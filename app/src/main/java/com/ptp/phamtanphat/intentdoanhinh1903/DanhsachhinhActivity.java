package com.ptp.phamtanphat.intentdoanhinh1903;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;

import java.util.ArrayList;

public class DanhsachhinhActivity extends AppCompatActivity {

    ArrayList<String> manghinh;
    TableLayout tableLayout;
    int id = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhsachhinh);

        tableLayout = findViewById(R.id.tablelayout);
        Intent intent = getIntent();
        manghinh = intent.getStringArrayListExtra("Manghinh");

        int sodong = 6;
        int socot = 3;

        for (int i = 1 ; i <= sodong ; i++){
            TableRow tableRow = new TableRow(this);
            for (int j = 1 ; j <= socot ; j++){
                ImageView imageView = new ImageView(this);
                //socot * (i - 1) + j -1
                int vitri = id++;
                TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(190,190);
                int idhinh = getResources().getIdentifier(manghinh.get(vitri),"drawable",getPackageName());
                imageView.setImageResource(idhinh);
                imageView.setLayoutParams(layoutParams);
                tableRow.addView(imageView);
            }
            tableLayout.addView(tableRow);
        }
    }


}
