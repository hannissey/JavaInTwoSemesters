
import java.util.*;

public class DisplayResult2 {
	public static void main(String[] args) 
	{
		int mark;
		Scanner sc = new Scanner(System.in);
		System.out.println("What exam mark did you get? ");
		mark = sc.nextInt();
		
		if (mark >= 70) {
			System.out.println("Congratulations, you have been awarded a Distinction. ");
		}
			else if (mark >= 40)
			{
			System.out.println("Congratulations, you passed! ");
			}
			else
			{
			System.out.println("I'm sorry, but you've failed.");
			}
		System.out.println("Good luck with your other exams.");
	}
}
