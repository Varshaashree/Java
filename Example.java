//CONSTRUCTOR EXAMPLE
class Student
{
 int rno; // Attributes / instance variable
 String sname;
 String dept;
  public Student()
  {
  System.out.println("Welcome to MCET");
  }
  public Student(String dept)
  {
    this.dept=dept;
  }
 public Student(int rno,String sname)
  {
   this.rno=rno;
  this.sname=sname;
  }
 void display()
 {
  System.out.println("Roll No : " + rno);
  System.out.println("Name : " + sname);
 
}
void result()
{
   System.out.println("Department : " + dept);
}
}
class Example
{
public static void main(String args[])
{
Student s=new Student();
s=new Student(58,"Varsha");
s.display();
s=new Student("IT");
s.result();
}
}