import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentArray
	{
	static ArrayList <Student> students = new ArrayList <Student>();
	public static void studentArray() throws IOException
		{	
		Scanner file = new Scanner(new File("studentInformation.txt"));
		while(file.hasNext())
			{
			String line = file.nextLine();
			String[] information = line.split(" ");
			//System.out.println(Arrays.toString(information));		
			students.add(new Student(information[0], information[1], information[2], information[3], information[4], information[5], information[6], information[7], 0));		
			}
		//System.out.println(students);
		// LOL IDIOT DONT KEEP THE PRINT IN THE FILL ARRAY METHOD
//		for(int i = 0; i < students.size(); i++)
//			{
//			System.out.print("Student " + (i+1) + ": ");
//			System.out.println(students.get(i));
//			}
		}
	}
