import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TpointTest {

   

    //only function ku check karte hai main se jarurat nii
    @Test
    public void test()
    {
        Tpoint t= new Tpoint();
        Assert.assertEquals(99, t.maxnum(new int[] {11,22,9,2,5,6,99}));

    }


     @Before
    public void beforee()
     {
             Tpoint t= new Tpoint();
            //  Assert.assertEquals(1, t.add(0, 1);
            System.out.println("before");


      }
    
}
