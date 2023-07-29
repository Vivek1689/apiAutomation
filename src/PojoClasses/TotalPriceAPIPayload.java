package PojoClasses;

import java.util.ArrayList;
import java.util.List;

public class TotalPriceAPIPayload {

    private List<Items> items = new ArrayList<>();
    private String currencyCode;
    private String regionCode;

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }


}
