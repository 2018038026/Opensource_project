import java.util.Scanner;
import java.util.InputMismatchException;

public class Multiply {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		 System.out.print("���ϰ��� �ϴ� �� �� �Է� >> ");
		 
		 try {
			 
			 int a = sc.nextInt();//���� �Է�
			 int b = sc.nextInt();
			 
			 System.out.print(a + "X" + b + "=" + a*b);//������ ���
			 
			 break;//���������� ���� �� while �����
		 }
		 catch(InputMismatchException e) {//���� ó����,,������ �Է¹ް��� �Ͽ�����, ����ڰ� 'a' ��� ���� ���ڸ� �Է��� ���
			 System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
			 sc.nextLine();/*next() �� �ܾ(�������) �д´�. ���๮�ڸ� �����ϰ� �Է¹޴´�
		                     nextLine() �� ���� �д´�, ���๮�ڷ� ����
			  				 �Է� ��Ʈ���� ������ �ִ� ���ڸ� �о���̰� �� ���� ��ȯ�Ѵ�*/
		 }
	   }
	   sc.close();
	}

}
