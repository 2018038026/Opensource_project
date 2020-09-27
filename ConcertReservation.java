import java.util.Scanner;

class Concert {
	private String S[];
	private String A[];
	private String B[];
	private Scanner sc;
	
	Concert(){
		sc = new Scanner(System.in);
		S = new String[10];
		A = new String[10];
		B = new String[10];
		
		for(int i = 0; i < S.length; i++) {
			S[i]="___";
			A[i]="___";
			B[i]="___";
		}
	}
	
	public static void printSeat(String seat[]) {//좌석 출력 static 동일한 클래스의 모든 객체에 의해 공유
		for(int i = 0; i < seat.length; i++) {
			System.out.print(" " + seat[i] + " ");
		}
		System.out.println();
	}
	
	public void allPrint() {//모든 좌석 출력
		System.out.print("S>>");
		Concert.printSeat(S);
		System.out.print("A>>");
		Concert.printSeat(A);
		System.out.print("B>>");
		Concert.printSeat(B);
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}
	
	public void choiceSeat() {//좌석 선택(S, A, B)
		while(true) {
			System.out.print("좌석구분 S(1), A(2), B(3)>>");
			int select = sc.nextInt();
			
			switch(select) {//좌석 선택
			case 1:
				System.out.print("S>>");
				printSeat(S);//해당 좌석 출력
				inputSeat(S);//좌석에 이름값 넣기
				return;
			case 2:
				System.out.print("A>>");
				printSeat(A);
				inputSeat(A);
				return;
			case 3:
				System.out.print("B>>");
				printSeat(B);
				inputSeat(B);
				return;
			default:
				System.out.println("다시 입력해 주세요.");
			}
		}
	}
	
	public void inputSeat(String seat[]) {//좌석에 이름값 넣기
		System.out.print("이름>>");
		String name = sc.next();
		
		while(true) {
			System.out.print("번호>>");//해당 번호에 이름값 넣기 1~10번
			int num = sc.nextInt();
		
			num--;//배열은 0~9
			if(seat[num].equals("___")) {
				seat[num] = name;
				break;
			}
			else {
				System.out.println("다른 좌석을 선택해 주세요.");
			}
		}
	}
	
	public void deleteChoice() {//좌석 선택 취소
		while(true) {
			System.out.print("좌석 S:1, A:2, B:3>>");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.print("S>>");
				printSeat(S);//S좌석 예약 현황
				deleteSeat(S);
				return;
			case 2:
				System.out.print("A>>");
				printSeat(A);
				deleteSeat(A);
				return;
			case 3:
				System.out.print("B>>");
				printSeat(B);
				deleteSeat(B);
				return;

			}
		}
	}
	
	public void deleteSeat(String seat[]) {
		System.out.print("이름>>");
		String name = sc.next();
		for(int i = 0; i < seat.length; i++) {
			if(name.equals(seat[i])) {//취소하려는 이름과 동일한 이름 삭제(다시 ___로 바꾸기)
				seat[i]="___";
				break;
			}
		}
	}
}

public class ConcertReservation{
		
	public static void main(String[] args) {
	// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		Concert concert = new Concert();
			
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			int select = sc.nextInt();
				
			switch(select) {
			case 1:
				concert.choiceSeat();
				break;
			case 2:
				concert.allPrint();
				break;
			case 3:
				concert.deleteChoice();
				break;
			case 4:
				sc.close();
				return;
			default:
				System.out.println("다시 입력해 주세요.");

			}
		}
	}
}