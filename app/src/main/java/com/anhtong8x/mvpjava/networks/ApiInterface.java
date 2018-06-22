package com.anhtong8x.mvpjava.networks;

import com.anhtong8x.mvpjava.models.base.ApiResponse;
import com.anhtong8x.mvpjava.models.user.LoginRequestM;
import com.anhtong8x.mvpjava.models.user.LoginResponseM;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {

    // login
    @POST("/api/Account/login")
    Call<ApiResponse<LoginResponseM>> getUserLogin(@Body LoginRequestM loginRequestM);
}
