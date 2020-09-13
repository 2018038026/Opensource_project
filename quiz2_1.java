import java.util.Scanner;

public class quiz2_1 {
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      
      int x, y, result;
      String op; //연산자
      
      System.out.print("연산>>");
      
      x = sc.nextInt();//다음 토큰을 int 타입으로 리턴
      op = sc.next();//문자열로 리턴
      y = sc.nextInt();
      
      //2-(1) if-else
      if(op.equals("+")) {
         result = x + y;
         System.out.print(x+op+y+"의 계산 결과는 "+result);//출력형태: x+y의 계산결과는 result
      }
      else if(op.equals("-")) {
         result = x - y;
         System.out.print(x+op+y+"의 계산 결과는 "+result);//출력형태: x-y의 계산결과는 result
      }
      else if(op.equals("*")) {
         result = x * y;
         System.out.print(x+op+y+"의 계산 결과는 "+result);//출력형태: x*y의 계산결과는 result
      }
      else if(op.equals("/")) {
         if(y==0) {
            System.out.print("0으로 나눌 수 없습니다.");
         }
         else {
            result = x / y;
            System.out.print(x+op+y+"의 계산 결과는 "+result);//출력형태: x/y의 계산결과는 result
         }
      }
      
      sc.close();
   }
}
