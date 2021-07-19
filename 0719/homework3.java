
import java.util.Scanner;

public class homework3 {


			public static int start() { 
				// 가위바위보 게임 메소드 
				System.out.println("가위바위보 하나 중 입력: ");
				Scanner sc = new Scanner(System.in);
				String user = sc.next(); // 사용자가 "가위", "바위", "보" 중 입력
				int com = (int) (Math.random() * 3); // 컴퓨터가 0~2 랜덤 선택
				String[] arr = { "가위", "바위", "보" }; // 위에서 나온 랜덤 숫자와 배열을 통해 가위바위보 문자열을 뽑아냄
				
				if (user.equals(arr[com])) { // 비길 경우 0을 리턴
					System.out.println("비겼습니다!!!");
					return 0;
				} else if (user.equals("가위") && arr[com].equals("보")) { // 사용자가 이길 경우 1을 리턴
					System.out.println("이겼습니다!!!");
					return 1;
				} else if (user.equals("바위") && arr[com].equals("가위")) {
					System.out.println("이겼습니다!!!");
					return 1;
				} else if (user.equals("보") && arr[com].equals("바위")) {
					System.out.println("이겼습니다!!!");
					return 1;
				} else { // 사용자가 질 경우 -1을 리턴
					System.out.println("졌습니다!!!");
					return -1;
				}
			}
			
			public static void Result(int userWin, int comWin) {
				
				if (userWin > comWin) {
					System.out.println("### 사용자 승!!!");
				}
				if (userWin < comWin) {
					System.out.println("### 컴퓨터 승!!!");
				}
			}

			public static void main(String[] args) {
				// 메인 메소드
				Scanner sc = new Scanner(System.in);
				System.out.println("가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.");
				System.out.println("1. 5판 3승");
				System.out.println("2. 3판 2승");
				System.out.println("3. 1판 1승");
				int choice = sc.nextInt(); // 1~3번으로 가위바위보 방식 선택
				int userWin = 0; // 사용자가 이긴 횟수
				int comWin = 0; // 컴퓨터가 이긴 횟수

				
				int [ ] fastWin = {3, 2, 1}; // 3승, 2승, 1승
					for (int i = 0; i < 20; i++) { 
						// choice(1~3번)를 -1 해서 배열의 인덱스로 활용 // 이에 따라 반복문 5번, 3번, 1번 돌림
						int score = start();
						switch (score) {
						case 1: userWin += 1; break;
						case -1: comWin += 1; break;
						}
						if(userWin == fastWin[choice-1] || comWin == fastWin[choice-1]) break;
						// 5판, 3판, 1판 게임에서 3승, 2승, 1승 했을 경우 게임 조기 종료
					}
					Result(userWin, comWin);
				}
			}
			
	
 

