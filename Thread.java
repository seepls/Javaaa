//1. using runnable interface
import java.io.*;
class Myclass implements Runnable{
public void run(){
for(int i =0;i<10;i++)
{
System.out.println(Thread.currentThread().getId() + "value"+i);
}try{Thread.sleep(1000);
}catch(InterruptedException e){e.printStackTrace();
}
}
}
public class Sam{
public static void main(String[] args){
Thread t1 = new Thread(new Myclass());
t1.run();
}
}

//2. subclassing from class Thread 
import java.io.*;
class Myclass extends Thread{
public void run(){
for (int i=0; i<10 ; i++){
System.out.println(Thread.currentThread().getId()+"value" + i );}
try{ 
Thread.sleep(100);
}catch(InterruptedException e){
e.printStackTrace();}}
}

public class Demo{
public static void main(String[] args){
Myclass myclass = new Myclass();
myclass.start();

Myclass one= new Myclass();
one .start();
}}
