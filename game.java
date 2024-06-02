package homework;
import java.util.Scanner;
public class game {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("player 1: choose 1:rock, choose 2:scissor, choose 3:paper");
		int Player_1=sc.nextInt();
		System.out.println("player 2: choose 1:rock, choose 2:scissor, choose 3:paper");
		int Player_2=sc.nextInt();
		if(Player_1 == Player_2) {
			System.out.println("Match Tie Between Them");
		}
		else {
			switch(Player_2) {
			case 1:
				if(Player_1 == 3) 
					System.out.println("Player_1 Wins");
					else 
						System.out.println("Player_2 Wins");
						break;
			case 3:
				if(Player_1 == 2)
					System.out.println("Player_1 Wins");
				else
					System.out.println("Player_2 Wins");
				break;
				
			case 2:
				if(Player_1 == 1)
					System.out.println("Player_1 Wins");
				else
					System.out.println("Player_2 Wins");
				break;
					
					
		}
				
			
				
			}
		}
		
		
	

	}


