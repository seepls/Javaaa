// this is a refrence variable that refers to the current object
//1. this : to refer to current class instance variable 
class Student{  
int rollno;  
String name;  
float fee;  
Student(int rollno,String name,float fee){  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
  
class TestThis2{  
public static void main(String args[]){  
Student s1=new Student(111,"ankit",5000f);  
Student s2=new Student(112,"sumit",6000f);  
s1.display();  
s2.display();  
}}  

//2.this : to invoke current class method 
// if you dont use this key word the compiler it self interprets it .
//eg; 
class A {
  void m(){}
  void n(){
  m();
  }
  public static void main (String[] args){
    new A().n();
  }
}
//compiler inerprets it as :
class A {
  void m(){}
  void n(){
  this.m();
  }
  public static void main (String[] args){
    new A().n();
  }
}
//3. to invoke current class constructor 
//calling default constructor from parametarized 
class A{  
A(){System.out.println("hello a");}  
A(int x){  
this();  
System.out.println(x);  
}  
}  
class TestThis5{  
public static void main(String args[]){  
A a=new A(10);  
}}  
//4.calling parametarized constructor from default 
class A{  
A(){  
this(5);  
System.out.println("hello a");  
}  
A(int x){  
System.out.println(x);  
}  
}  
class TestThis6{  
public static void main(String args[]){  
A a=new A();  
}}  


//usage of this in constructor call
class Stundent
{
  int roll;
  String name ,course ;
  float fee ;
  Student (int roll , String name , String course ){
    this.roll = roll ; 
    this.name = name ;
    this.course = course ;
  }
  Student (int roll ,String name ,String course , float fee ){
    this.fee = fee ;
    Student(roll , name , course );
  }
  void display(){System.out.println(roll + " " + name + "  "+ course + " " + fee);}
  class Test{
    public static void main(String args){
      Student s1=new Student(111,"smriti","java");  
Student s2=new Student(112,"prashanthi","java",6000f);  
s1.display();  
s2.display();  
}}  
  
 // this to pass as an argument in the method 
  class S2{  
  void m(S2 obj){  
  System.out.println("method is invoked");  
  }  
  void p(){  
  m(this);  
  }  
  public static void main(String args[]){  
  S2 s1 = new S2();  
  s1.p();  
  }  
}  
