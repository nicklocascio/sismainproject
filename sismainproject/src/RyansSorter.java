import java.io.IOException;
import java.util.Comparator;

public class RyansSorter
	{
		public static void GPASorter() throws IOException
			{
				StudentArray.studentArray();
				for (int i=0; i<StudentArray.students.size(); i++)
					{

					}
			}
		public static void LastNameSorter() 
			{
				StudentArray.studentArray();
				for (int i=0; i<StudentArray.students.size(); i++)
					{
						
						Collections.sort(students, new Comparator<Student> ()
							{
							public int compare(Student.getName students1, Student.getName students2)
								{
									
								}
							});
					}
			}
		public static void ClassSorter()
			{
				
			}

	}
