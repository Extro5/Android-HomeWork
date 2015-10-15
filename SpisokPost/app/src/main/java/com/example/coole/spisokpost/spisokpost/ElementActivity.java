package com.example.coole.spisokpost.spisokpost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ElementActivity extends AppCompatActivity {


    int img1;
    int img2;
    int img3;
    int img4;
    int img5;
    String name;
    String descr;
    String date;

    ElementActivity(int kimg1, String kname, String kdate, int kimg2, String kdescr, int kimg3, int kimg4, int kimg5) {
        img1 = kimg1;
        img2 = kimg2;
        img3 = kimg3;
        img4 = kimg4;
        img5 = kimg5;
        name = kname;
        descr = kdescr;
        date = kdate;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_element);


    }
}
