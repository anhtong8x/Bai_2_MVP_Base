package com.anhtong8x.mvpjava.networks;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.anhtong8x.mvpjava.configs.Helper.BASE_URL;

public class ApiClient {

    private static Retrofit retrofit = null;
    public static Retrofit getRetrofit (){
        if ( retrofit == null ){
            retrofit  = new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
