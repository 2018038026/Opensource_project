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
	
	public static void printSeat(String seat[]) {//�¼� ��� static ������ Ŭ������ ��� ��ü�� ���� ����
		for(int i = 0; i < seat.length; i++) {
			System.out.print(" " + seat[i] + " ");
		}
		System.out.println();
	}
	
	public void allPrint() {//��� �¼� ���
		System.out.print("S>>");
		Concert.printSeat(S);
		System.out.print("A>>");
		Concert.printSeat(A);
		System.out.print("B>>");
		Concert.printSeat(B);
		System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
	}
	
	public void choiceSeat() {//�¼� ����(S, A, B)
		while(true) {
			System.out.print("�¼����� S(1), A(2), B(3)>>");
			int select = sc.nextInt();
			
			switch(select) {//�¼� ����
			case 1:
				System.out.print("S>>");
				printSeat(S);//�ش� �¼� ���
				inputSeat(S);//�¼��� �̸��� �ֱ�
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
				System.out.println("�ٽ� �Է��� �ּ���.");
			}
		}
	}
	
	public void inputSeat(String seat[]) {//�¼��� �̸��� �ֱ�
		System.out.print("�̸�>>");
		String name = sc.next();
		
		while(true) {
			System.out.print("��ȣ>>");//�ش� ��ȣ�� �̸��� �ֱ� 1~10��
			int num = sc.nextInt();
		
			num--;//�迭�� 0~9
			if(seat[num].equals("___")) {
				seat[num] = name;
				break;
			}
			else {
				System.out.println("�ٸ� �¼��� ������ �ּ���.");
			}
		}
	}
	
	public void deleteChoice() {//�¼� ���� ���
		while(true) {
			System.out.print("�¼� S:1, A:2, B:3>>");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.print("S>>");
				printSeat(S);//S�¼� ���� ��Ȳ
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
		System.out.print("�̸�>>");
		String name = sc.next();
		for(int i = 0; i < seat.length; i++) {
			if(name.equals(seat[i])) {//����Ϸ��� �̸��� ������ �̸� ����(�ٽ� ___�� �ٲٱ�)
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
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		Concert concert = new Concert();
			
		while(true) {
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
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
				System.out.println("�ٽ� �Է��� �ּ���.");

			}
		}
	}
}