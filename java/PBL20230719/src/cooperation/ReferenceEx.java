package cooperation;

public class ReferenceEx {

	public static void main(String[] args) {
		Reference1 r1 = new Reference1();
		int k = 1;
		r1.setI(k); // 값에 읜한 전달 방식
		System.out.println(k);
		System.out.println(r1.getI());
		Reference ref =  new Reference();
		ref.setI(100);
		r1.setR(ref); // 주소 전달 방식, reference에 의한 전달
		System.out.println(ref.getI());
		System.out.println(r1.getR().getI());
	}
}
