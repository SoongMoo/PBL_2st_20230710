package array;

public class ArrayEx7 {

	public static void main(String[] args) {
		char [] alphabets = new char[26];
		char ch ='A';
		for(int idx = 0; idx <alphabets.length ; idx++) {
			//alphabets[idx] = ch++;
			alphabets[idx] = ch;
			ch = (char) (ch + 1);
		}
		for(int idx = 0; idx < alphabets.length ; idx++) {
			System.out.print(alphabets[idx]);
		}

	}

}
