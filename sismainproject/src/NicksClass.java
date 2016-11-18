import java.util.Scanner;

public class NicksClass
	{
	// HEY HOW BOUT YOU MAKE A METHOD TO PRINT OUT THEIR BUISNESS BRO
	public static void changeGrade()
		{
		// Getting student
		System.out.println("");
		Scanner userInput = new Scanner(System.in);
		System.out.println("Which student's grade would you like to change?");
		for(int i = 0; i < StudentArray.students.size(); i++)
			{
			System.out.println((i+1) + ". " + StudentArray.students.get(i).getFirstName() + " " + StudentArray.students.get(i).getLastName() );
			}
		int choice = userInput.nextInt()-1;
		System.out.println("Here is their information: ");
		System.out.println("1. " + StudentArray.students.get(choice).getClass1() + " " + StudentArray.students.get(choice).getGrade1());
		System.out.println("2. " + StudentArray.students.get(choice).getClass2() + " " + StudentArray.students.get(choice).getGrade2());
		System.out.println("3. " + StudentArray.students.get(choice).getClass3() + " " + StudentArray.students.get(choice).getGrade3());
		// Getting which class
		Scanner userInput2 = new Scanner(System.in);
		System.out.println("For which class would you like to change the grade?");
		int classNum = userInput2.nextInt();
		if(classNum == 1)
			{
			Scanner userInput3 = new Scanner(System.in);
			System.out.println("What would you like to change the grade to?");
			String newGrade = userInput3.nextLine();
			StudentArray.students.get(choice).setGrade1(newGrade);
			System.out.println(StudentArray.students.get(choice));
			}
		if(classNum == 2)
		{
			Scanner userInput3 = new Scanner(System.in);
			System.out.println("What would you like to change the grade to?");
			String newGrade = userInput3.nextLine();
			StudentArray.students.get(choice).setGrade2(newGrade);
			System.out.println(StudentArray.students.get(choice));
			}
		if(classNum == 3)
			{
			Scanner userInput3 = new Scanner(System.in);
			System.out.println("What would you like to change the grade to?");
			String newGrade = userInput3.nextLine();
			StudentArray.students.get(choice).setGrade3(newGrade);
			System.out.println(StudentArray.students.get(choice));
			}
		}
	
	public static void changeClass() // SWITCH ANY TWO CLASSES 
		{
		// Getting the student 
		System.out.println("");
		Scanner userInput = new Scanner(System.in);
		System.out.println("Which student's class would you like to change?");
		int choice = userInput.nextInt()-1;
		System.out.println("Here is their information: ");
		System.out.println(StudentArray.students.get(choice));
		// Getting the class
		Scanner userInput2 = new Scanner(System.in);
		System.out.println("For which class would you like to change the grade?");
		int classNum = userInput2.nextInt();
		if(classNum == 1)
			{
			
			}
		}
	}
