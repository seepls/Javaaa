// posible set of errors 

class Simple{  
public static void main(String[] args){  
byte a=10;  
byte b=10;  
//byte c=a+b;//Compile Time Error: because a+b=20 will be int  
byte c=(byte)(a+b);  
System.out.println(c);  
}}  


class OperatorExample{  
public static void main(String args[]){  
short a=10;  
short b=10;  
//a+=b;//a=a+b internally so fine  
a=a+b;//Compile time error because 10+10=20 now int  
System.out.println(a);  
}}  
