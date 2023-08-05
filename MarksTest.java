import org.junit.Assert;
import org.junit.Test;

public class MarksTest {

@Test
    public void fiftySNinehouldreturnD()
    {

        Marks m= new Marks();
       char ans=  m.grade(59);
        Assert.assertEquals('d', ans);

    }





@Test
    public void ThirdNineShouldreturnD()
    {

        Marks m= new Marks();
       char ans=  m.grade(349);
        Assert.assertEquals('f', ans);

    }

    @Test
    public void NiniNineShouldreturnD()
    {

        Marks m= new Marks();
       char ans=  m.grade(99);
        Assert.assertEquals('a', ans);

    }
    
}
