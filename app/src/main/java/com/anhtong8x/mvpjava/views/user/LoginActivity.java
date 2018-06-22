package com.anhtong8x.mvpjava.views.user;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.anhtong8x.mvpjava.configs.Helper;
import com.anhtong8x.mvpjava.configs.MyApplication;
import com.anhtong8x.mvpjava.presenters.user.LoginInterfaceP;
import com.anhtong8x.mvpjava.presenters.user.LoginLogicP;
import com.anhtong8x.mvpjava.R;
import com.anhtong8x.mvpjava.views.mainapp.MainActivity;

public class LoginActivity extends AppCompatActivity implements LoginInterfaceV {

    LoginInterfaceP loginInterfaceP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginInterfaceP = new LoginLogicP(this);
        Button btnLogin = (Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(onClickLogin);

    }

    View.OnClickListener onClickLogin = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String str = loginInterfaceP.getTokenLogin("0972139259","12031990");
        }
    };

    @Override
    public void loginSuccess(String token) {
        Toast.makeText(this, "" + token, Toast.LENGTH_LONG).show();
        MyApplication myApplication = (MyApplication)getApplicationContext();
        myApplication.setToken(token);
        Helper helper = new Helper();
        helper.launchActivity(this, MainActivity.class);
    }

    @Override
    public void loginUnSuccess() {

    }

}
