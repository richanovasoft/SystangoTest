package com.systangotest.Interface;

import com.systangotest.Bean.ProductBean;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
//https://inducesmile.com/android/android-retrofit-2-with-json-api-example/
public interface ApiInterface {

    @GET("v2/5a96abc232000057005e2ed7")
    public Call<List<ProductBean>> getAllPost();

}


