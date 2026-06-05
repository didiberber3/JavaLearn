@echo off
chcp 65001
echo 编译Java程序...
javac -encoding GBK -d out/production/Hello src/Main.java
if %errorlevel% equ 0 (
    echo 编译成功，运行程序...
    java -Dfile.encoding=UTF-8 -cp out/production/Hello Main
) else (
    echo 编译失败！
)
pause
