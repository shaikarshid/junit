import org.junit.Assert;
import org.junit.Test;

public class AddTest {

@Test
  public void  test()
  {
Add a= new Add();
   int  ans = a.add(2,2);
Assert.assertEquals(4, ans); //corec t   
}

@Test
  public void  test1()
  {
     Add a= new Add();
     int  ans = a.add(1,2);
Assert.assertEquals(4, ans); //corec t

    
}


 

@Test
  public void  test81()
  {
     Add a= new Add();
     int  ans = a.add(1,2);
Assert.assertEquals(3, ans); //corec t

    
}









}
