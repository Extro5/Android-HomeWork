package com.example.coole.calcfirst;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Objects;

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
    private Button btnmnus;
    private Button btnravno;
    private Button btnnull;
    private TextView tv1;
    public String str = "";
    final static int CLEAR = 1;
    final static int DONT_CLEAR = 0;
    int clearCalcDisplay = 0;
    ArrayList<Float> result = new ArrayList<Float>();
    float number2;
    float number1;
    final static int SUBTRACT = 2;
    final static int ADD = 1;
    int currentOperation = 0;
    int nextOperation;
    final static int EQUALS = 5;



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
        final TextView tv1 = (TextView) findViewById(R.id.tv1);





        tv1.setKeyListener(DigitsKeyListener.getInstance(true, true));

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String r = (String) tv1.getText();


                tv1.setText(r + "1");
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String r = (String) tv1.getText();


                tv1.setText(r + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String r = (String) tv1.getText();


                tv1.setText(r + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String r = (String) tv1.getText();


                tv1.setText(r + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String r = (String) tv1.getText();


                tv1.setText(r + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String r = (String) tv1.getText();


                tv1.setText(r + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (clearCalcDisplay == CLEAR) {
                    tv1.setText("");
                }
                clearCalcDisplay = DONT_CLEAR;
                tv1.append("7");

            }
        });


        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String r = (String) tv1.getText();


                tv1.setText(r + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String r = (String) tv1.getText();


                tv1.setText(r + "9");


            }
        });

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String r = (String) tv1.getText();

                if (r != "" ) {
                    tv1.setText(r + "+");


                }


            }
        });


        btnmnus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    calcLogic(SUBTRACT);

            }
        });

        btnnull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String r = (String) tv1.getText();


                tv1.setText(r + "0");


            }
        });

        btnravno.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {

               if ( tv1.getText().length() == 5) {


                    String r = (String) tv1.getText();
                    char a = r.charAt(0);
                    char b = r.charAt(2);
                    char c = r.charAt(4);

                    char q = r.charAt(1);
                    char w = r.charAt(3);
                    String z = Character.toString(q);
                    String x = Character.toString(w);


                    int e = Character.getNumericValue(a);
                    int d = Character.getNumericValue(b);
                    int k = Character.getNumericValue(c);

                    if ((Objects.equals(z, "+")) && (Objects.equals(x, "+"))) {

                        int p = e + d + k;
                        r = Integer.toString(p);
                        tv1.setText(r);
                    } else if (((Objects.equals(z, "+")) && (Objects.equals(x, "-")))) {
                        int p = e + d - k;
                        r = Integer.toString(p);
                        tv1.setText(r);
                    } else if (((Objects.equals(z, "-")) && (Objects.equals(x, "+")))) {
                        int p = e - d + k;
                        r = Integer.toString(p);
                        tv1.setText(r);
                    } else if (((Objects.equals(z, "-")) && (Objects.equals(x, "-")))) {
                        int p = e - d - k;
                        r = Integer.toString(p);
                        tv1.setText(r);
                    }
                }else if ( tv1.getText().length() == 3) {

                    String r = (String) tv1.getText();
                    char a = r.charAt(0);
                    char b = r.charAt(2);

                    char q = r.charAt(1);
                    String z = Character.toString(q);

                    int e = Character.getNumericValue(a);
                    int d = Character.getNumericValue(b);

                    if ((Objects.equals(z, "+")) ) {

                        int p = e + d;
                        r = Integer.toString(p);
                        tv1.setText(r);
                    } else if (((Objects.equals(z, "-")))) {
                        int p = e - d;
                        r = Integer.toString(p);
                        tv1.setText(r);
                    }

                }

            }
        });


    }


    private void calcLogic(int operator) {

        result.add(Float.parseFloat(tv1.getText().toString()));

        if (operator != EQUALS) {
            nextOperation = operator;
        } else if (operator == EQUALS) {
            nextOperation = 0;
        }

        switch (currentOperation) {

    /*Прибавление*/
            case ADD:
                number1 = result.get(0);
                number2 = result.get(1);

                result.removeAll(result);

                result.add(number1 + number2);

                tv1.setText(String.format("%.0f", result.get(0)));
                break;

      /*Вычитание*/
            case SUBTRACT:
                number1 = result.get(0);
                number2 = result.get(1);

                result.removeAll(result);

                result.add(number1 - number2);

                tv1.setText(String.format("%.0f", result.get(0)));
                break;


        }
    }
}
