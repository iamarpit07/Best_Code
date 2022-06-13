import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         ArrayList<String> al = new ArrayList<String>();
         al=getStairPaths(n,0);
         System.out.println(al);
    }

    public static ArrayList<String> getStairPaths(int n,int start) throws Exception{
        if(start==n){
            ArrayList<String> name = new ArrayList<String>();
            name.add("");
            return name;
        }
        if(start>n){
            ArrayList<String> name = new ArrayList<String>(0);
            return name;
        }
        ArrayList<String> al= new ArrayList<String>();
        ArrayList<String> al0= new ArrayList<String>();
        ArrayList<String> al1 = new ArrayList<String>();
        ArrayList<String> al2 = new ArrayList<String>();
        al0=getStairPaths(n,start+1);
        int k=al0.size();
        for( int i=0 ;i<k  ;i++  ) {
            String s =Integer.toString(1)+al0.get(i);
            al.add(s);
        }
        al1=getStairPaths(n,start+2);
        k=al1.size();
        for( int i=0 ;i<k  ; i++ ) {
            String s =Integer.toString(2)+al1.get(i);
            al.add(s);
        }
        al2=getStairPaths(n,start+3);
        k=al2.size();
        for( int i=0 ;i<k  ; i++ ) {
            String s =Integer.toString(3)+al2.get(i);
            al.add(s);
        }
        return al;
    }

}