import java.util.Scanner;//import 문 필요

public class quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);//Scanner 객체 생성
		
		int x1, y1;
		int x2, y2;
		double r1, r2, distance;
		
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		
		x1 = scanner.nextInt();//다음 토큰을 int 타입으로 리턴
		y1 = scanner.nextInt();
		r1 = scanner.nextDouble();//다음 토큰을 double 타입으로 리턴
		
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
		r2 = scanner.nextDouble();
		
		distance = Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
		
		if(distance <= r1+r2) {//두 원의 반지름의 길이의 합보다 작거나 같으면
			System.out.print("두 원은 서로 겹친다.");
		}
		else {//두 원의 반지름의 길이의 합보다 크면
			System.out.print("두 원은 서로 겹치지 않는다.");
		}
		
		scanner.close();//scanner 닫기
	}

}
