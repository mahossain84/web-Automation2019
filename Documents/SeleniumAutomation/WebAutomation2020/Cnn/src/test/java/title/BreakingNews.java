package title;

import base.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BreakingNews extends CommonApi {

    @Test
  public void testCnn(){
       //driver.findElement(By.cssSelector(".nav-linksstyles__Link-sc-1tike8v-0")).click();
        clickOnElement(".nav-linksstyles__Link-sc-1tike8v-0");
   }
}
