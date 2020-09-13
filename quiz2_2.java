import java.util.Scanner;

public class quiz2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	    int x, y, result;
	    String op; //연산자
	      
	    System.out.print("연산>>");
	      
	    x = sc.nextInt();
	    op = sc.next();
	    y = sc.nextInt();
		
		//2-(2) switch
		switch(op) {
		case "+":
			result = x + y;
			System.out.print(x+op+y+"의 계산 결과는"+result);
			break;
		case "-":
			result = x - y;
			System.out.print(x+op+y+"의 계산 결과는"+result);
			break;
		case "*":
			result = x * y;
			System.out.print(x+op+y+"의 계산 결과는"+result);
			break;
		case "/":
			if(y==0) {
				System.out.print("0으로 나눌 수 없습니다.");
				break;
			}
			else {
				result = x / y;
				System.out.print(x+op+y+"의 계산 결과는"+result);
				break;
			}
		default:
			System.out.print("잘못 입력하였습니다.");
		}
		
		sc.close();
	}

}
