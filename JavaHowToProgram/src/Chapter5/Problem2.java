package Chapter5;
import java.util.Scanner;
import java.security.SecureRandom;

//java How to Program 10ed 5.37
public class Problem2{
	public static void main(String[] args) {
		int correctNum = 0;
		String [] arrayCorrect = {"Very good!", "Excellent!", "Nice work!", "Keep up the good work!"};
		String [] arrayIncorrect = {"No. Please try again.", "Wrong. Try once more.", "Don't give up!", "No. Keep trying."};
		SecureRandom rand = new SecureRandom();
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			int num1 = rand.nextInt(9) + 1;
			int num2 = rand.nextInt(9) + 1;	
			int correctAnswer = num1 * num2;
			
			System.out.println("How much is " + num1 + " times " + num2 + "?");
			int answerInt = Integer.parseInt(scanner.nextLine());
			
			String responseCorrect = arrayCorrect[rand.nextInt(4)];
			String responseIncorrect = arrayIncorrect[rand.nextInt(4)];
			if (answerInt == correctAnswer) {
				System.out.println(responseCorrect);
				correctNum += 1;
			} else {
				System.out.println(responseIncorrect);
			}
		}

		double correctPercent = correctNum / 10.0;
		if (correctPercent > 0.75) {
			System.out.println("Congratulations, you are ready to go to the next level!");
		}
		else {
			System.out.println("Please ask your teacher for extra help.");
		}
	}
}
