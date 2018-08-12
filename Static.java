
// used for memory management mainly 
// belongs to the class than the instance of a class 
// can be method(class method) , variable(class variable) , nested method ,block.
// static variable :used to refrence those properties of all object (not unique for each object )
// gets memory only once in class area , during class loading
//advantage of static variable is that it makes the program memory efficient 
//Java static property is shared to all objects.

//JAVA STATIC METHOD
// counter without static variable 
class Counter{  
int count=0;//will get memory when instance is created  
  
Counter(){  
count++;  
System.out.println(count);  
}  
  
public static void main(String args[]){  
  
Counter c1=new Counter();  
Counter c2=new Counter();  
Counter c3=new Counter();  
  
 }  
}  

//output : 1 1 1 

//counter with static variable 
class Counter2{  
static int count=0;//will get memory only once and retain its value  
  
Counter2(){  
count++;  
System.out.println(count);  
}  
  
public static void main(String args[]){  
  
Counter2 c1=new Counter2();  
Counter2 c2=new Counter2();  
Counter2 c3=new Counter2();  
  
 }  
}  

//output : 1 2 3 


// JAVA STATIC METHOD 
//Static method mainly belongsto the class than the object 
//static method can be invoked without the need to create a object
//static method can access static variable and set their values


//why java main method is static : as object is not needed to call static method , if it would have been non static , JVM first had to create a object in order to call it 

// JAVA STATIC BLOCK
// used to initialize static data memebers
// executed before main method at time of classloading
class A2{  
  static{System.out.println("static block is invoked");}  
  public static void main(String args[]){  
   System.out.println("Hello main");  
  }  
}  

// output : static block is invoked
      // Hello main
// execute programe without main ?? 
// using static block
class A3{  
  static{  
  System.out.println("static block is invoked");  
  System.exit(0);  
  }  
}  // in earlier version of jdk , not any more 
