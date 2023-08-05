import java. util. Scanner; 
public class Lab {
    
  public static int add(int[]a)
  {

    int sum=0;
    for (int i = 0; i < a.length; i++) {
        sum =sum+ a[i];
    }
    return sum;
  }

//No need to write  main function when u test the program

  public static void main(String[] args) 
    {
    Scanner ip= new  Scanner(System.in);
       int a[]=new int[6];
       System.out.println("enter number");
       for(int i=0;i<a.length;i++)
       {
         a[i]=ip.nextInt();
       }

         int ans= add(a);
         System.out.println(ans);
   
    }
    
}
