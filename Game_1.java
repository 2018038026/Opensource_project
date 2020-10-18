import java.util.Scanner;
import java.util.Vector;

public class Game_1 {
	private Vector<Nation> item = new Vector<Nation>();//Vector<Nation>�÷���, item ��ü
	private Scanner scanner = new Scanner(System.in);
	
	public Game_1() {// item�� 9 ���� �������� �Է��Ͽ� �ʱ�ȭ
		item.add(new Nation("�߽���", "�߽��ڽ�Ƽ"));//add()�� �̿��Ͽ� ��� ����
		item.add(new Nation("������", "������"));
		item.add(new Nation("������", "�ĸ�"));
		item.add(new Nation("����", "����"));
		item.add(new Nation("�׸���", "���׳�"));
		item.add(new Nation("����", "������"));
		item.add(new Nation("�Ϻ�", "����"));
		item.add(new Nation("�߱�", "����¡"));
		item.add(new Nation("���þ�", "��ũ��"));
	}
	
	public void startGame() {//���� ���� �޴�
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
	
	private boolean contains(String country) {//���Ϳ� �߰��� �Է¹��� ����country�� �ִٸ� true ����
		for(int i=0; i<item.size(); i++) {//get()�� �̿��Ͽ� ��� �˻�
			if(item.get(i).getCountry().equals(country)) { // ����ڰ� �Է��� ���� �̹� �ִٸ�
				return true;
			}
		}
		return false;
	}
	
	private void inputItem() {//����� ���� �Է�
		int n = item.size();
		
		System.out.println("���� " + n + "�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
		n++;
		
		while(true) {
			System.out.print("����� ���� �Է�" + n + ">> ");
			String country = scanner.next(); //���� �߰��� �Է�
			
			if(country.equals("�׸�")) {//�׸��̸� �Է� ����
				break;
			}
			
			String capital = scanner.next(); //���� �߰��� �Է�
			
			if(contains(country)) { //�߰��� �Է��� ���� �̹� �ִٸ�>>true�̸�
				System.out.println(country + "�� �̹� �ֽ��ϴ�!");
				continue;
			}
			
			item.add(new Nation(country, capital));//�߰� �Է� ���� ���ٸ� �߰�>>false �̸�
			n++;
		}
	}
	
	private void startQuiz() {
		while(true) {// ���� �߿��� �ϳ��� ����
			int index = (int)(Math.random()*item.size()); //������ ��ġ�� ���� ����
			
			Nation nation = item.get(index);// ����(����)�� ����(����)�� ����
			String question = nation.getCountry();
			String answer = nation.getCapital();
			
			System.out.print(question + "�� ������? ");//������ ���
			
			String userAnswer = scanner.next();//�������� ���� �Է�
			
			if(userAnswer.equals("�׸�")) {//���� ����
				break;
			}
			
			if(userAnswer.equals(answer))//�������� ����� ������ ������ ������
				System.out.println("����!!");
			else
				System.out.println("�ƴմϴ�!!");				
		}	
	}
	
	private void endQuiz() {
		System.out.println("������ �����մϴ�.");	
	}
	
	private void printError(String msg) {
		System.out.println(msg);//���� �޽��� ���
	}
	
	public static void main(String[] args) {
		Game_1 game = new Game_1();
		game.startGame();//���� ����
	}
}

class Nation {
	private String country;
	private String capital;
	
	public Nation(String country, String capital) {//���� �̸��� ������ ������ Nation Ŭ����
		this.country = country;
		this.capital = capital;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getCapital() {
		return capital;
	}
}