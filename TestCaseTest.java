import org.junit.*;
public class TestCaseTest 
{
static int beforClassCount =1;
static int beforCount =1;
static int afterCount =1;
static int afterClassCount =1;

 
    @Before
    public void b() {
      
        System.out.println("Before = "  +beforCount++);
    }

      @BeforeClass
    public static void bs() {
       
        System.out.println("BeforClass = "+beforClassCount++);
    }
       @Test
    public void test1() {
      
        System.out.println("test()1");
    }
        @Test
    public void test2() {
      
        System.out.println("test()2");
    }

       @Test
    public void test3() {
      
        System.out.println("test()3");
    }
    
      @After
    public void a() {
     
        System.out.println("After"+afterCount++);
    }
      @AfterClass
    public static void as() {
        
        System.out.println("AfterClass"+afterClassCount++);
    }
}
