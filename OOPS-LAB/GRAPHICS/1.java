import java.awt.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;
import java.applet.*;
//reads a number x and creates a line from x , 100 to x+50,200
public class ex extends Applet 
{
  int x = 70 ; String a =" " ;
public void paint (Graphics g){
do{
  try{DataInputStream o = new DataInputStream(System.in);a=o.readLine();}
  catch(Exception t ){}
  x = Integer.parseInt(a);
  g.drawLine(x,100,x+50,200);
  
}while(1==1);
}
