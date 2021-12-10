package com.example.setin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String content ="哒哒哒哒";//短信内容
        String phone = "15381199038";//电话号码
        SmsManager sm = SmsManager.getDefault();
        List<String> sms = sm.divideMessage(content);
        for (String smslist :sms){
            sm.sendTextMessage(phone,null,smslist,null,null);
        }
    }
}