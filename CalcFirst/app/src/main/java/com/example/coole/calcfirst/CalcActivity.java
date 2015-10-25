package com.example.coole.calcfirst;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalcActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;

    private Button btnplus;
    private Button btnc;
    private Button btnmnus;
    private Button btnravno;
    private Button btnnull;
    private TextView tv1;
    public int num = 0;
    public int result = 0;
    public int num1 = 0;
    public int q = 0;
    public int num2 = 0;
    public int num3 = 0;
    public int z = 0;
    public int x = 0;
    public int c = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);


        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn8 = (Button) findViewById(R.id.btn8);
        Button btn9 = (Button) findViewById(R.id.btn9);
        Button btnplus = (Button) findViewById(R.id.btnplus);
        Button btnmnus = (Button) findViewById(R.id.btnmnus);
        Button btnravno = (Button) findViewById(R.id.btnravno);
        Button btnnull = (Button) findViewById(R.id.btnnull);
        Button btnc = (Button) findViewById(R.id.btnc);
        final TextView tv1 = (TextView) findViewById(R.id.tv1);


        btn1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                if (num == 0) {
                    num += 1;
                } else {
                    num = num * 10 + 1;
                }
                String r = (String) tv1.getText();


                tv1.setText(r + "1");
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (num == 0) {
                    num += 2;
                } else {
                    num = num * 10 + 2;
                }
                String r = (String) tv1.getText();


                tv1.setText(r + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num == 0) {
                    num += 3;
                } else {
                    num = num * 10 + 3;
                }
                String r = (String) tv1.getText();


                tv1.setText(r + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num == 0) {
                    num += 4;
                } else {
                    num = num * 10 + 4;
                }
                String r = (String) tv1.getText();


                tv1.setText(r + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num == 0) {
                    num += 5;
                } else {
                    num = num * 10 + 5;
                }
                String r = (String) tv1.getText();


                tv1.setText(r + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num == 0) {
                    num += 6;
                } else {
                    num = num * 10 + 6;
                }
                String r = (String) tv1.getText();


                tv1.setText(r + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (num == 0) {
                    num += 7;
                } else {
                    num = num * 10 + 7;
                }
                String r = (String) tv1.getText();


                tv1.setText(r + "7");
            }
        });


        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num == 0) {
                    num += 8;
                } else {
                    num = num * 10 + 8;
                }
                String r = (String) tv1.getText();


                tv1.setText(r + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num == 0) {
                    num += 9;
                } else {
                    num = num * 10 + 9;
                }
                String r = (String) tv1.getText();


                tv1.setText(r + "9");


            }
        });

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String r = (String) tv1.getText();


                tv1.setText(r + "+");

                if (x == 1) {
                    result = result - num;
                    x = 0;
                } else if (x == 0) {
                    result = result + num;
                }

                z = 1;


                num = 0;


            }
        });


        btnmnus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String r = (String) tv1.getText();


                tv1.setText(r + "-");
                if (z == 1) {

                    result = result + num;
                    z = 0;

                } else if ((z == 0) && (c == 0)) {
                    result = num;

                } else if (z == 0) {
                    result = result - num;
                }
                c = 1;
                x = 1;
                num = 0;


            }
        });

        btnnull.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (num == 0) {
                    num += 0;
                } else {
                    num = num * 10 + 0;
                }
                String r = (String) tv1.getText();


                tv1.setText(r + "0");


            }
        });

        btnravno.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String r = (String) tv1.getText();
                if (z == 1) {
                    result = result + num;
                    z = 0;
                    num = 0;

                } else if (x == 1) {
                    result = result - num;
                    x = 0;
                    num = 0;

                }


                String str = Integer.toString(result);
                tv1.setText(str);

            }
        });

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String r = " ";
                tv1.setText(r);

                num = 0;
                result = 0;
                num1 = 0;
                q = 0;
                num2 = 0;
                num3 = 0;
                z = 0;
                x = 0;
                c = 0;

            }
        });

    }


}
