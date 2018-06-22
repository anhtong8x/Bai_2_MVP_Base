package com.anhtong8x.mvpjava.configs;

import android.content.Context;
import android.content.Intent;

public class Helper {

    public static String BASE_URL = "http://14.225.3.30:461/";

    public static void launchActivity(Context context, Class<?> clss){
        Intent intent = new Intent(context, clss);
        context.startActivity(intent);
    }

}
