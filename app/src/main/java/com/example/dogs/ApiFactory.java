package com.example.dogs;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiFactory {

    private static final String BASE_URL = "https://dog.ceo/api/breeds/";
    private static ApiSrv apiSrv;

    public static ApiSrv getApiSrv() {
    if(apiSrv == null){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .build();
        apiSrv = retrofit.create(ApiSrv.class);
    }
    return apiSrv;
    }
}
