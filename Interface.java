// interface has all abstract method  : unlike abstract class which can have both concrete and abstract method 
//interface implimented  and abstract class extends 
//using interface we can do multiple inheritance : not in abstract class 
//performance of abstract > interface 
//priority queue : abstract data type : each element has priority associated .

import java.io.*;
import java.lang.*;
interface picture { float area() ;void change() ; void size();}
class rectangle implements picture {
float p,q;
public rectangle(float a,float b){p =a ; q = b ; }
public int  getl(){return (int)p ;}
public int getb(){return (int)q;}
public void change(){ p = p+5 ; q = q+7;}
	
public void size(){System.out.print("size "+ p +" "+q);}
public float area(){return p*q ;}
}
class circle implements picture
{
	float r ; public circle(float a){r=a;}
	public int getr(){return (int)r ;}
	public float area(){ return (float)3.14*r*r ;}
    public void change(){r = r+10; }
    public void size(){System.out.print("size" + r );}
}

class ravi
{
	public static void main(String args[])throws Exception
	{
		picture p[] = new picture[20];
		char what[] = new char[20];
		float a,b;
		int i,n=0;
		String s,t,u;
		char v,w ;
		DataInputStream o = new DataInputStream(System.in);
		do{
			s= o.readLine();
			w = s.charAt(0);
			if(w=='C')
			{
				n = n+1 ;t = s.substring(1); a = Float.parseFloat(t);
				p[n] = new circle(a);
				what[n] = 'C';
				System.out.println(n+"is circle radius"+a);
			}
			if(w=='R'){
				n = n+1 ; i =s.indexOf(',');
				t=s.substring(1,i); a = Float.parseFloat(t);
				u = s.substring(i+1); b = Float.parseFloat(u);
				p[n]=new rectangle(a,b);what[n] = 'R';
				System.out.println(n+"rectangle length : "+a+"breadth"+b);
			}
			if(w=='A'){
				v = s.charAt(1); 
				i = (int)v- 48 ; 
				System.out.println(p[i].area());

			}
			if(w=='B'){
				t = s.substring(1);
				i = Integer.parseInt(t);
				p[i].change();
			}
			if(w=='D'){
		 		t = s.substring(1);
		 		i = Integer.parseInt(t);
		 		p[i].size();
		 	}
		}while(1==1);
	}
}
