package title;

import base.CommonApi;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonHome extends CommonApi {

    @Test
    public void test1(){
        String title = driver.getTitle();
        Assert.assertEquals(title, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
    }

}









