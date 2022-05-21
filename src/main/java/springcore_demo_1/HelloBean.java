package springcore_demo_1;

public class HelloBean {
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void sayHello() {
		System.out.println("Hello World! " + this.msg);
	}
}
