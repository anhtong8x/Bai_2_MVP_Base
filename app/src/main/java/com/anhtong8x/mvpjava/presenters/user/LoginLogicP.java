package com.anhtong8x.mvpjava.presenters.user;

import android.util.Log;

import com.anhtong8x.mvpjava.models.base.ApiResponse;
import com.anhtong8x.mvpjava.models.user.LoginRequestM;
import com.anhtong8x.mvpjava.models.user.LoginResponseM;
import com.anhtong8x.mvpjava.networks.ApiClient;
import com.anhtong8x.mvpjava.networks.ApiInterface;
import com.anhtong8x.mvpjava.views.user.LoginInterfaceV;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginLogicP implements LoginInterfaceP {
    LoginInterfaceV view;

    public LoginLogicP(LoginInterfaceV view) {
        this.view = view;
    }


    @Override
    public String getTokenLogin(String userName, String passWord) {
        String tk = "";
        try{
            ApiInterface api = ApiClient.getRetrofit().create(ApiInterface.class);
            tk = getToken(api, new LoginRequestM(userName, passWord));
        }catch (Exception ex){
            //
        }
        return tk;
    }

    private String getToken (ApiInterface api, LoginRequestM userLogin){
        final String[] tk = {""};
        Call<ApiResponse<LoginResponseM>> call = api.getUserLogin(userLogin);
        call.enqueue(new Callback<ApiResponse<LoginResponseM>>() {
            @Override
            public void onResponse(Call<ApiResponse<LoginResponseM>> call, Response<ApiResponse<LoginResponseM>> response) {
                //Log.d("LOG", "" + response.code());
                ApiResponse<LoginResponseM> u = response.body();
                //Log.d("LOG", "" + u.getData().getToken());
                tk[0] = u.getData().getToken();
                if( !tk[0].equals("") ){view.loginSuccess(tk[0]);}
                else { view.loginUnSuccess();}
            }

            @Override
            public void onFailure(Call<ApiResponse<LoginResponseM>> call, Throwable t) {

            }
        });

        return tk[0];
    }

}
