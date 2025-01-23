import pack1.D;
class A{
    int def1;
    private int pri1;
    protected int pro1;
    public int pub1;
 void displayA(){
    System.out.println("From class A");
    System.out.println("Default"+def1);
    System.out.println("Private:"+pri1);
    System.out.println("Public:"+pub1);
    System.out.println("Protected:"+pro1);

 }
}
 class B extends A{
  
 void displayB(){
    System.out.println("From class B");
    System.out.println("Default"+def1);
    //System.out.println("Private:"+pri1);
    System.out.println("Public:"+pub1);
    System.out.println("Protected:"+pro1);

 }
}
class C {
  A a=new A();
 void displayC(){
    System.out.println("From class C");
    System.out.println("Default"+a.def1);
    //System.out.println("Private:"+a.pri1);
    System.out.println("Public:"+a.pub1);
    System.out.println("Protected:"+a.pro1);

 }
}
class E  {
  D d=new D();
 void displayE(){
    System.out.println("From class E");
    //System.out.println("Default"+def2);
    //System.out.println("Private:"+pri2);
    System.out.println("Public:"+d.pub2);
    //System.out.println("Protected:"+d.pro2);

 }
}

class Emp{
    public static void main(String[] args){
        A obja=new A();
        obja.displayA();
        B objb=new B();
        objb.displayB();
        C objc=new C();
        objc.displayC();
        E obje=new E();
        obje.displayE();
    }
    }