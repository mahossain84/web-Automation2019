package register;

import base.CommonApi;
import org.testng.annotations.Test;

public class RegisterEbay extends CommonApi {


    @Test
    public void register (){



        clickOnElement("#gh-ug-flex > a:nth-child(1)");
        typeOnElement("#firstname","Alamgir");
        typeOnElement("#lastname","Hossain");
        typeOnElement("#email", "Alamgirhossain1984@gmail.com");
        typeOnElement("PASSWORD","123456");




    }


}
