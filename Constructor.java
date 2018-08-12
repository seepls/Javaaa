//called when instance of a class is created and memory is allocated for the object 
// java complier creates a default constructor if your class does not have any 
// constructor name same as class
// no explicit return type
// 2 kinds : 1. default (used to set default values to the objects ) 2. parameterized 
// constructor overloading
class Student5{  
    int id;  
    String name;  
    int age;  
    Student5(int i,String n){  
    id = i;  
    name = n;  
    }  
    Student5(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){  
    Student5 s1 = new Student5(111,"Karan");  
    Student5 s2 = new Student5(222,"Aryan",25);  
    s1.display();  
    s2.display();  
   }  
}  

//java : copy values of one object to another : 3 ways 
// constructor : copy :clone() method of  Object class
// does constructor return any value : YESSS!!!returns current class instance . you cannot use a return type yet it returns a value.
// one can perfrm any operation in a constructor that he can in a method 

 
