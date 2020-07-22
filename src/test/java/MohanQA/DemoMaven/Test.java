package MohanQA.DemoMaven;

public abstract class Test {
	abstract String m1(Emp e, int a);
	public static void main(String[] args) {
		Test t= new Test() {
			
			
			@Override
			String m1(Emp e, int a) {
				System.out.println(e+"-----------"+a);
				return 	"guru";
			}
		};
	}
}
