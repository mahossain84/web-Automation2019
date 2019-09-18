package home;

import base.CommonApi;
import org.testng.annotations.Test;

public class homeTest extends CommonApi {

    @Test
    public void homeTest(){
        typeOnElement("headerSearch","Hammer");
        clickOnElement("SearchBox__input");

    }
}
