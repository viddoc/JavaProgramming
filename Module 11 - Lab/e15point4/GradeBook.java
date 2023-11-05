package e15point4;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;

public class GradeBook 
{
	//Instance Variable for the Gradebook
	private Map<String, String> studentGrades = new HashMap<String, String>();
	
	//Empty Constructor
	public GradeBook(){}
	/**
	 * Method to add or change a grade
	 * @param name of student that will be added or modified
	 * @param grade The grade that will be added or modified
	 */
	public void putStudentGrade(String name, String grade)
	{
		this.studentGrades.put(name, grade);
	}
	/**
	 * Method to remove student from gradebook
	 * @param name of student to remove
	 */
	public void removeStudent(String name)
	{
		this.studentGrades.remove(name);
	}
	/**
	 * Getter method for the grade of the student name input
	 * @param name of the student to grade for
	 * @return grade of the student
	 */
	public String getGrade(String name)
	{
		return this.studentGrades.get(name);
	}
	/**
	 * Method to print all students and their grades from the gradebook
	 */
	public void printGradeBook()
	{
		Set<String> keySet = this.studentGrades.keySet();
		System.out.println("-------------------------------");
		for(String key : keySet)
		{
			String grade = this.studentGrades.get(key);
			System.out.printf("%s%s", key + ": ", grade + "\n");
		}
		System.out.println("-------------------------------");
	}
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		GradeBook gb = new GradeBook();
		boolean exit = false;
		String name, grade;
		
		do
		{
			//Menu and options
			System.out.println("-------------------------------");
			System.out.println("-       Grade Book Menu       -");
			System.out.println("- 1. Add Student              -");
			System.out.println("- 2. Remove Student           -");
			System.out.println("- 3. Modify Grade             -");
			System.out.println("- 4. Print All Grades         -");
			System.out.println("- 5. Exit                     -");
			System.out.println("-------------------------------");
			System.out.print("Please make selection: ");
			String choice = in.next();
			//Switch Statement to implement menu choices
			switch(choice)
			{
			case "1":
				System.out.print("Student Name: ");
				name = in.next();
				System.out.print("Student Grade: ");
				grade = in.next();
				gb.putStudentGrade(name, grade);
				break;
			case "2":
				System.out.print("Student Name: ");
				name = in.next();
				gb.removeStudent(name);
				break;
			case "3":
				System.out.print("Student Name: ");
				name = in.next();
				System.out.print("Student Grade: ");
				grade = in.next();
				gb.putStudentGrade(name, grade);
				break;
			case "4":
				gb.printGradeBook();
				break;
			case "5":
				exit = true;
				break;
			default :
				System.out.println("This is not a valid menu option.");
				break;
			}
		}while(exit == false);
		in.close();

	}

}
