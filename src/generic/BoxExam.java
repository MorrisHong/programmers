package generic;

public class BoxExam {
	public static void main(String[] args) {
		Box<String> b1 = new Box<>();
		b1.setObj("HONG");
		String b1Str = b1.getObj();
		
		Box<Integer> b2 = new Box<>();
		b2.setObj(910628);
		int b2Integer = b2.getObj();
		
		System.out.println(b1Str);
		System.out.println(b2Integer);
		
	}
}
