package MohanQA.DemoMaven;

public class Parentclass {
	public static void main(String[] args) {
//		Scanner sn= new Scanner(System.in);
		
		String data="Guru is goood boy";
		StringBuffer buffer= new StringBuffer();
		char[] ch= data.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if ((ch[i]!=' ') && (ch[i]!='\t')) {
				buffer.append(ch[i]);
			}
		}
		String nospacestring= buffer.toString();
		System.out.println(nospacestring);
	}
}
