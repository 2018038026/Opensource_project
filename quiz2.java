import java.util.Scanner;

public class quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str[] = {"����", "����", "��"};
		String User, Computer;
		int n;//��ǻ�ͳ� ���� ��
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		do {
			System.out.print("���� ���� ��! >> ");
			User = sc.next();//���ڿ��� �Է¹޴´�
			
			if(User.equals("�׸�"))//�Է¹��� ���ڿ��� �׸��̸�,
				break;//�ݺ����� �����
			
			n = (int)(Math.random()*3);//array[0]=����, array[1]=����, array[2]=��...0~2���� ���� �����ϰ� ����
			Computer = str[n];//�ش� ���ڿ��� �Ҵ�
			
			if(User.equals("����")) {//����ڰ� ������ �Է�������,
				if(str[n].equals("����")) {//��ǻ�͵� �����̸�,
					System.out.println("����� = "+User+", ��ǻ�� = "+Computer+" �����ϴ�.");
					continue;
				}
				else if(str[n].equals("����")) {//��ǻ�Ͱ� �����̸�,
					System.out.println("����� = "+User+", ��ǻ�� = "+Computer+" ����ڰ� �����ϴ�.");
					continue;
				}
				else if(str[n].equals("��")) {//��ǻ�Ͱ� ���̸�,
					System.out.println("����� = "+User+", ��ǻ�� = "+Computer+" ����ڰ� �̰���ϴ�.");
					continue;
				}
		    }
			else if(User.equals("����")) {//����ڰ� ������ �Է�������,
				if(str[n].equals("����")) {//��ǻ�Ͱ� �����̸�,
					System.out.println("����� = "+User+", ��ǻ�� = "+Computer+" ����ڰ� �̰���ϴ�.");
					continue;
				}
				else if(str[n].equals("����")) {//��ǻ�͵� �����̸�,
					System.out.println("����� = "+User+", ��ǻ�� = "+Computer+" �����ϴ�.");
					continue;
				}
				else if(str[n].equals("��")) {//��ǻ�Ͱ� ���̸�,
					System.out.println("����� = "+User+", ��ǻ�� = "+Computer+" ����ڰ� �����ϴ�.");
					continue;
				}
			}
			else if(User.equals("��")) {//����ڰ� ���� �Է�������,
				if(str[n].equals("����")) {//��ǻ�Ͱ� �����̸�,
					System.out.println("����� = "+User+", ��ǻ�� = "+Computer+" ����ڰ� �����ϴ�.");
					continue;
				}
				else if(str[n].equals("����")) {//��ǻ�Ͱ� �����̸�,
					System.out.println("����� = "+User+", ��ǻ�� = "+Computer+" ����ڰ� �̰���ϴ�.");
					continue;
				}
				else if(str[n].equals("��")) {//��ǻ�͵� ���̸�,
					System.out.println("����� = "+User+", ��ǻ�� = "+Computer+" �����ϴ�.");
					continue;
				}
		    }
        }while(true);
		
		System.out.println("������ �����մϴ�...");//�ݺ����� ����� �Ǹ� ���
		sc.close();
    }
}