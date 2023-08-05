// nomal functioon

import org.junit.Assert;
import org.junit.Test;

public class TestCase {

    static  String message="hello";



    @Test
    public void test()
    {
        Assert.assertEquals("hello", message);
    }
    
    public static void main(String[] args) {
        System.out.println(message);
        
    }


    
}
