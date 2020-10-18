import java.util.*;

public class Game_2 {
	private HashMap<String, String> item = new HashMap<String, String>();//�����̸�:Ű ����:��
	private Scanner scanner = new Scanner(System.in);
	
	public Game_2() {// item�� 9 ���� �������� �Է��Ͽ� �ʱ�ȭ
		item.put("�߽���", "�߽��ڽ�Ƽ");//put�� ����Ͽ� ��� ����
		item.put("������", "������");
		item.put("������", "�ĸ�");
		item.put("����", "����");
		item.put("�׸���", "���׳�");
		item.put("����", "������");
		item.put("�Ϻ�", "����");
		item.put("�߱�", "������");
		item.put("���þ�", "��ũ��");
	}
	
	public void startGame() {
		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
		while(true) {
			System.out.print("�Է�:1, ����:2, ����:3>> ");
			int menu = scanner.nextInt();
			switch(menu) {
				case 1:
					inputItem();
					break;
				case 2:
					startQuiz();
					break;
				case 3:
					endQuiz();
					return;
				default: 
					printError("�߸��� �Է��Դϴ�.");
			}
		}	
	}
	
	private void inputItem() {
		int n = item.size();
		
		System.out.println("���� " + n + "�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
		n++;
		
		while(true) {
			System.out.print("����� ���� �Է�" + n + ">> ");
			String country = scanner.next();
			
			if(country.equals("�׸�")) {//�Է��� ���� �׸��̸�,
				break;
			}
			
			String capital = scanner.next();
			
			if(item.containsKey(country)) {//�Է��� ���� ��ġ�ϴ� Ű�� �����ϸ�
				System.out.println(country + "�� �̹� �ֽ��ϴ�");
				continue;
			}
			
			item.put(country, capital);
			n++;
		}
	}
	
	private void startQuiz() {
		Set<String> keys = item.keySet();//�ؽø��� ��� Ű�� ���� Set<String> �÷��� ����
		Object [] array = (keys.toArray());//�ؽø� �迭��ȯ
		
		while(true) {// ���� �߿��� �ϳ��� �����Ѵ�.
			int index = (int)(Math.random()*array.length); //������ ��ġ�� ���� ����
			
			String question = (String)array[index];// ����(����)�� ����(����)�� ����
			String answer = item.get(question);
			
			System.out.print(question + "�� ������? ");// ������ ���
			
			String userAnswer = scanner.next(); // ������� �Է�
			
			if(userAnswer.equals("�׸�")) {
				break;
			}
			
			if(userAnswer.equals(answer))
				System.out.println("����!!");
			else
				System.out.println("�ƴմϴ�!!");				
		}	
	}
	
	private void endQuiz() {
		System.out.println("������ �����մϴ�.");	
	}
	
	private void printError(String msg) {
		System.out.println(msg);
	}//���� �޽��� ���
	
	public static void main(String[] args) {
		Game_2 game = new Game_2();
		game.startGame();//���� ����
	}
}