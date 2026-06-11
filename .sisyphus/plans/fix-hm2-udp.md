# 修复 hm2 UDP 通信程序

## TL;DR
> **Summary**: 重写 ReceiverA.java 和 SenderB.java，修复端口不匹配、IP 硬编码、内容匹配错误等问题，实现正确的 UDP 一问一答通信。
> **Deliverables**: 2 个 Java 源文件
> **Effort**: Quick
> **Parallel**: NO（2 个文件可并行）
> **Critical Path**: 无

## 需求确认
1. UDP 协议，接收端 A 监听 8888 端口
2. 发送端 B 发送 "四大名著是哪些" 给 A
3. A 收到后判断：匹配则返回 `"四大名著是<<红楼梦>>,<<西游记>>,<<三国演义>>,<<水浒传>>"`，否则返回 `"what?"`
4. 双方退出

## 原有 Bug 总结
| Bug | 说明 |
|-----|------|
| 端口不匹配 | SenderB 发往 9999，ReceiverA 监听 8888 |
| IP 硬编码 | 双方都用 `"172.20.10.9"` 写死，换环境必挂 |
| 回复地址写死 | ReceiverA 回复时没用 `packet.getAddress()/getPort()` |
| 发的内容不对 | 发的是"四大名著都有谁?"，需求是"四大名著是哪些" |
| 判断条件不对 | `equals("四大名著")` 永远匹配不上 |
| 回复内容不对 | 返回的是"四大名著:三国演义..."，不是需求格式 |
| SenderB 绑固定端口 9998 | 不必要，用无参构造即可 |

## TODOs

- [ ] 1. 重写 ReceiverA.java

  **What to do**: 用以下内容完全覆盖 `D:\JavaProject\chapter21\src\com\jl\hm\hm2\ReceiverA.java`

  代码内容：
  ```java
  package com.jl.hm.hm2;

  import java.io.IOException;
  import java.net.DatagramPacket;
  import java.net.DatagramSocket;

  public class ReceiverA {
      public static void main(String[] args) throws IOException {
          // 1. 监听 8888 端口
          DatagramSocket socket = new DatagramSocket(8888);

          // 2. 接收数据
          byte[] buf = new byte[64 * 1024];
          DatagramPacket packet = new DatagramPacket(buf, buf.length);
          socket.receive(packet);

          // 3. 解析问题
          String question = new String(packet.getData(), 0, packet.getLength());
          System.out.println("收到: " + question);

          // 4. 准备回复
          String answer;
          if ("四大名著是哪些".equals(question)) {
              answer = "四大名著是<<红楼梦>>,<<西游记>>,<<三国演义>>,<<水浒传>>";
          } else {
              answer = "what?";
          }

          // 5. 回复（从收到的 packet 取发送方地址和端口）
          byte[] replyData = answer.getBytes();
          DatagramPacket replyPacket = new DatagramPacket(
                  replyData, replyData.length,
                  packet.getAddress(), packet.getPort()
          );
          socket.send(replyPacket);

          // 6. 退出
          socket.close();
      }
  }
  ```

  **Must NOT do**: 不要硬编码 IP 和端口，必须用 `packet.getAddress()/getPort()`

  **Acceptance Criteria**:
  - [ ] 编译无错误
  - [ ] 监听 8888 端口
  - [ ] 回复时使用 `packet.getAddress()` 和 `packet.getPort()` 而非硬编码

- [ ] 2. 重写 SenderB.java

  **What to do**: 用以下内容完全覆盖 `D:\JavaProject\chapter21\src\com\jl\hm\hm2\SenderB.java`

  代码内容：
  ```java
  package com.jl.hm.hm2;

  import java.io.IOException;
  import java.net.DatagramPacket;
  import java.net.DatagramSocket;
  import java.net.InetAddress;

  public class SenderB {
      public static void main(String[] args) throws IOException {
          // 1. 创建发送端（系统自动分配端口）
          DatagramSocket socket = new DatagramSocket();

          // 2. 发送问题到接收端 A（localhost:8888）
          byte[] questionData = "四大名著是哪些".getBytes();
          DatagramPacket questionPacket = new DatagramPacket(
                  questionData, questionData.length,
                  InetAddress.getLocalHost(), 8888
          );
          socket.send(questionPacket);
          System.out.println("发送: 四大名著是哪些");

          // 3. 接收回复
          byte[] buf = new byte[64 * 1024];
          DatagramPacket replyPacket = new DatagramPacket(buf, buf.length);
          socket.receive(replyPacket);

          // 4. 解析回复并打印
          String reply = new String(replyPacket.getData(), 0, replyPacket.getLength());
          System.out.println("收到回复: " + reply);

          // 5. 退出
          socket.close();
      }
  }
  ```

  **Must NOT do**: 不要绑定固定端口，不要硬编码 IP

  **Acceptance Criteria**:
  - [ ] 编译无错误
  - [ ] 使用 `new DatagramSocket()` 无参构造（自动分配端口）
  - [ ] 发送内容为 "四大名著是哪些"
  - [ ] 发往 localhost:8888

## 运行方式
1. 先启动 **ReceiverA**（阻塞等待）
2. 再启动 **SenderB**（发送问题并等待回复）
3. 观察两端控制台输出

## 关键改动说明
| 改动 | 原因 |
|------|------|
| `new DatagramSocket()` 代替 `new DatagramSocket(9998)` | 发送端不需要固定端口 |
| `InetAddress.getLocalHost()` 代替 `"172.20.10.9"` | 本地测试通用写法 |
| 目标端口统一为 `8888` | 匹配接收端监听端口 |
| `packet.getAddress()/getPort()` 回复 | 从收到的包获取发送方信息 |
| 发送内容改为 "四大名著是哪些" | 匹配需求 |
| 判断条件改为 `equals("四大名著是哪些")` | 匹配需求 |
| 回复内容改为需求格式 | 匹配需求 |
| else 返回 "what?" | 匹配需求 |
