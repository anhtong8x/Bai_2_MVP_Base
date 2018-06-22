package com.anhtong8x.mvpjava.views.mainapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.anhtong8x.mvpjava.R;
import com.anhtong8x.mvpjava.configs.MyApplication;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyApplication myApplication = (MyApplication)getApplicationContext();
        //Toast.makeText(this, "" + myApplication.getToken(), Toast.LENGTH_LONG).show();
        TextView txtToken = (TextView)findViewById(R.id.txtToken);
        txtToken.setText(myApplication.getToken().toString());

    }
}
