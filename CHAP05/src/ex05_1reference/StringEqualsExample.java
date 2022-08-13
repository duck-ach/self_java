package ex05_1reference;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		String strVar1 = "히랭찌";
		String strVar2 = "히랭찌";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같다.");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다르다.");
		}
		
		if(strVar1.equals(strVar2) ) {
			System.out.println("strVar1과 strVar2는 문자열이 같다.");
		}
		
		String strVar3 = new String("heer");
		String strVar4 = new String("heer");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같다.");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다르다.");
		}
		
		if(strVar3.equals(strVar4) ) {
			System.out.println("strVar3과 strVar4는 문자열이 같다.");
		}

	}

}
