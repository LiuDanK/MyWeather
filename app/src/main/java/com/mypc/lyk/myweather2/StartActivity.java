package com.mypc.lyk.myweather2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if (prefs.getString("weather", null) != null) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }

//        SharedPreferences sp= this.getSharedPreferences("firstStart", this.MODE_PRIVATE);
//        //firstStart 是手动命名的配置名称   this.MODE_PRIVATE 私有的,也就是只有本应用可以访问
//        boolean firstInto = sp.getBoolean("firstStart", true); //初始赋值为true
//        if (firstInto == true) {
//            // 第一次进入后修改成false 以后进入就不会重新进入欢迎界面了
//            SharedPreferences.Editor e = sp.edit(); //编辑配置
//            e.putBoolean("firstStart", false); //改为false
//            e.commit(); //结束编辑
//        }else
//        {
//            Intent in=new Intent(StartActivity.this,MainActivity.class);
//            startActivity(in);
//            finish();
//        }


    }
}
