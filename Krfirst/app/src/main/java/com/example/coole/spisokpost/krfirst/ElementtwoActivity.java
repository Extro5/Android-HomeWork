package com.example.coole.spisokpost.krfirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ElementtwoActivity extends AppCompatActivity {
    public Button btn2;
    public Button btn3;
    public TextView tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elementtwo);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        final TextView tv4 = (TextView) findViewById(R.id.tv4);



        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String r = (String) tv4.getText();
                Integer result = new Integer(r);


                result++;

                String str = Integer.toString(result);

                if (result > 0){
                    tv4.setText("+"+str);
                }else
                tv4.setText(str);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String r = (String) tv4.getText();
                Integer result = new Integer(r);

                result--;

                String str = Integer.toString(result);


                if (result > 0){
                    tv4.setText("+"+str);
                }else
                    tv4.setText(str);
                tv4.setText(str);

            }
        });





    }
}
