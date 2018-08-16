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

// example where we are using interface and abstract class both.

interface A{  
void a();//bydefault, public and abstract  
void b();  
void c();  
void d();  
}  
  
//Creating abstract class that provides the implementation of one method of A interface  
abstract class B implements A{  
public void c(){System.out.println("I am C");}  
}  
  
//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods  
class M extends B{  
public void a(){System.out.println("I am a");}  
public void b(){System.out.println("I am b");}  
public void d(){System.out.println("I am d");}  
}  
  
//Creating a test class that calls the methods of A interface  
class Test5{  
public static void main(String args[]){  
A a=new M();  
a.a();  
a.b();  
a.c();  
a.d();  
}}  

