package struts2.action;

public class TestDynamicMethodInvocationActoin {

	public String save(){
		System.out.println("save...");
		return "success";
	}
	
	public String update(){
		System.out.println("update...");
		return "success";
	}
}
