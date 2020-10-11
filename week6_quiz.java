import java.util.Scanner;

class Person {
	private int num1, num2, num3;
	public String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public boolean game() {
		num1 = (int)((Math.random()*3)+1);//난수  생성
		num2 = (int)((Math.random()*3)+1);
		num3 = (int)((Math.random()*3)+1);
		
		System.out.print("\t" + num1 + " " + num2 + " " + num3 + " ");
		if(num1 == num2 && num2 == num3)//생성된 난수들이 다 같으면
			return true;//승리
		else
			return false;
	}
}

public class week6_quiz {

	public static void main(String[] args) {//2개의 person 객체 생성
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1번째 선수 이름>>");
		String name = sc.next();
		Person person1 = new Person(name);
		
		System.out.print("2번째 선수 이름>>");
		name = sc.next();
		Person person2 = new Person(name);
		
		String buffer = sc.nextLine();
		
		while(true) {
			System.out.print("[" + person1.name + "]:<Enter>");//person1의 차례
			buffer = sc.nextLine();
			
			if(person1.game()) {
				System.out.println(person1.name + "님이 이겼습니다!");
				break;
			}
			System.out.println("아쉽군요!");
			
			System.out.print("[" + person2.name + "]:<Enter>");//person2의 차례
			buffer = sc.nextLine();
			
			if(person2.game()) {
				System.out.println(person2.name + "님이 이겼습니다!");
				break;
			}
			System.out.println("아쉽군요!");
		}
		sc.close();
	}

}
