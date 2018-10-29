import java.io.*;
import java.lang.*;
class d2vectors
{
  protected float i , j ;
  public d2vectors(float a , float b)
  {
    i = a ; j = b ;
  }
  public float slope(){return (j/i);}
  public float magsqr(){return(i*i+j*j) ;}
  public void dble(){i = 2*i ; j = 2*j ;}
  public void pt(){System.out.print(i+"i"+j+"j");}
  public void ab(d2vectors p){System.out.println(1000*i+100*j+10*p.i + p.j);}
}

class d3vectors extends d2vectors{
float k ;
public d3vectors{float p , float q , float r}{super(p,q); k = r ;}
public float magsqr(){ return(super.magsqr()+k*k);}
public void ttt(){super.dble(); k = k*3 ; }// remove super 
public void dble(){i = 2*i ; j = 2*j; k =2*k ; }
public double direction (){return (k/Math.sqrt(i*i+j*j)) ; }
public void pt(){ return super.pt() + System.out.print( k+"k");}
}

class xyz{
 public static void main(String ar[]){
  d2vectors a,c;
  double t ;
  d3vectors b,d;
  b=new d3vectors(6,8,7);
  c = new d2vectors(6,7);
  t = c.magsqr(); System.out.println(t);
  t = b.magsqr(); System.out.println(t);
  t = b.slope(); System.out.println(t);
  t = b.direction(); System.out.println(t);
  c.pt();  b.pt() ; b.dble() ; b.pt() ;b.ttt(); b.pt(); c.ab(d); d.ab(c);
  
 }
}



