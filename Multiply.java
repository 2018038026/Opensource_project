import java.util.Scanner;
import java.util.InputMismatchException;

public class Multiply {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		 System.out.print("곱하고자 하는 두 수 입력 >> ");
		 
		 try {
			 
			 int a = sc.nextInt();//정수 입력
			 int b = sc.nextInt();
			 
			 System.out.print(a + "X" + b + "=" + a*b);//실행결과 출력
			 
			 break;//정상적으로 실행 후 while 벗어나기
		 }
		 catch(InputMismatchException e) {//예외 처리문,,정수를 입력받고자 하였지만, 사용자가 'a' 등과 같이 문자를 입력한 경우
			 System.out.println("실수는 입력하면 안됩니다.");
			 sc.nextLine();/*next() 한 단어를(공백기준) 읽는다. 개행문자를 무시하고 입력받는다
		                     nextLine() 한 줄을 읽는다, 개행문자로 포함
			  				 입력 스트림에 남겨져 있는 글자를 읽어들이고 빈 줄을 반환한다*/
		 }
	   }
	   sc.close();
	}

}
