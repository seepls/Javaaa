name.java
javac name.java 
java main_class_name 

funciton used : 
1.say 
DataInputStream o = new DataInputStream(); 
k = o.readLine();

k is string : can get a substring : p = k.substring(a,b) ; a to b , a inclusive excluding b .


p = q+r ; will add the string in a new string : direct concatanation of strings 

change the string input of a interger in a integer : 
m = Integer.parseInt() ;
int i = a.compareTo(b) ;
 int a ; String b ; b = a + " " ; converts int a. to string 
 
 string length : String a = o.readLine() ;a.length () // length of string
 
 a.trim() : reads everything except the crap 
 
 a.indexOf(char) : if character not present returns -1 
 
 
 stream of string converted to array of char , then back to string
 class name{
 public static void main(String args[]){
 DataInputStream t = new DataInputStream(System.in);
 String m ; 
 m = t.readLine();
 byte a[] = new byte[100] ; a = m .getBytes();m = new String(a) ; System.out.print(m) ;

 }
 }
