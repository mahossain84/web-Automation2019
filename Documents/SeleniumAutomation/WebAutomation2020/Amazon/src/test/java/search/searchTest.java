package search;

import base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class searchTest extends CommonApi {
    @Test
   public void search(){
       // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books", Keys.ENTER);

        typeOnElement("twotabsearchtextbox", "Books");
       clickOnElement(".nav-input");

   }


}
