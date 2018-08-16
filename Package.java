// group of similar type of classes , interfaces and subpackages  .
//built-in and user defined 
// java package is used to categorize the classes and interfaces so they can be easily maintained 
//access protection 
//removes naming collision 
//To Compile: javac -d . Name.java
// To Run: java mypack.Name
here are three ways to access the package from outside the package.

import package.*;
import package.classname;
fully qualified name.
  //package then import then class.
  //save by A.java  
package pack;  
public class A{  
  public void msg(){System.out.println("Hello");}  
}  

//save by B.java  
package mypack;  
class B{  
  public static void main(String args[]){  
   pack.A obj = new pack.A();//using fully qualified name  
   obj.msg();  
  }  
}  


//If you import a package, all the classes and interface of that package will be imported 
//excluding the classes and interfaces of the subpackages. Hence, you need to import the subpackage as well.
//Package inside the package is called the subpackage. It should be created to categorize the package further.
