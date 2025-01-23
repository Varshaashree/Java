// Copy Constructor
class Emp
{
    String ename;
    int sal;    
public Emp(String ename, int sal) // Step 2
    {
        this.ename = ename;
        this.sal = sal;
    }    
public  Emp(Emp obj)   // constr parameter // Step 5
    {
        this.ename = obj.ename + " - Pollachi";
        this.sal = obj.sal + 10000;
    }    
    void showData() 
    {
        System.out.println("Name :"+ename);
        System.out.println("Salary :"+sal);
    }
}
public class Copy
{
    public static void main(String[] args) 
     {       
        Emp e1= new Emp("Chandru",100000); // Step 1
        e1.showData(); // Step 3

        Emp e2 = new Emp(e1); // Step 4
        e2.showData(); // Step 6
    }
}