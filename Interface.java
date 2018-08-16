// interface in java is blueprint of class.
// has static constants and  abstract methods , cannot have a method body .
// 1. class extends class
//2.class impliments interface
//3.interface extends interface

// multiple inheritance 
interface Printable{  
void print();  
}  
interface Showable{  
void show();  
}  
class A7 implements Printable,Showable{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
  
public static void main(String args[]){  
A7 obj = new A7();  
obj.print();  
obj.show();  
 }  
}  
