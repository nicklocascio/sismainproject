import java.util.Scanner;
import java.util.*;
import java.io.*;
public class Runner
	{
	public static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) throws IOException
		{
		Scanner file = new Scanner (new File ("studentInformation.txt"));	
		
		System.out.println("What would you like to do?"
				+ "(1) Add or delete a student."
				+ "(2) Change students grades/ schedule."
				+ "(3) Sort students.");
		int input = userInput.nextInt();
			
			if(input == 1)
			{
				System.out.println("(1) Add a student."
						+ "(2) Delete a student.");
				int input2 = userInput.nextInt();
						if(input2 == 1)
						{
							
							addStudent();
							
						}
						if(input2 == 2)
						{
							 //delete a student
						}
						else
						{
							System.out.println("Please input a valid number.");
						}
			}
			if(input == 2)
			{
				System.out.println("(1) Change grade"
						+ "(2) Switch classes");
				int input3 = userInput.nextInt();
						if(input3 == 1)
						{
							//change grades
						}
						if(input3 == 2)
						{
							//switch classes
						}
						else
						{
							System.out.println("Please input a valid number.");
						}
			}
			if(input ==3)
			{
				System.out.println("(1) Sort by last name."
						+ "(2) Sort by GPA."
						+ "(3) Sort by class.");
				int input4 = userInput.nextInt();
						if(input4 == 1)
						{
							//sort by last name
						}
						if(input4 == 2)
						{
							//Sort by GPA
						}
						if(input4 == 3)
						{
							//Sort by class
						}
						else
						{
							System.out.println("Pleae input a valid number");
						}
				
			}
			
		}
	public static void addStudent()
	{
		System.out.println("Whats the students first name?");
		String firstN = userInput.nextLine();
	System.out.println("What is the students last name?");
		String lastN = userInput.nextLine();
	System.out.println("What is the students first class?");
		String classUno = userInput.nextLine();
	System.out.println("What is the students grade in that class?");
		String gradeUno = userInput.nextLine();
	System.out.println("What is the students second class?");
		String classDos = userInput.nextLine();
	System.out.println("What is the students grade in that class?");
		String gradeDos = userInput.nextLine();
	System.out.println("What is the students third class?");
		String classTres = userInput.nextLine();
	System.out.println("What is the students grade in that class?");
		String gradeTres = userInput.nextLine();
	StudentArray.students.add(new Student(firstN, lastN, classUno, gradeUno, classDos, gradeDos, classTres, gradeTres));
	}
	}