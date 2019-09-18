package amazonGiftCard;

import base.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AmazonGiftCardTest extends CommonApi {

    @Test

    public void giftTest(){
        tryOnXpath("//a[contains(text(),'Gift Cards')]");
        tryOnXpath("//a[contains(text(),'Redeem an Amazon Gift Card')]");
        tryOnXpath("//a[contains(text(),'Create your Amazon account')]");
        typeOnElement("ap_customer_name","Alamgir");
        typeOnElement("#email","alaviusanyc@yahoo.com");
    }

//    @Test
//    public void t(){
//       // driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
//        tryOnXpath("//a[contains(text(),'Gift Cards')]");
//    }
}
