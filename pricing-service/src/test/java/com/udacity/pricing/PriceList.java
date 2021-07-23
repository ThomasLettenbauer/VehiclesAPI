package com.udacity.pricing;

import com.udacity.pricing.domain.price.Price;

import java.util.ArrayList;
import java.util.List;

public class PriceList {
    private List<Price> priceList;

    public PriceList() {
    }

    public PriceList(List<Price> priceList) {
        this.priceList = priceList;
    }

    public List<Price> getPriceList() {
        return priceList;
    }

    public void setPriceList(List<Price> priceList) {
        this.priceList = priceList;
    }
}
