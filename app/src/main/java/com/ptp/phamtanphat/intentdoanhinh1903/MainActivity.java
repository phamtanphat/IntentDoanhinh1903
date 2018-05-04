package com.ptp.phamtanphat.intentdoanhinh1903;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imgHinhchon, imgHinhgoc;
    String[] arrayanimal;
    ArrayList<String> mangtenhinh;
    String tenhinhgoc;
    int idhinhgoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgHinhchon = findViewById(R.id.imageviewHinhchon);
        imgHinhgoc = findViewById(R.id.imageviewHinhgoc);

        arrayanimal = getResources().getStringArray(R.array.Arrayanimals);
        // add string[] vao gia tri khoi tao cho arraylist
        mangtenhinh = new ArrayList<>(Arrays.asList(arrayanimal));
        //Buoc 1 : Random 1 tam hinh gan cho imgHinhgoc
        //Random cho mang
        Collections.shuffle(mangtenhinh);
        tenhinhgoc = mangtenhinh.get(0);
        //cach lay du lieu file thong qua ten file
        idhinhgoc = getResources().getIdentifier(tenhinhgoc, "drawable", getPackageName());
        imgHinhgoc.setImageResource(idhinhgoc);
        imgHinhchon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DanhsachhinhActivity.class);
                intent.putExtra("Manghinh",mangtenhinh);
                startActivity(intent);
            }
        });

    }
}
