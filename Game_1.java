import java.util.Scanner;
import java.util.Vector;

public class Game_1 {
	private Vector<Nation> item = new Vector<Nation>();//Vector<Nation>컬렉션, item 객체
	private Scanner scanner = new Scanner(System.in);
	
	public Game_1() {// item에 9 개의 아이템을 입력하여 초기화
		item.add(new Nation("멕시코", "멕시코시티"));//add()를 이용하여 요소 삽입
		item.add(new Nation("스페인", "리스본"));
		item.add(new Nation("프랑스", "파리"));
		item.add(new Nation("영국", "런던"));
		item.add(new Nation("그리스", "아테네"));
		item.add(new Nation("독일", "베를린"));
		item.add(new Nation("일본", "동경"));
		item.add(new Nation("중국", "베이징"));
		item.add(new Nation("러시아", "모스크바"));
	}
	
	public void startGame() {//게임 시작 메뉴
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
	
	private boolean contains(String country) {//벡터에 추가로 입력받은 나라country가 있다면 true 리턴
		for(int i=0; i<item.size(); i++) {//get()을 이용하여 요소 검색
			if(item.get(i).getCountry().equals(country)) { // 사용자가 입력한 나라가 이미 있다면
				return true;
			}
		}
		return false;
	}
	
	private void inputItem() {//나라와 수도 입력
		int n = item.size();
		
		System.out.println("현재 " + n + "개 나라와 수도가 입력되어 있습니다.");
		n++;
		
		while(true) {
			System.out.print("나라와 수도 입력" + n + ">> ");
			String country = scanner.next(); //나라 추가로 입력
			
			if(country.equals("그만")) {//그만이면 입력 종료
				break;
			}
			
			String capital = scanner.next(); //수도 추가로 입력
			
			if(contains(country)) { //추가로 입력한 나라가 이미 있다면>>true이면
				System.out.println(country + "는 이미 있습니다!");
				continue;
			}
			
			item.add(new Nation(country, capital));//추가 입력 나라가 없다면 추가>>false 이면
			n++;
		}
	}
	
	private void startQuiz() {
		while(true) {// 나라 중에서 하나를 선택
			int index = (int)(Math.random()*item.size()); //랜덤한 위치의 문제 결정
			
			Nation nation = item.get(index);// 문제(나라)와 정답(수도)을 결정
			String question = nation.getCountry();
			String answer = nation.getCapital();
			
			System.out.print(question + "의 수도는? ");//문제를 출력
			
			String userAnswer = scanner.next();//참가자의 정답 입력
			
			if(userAnswer.equals("그만")) {//퀴즈 종료
				break;
			}
			
			if(userAnswer.equals(answer))//참가자의 정답과 문제의 정답이 같으면
				System.out.println("정답!!");
			else
				System.out.println("아닙니다!!");				
		}	
	}
	
	private void endQuiz() {
		System.out.println("게임을 종료합니다.");	
	}
	
	private void printError(String msg) {
		System.out.println(msg);//에러 메시지 출력
	}
	
	public static void main(String[] args) {
		Game_1 game = new Game_1();
		game.startGame();//게임 동작
	}
}

class Nation {
	private String country;
	private String capital;
	
	public Nation(String country, String capital) {//나라 이름과 수도로 구성된 Nation 클래스
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