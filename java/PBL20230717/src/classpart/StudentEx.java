package classpart;

import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class StudentEx {

	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		Scanner sc = new Scanner(System.in);
		// 객체 지향
		Student 이숭무 = new Student(); // 객체 생성
		이숭무.id = 100001;
		이숭무.name = "이숭무";
		이숭무.grade = 1;
		이숭무.addr = "성남";
		System.out.println(이숭무.id);
		System.out.println(이숭무.name);
		System.out.println(이숭무.grade);
		Student 김찬중 = new Student(); // 객체 생성
		김찬중.id = 100002;
		김찬중.name = "김찬중";
		김찬중.grade = 1;
		김찬중.addr = "서울";
		System.out.println(김찬중.id);
		System.out.println(김찬중.name);
		System.out.println(김찬중.grade);
		
		int id = 10001;
		String name = "이숭무";
		int grade = 1;
		String addr = "성남";
		
		int id1  = 10002;
		String name1= "김찬중";
		int grade1 = 2;
		String addr2 = "서울";

	}

}
