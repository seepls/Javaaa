// method overloading :mthods having same name but different parameters 
// type promotion : One type is promoted to another implicitly if no matching datatype is found. 
// in case of ambiguity 
class OverloadingCalculation3{  
  void sum(int a,long b){System.out.println("a method invoked");}  
  void sum(long a,int b){System.out.println("b method invoked");}  
  
  public static void main(String args[]){  
  OverloadingCalculation3 obj=new OverloadingCalculation3();  
  obj.sum(20,20);//now ambiguity  
  }  
}  

//One type is not de-promoted implicitly for example double cannot be depromoted to any type implicitly.
____________________
// method overriding : when same method as DECLARED  in parent class ,  defined differently in subclass 
class Bank{  
int getRateOfInterest(){return 0;}  
}  
  
class SBI extends Bank{  
int getRateOfInterest(){return 8;}  
}  
  
class ICICI extends Bank{  
int getRateOfInterest(){return 7;}  
}  
class AXIS extends Bank{  
int getRateOfInterest(){return 9;}  
}  
  
class Test2{  
public static void main(String args[]){  
SBI s=new SBI();  
ICICI i=new ICICI();  
AXIS a=new AXIS();  
System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
}  
}  


// can we override static methods ? NO , can be explained by runtime polymorphism 
//why ? cause static method is bound class , where as instance methid is bound to object . static belogs to class area where as instance belongs to heap area .
// so , we cant over ride main method as is public static . 



// covarient return type : specifies that the return type may vary in the same direction as the subclass .
//it is possible to override method by changing the return type if subclass overrides any method whose ,
//return type is Non-Primitive but it changes its return type to subclass type.

//super refers to the immidiate parent class of the this class .
//1. super used to refer immidiate parent class instance variable 

class Animal {
  String color = " white " ;
}
class Dog extends Animal {
  String color = "black" ;
  void printColor(){
    System.out.println(color);
    System.out.println(super.color);
  }
}
class TestSuper{
  public static void main(String args[]){
    Dog d = new Dog();
    d.printColor();
  }
}


// 2. super class can be used to invoke parent class method 
class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void eat(){System.out.println("eating bread...");}  
void bark(){System.out.println("barking...");}  
void work(){  
super.eat();  
bark();  
}  
}  
class TestSuper2{  
public static void main(String args[]){  
Dog d=new Dog();  
d.work();  
}}  

















