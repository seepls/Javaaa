public class ContinueExample {  
public static void main(String[] args) {  
    for(int i=1;i<=10;i++){  
        if(i==5){  
            continue;  
        }  
        System.out.println(i);  
    }  
}  
}  
output : 1 to 10 excpet 5


public class BreakExample {  
public static void main(String[] args) {  
    for(int i=1;i<=10;i++){  
        if(i==5){  
            break;  
        }  
        System.out.println(i);  
    }  
}  
}  
output : 1 2 3 4 
