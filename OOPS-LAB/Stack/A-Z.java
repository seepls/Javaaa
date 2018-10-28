import java.io.*;
import java.lang.*;
import java.util.Stack;
class smriti
{
  public static void main(String args[])throws Exception
  {Stack<String> s = new Stack <String>();
  Stack <String> t = new Stack <String>();
  DataInputStream u = new DataInputStream(System.in);
  String a,b,c ;
  char p,q ;
  int i,j,size = 0 ;
  do{a = u.readLine();
  p = a.charAt(0);
  if( p =='A')//Ax put x at end
  { b = a.substring(1);
    s.push(b);
   size = size +1 ;
  }
  if(p=='B') // remove the last element 
  {s.pop();
   size = size -1 ;
  }
  if(p=='C'){ // print the last element 
    b = s.pop();
    System.out.println(b);
    s.push(b);
  }
  if(p=='D'){//print the entire list 
    for(i =1;i<=size ;i++){
      b=s.pop();
      t.push(b);
    }
    for(i=1;i<=size ;i++){
      b=t.pop();
      System.out.print(b+" ");
      s.push(b);
    }
    
  }
  
  if(p=='E'){// Exy : put y at location x 
    q=a.charAt(1);
    c=a.substring(2);
    j = (int)q-48;
    j=size+2-j;
    size = size +1;
    for(i =1 ;i<=j-1;i++){
      b=s.pop();
      t.push(b);
    }
    s.push(c);
    for(i=1;i<=j-1;i++){
      b=t.pop();
      s.push(b);
    }
  }
  if(p=='F'){//print the list in reverse order 
    
  }
  if(p=='G'){//print the first element 
  }
  if(p=='H'){// Hx : print the xth element 
  }
  if(p=='I'){// Ix : put x at the beginning 
  }
  if(p=='J'){// remove the first element
  }
  if(p=='K'){// print the maximum element 
  }
  if(p=='L'){//remove the max element 
  }
  if(p=='M'){//Mx: put x at proper position in  sorted list
  }
  if(p=='N'){//replace xth element by y
  }
  if(p=='P'){// print list in decending order 
      
  }
  if(p=='Q'){//Qx : whether x is present or not 
  }
  if(p=='R'){//Rx: remove x 
  }
  if(p=='W'){//first line of selection sort 
  }
  if(p=='X'){//first line of bubble sort 
  }
  if(p=='Y'){// complete method of selection sort 
  }
  if(p=='Z'){// complete method of bubble sort 
  }
  
  }while(1==1);
  }
}
