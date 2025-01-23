class Emo{
        int eno;
    String ename;
    public Emo(){
        System.out.println("Parent");

    }
}
class Manager extends Emo{
        int mno;
    String mname;
    public Manager(){
        System.out.println("Child");
        
    }
void input(    int eno, String ename,int mno,String mname){
    this.eno=eno;
    this.ename=ename;
    this.mno=mno;
    this.mname=mname;

}
void diplay(){
    System.out.println(eno);
    System.out.println(ename);
    System.out.println(mno);
    System.out.println(mname);
}
} 
class Inherit{
    public static void main(String args[]){
        Manager m=new Manager();
        m.input(101,"Varsha",102,"Shree");
        m.diplay();
    }


}