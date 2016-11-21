import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class NicksClass
	{
	public static void changeGrade() // DONE
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
		// Switching
		if(classNum == 1)
			{
			Scanner userInput3 = new Scanner(System.in);
			System.out.println("What would you like to change the grade to?");
			String newGrade = userInput3.nextLine();
			StudentArray.students.get(choice).setGrade1(newGrade);
			System.out.println("Here is their new information:");
			System.out.println("1. " + StudentArray.students.get(choice).getClass1() + " " + StudentArray.students.get(choice).getGrade1());
			System.out.println("2. " + StudentArray.students.get(choice).getClass2() + " " + StudentArray.students.get(choice).getGrade2());
			System.out.println("3. " + StudentArray.students.get(choice).getClass3() + " " + StudentArray.students.get(choice).getGrade3());
			}
		if(classNum == 2)
			{
			Scanner userInput3 = new Scanner(System.in);
			System.out.println("What would you like to change the grade to?");
			String newGrade = userInput3.nextLine();
			StudentArray.students.get(choice).setGrade2(newGrade);
			System.out.println("Here is their new information:");
			System.out.println("1. " + StudentArray.students.get(choice).getClass1() + " " + StudentArray.students.get(choice).getGrade1());
			System.out.println("2. " + StudentArray.students.get(choice).getClass2() + " " + StudentArray.students.get(choice).getGrade2());
			System.out.println("3. " + StudentArray.students.get(choice).getClass3() + " " + StudentArray.students.get(choice).getGrade3());
			}
		if(classNum == 3)
			{
			Scanner userInput3 = new Scanner(System.in);
			System.out.println("What would you like to change the grade to?");
			String newGrade = userInput3.nextLine();
			StudentArray.students.get(choice).setGrade3(newGrade);
			System.out.println("Here is their new information:");
			System.out.println("1. " + StudentArray.students.get(choice).getClass1() + " " + StudentArray.students.get(choice).getGrade1());
			System.out.println("2. " + StudentArray.students.get(choice).getClass2() + " " + StudentArray.students.get(choice).getGrade2());
			System.out.println("3. " + StudentArray.students.get(choice).getClass3() + " " + StudentArray.students.get(choice).getGrade3());
			}
		}
	
	public static void changeClass() // DONE
		{
		// Getting the student 
		System.out.println("");
		Scanner userInput = new Scanner(System.in);
		System.out.println("Which student's class would you like to change?");
		for(int i = 0; i < StudentArray.students.size(); i++)
			{
			System.out.println((i+1) + ". " + StudentArray.students.get(i).getFirstName() + " " + StudentArray.students.get(i).getLastName() );
			}
		int choice = userInput.nextInt()-1;
		System.out.println("Here is " + StudentArray.students.get(choice).getFirstName() + "'s information: ");
		System.out.println("Period 1: " + StudentArray.students.get(choice).getClass1());
		System.out.println("Period 2: " + StudentArray.students.get(choice).getClass2());
		System.out.println("Period 3: " + StudentArray.students.get(choice).getClass3()); 
		// Getting the class 
		Scanner userInput2 = new Scanner(System.in);
		System.out.println("Which class do you want to change?");
		int classNum1 = userInput2.nextInt();
		Scanner userInput3 = new Scanner(System.in);
		System.out.println("What class do you want to switch it with?");
		int classNum2 = userInput3.nextInt();
		// Switching
		if((classNum1 == 1 && classNum2 == 2) || (classNum1 == 2 && classNum2 == 1))
			{
			String temp = StudentArray.students.get(choice).getClass1();
			StudentArray.students.get(choice).setClass1(StudentArray.students.get(choice).getClass2());
			StudentArray.students.get(choice).setClass2(temp);
			}
		if((classNum1 == 1 && classNum2 == 3) || (classNum1 == 3 && classNum2 == 1))
			{
			String temp = StudentArray.students.get(choice).getClass1();
			StudentArray.students.get(choice).setClass1(StudentArray.students.get(choice).getClass3());
			StudentArray.students.get(choice).setClass3(temp);
			}
		if((classNum1 == 2 && classNum2 == 3) || (classNum1 == 3 && classNum2 == 2))
			{
			String temp = StudentArray.students.get(choice).getClass2();
			StudentArray.students.get(choice).setClass2(StudentArray.students.get(choice).getClass3());
			StudentArray.students.get(choice).setClass3(temp);
			}
		System.out.println("Here is the new information: ");
		System.out.println("Period 1: " + StudentArray.students.get(choice).getClass1());
		System.out.println("Period 2: " + StudentArray.students.get(choice).getClass2());
		System.out.println("Period 3: " + StudentArray.students.get(choice).getClass3()); 
		}
	
	public static Comparator<Student> LastNameComparator = new Comparator <Student>()
		{
		public int compare(Student s1, Student s2)
			{
			String StudentName1 = s1.getLastName().toUpperCase();
			String StudentName2 = s2.getLastName().toUpperCase();
			return StudentName1.compareTo(StudentName2);
			}

		public int compare1(Student o1, Student o2)
			{
			// TODO Auto-generated method stub
			return 0;
			}
		};
		
	public static void sortLastName()
		{
		System.out.println("Sorting by last name: ");
		Collections.sort(StudentArray.students, LastNameComparator);
		for(int i = 0; i < StudentArray.students.size(); i++)
			{
			System.out.println(StudentArray.students.get(i).getFirstName() + " " + StudentArray.students.get(i).getLastName());
			}
		}
	
	public static Comparator<Student> ClassPeriod1Comparator = new Comparator <Student>()
		{
		public int compare(Student s1, Student s2)
			{
			String StudentClass1 = s1.getClass1().toUpperCase();
			String StudentClass2 = s2.getClass1().toUpperCase();
			return StudentClass1.compareTo(StudentClass2);
			}

		public int compare1(Student o1, Student o2)
			{
			// TODO Auto-generated method stub
			return 0;
			}
		};
		
		public static Comparator<Student> ClassPeriod2Comparator = new Comparator <Student>()
			{
			public int compare(Student s1, Student s2)
				{
				String StudentClass1 = s1.getClass2().toUpperCase();
				String StudentClass2 = s2.getClass2().toUpperCase();
				return StudentClass1.compareTo(StudentClass2);
				}

			public int compare1(Student o1, Student o2)
				{
				// TODO Auto-generated method stub
				return 0;
				}
			};
			
			public static Comparator<Student> ClassPeriod3Comparator = new Comparator <Student>()
				{
				public int compare(Student s1, Student s2)
					{
					String StudentClass1 = s1.getClass3().toUpperCase();
					String StudentClass2 = s2.getClass3().toUpperCase();
					return StudentClass1.compareTo(StudentClass2);
					}

				public int compare1(Student o1, Student o2)
					{
					// TODO Auto-generated method stub
					return 0;
					}
				};
		
	public static void sortClassPeriod1()
		{
		System.out.println("Sorting first period classes: ");
		Collections.sort(StudentArray.students, ClassPeriod1Comparator);
		for(int i = 0; i < StudentArray.students.size(); i++)
			{
			System.out.println(StudentArray.students.get(i).getFirstName() + " " + StudentArray.students.get(i).getLastName() + ": " + StudentArray.students.get(i).getClass1());
			}
		}
	
	public static void sortClassPeriod2()
		{
		System.out.println("Sorting second period classes: ");
		Collections.sort(StudentArray.students, ClassPeriod2Comparator);
		for(int i = 0; i < StudentArray.students.size(); i++)
			{
			System.out.println(StudentArray.students.get(i).getFirstName() + " " + StudentArray.students.get(i).getLastName() + ": " + StudentArray.students.get(i).getClass2());
			}
		}
	
	public static void sortClassPeriod3()
		{
		System.out.println("Sorting third period classes: ");
		Collections.sort(StudentArray.students, ClassPeriod3Comparator);
		for(int i = 0; i < StudentArray.students.size(); i++)
			{
			System.out.println(StudentArray.students.get(i).getFirstName() + " " + StudentArray.students.get(i).getLastName() + ": " + StudentArray.students.get(i).getClass3());
			}
		}
	
	public static void calculateGPA()
		{
		double grade1 = 0;
		double grade2 = 0;
		double grade3 = 0;
		for(int i = 0; i < StudentArray.students.size(); i++)
			{
			// Grade 1
			if(StudentArray.students.get(i).getGrade1().substring(0,1).equals("A"))
				{
				grade1 = 4.0;	
				}
			if(StudentArray.students.get(i).getGrade1().substring(0,1).equals("A+"))
				{
				grade1 = 4.3;	
				}
			if(StudentArray.students.get(i).getGrade1().substring(0,1).equals("A-"))
				{
				grade1 = 3.7;	
				}
			if(StudentArray.students.get(i).getGrade1().substring(0,1).equals("B"))
				{
				grade1 = 3.0;	
				}
			if(StudentArray.students.get(i).getGrade1().substring(0,1).equals("B+"))
				{
				grade1 = 3.3;	
				}
			if(StudentArray.students.get(i).getGrade1().substring(0,1).equals("B-"))
				{
				grade1 = 2.7;	
				}
			if(StudentArray.students.get(i).getGrade1().substring(0,1).equals("C"))
				{
				grade1 = 2.0;	
				}
			if(StudentArray.students.get(i).getGrade1().substring(0,1).equals("C+"))
				{
				grade1 = 2.3;	
				}
			if(StudentArray.students.get(i).getGrade1().substring(0,1).equals("C-"))
				{
				grade1 = 1.7;	
				}
			if(StudentArray.students.get(i).getGrade1().substring(0,1).equals("D"))
				{
				grade1 = 1.0;	
				}
			if(StudentArray.students.get(i).getGrade1().substring(0,1).equals("D+"))
				{
				grade1 = 1.3;	
				}
			if(StudentArray.students.get(i).getGrade1().substring(0,1).equals("D-"))
				{
				grade1 = 0.7;	
				}
			if(StudentArray.students.get(i).getGrade1().substring(0,1).equals("F"))
				{
				grade1 = 0.0;	
				}
			// Grade 2
			if(StudentArray.students.get(i).getGrade2().substring(0,1).equals("A"))
				{
				grade2 = 4.0;	
				}
			if(StudentArray.students.get(i).getGrade2().substring(0,1).equals("A+"))
				{
				grade2 = 4.3;	
				}
			if(StudentArray.students.get(i).getGrade2().substring(0,1).equals("A-"))
				{
				grade2 = 3.7;	
				}
			if(StudentArray.students.get(i).getGrade2().substring(0,1).equals("B"))
				{
				grade2 = 3.0;	
				}
			if(StudentArray.students.get(i).getGrade2().substring(0,1).equals("B+"))
				{
				grade2 = 3.3;	
				}
			if(StudentArray.students.get(i).getGrade2().substring(0,1).equals("B-"))
				{
				grade2 = 2.7;	
				}
			if(StudentArray.students.get(i).getGrade2().substring(0,1).equals("C"))
				{
				grade2 = 2.0;	
				}
			if(StudentArray.students.get(i).getGrade2().substring(0,1).equals("C+"))
				{
				grade2 = 2.3;	
				}
			if(StudentArray.students.get(i).getGrade2().substring(0,1).equals("C-"))
				{
				grade2 = 1.7;	
				}
			if(StudentArray.students.get(i).getGrade2().substring(0,1).equals("D"))
				{
				grade2 = 1.0;	
				}
			if(StudentArray.students.get(i).getGrade2().substring(0,1).equals("D+"))
				{
				grade2 = 1.3;	
				}
			if(StudentArray.students.get(i).getGrade2().substring(0,1).equals("D-"))
				{
				grade2 = 0.7;	
				}
			if(StudentArray.students.get(i).getGrade2().substring(0,1).equals("F"))
				{
				grade2 = 0.0;	
				}
			// Grade 3
			if(StudentArray.students.get(i).getGrade3().substring(0,1).equals("A"))
				{
				grade3 = 4.0;	
				}
			if(StudentArray.students.get(i).getGrade3().substring(0,1).equals("A+"))
				{
				grade3 = 4.3;	
				}
			if(StudentArray.students.get(i).getGrade3().substring(0,1).equals("A-"))
				{
				grade3 = 3.7;	
				}
			if(StudentArray.students.get(i).getGrade3().substring(0,1).equals("B"))
				{
				grade3 = 3.0;	
				}
			if(StudentArray.students.get(i).getGrade3().substring(0,1).equals("B+"))
				{
				grade3 = 3.3;	
				}
			if(StudentArray.students.get(i).getGrade3().substring(0,1).equals("B-"))
				{
				grade3 = 2.7;	
				}
			if(StudentArray.students.get(i).getGrade3().substring(0,1).equals("C"))
				{
				grade3 = 2.0;	
				}
			if(StudentArray.students.get(i).getGrade3().substring(0,1).equals("C+"))
				{
				grade3 = 2.3;	
				}
			if(StudentArray.students.get(i).getGrade3().substring(0,1).equals("C-"))
				{
				grade3 = 1.7;	
				}
			if(StudentArray.students.get(i).getGrade3().substring(0,1).equals("D"))
				{
				grade3 = 1.0;	
				}
			if(StudentArray.students.get(i).getGrade3().substring(0,1).equals("D+"))
				{
				grade3 = 1.3;	
				}
			if(StudentArray.students.get(i).getGrade3().substring(0,1).equals("D-"))
				{
				grade3 = 0.7;	
				}
			if(StudentArray.students.get(i).getGrade3().substring(0,1).equals("F"))
				{
				grade3 = 0.0;	
				}
			
			double total = (grade1 + grade2 + grade3);
			double GPA = total/3;
			System.out.println(GPA);
			ArrayList <Student> GPAList = new ArrayList <Student>();
			GPAList.add(new Student(StudentArray.students.get(i).getFirstName(), GPA));
//			for(Student hi : GPAList)
//				{
//				System.out.println(hi);
//				}
			//System.out.println(GPA);
			}		
		}
	}
