import java.io.*;
import java.util.*;

public class WordSearchProgram {
	private File testFile = null;//파일 객체 textFile
	Vector<String> lineVector = new Vector<String>();//string 타입 vector 객체 lineVector 생성
	
	public WordSearchProgram() { }
	
	private void readFile(String fileName) {//파일을 라인 단위 벡터로 읽어들임
		testFile = new File(fileName);
		try {
			Scanner sc = new Scanner(new FileReader(testFile));
			while(sc.hasNext()) {//파일을 라인 단위로 모두 읽기, 입력된 값 즉, 토큰이 있으면 true 리턴, 토큰이 비어있으면 false 리턴
				String line = sc.nextLine();//한 라인 읽고,
				lineVector.add(line);//한 라인을 벡터에 저장
			}			
			sc.close();
			
		} catch (FileNotFoundException e) {//처리할 예외 타입선언
			e.printStackTrace();/*예외처리문: 리턴값이 없다. 이 메소드를 호출하면 메소드가 내부적으로 예외 결과를 화면에 출력한다.*/
		}
	}
	
	private Vector<Integer> searchWord(String word) {//word가 포함된 라인 번호들을 벡터로 리턴
		Vector<Integer> ivector = new Vector<Integer>();//integer 타입 vector 객체 vector 생성
		for(int i=0; i<lineVector.size(); i++) {
			String line = lineVector.get(i);//한라인씩 가져와서
			if(line.indexOf(word) != -1)//가져온 라인의 (문자열) 내에 특정한 문자열 word의 index값 리턴
				ivector.add(i);//add요소삽입
		}
		return ivector;
	}

	private void printLines(Vector<Integer> noVector) {//단어를 포함하는 모든 라인 번호 리턴값을 받아와서
		for(int i=0; i<noVector.size(); i++) {
			int lineNo = noVector.get(i);//단어를 포함하는 모든 라인 번호 가져오기
			String line = lineVector.get(lineNo);//번호에 해당하는 라인
			System.out.println(lineNo + ":" + line);
		}
	}
	
	public void run() {
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		System.out.print("대상 파일명 입력>> ");
		
		Scanner scanner = new Scanner(System.in);
		String fileName = scanner.nextLine();//라인단위

		readFile(fileName); 
		
		while(true) {
			System.out.print("검색할 단어나 문장>> ");
			String fword = scanner.nextLine();
			
			if(fword.equals("그만"))//입력받은 값이 그만이면,
				break;//프로그램 종료
			Vector<Integer> vector = searchWord(fword);//fword의 단어를 포함하는 모든 라인 번호 리턴
			printLines(vector);//해당 라인들 출력
		}
		scanner.close();
		System.out.println("프로그램을 종료합니다.");
	}
	public static void main(String[] args) {
		WordSearchProgram wsp = new WordSearchProgram();
		wsp.run();
	}
}