package Chapter5;
import java.util.Scanner;
import java.security.SecureRandom;

//java How to Program 10ed 5.38
public class Problem3{
	public static void main(String[] args) {
		int correctNum = 0;
		SecureRandom rand = new SecureRandom();
		Scanner scanner = new Scanner(System.in);
		String [] arrayCorrect = {"Very good!", "Excellent!", "Nice work!", "Keep up the good work!"};
		String [] arrayIncorrect = {"No. Please try again.", "Wrong. Try once more.", "Don't give up!", "No. Keep trying."};
		
		System.out.println("Please enter a level");
		int level = Integer.parseInt(scanner.nextLine());
		
		int startNum = (int) (Math.pow(10, level - 1));
		int endNum = (int) (Math.pow(10, level) - 1);
		
		for (int i = 0; i < 10; i++) {
			int num1 = rand.nextInt(endNum - startNum + 1) + startNum;
			int num2 = rand.nextInt(endNum - startNum + 1) + startNum;
			int correctAnswer = num1 * num2;
			
			System.out.println("How much is " + num1 + " times " + num2 + "?");
			int answerInt = Integer.parseInt(scanner.nextLine());
			
			if (answerInt == correctAnswer) {
				String responseCorrect = arrayCorrect[rand.nextInt(4)];
				System.out.println(responseCorrect);
				correctNum += 1;
			} else {
				String responseIncorrect = arrayIncorrect[rand.nextInt(4)];
				System.out.println(responseIncorrect);
			}
		}
		
		if (correctNum / 10.0 > 0.75) {
			System.out.println("Congratulations, you are ready to go to the next level!");
		}
		else {
			System.out.println("Please ask your teacher for extra help.");
		}
	}
}
