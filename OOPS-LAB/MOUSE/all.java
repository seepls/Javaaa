// about how we can take over the control of mouse : prety interestng 
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class muse extends Applet impliments MouseListener,MouseMotionListener
{int p , q ; 
 public void init()
 { addMouseListener(this);
   addMouseMotionListener(this);
 }
 public void mouseClicked(MouseEvent k){p = k.getX() ; q = k.getY();}
 public void mouseEntered(MouseEvent k ){}
 public void mouseExited(MouseEvent k){}
 public void mousePressed(MouseEvent k){}
 public void mouseReleased(MouseEvent k){}
 public void mouseDragged(MouseEvent k){}
 public void mouseMoved(MouseEvent k){}
 public void paint(Graphics f){f.drawOval(p-5,q-5,10,10); }
}
// use what ever suits you :D 
