// posible set of errors 

//1.
class Simple{  
public static void main(String[] args){  
byte a=10;  
byte b=10;  
//byte c=a+b;//Compile Time Error: because a+b=20 will be int  
byte c=(byte)(a+b);  
System.out.println(c);  
}}  

//2.
class OperatorExample{  
public static void main(String args[]){  
short a=10;  
short b=10;  
//a+=b;//a=a+b internally so fine  
a=a+b;//Compile time error because 10+10=20 now int  
System.out.println(a);  
}}  

//3. if u initialize m = 0 ; fuck all ! -_-
public class Fact{
public static void main(String[] args){
int n= 5,m=1 ;// number to be checked .

for(int i =1 ; i <= n ; i++ ) {

 m *=i;
 }
 System.out.println(n+"factorial is " + m);
 }
 }

//4.static access errors
class A{  
 int a=40;//non static  
   
 public static void main(String args[]){  
  System.out.println(a);  
 }  
}      //Output:Compile Time Error


//two main restriction with static method : 1. static method cannot call non-static variable directly
//this and super cannot be used in static context 

//5. Compile Time Error: Call to this must be first statement in constructor
class Student{  
int rollno;  
String name,course;  
float fee;  
Student(int rollno,String name,String course){  
this.rollno=rollno;  
this.name=name;  
this.course=course;  
}  
Student(int rollno,String name,String course,float fee){  
this.fee=fee;  
this(rollno,name,course);//C.T.Error  
}  
void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}  
}  
class TestThis8{  
public static void main(String args[]){  
Student s1=new Student(111,"ankit","java");  
Student s2=new Student(112,"sumit","java",6000f);  
s1.display();  
s2.display();  
}}  


