//advantage of array : code optimization , : random access
// size limit is the issue // to remove this collection framework is used .
// instantiation  name = new DataType[size] ;
//1 .sinlge dimension 
// copy in java 
// syntax 
public static void arraycopy(  
Object src, int srcPos,Object dest, int destPos, int length  
)  
//ex.
class TestArrayCopyDemo {  
    public static void main(String[] args) {  
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',  
                'i', 'n', 'a', 't', 'e', 'd' };  
        char[] copyTo = new char[7];  
  
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);  
        System.out.println(new String(copyTo));  
    }  
}  
