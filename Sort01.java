import java.util.*;

class Sort01

{

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

System.out.println("enter the size of an array");

int n=sc.nextInt();

int a[]=new int[n];

for(int i=0;i<n;i++)

a[i]=sc.nextInt();

int i,j;

for(i=0;i<n;i++)

{

for(j=i+1;j<n;j++)

{

if(a[i]>a[j])

{

int t=a[i];

a[i]=a[j];

a[j]=t;

}

}

}

for (int e : a) {

System.out.print(e);

}

}

}