import java.awt.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;
import java.applet.*;
// draws rectangle writes string , makes oval , fills color 
publicclass ex extends Applet // file name and class name must be same 
{
  int x = 70 ; String a =" " ;
  public void init()
  {setBackground(Color.white );
   setForeground(Color.red);
  }
  public void paint(Graphics g ){
  g.drawRect(10,100,50,70);// draws a rect whose north west corner is : 10,100 and sides are 50 , 70 
  g.fillOval(10,100,50,70); //draws a ellipse inside a rectangle whose northwest corner is 10,100 and sides are 50 , 70 
  g.drawString("smriti " , x ,7 );
  g.drawLine(100,20,400,70);//line joining 100,20 and 400,70 
  g.setColor(Color.blue);
  g.drawOval(100,200,50,10);
  }
}
