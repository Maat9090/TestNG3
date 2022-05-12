import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {

    @Test(priority = 1)

    void setup(){
        System.out.println(" Opening browser. ");
    }

    @Test (priority = 3)
    void searchCustomer(){
        System.out.println("This is search Customer test.");
<<<<<<< HEAD
     //   Assert.assertEquals(1,2);
=======
        Assert.assertEquals(1,2);
>>>>>>> d7dda5ca3a01ab624fe7faa6fe9f714eeb8b1e5b
    }
    @Test (priority = 2)
    void addCustomer(){
        System.out.println("This is add Customer test.");
    }
    @Test (priority = 4)
    void teardown(){
        System.out.println("Closing browser.");

    }

}
