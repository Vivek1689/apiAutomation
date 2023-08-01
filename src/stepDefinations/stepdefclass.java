package stepDefinations;

import io.cucumber.java.en.Given;
import test.*;

import java.util.ArrayList;

public class stepdefclass {

    @Given("total price API is called with currencyCode as {string} and regionCode as {string}")
    public void totalPriceAPIIsCalledWithCountryCodeAsAndRegionCodeAs(String currencyCode, String regionCode) {
        totalPriceAPI totalpriceapi = new totalPriceAPI();
        listOfProducts products = new listOfProducts();
        ArrayList<String> productList = (ArrayList<String>) products.getPlu();
        for (String product:productList) {
            double actualPrice = totalpriceapi.getActualPrice(product,currencyCode,regionCode);
            System.out.println(actualPrice);
        }

    }

    @Given("price API is called with currencyCode as {string} and regionCode as {string}")
    public void priceAPIIsCalledWithCurrencyCodeAsAndRegionCodeAs(String currencyCode, String regionCode) {

    }
}