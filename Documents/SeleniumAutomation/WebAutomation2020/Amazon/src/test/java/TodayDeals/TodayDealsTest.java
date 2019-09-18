package TodayDeals;

import base.CommonApi;
import org.testng.annotations.Test;

public class TodayDealsTest extends CommonApi {
    @Test

    public void DealsTest(){

        clickOnElement("#nav-xshop > a:nth-child(2)");

        clickOnElement("div.tile:nth-child(3) > a:nth-child(1) > div:nth-child(1)");

  }
}
