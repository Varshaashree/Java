// Constructor Chaining
class Student
{
  public Student() // Step 2
  {
  this(1002,"Hema"); // Connecting another 2 para constructor
  System.out.println("Welcome to MCET"); // Step 7
  }
 public Student(int rno,String sname) // Step 3
  { 
   this("IT");  // Connecting another 1 para constructor
System.out.println("Roll No : " + rno); // Step 6
System.out.println("Name : " + sname); // Step 6

  }
 public Student(String dept) // Step 4
  { 
  System.out.println("Dept : " + dept); // Step 5  
}  
}
class Chaining
{
public static void main(String args[])
{
Student s=new Student(); // Step 1
}
}
