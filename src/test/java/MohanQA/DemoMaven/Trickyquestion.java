package MohanQA.DemoMaven;

public class Trickyquestion {

	int id;
	double salary;
	String name;

	public void m1() {
		id = 101;

	}

	public static void main(String[] args) {
		Trickyquestion tt = new Trickyquestion();
		tt.id = 102;
		tt.m1();
		System.out.println(tt.id);
		Trickyquestion tt1 = new Trickyquestion();
		tt1.id=103;
		System.out.println(tt1.id);
	}

}
