//circle when mouse is excited 
// when mouse clicked circle with the click point as the radius 
// cirle when mouse released at the place where initially clicked 
//circle midway between mouse clicked and released 
//circle when mouse released , place opposite to where relased 
//circle when mouse exited from the window, place midway press and released 
//initally 2 circles when mouse clicked INSIDE any circle the radius of that circle increases by 5 . 
// initially 4 circles appear when mouse clicked inside any circle then it disappears // use repaint () 

// snippet : when mouse clicked small circle is drawn , when pressed a bigger circle is drawn 
int p,q,k ;
public void mouseClicked(MouseEvent g){p=g.getX(); q=g.getY(); k =1 ; repaint();}
public void mousePressed(MouseEvent n){p = n.getX() ; q = n.getY(); k = 2 ; repaint();}
public void paint(Graphics f )
{if(k==1)f.drawOval(p,q,10,10); if(k==2)f.drawOval(p,q,100,100);
}
//circle when mouse pressed and rectangle when released , location anywhere . 
