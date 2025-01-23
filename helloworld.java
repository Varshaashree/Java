class Student
{
 int rno; // Attributes / instance variable
 String sname;
  public Student()
  {
  System.out.println("Welcome to MCET");
  }
 public Student(int rno,String sname)
  {
  rno=rno;
  sname=sname;
  }
 void display()
 {
  System.out.println("Roll No : " + rno);
  System.out.println("Name : " + sname);
}
}
class Prg13
{
public static void main(String args[])
{
Student s=new Student();
s=new Student(1001,"Vasuki");
s.display();
}
}