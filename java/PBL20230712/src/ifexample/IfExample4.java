package ifexample;

public class IfExample4 {
	public static void main(String[] args) {
		// 8세 미만은  "미 취학 아동입니다." , 입장료가 1000 
		// 14세 미만은 "초등학생 입니다." , 입장료가 2000
		// 20세 미만은 "중, 고등학생 입니다." 입장료 2500
		// 이상은 "일반인 입니다." , 입장료가 3000원
		int age = 13;
		int charge; // 입장료
		if(age < 8){
			charge = 1000; 
			System.out.println("미 취학 아동입니다.");
		}else if(age < 14){
			charge = 2000;
			System.out.println("초등학생 입니다.");
		}else if(age < 20){
			charge = 2500;
			System.out.println("중, 고등학생 입니다.");
		}else{
			charge = 3000;
			System.out.println("일반인 입니다.");
		} 		
		System.out.println("입장료는 " + charge + "원입니다.");
	}

}
