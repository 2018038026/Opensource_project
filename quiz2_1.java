import java.util.Scanner;

public class quiz2_1 {
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      
      int x, y, result;
      String op; //������
      
      System.out.print("����>>");
      
      x = sc.nextInt();//���� ��ū�� int Ÿ������ ����
      op = sc.next();//���ڿ��� ����
      y = sc.nextInt();
      
      //2-(1) if-else
      if(op.equals("+")) {
         result = x + y;
         System.out.print(x+op+y+"�� ��� ����� "+result);//�������: x+y�� ������� result
      }
      else if(op.equals("-")) {
         result = x - y;
         System.out.print(x+op+y+"�� ��� ����� "+result);//�������: x-y�� ������� result
      }
      else if(op.equals("*")) {
         result = x * y;
         System.out.print(x+op+y+"�� ��� ����� "+result);//�������: x*y�� ������� result
      }
      else if(op.equals("/")) {
         if(y==0) {
            System.out.print("0���� ���� �� �����ϴ�.");
         }
         else {
            result = x / y;
            System.out.print(x+op+y+"�� ��� ����� "+result);//�������: x/y�� ������� result
         }
      }
      
      sc.close();
   }
}
