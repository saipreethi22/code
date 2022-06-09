package saipreethi22;

public class Method2 {


		public void m1() {
			System.out.println("m1");

		}
	  public void m2(int i,int j) {
			System.out.println("m2");
			System.out.println(i+j);

		}
	  public static void m3() {
		  System.out.println("Ststic method");
	  }
	  public static int m4(int a,int b) {
		  System.out.println("parameterized ststic");
		  System.out.println(a+b);
		return a+b;
		  
	  }
		public static void main(String[] args) {
			Method2 obj=new Method2();
			obj.m1();
			obj.m2(10, 20);
			m3();
			m4(10,30);

		}


}
