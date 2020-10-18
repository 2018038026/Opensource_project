import java.util.*;

public class Game_2 {
	private HashMap<String, String> item = new HashMap<String, String>();//나라이름:키 수도:값
	private Scanner scanner = new Scanner(System.in);
	
	public Game_2() {// item에 9 개의 아이템을 입력하여 초기화
		item.put("멕시코", "멕시코시티");//put을 사용하여 요소 삽입
		item.put("스페인", "리스본");
		item.put("프랑스", "파리");
		item.put("영국", "런던");
		item.put("그리스", "아테네");
		item.put("독일", "베를린");
		item.put("일본", "동경");
		item.put("중국", "베이찡");
		item.put("러시아", "모스크바");
	}
	
	public void startGame() {
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		while(true) {
			System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
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
					printError("잘못된 입력입니다.");
			}
		}	
	}
	
	private void inputItem() {
		int n = item.size();
		
		System.out.println("현재 " + n + "개 나라와 수도가 입력되어 있습니다.");
		n++;
		
		while(true) {
			System.out.print("나라와 수도 입력" + n + ">> ");
			String country = scanner.next();
			
			if(country.equals("그만")) {//입력한 값이 그만이면,
				break;
			}
			
			String capital = scanner.next();
			
			if(item.containsKey(country)) {//입력한 값에 일치하는 키가 존재하면
				System.out.println(country + "는 이미 있습니다");
				continue;
			}
			
			item.put(country, capital);
			n++;
		}
	}
	
	private void startQuiz() {
		Set<String> keys = item.keySet();//해시맵의 모든 키를 담은 Set<String> 컬렉션 리턴
		Object [] array = (keys.toArray());//해시맵 배열전환
		
		while(true) {// 나라 중에서 하나를 선택한다.
			int index = (int)(Math.random()*array.length); //랜덤한 위치의 문제 결정
			
			String question = (String)array[index];// 문제(나라)와 정답(수도)을 결정
			String answer = item.get(question);
			
			System.out.print(question + "의 수도는? ");// 문제를 출력
			
			String userAnswer = scanner.next(); // 사용자의 입력
			
			if(userAnswer.equals("그만")) {
				break;
			}
			
			if(userAnswer.equals(answer))
				System.out.println("정답!!");
			else
				System.out.println("아닙니다!!");				
		}	
	}
	
	private void endQuiz() {
		System.out.println("게임을 종료합니다.");	
	}
	
	private void printError(String msg) {
		System.out.println(msg);
	}//에러 메시지 출력
	
	public static void main(String[] args) {
		Game_2 game = new Game_2();
		game.startGame();//게임 동작
	}
}