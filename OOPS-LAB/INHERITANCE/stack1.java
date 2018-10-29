import java.io.*;
import java.lang.*;
class stack
{
Protected String s[] = new String[10] ;
int sp =1 ;
public void put(String e){s[sp]=e ; sp++;}
public String take(){sp-- ; return s[sp];}
public String top(){return s[sp-1]; }
public void pt(){int i ; for(i=1 ; i<sp; i++)System.out.print(s[i]+" " );}
}

class kapil
{ public static void main(String args[])throws Exception
{ String a = " " , b ; 
  int i ; 
  stack x ; 
  x = new stack();
  DataInputStream k = new DataInputStream(System.in);
  do{
   a = k.readLine();
   i = a.indexOf(' ' ) ;
   if( i!= -1)b = a.substring(0,i); else b = a ;
   if(b.compareTo("put")==0)x.put(a.substring(i+1));
   if(b.compareTo("take")==0)System.out.print("taken element is " + x.take());
   if(b.compareTo("top")==0)System.out.print("the first element is : " + x.top());
   if(b.compareTo("print")==0) {x.pt(); System.out.println();}
  }while(b.compareTo("exit") != 0 ) 
}
}
