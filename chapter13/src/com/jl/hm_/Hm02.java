package com.jl.hm_;


public class Hm02 {
	public static void main(String[] args) throws Exception {
//		输入用户名,密码,邮箱,如果信息录入正确,则提示注册成功,否则生成异常对象.

		User user = new User("jack", "123456", "123qq@.com");


		System.out.println("注册成功");
//		要求:


	}

	static class User {

		String username;
		String psw;
		String email;


		public User(String username, String psw, String e) throws Exception {

			this.username = username;
			this.psw = psw;
			this.email = e;
			//		用户名长度为2或3或4
			if (!(username.length() >= 2 && username.length() <= 4)) {
				throw new Exception("用户名长度异常");
			}
			//密码必须是6为并且全数字
			if (!(psw != null && psw.length() == 6)) {
				throw new Exception("密码长度异常");
			} else {
				for (int i = 0; i < psw.length(); i++) {
					char c = psw.charAt(i);
					if (c < '0' || c > '9') {  // 使用严格判断
						throw new Exception("密码格式异常");
					}
				}
			}
			//		邮箱中包含@ 和 .  @在.的前面

			if (!(e.indexOf('@') != -1 && e.indexOf('.') != -1)) {
				throw new Exception("没有@或.异常");
			}

			int e1 = e.lastIndexOf('@');
			int e2 = e.indexOf('.');
			if (!(e1 < e2)) {
				throw new Exception("@不在.前面异常");
			}

		}


		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPsw() {
			return psw;
		}

		public void setPsw(String psw) {
			this.psw = psw;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

	}
}
