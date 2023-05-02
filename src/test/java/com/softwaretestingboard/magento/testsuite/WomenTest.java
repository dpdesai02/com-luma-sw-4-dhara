package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {
    HomePage homepage = new HomePage();
    WomenPage womenpage = new WomenPage();


    @Test
    public void verifyTheSortByProductNameFilter()
    {
        homepage.mouseHoverOnWomenMenu();
        homepage.mouseHoverOnTops();
        homepage.clickOnJackets();
        womenpage.selectProductName("Product Name");

        Assert.assertEquals(womenpage.getProductList1(),womenpage.getProductList2());

    }
    @Test
    public void verifyTheSortByPriceFilter()
    {
        homepage.mouseHoverOnWomenMenu();
        homepage.mouseHoverOnTops();
        homepage.clickOnJackets();
        womenpage.selectProductName("Price");
        Assert.assertEquals(womenpage.getProductPriceList1(),womenpage.getProductPriceList2());

    }
}