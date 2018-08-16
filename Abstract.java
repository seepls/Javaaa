// abstract class can have abstract and non-abstract methods 
// abstraction is a process of hiding implimentation details . 
// 2 ways to acheive abstraction in java 
// 1. abstarct class(0 to 100%) 2.  Interface (100%) 
// abstaract class needs to be extended 
// and its method implimented 
// cannot be instantiated 
// can have constructors and static methods also 
// it can have final methods which can force the subclass not to change the body of the method .


// abstract method : a methid which is declared as abstract and does not have implimentation is known as abstract class .
// example abstract class with abstract method 
abstract class Bike{  
  abstract void run();  
}  
class Honda4 extends Bike{  
void run(){System.out.println("running safely");}  
public static void main(String args[]){  
 Bike obj = new Honda4();  
 obj.run();  
}  
}  
