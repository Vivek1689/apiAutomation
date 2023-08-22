package test;

import PojoClasses.Items;
import PojoClasses.PhotobookData;
import PojoClasses.TotalPriceAPIPayload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class totalPriceAPI {
    public double getActualPrice(String plu, String currencyCode, String regionCode){
        TotalPriceAPIPayload priceAPIPayload = new TotalPriceAPIPayload();
        Items items = new Items();
        PhotobookData sheetCount = new PhotobookData();
        sheetCount.setAdditionalSheetCount(0);
        items.setPlu(plu);
        items.setQuantity(1);
        items.setPhotobookData(sheetCount);
        List<Items> listOfItems = new ArrayList<>();
        listOfItems.add(items);
        priceAPIPayload.setItems(listOfItems);
        priceAPIPayload.setCurrencyCode(currencyCode);
        priceAPIPayload.setRegionCode(regionCode);

        RestAssured.baseURI = "https://dev-photos-client-usea-app.azurewebsites.net";
        String actualPriceResponse = given().header("Content-Type","application/json").header("api-version","2.0")
                .body(priceAPIPayload).when().post("/products/totalPrice").then().extract().response().asString();
       JsonPath actualPriceJs = new JsonPath(actualPriceResponse);
       return actualPriceJs.getDouble("price.value");

    }

    public void getExpectedPrice(String plu,String currencyCode){

    }
}
