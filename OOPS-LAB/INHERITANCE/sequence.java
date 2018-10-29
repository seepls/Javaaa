class sequence{
//put(e,k){}
//take(k){}
//find(k){}
//size(){}
//print(){} 
}

class smriti{
 public static void main(String args[]) throws Exception
 { String a = " " , b ; 
 int i ; 
   sequence x ;
   x = new sequence(); 
    DataInputStream k = new DataInputStream(System.in);
  do{
   a = k.readLine();
   i = a.indexOf(' ' ) ;
   if( i!= -1)b = a.substring(0,i); else b = a ;
   if(b.compareTo("put")==0)x.put(a.substring(i+1));
   if(b.compareTo("take")==0)System.out.print("taken element is " + x.take());
   if(b.compareTo("find")==0)System.out.print("the first element is : " + x.top());
   if(b.compareTo("print")==0) {x.pt(); System.out.println();}
    if(b.compareTo("size")==0) { System.out.println("size is " + x.size());}
  }while(b.compareTo("exit") != 0 ) 
 }
}

/*after operation : put(12,1) put(37,2) put(41,1) put (67,2) put(95,3) take(4) : op 41 67 95 37 
: taken will be 12 find(3) = 95 
*/
