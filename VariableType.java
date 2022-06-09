package saipreethi22;

public class VariableType {
	static int a=19;//static variable
	int b=20;//instatance variable
	public int  main(int a,int b) {
		return a+b;
		
	}
	
	

	public static void main(String[] args) {
		int b= 6;
		System.out.println(b);
		VariableType v1=new VariableType();
		
		v1.main(a, b);
		System.out.println(v1.main(a,b));
		
}

}
