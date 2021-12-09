
/* A group of students has been told to get into teams a specific size for their coursework.
 * Design and implement a program that prompts for the number of students in the group and the size
 * of the teams to be formed, and displays how many teams can be formed and how many students are
 * left without a team.
 * 
 * BEGIN
 * ask for number of students
 * ask for how many can be on a team
 * display how many teams can be formed
 * display how many students are left without a team
 * END
 * 
 * 
 */

import java.util.*;

public class StudentTeams {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many students are there in total? ");
		int students = sc.nextInt();
		System.out.println("How many students can be on a team? ");
		int teamMembers = sc.nextInt();
		int teams = students / teamMembers;
		int remaining = students % teamMembers;
		System.out.println("There are " + students + " in total. We can form " + teams + " teams made up of " 
		+ teamMembers + " members with " + remaining + " students remaining.");
	}

}
