package com.ptp.phamtanphat.intentdoanhinh1903;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class DanhsachhinhActivity extends AppCompatActivity {

    ArrayList<String> manghinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhsachhinh);

        Intent intent = getIntent();
        manghinh = intent.getStringArrayListExtra("Manghinh");


    }
}
