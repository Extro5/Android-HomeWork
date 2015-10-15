package com.example.coole.spisokpost.spisokpost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SpisokPostActivity extends AppCompatActivity {
    ArrayList<ElementActivity> ea = new ArrayList<>();
    private String[] date;
    private String[] descr;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spisok_post);


        fillDate();
        fillDecsr();
        fillAdapter();

        myAdapter = new MyAdapter(this, ea);

        ListView lvlol = (ListView)  findViewById(R.id.lv1);
        lvlol.setAdapter(myAdapter);

        lvlol.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final Toast toast = Toast.makeText(getApplicationContext(), descr[position], Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }


    private void fillDate() {
        date = getResources().getStringArray(R.array.datearr);

    }

    private void fillDecsr() {
        descr = getResources().getStringArray(R.array.deskrarr);
    }

    private void fillAdapter() {
        for (int i = 0; i < date.length; i++) {
            ea.add(new ElementActivity(R.drawable.sams, "Samsung Android Lab", descr[i], R.drawable.dotsvertical11, date[i], R.drawable.com11, R.drawable.bullhorn11, R.drawable.heart11));
        }
    }
}