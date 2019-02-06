package com.systangotest.Client;

import com.systangotest.Interface.ApiInterface;

public class ApiUtil {

    private static final String BASE_URL = "http://www.mocky.io/";

    public static ApiInterface getServiceClass() {
        return APIClient.getRetrofit(BASE_URL).create(ApiInterface.class);
    }
}
