package com.homeoffice;

import com.homeoffice.propertyreader.PropertyReader;
import com.homeoffice.utilities.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Utility
{
    @Before
    public void setup()
    {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }



    @After
    public void teardown(){

    }


}
