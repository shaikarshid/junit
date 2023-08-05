import java.util.Scanner;

public class Tpoint 
{
    public int  maxnum(int []a)
    {
     int max=a[0];
      for(int i=0;i<a.length;i++)
       {
         if(a[i]>max)
         {
           max=a[i];
           }
            
        }
        return max;
    }


public  void add(int a,int b)
{
System.out.println(a+b);
}




public static void main(String[] args) 
{
    Scanner ip= new Scanner(System.in);
    System.out.println("enter num");
    int []a = new int[6];
    for(int i=0;i<a.length;i++)
    {
        a[i]=ip.nextInt();
    }
    Tpoint t= new Tpoint();
    // int ans = t.maxnum(  new int[] {1,2,3,4,5} );

         int ans= t.maxnum(a);


    System.out.println(ans);

           t.add(1, 2);

        
 
}
    
}
