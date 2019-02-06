package com.systangotest.Bean;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class ProductBean extends RealmObject {


    @PrimaryKey
    private int mProductId;

    private String mStrProductName;

    private String mStrProductPrice;

    private String mStrProductCategory;
    
    private String mStrProductImage;


    public String getStrProductName() {
        return mStrProductName;
    }

    public void setStrProductName(String mStrProductName) {
        this.mStrProductName = mStrProductName;
    }

    public String getStrProductPrice() {
        return mStrProductPrice;
    }

    public void setStrProductPrice(String mStrProductPrice) {
        this.mStrProductPrice = mStrProductPrice;
    }

    public String getStrProductCategory() {
        return mStrProductCategory;
    }

    public void setStrProductCategory(String mStrProductCategory) {
        this.mStrProductCategory = mStrProductCategory;
    }

    public String getStrProductImage() {
        return mStrProductImage;
    }

    public void setStrProductImage(String mStrProductImage) {
        this.mStrProductImage = mStrProductImage;
    }

    public int getProductId() {
        return mProductId;
    }

    public void setProductId(int mProductId) {
        this.mProductId = mProductId;
    }
}
