package Chapter5;
import java.util.Scanner;
import java.security.SecureRandom;

//java How to Program 10ed 5.35~36
public class Problem1{
	public static void main(String[] args) {
		String [] arrayCorrect = {"Very good!", "Excellent!", "Nice work!", "Keep up the good work!"};
		String [] arrayIncorrect = {"No. Please try again.", "Wrong. Try once more.", "Don't give up!", "No. Keep trying."};
		
		SecureRandom rand = new SecureRandom();
		int num1 = rand.nextInt(9) + 1;
		int num2 = rand.nextInt(9) + 1;	
		int correctAnswer = num1 * num2;
		
		System.out.println("How much is " + num1 + " times " + num2 + "?");
		Scanner scanner = new Scanner(System.in);
		int answerInt = Integer.parseInt(scanner.nextLine());
		
		while (answerInt != correctAnswer) {
			String responseIncorrect = arrayIncorrect[rand.nextInt(4)];
			System.out.println(responseIncorrect);
			answerInt = Integer.parseInt(scanner.nextLine());
		}
		String responseCorrect = arrayCorrect[rand.nextInt(4)];
		if (answerInt == correctAnswer) {
			System.out.println(responseCorrect);
		}
	}
}
