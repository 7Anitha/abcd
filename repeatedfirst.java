import java.io.*;
import java.util.*;
class repeatedfirst
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]==a[i+1])
            {
             System.out.print(a[i]);
             break;
            }
        }
    }
}

