import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class LabTest {
    @Test
    public void findsum()
    {
    
        Assert.assertEquals(267677, Lab.add( new int[] {1,2,3,4,5,6}));
        Assert.assertEquals(21, Lab.add( new int[] {1,2,3,4,5,6}));
         Assert.assertEquals(22, Lab.add( new int[] {2,2,3,4,5,6}));

    }
    
}
