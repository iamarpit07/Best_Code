/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		ArrayList<String> al=new ArrayList<>();
		al=getMazePath(1,1,n,m);
		System.out.println(al);
	}
	public static ArrayList<String> getMazePath(int sr,int sc,int dr,int dc){
	    if (sr==dr && sc==dc){
	        ArrayList<String> blank=new ArrayList<>();
	        blank.add("");
	        return blank;
	    }
	    if (sr>dr || sc>dc){
	        ArrayList<String> blank=new ArrayList<>(0);
	        return blank;
	    }
	    ArrayList<String> al=new ArrayList<String>();
	    ArrayList<String> al0=new ArrayList<String>();
	    ArrayList<String> al1=new ArrayList<String>();
	    al1=getMazePath(sr,sc+1,dr,dc);
	    for (int i=0;i<al1.size() ;i++ ){
	        al.add("h"+al1.get(i));
	    }
        al0=getMazePath(sr+1,sc,dr,dc);
	    for (int i=0;i<al0.size() ;i++ ){
	        al.add("v"+al0.get(i));
	    }
	    return al;
	}
}
