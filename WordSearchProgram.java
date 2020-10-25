import java.io.*;
import java.util.*;

public class WordSearchProgram {
	private File testFile = null;//���� ��ü textFile
	Vector<String> lineVector = new Vector<String>();//string Ÿ�� vector ��ü lineVector ����
	
	public WordSearchProgram() { }
	
	private void readFile(String fileName) {//������ ���� ���� ���ͷ� �о����
		testFile = new File(fileName);
		try {
			Scanner sc = new Scanner(new FileReader(testFile));
			while(sc.hasNext()) {//������ ���� ������ ��� �б�, �Էµ� �� ��, ��ū�� ������ true ����, ��ū�� ��������� false ����
				String line = sc.nextLine();//�� ���� �а�,
				lineVector.add(line);//�� ������ ���Ϳ� ����
			}			
			sc.close();
			
		} catch (FileNotFoundException e) {//ó���� ���� Ÿ�Լ���
			e.printStackTrace();/*����ó����: ���ϰ��� ����. �� �޼ҵ带 ȣ���ϸ� �޼ҵ尡 ���������� ���� ����� ȭ�鿡 ����Ѵ�.*/
		}
	}
	
	private Vector<Integer> searchWord(String word) {//word�� ���Ե� ���� ��ȣ���� ���ͷ� ����
		Vector<Integer> ivector = new Vector<Integer>();//integer Ÿ�� vector ��ü vector ����
		for(int i=0; i<lineVector.size(); i++) {
			String line = lineVector.get(i);//�Ѷ��ξ� �����ͼ�
			if(line.indexOf(word) != -1)//������ ������ (���ڿ�) ���� Ư���� ���ڿ� word�� index�� ����
				ivector.add(i);//add��һ���
		}
		return ivector;
	}

	private void printLines(Vector<Integer> noVector) {//�ܾ �����ϴ� ��� ���� ��ȣ ���ϰ��� �޾ƿͼ�
		for(int i=0; i<noVector.size(); i++) {
			int lineNo = noVector.get(i);//�ܾ �����ϴ� ��� ���� ��ȣ ��������
			String line = lineVector.get(lineNo);//��ȣ�� �ش��ϴ� ����
			System.out.println(lineNo + ":" + line);
		}
	}
	
	public void run() {
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		System.out.print("��� ���ϸ� �Է�>> ");
		
		Scanner scanner = new Scanner(System.in);
		String fileName = scanner.nextLine();//���δ���

		readFile(fileName); 
		
		while(true) {
			System.out.print("�˻��� �ܾ ����>> ");
			String fword = scanner.nextLine();
			
			if(fword.equals("�׸�"))//�Է¹��� ���� �׸��̸�,
				break;//���α׷� ����
			Vector<Integer> vector = searchWord(fword);//fword�� �ܾ �����ϴ� ��� ���� ��ȣ ����
			printLines(vector);//�ش� ���ε� ���
		}
		scanner.close();
		System.out.println("���α׷��� �����մϴ�.");
	}
	public static void main(String[] args) {
		WordSearchProgram wsp = new WordSearchProgram();
		wsp.run();
	}
}