package Chapter02;

import java.util.Scanner;

public class InputExample 
{
	public static void main(String[] args) 
	{		
		/*String nameString = "감자바";
		int age = 25;
		String tel1 = "010", tel2 = "123", tel3 = "4567";
		System.out.println(tel1 + "-" + tel2 + "-" + tel3);
		System.out.print(tel1 + "-" + tel2 + "-" + tel3 + "\n");
		System.out.printf("%s-%s-%s", tel1, tel2, tel3);*/
	    
		/*Scanner s = new Scanner(System.in);
		
		System.out.print("첫번째 수: ");
		String strNum1 = s.nextLine();
		
		System.out.println("두번째 수: ");
		String strNum2 = s.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.printf("덧셈 결과 : %d", result);*/
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("[필수 입력 정보]");
		
		System.out.print("이름 : ");
		String name = s.nextLine();
		
		System.out.print("주민번호 : ");
		String id = s.nextLine();
		
		System.out.print("전화번호 : ");
		String phone = s.nextLine();
		
		System.out.println("[입력한내용]");
		System.out.printf("이름 : %s\n주민번호 앞 6자리 : %s\n전화번호 : %s", name, id, phone);
		s.close();
	}
}

