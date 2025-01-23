class Emp
{
int eno;
String ename;
public Emp(int eno,String ename)
{
this.eno=eno;
this.ename=ename;
System.out.println("From Emp class");
}
}
class Manager extends Emp
{
int mno;
String mname;
public Manager(int eno,int mno,String ename,String mname)
{
super(eno,ename); // can pass value to base class constructor
this.mno=mno; 
this.mname=mname;
System.out.println("From Manager class");
}
void display()
{
System.out.println("Emp No :" +eno);
System.out.println("Emp Name :" +ename);
System.out.println("Manager No :" +mno);
System.out.println("Manager Name :" +mname);
}
}

class Sup
{
public static void main(String args[])
{
Manager m=new Manager(101,1001,"Ashwin","Vishallll"); 
m.display();
}
}
