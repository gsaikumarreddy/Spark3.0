class Student
{
	int rollNo=123; //non-static
	String name="rahul";
	String address="delhi";
	static int id=333;
	

	//ye ho app
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		//System.out.println(rollNo); // no
		System.out.println(id);

		//create object
		Student s=new Student();
		System.out.println(s.rollNo);
		System.out.println(s.name);

		//calling
		sum();

		//s.sum();
	}


    //dost
	public static void sum()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
		//System.out.println(id);
		//System.out.println(rollNo);
	}
}
