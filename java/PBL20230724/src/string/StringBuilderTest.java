package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String javaStr = new String("Java");
		StringBuilder buffer = new StringBuilder();
		buffer.append(javaStr);
		System.out.println(buffer);
		buffer.append(" and");
		System.out.println(buffer);
		buffer.append(" android");
		System.out.println(buffer);
		javaStr = buffer.toString();
		System.out.println(javaStr);
		
		String str = javaStr + " and";
		str += " android";
		str += " programming";
		System.out.println(str);
		
	}

}
