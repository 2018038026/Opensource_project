import java.util.Scanner;//import �� �ʿ�

public class quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);//Scanner ��ü ����
		
		int x1, y1;
		int x2, y2;
		double r1, r2, distance;
		
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
		
		x1 = scanner.nextInt();//���� ��ū�� int Ÿ������ ����
		y1 = scanner.nextInt();
		r1 = scanner.nextDouble();//���� ��ū�� double Ÿ������ ����
		
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
		
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
		r2 = scanner.nextDouble();
		
		distance = Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
		
		if(distance <= r1+r2) {//�� ���� �������� ������ �պ��� �۰ų� ������
			System.out.print("�� ���� ���� ��ģ��.");
		}
		else {//�� ���� �������� ������ �պ��� ũ��
			System.out.print("�� ���� ���� ��ġ�� �ʴ´�.");
		}
		
		scanner.close();//scanner �ݱ�
	}

}
