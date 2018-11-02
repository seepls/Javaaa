import java.io.*;
import java.lang.*;

class pic {
int f = 0  ;

	int p , q ;
	public void rectangle(int a , int b ){ p = a ;  q = b ;}
	public float area(){return p*q ; }
	int r ;
	public void circle(int a )r = a ;
	public float areac(){return 3.14*r*r;}
	}


class ram{
	public static void main(String args[])throws Exception{
		int i=0, j=0 ,n =0,a=0;
		char w ;
		String t ,u,v;
		pic picture[] = new pic[20];
		char what[] = new char[20];
		DataInputStream o = new DataInputStream(System.in);
		do
		{s= o.readLine(); w = s.charAt(0);
		if(w=='C'){ f =  0 ; n = n+1 ; what[i]='C';i++;
			t = s.substring(1);i = Integer.parseInt(t);
			pic[n].circle(i);
		}
		if(w=='R'){
			n=n+1 ; i = s.indexOf(',');what[i]='R'; i++;
			t = s.substring(1,i);j =Integer.parseInt(t);
			u = s.substring(i+1);a =Integer.parseInt(t);
			pic[n].rectangle(j,a);
		}
		else{ if(what[i]=='C') System.out.print(pic[n].areac());
		      else System.out.print(pic[n].area());

		}
	}while(1==1);

	}
}