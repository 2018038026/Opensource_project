import java.util.Scanner;

public class quiz2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	    int x, y, result;
	    String op; //������
	      
	    System.out.print("����>>");
	      
	    x = sc.nextInt();
	    op = sc.next();
	    y = sc.nextInt();
		
		//2-(2) switch
		switch(op) {
		case "+":
			result = x + y;
			System.out.print(x+op+y+"�� ��� �����"+result);
			break;
		case "-":
			result = x - y;
			System.out.print(x+op+y+"�� ��� �����"+result);
			break;
		case "*":
			result = x * y;
			System.out.print(x+op+y+"�� ��� �����"+result);
			break;
		case "/":
			if(y==0) {
				System.out.print("0���� ���� �� �����ϴ�.");
				break;
			}
			else {
				result = x / y;
				System.out.print(x+op+y+"�� ��� �����"+result);
				break;
			}
		default:
			System.out.print("�߸� �Է��Ͽ����ϴ�.");
		}
		
		sc.close();
	}

}
