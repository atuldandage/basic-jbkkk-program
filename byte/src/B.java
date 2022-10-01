
public class B extends A{
 int a=20;
	public  void m1() {
		
		System.out.println("sub m1");
	}
	
	
	
	public static void main(String[] args) {
		
		A aa=new B();
		
		aa.m1();
		
		
		System.out.println(aa.a);
		
	}
	
	
	
	
	
	
}
