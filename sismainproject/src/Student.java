
public class Student
	{
	private String firstName;
	private String lastName;
	private String class1;
	private String grade1;
	private String class2;
	private String grade2;
	private String class3;
	private String grade3;
	public Student(String a, String b, String c, String d, String e, String f, String g, String h)	
		{
		firstName = a;
		lastName = b;
		class1 = c;
		grade1 = d;
		class2 = e;
		grade2 = f;
		class3 = g;
		grade3 = h;
		}
	public String getFirstName()
		{
			return firstName;
		}
	public void setFirstName(String firstName)
		{
			this.firstName = firstName;
		}
	public String getLastName()
		{
			return lastName;
		}
	public void setLastName(String lastName)
		{
			this.lastName = lastName;
		}
	public String getClass1()
		{
			return class1;
		}
	public void setClass1(String class1)
		{
			this.class1 = class1;
		}
	public String getGrade1()
		{
			return grade1;
		}
	public void setGrade1(String grade1)
		{
			this.grade1 = grade1;
		}
	public String getClass2()
		{
			return class2;
		}
	public void setClass2(String class2)
		{
			this.class2 = class2;
		}
	public String getGrade2()
		{
			return grade2;
		}
	public void setGrade2(String grade2)
		{
			this.grade2 = grade2;
		}
	public String getClass3()
		{
			return class3;
		}
	public void setClass3(String class3)
		{
			this.class3 = class3;
		}
	public String getGrade3()
		{
			return grade3;
		}
	public void setGrade3(String grade3)
		{
			this.grade3 = grade3;
		}
	@Override
	public String toString()
		{
		return "firstName = " + firstName + ", lastName = " + lastName + ", class1 = " + class1 + ", grade1 = "
				+ grade1 + ", class2 = " + class2 + ", grade2 = " + grade2 + ", class3 = " + class3 + ", grade3 = " + grade3;
		}	
	
	
	}

