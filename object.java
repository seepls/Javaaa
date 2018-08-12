//1. main function inside class 
class Student{  
 int id; 
 String name;  
  
 public static void main(String args[]){  
  Student s1=new Student();
  System.out.println(s1.id);
  System.out.println(s1.name);  
 }  
}  
//2. main funciton outside class 
class Student{  
 int id;  
 String name;  
}  
class TestStudent1{  
 public static void main(String args[]){  
  Student s1=new Student();  
  System.out.println(s1.id);  
  System.out.println(s1.name);  
 }  
}  

