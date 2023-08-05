import org.junit.*;
public class PersonTest
{

@Test
    public void testName()
    {
    Person p= new Person("utl", 0222);
    Assert.assertEquals("utlcompany", p.getName()); 
    }



@Test
    public void testAge()
    {
      Person p= new Person("utl", 57);
   
         Assert.assertEquals(57, p.getAge());
    }

}
    

