import java.util.Scanner;

public class quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str[] = {"가위", "바위", "보"};
		String User, Computer;
		int n;//컴퓨터나 내는 것
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		do {
			System.out.print("가위 바위 보! >> ");
			User = sc.next();//문자열을 입력받는다
			
			if(User.equals("그만"))//입력받은 문자열이 그만이면,
				break;//반복문을 벗어난다
			
			n = (int)(Math.random()*3);//array[0]=가위, array[1]=바위, array[2]=보...0~2까지 숫자 랜덤하게 결정
			Computer = str[n];//해당 문자열을 할당
			
			if(User.equals("가위")) {//사용자가 가위를 입력했을때,
				if(str[n].equals("가위")) {//컴퓨터도 가위이면,
					System.out.println("사용자 = "+User+", 컴퓨터 = "+Computer+" 비겼습니다.");
					continue;
				}
				else if(str[n].equals("바위")) {//컴퓨터가 바위이면,
					System.out.println("사용자 = "+User+", 컴퓨터 = "+Computer+" 사용자가 졌습니다.");
					continue;
				}
				else if(str[n].equals("보")) {//컴퓨터가 보이면,
					System.out.println("사용자 = "+User+", 컴퓨터 = "+Computer+" 사용자가 이겼습니다.");
					continue;
				}
		    }
			else if(User.equals("바위")) {//사용자가 바위를 입력했을때,
				if(str[n].equals("가위")) {//컴퓨터가 가위이면,
					System.out.println("사용자 = "+User+", 컴퓨터 = "+Computer+" 사용자가 이겼습니다.");
					continue;
				}
				else if(str[n].equals("바위")) {//컴퓨터도 바위이면,
					System.out.println("사용자 = "+User+", 컴퓨터 = "+Computer+" 비겼습니다.");
					continue;
				}
				else if(str[n].equals("보")) {//컴퓨터가 보이면,
					System.out.println("사용자 = "+User+", 컴퓨터 = "+Computer+" 사용자가 졌습니다.");
					continue;
				}
			}
			else if(User.equals("보")) {//사용자가 보를 입력했을떄,
				if(str[n].equals("가위")) {//컴퓨터가 가위이면,
					System.out.println("사용자 = "+User+", 컴퓨터 = "+Computer+" 사용자가 졌습니다.");
					continue;
				}
				else if(str[n].equals("바위")) {//컴퓨터가 바위이면,
					System.out.println("사용자 = "+User+", 컴퓨터 = "+Computer+" 사용자가 이겼습니다.");
					continue;
				}
				else if(str[n].equals("보")) {//컴퓨터도 보이면,
					System.out.println("사용자 = "+User+", 컴퓨터 = "+Computer+" 비겼습니다.");
					continue;
				}
		    }
        }while(true);
		
		System.out.println("게임을 종료합니다...");//반복문을 벗어나게 되면 출력
		sc.close();
    }
}