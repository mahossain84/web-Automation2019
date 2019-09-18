package accountSign;

import base.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AccountSignTest extends CommonApi {
   @Test
    public void Account() {
        // driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();

        clickOnElement("#nav-link-accountList");
        typeOnElement("ap_email","alamgirhossain1984@gmail.com");
        clickOnElement("#continue");
        typeOnElement("ap_password","1234567");
        clickOnElement(".a-button-input");

    }


    }

