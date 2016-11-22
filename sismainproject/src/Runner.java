import java.util.Scanner;
import java.util.*;
import java.io.*;
public class Runner
	{
	public static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) throws IOException
		{
		StudentArray.studentArray();
		NicksClass.calculateGPA();
//		System.out.println("Welcome! Here is your class list: ");
//		for(Student hi : StudentArray.students)
//			{
//			System.out.println(hi);	
//			}
//		System.out.println(" ");
		boolean stillWorking = true;
		while(stillWorking)
			{
			Scanner file = new Scanner (new File ("studentInformation.txt"));	
			
			System.out.println("What would you like to do? \n"
					+ "(1) Add or delete a student. \n"
					+ "(2) Change students grades/schedule. \n"
					+ "(3) Sort students.");
			int input = userInput.nextInt();
				
			if(input == 1)
				{
				System.out.println("(1) Add a student. \n"
							+ "(2) Delete a student.");
				int input2 = userInput.nextInt();
				if(input2 == 1)
					{
					addStudent();
					}
				else if(input2 == 2)
					{
					deleteStudent();
					}		
				}
			if(input == 2)
				{
				System.out.println("(1) Change grade. \n"
						+ "(2) Switch classes.");
				int input3 = userInput.nextInt();
				if(input3 == 1)
					{
					NicksClass.changeGrade();
					}
				else if(input3 == 2)
					{
					NicksClass.changeClass();
					}						
				}
			if(input ==3)
				{
				System.out.println("(1) Sort by last name. \n"
							+ "(2) Sort by GPA. \n"
							+ "(3) Sort by class.");
				int input4 = userInput.nextInt();
				if(input4 == 1)
					{
					NicksClass.sortLastName();
					}
				else if(input4 == 2)
					{
					NicksClass.sortGPA();
					}
				else if(input4 == 3)
					{
					System.out.println("(1) Do you want to sort by period 1? \n"
							+ "(2) Sort by period 2? \n"
							+ "(3) Sort by period 3?");
					int input5 = userInput.nextInt();
					if(input5 == 1)
						{
						NicksClass.sortClassPeriod1();
						}
					else if(input5 == 2)
						{
						NicksClass.sortClassPeriod2();
						}
					else if(input == 3)
						{
						NicksClass.sortClassPeriod3();
						}						
					}
				}
			Scanner userInput = new Scanner(System.in);
			System.out.println("Would you like to do something else?");
			String more = userInput.nextLine();
			if(more.toLowerCase().equals("yes"))
				{
				stillWorking = true;	
				}
			else if(more.toLowerCase().equals("no"))
				{
				System.out.println("Have a good day!");
				stillWorking = false;	
				}
			}		
		}
	
	public static void addStudent()
		{
			String loser = userInput.nextLine();
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
		StudentArray.students.add(new Student(firstN, lastN, classUno, gradeUno, classDos, gradeDos, classTres, gradeTres, 0));
		NicksClass.calculateGPA();
		System.out.println("Here is the updated list: ");
		for(int i = 0; i < StudentArray.students.size(); i++)
			{
			System.out.println((i+1) + ". " + StudentArray.students.get(i).getFirstName() + " " + StudentArray.students.get(i).getLastName() );
			}	
		}
	
	public static void deleteStudent()
		{
		System.out.println("Which student would you like to remove?");
		for(int i = 0; i < StudentArray.students.size(); i++)
			{
			System.out.println((i+1) + ". " + StudentArray.students.get(i).getFirstName() + " " + StudentArray.students.get(i).getLastName() );
			}
		int theStudent = userInput.nextInt();
		StudentArray.students.remove(theStudent-1);
		System.out.println("Here is the new list: ");
		for(int i = 0; i < StudentArray.students.size(); i++)
			{
			System.out.println((i+1) + ". " + StudentArray.students.get(i).getFirstName() + " " + StudentArray.students.get(i).getLastName() );
			}	
		}
	}



