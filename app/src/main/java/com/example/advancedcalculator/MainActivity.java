package com.example.advancedcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn5,btn6,btn7,btn9,btn10,btn11,btn13,btn14,btn15,btn18;
    Button buttonAdd,buttonSub,buttonDivision,buttonMul,buttonDot,buttonC,buttonEqual,buttonMark,buttonPercent,buttonExNumb,buttonRoot,buttonMode,buttonFact,buttonPerm;
    TextView numb;
    float numb1, numb2;
    boolean bdAddition,mSubtract,bdMultiplication,bdDivision,bdPercent,bdExNumb,bdRoot,bdMode,bdFact,bdPerm,bdMark;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn5 = (findViewById(R.id.btn5));
        btn6 = (findViewById(R.id.btn6));
        btn7 = (findViewById(R.id.btn7));
        btn9 = (findViewById(R.id.btn9));
        btn10 = (findViewById(R.id.btn10));
        btn11 = (findViewById(R.id.btn11));
        btn14 = (findViewById(R.id.btn14));
        btn13 = (findViewById(R.id.btn13));
        btn15 = (findViewById(R.id.btn15));
        btn18 = (findViewById(R.id.btn18));
        buttonAdd = (findViewById(R.id.btn16));
        buttonSub = (findViewById(R.id.btn12));
        buttonMul = (findViewById(R.id.btn8));
        buttonDivision = (findViewById(R.id.btn4));
        buttonC = (findViewById(R.id.btn1));
        buttonEqual = (findViewById(R.id.btn20));
        buttonMark = (findViewById(R.id.btn2));
        buttonPercent = (findViewById(R.id.btn3));
        buttonDot = (findViewById(R.id.btn19));
        buttonExNumb = (findViewById(R.id.btn17));
        buttonRoot = (findViewById(R.id.btn21));
        buttonMode = (findViewById(R.id.btn22));
        buttonFact = (findViewById(R.id.btn23));
        buttonPerm = (findViewById(R.id.btn24));

        numb = (findViewById(R.id.numb));

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numb.setText(numb.getText()+"1");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numb.setText(numb.getText()+"2");
            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numb.setText(numb.getText()+"3");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numb.setText(numb.getText()+"4");
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numb.setText(numb.getText()+"5");
            }
        });


        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numb.setText(numb.getText()+"6");
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numb.setText(numb.getText()+"7");
            }
        });

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numb.setText(numb.getText()+"8");
            }
        });

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numb.setText(numb.getText()+"9");
            }
        });

        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numb.setText(numb.getText()+"0");
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numb.setText(numb.getText()+".");

            }
        });


        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(numb == null)
                {
                    numb.setText("");
                }
                else
                {
                    numb1 = Float.parseFloat(numb.getText()+"");
                    bdAddition=true;
                    numb.setText(null);
                }

            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numb1 = Float.parseFloat(numb.getText()+"");
                mSubtract = true;
                numb.setText(null);

            }
        });

        buttonFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numb1 = Float.parseFloat(numb.getText()+"");
                bdFact = true;

            }
        });


        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numb1 = Float.parseFloat(numb.getText()+"");
                bdMultiplication = true;
                numb.setText(null);
            }
        });

        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numb1 = Float.parseFloat(numb.getText()+"");
                bdPercent = true;
                numb.setText(null);
            }
        });

        buttonExNumb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numb1 = Float.parseFloat(numb.getText()+"");
                bdExNumb = true;
                numb.setText(null);
            }
        });

        buttonMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numb1 = Float.parseFloat(numb.getText()+"");
                bdMode= true;
                numb.setText(null);
            }
        });



        buttonRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numb2 = Float.parseFloat(numb.getText()+"");
                bdRoot = true;
            }
        });


        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numb1 = Float.parseFloat(numb.getText()+"");
                bdDivision = true;
                numb.setText(null);

            }
        });


        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numb.setText("");

            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(!numb.equals(""))
                {
                    numb2 = Float.parseFloat(numb.getText()+"");
                    if(bdAddition == true)
                    {
                        numb.setText(numb1 + numb2 +"");
                        bdAddition = false;
                    }

                    if (mSubtract == true)
                    {
                        numb.setText(numb1 - numb2 +"");
                        mSubtract = false;
                    }
                    if(bdDivision == true)
                    {
                        numb.setText(numb1 / numb2 +"");
                        bdDivision = false;
                    }
                    if(bdMultiplication == true)
                    {
                        numb.setText(numb1 * numb2 +"");
                        bdMultiplication = false;
                    }
                    if(bdPercent == true)
                    {
                        numb.setText(numb1 * numb2 /(100)+"");
                        bdPercent = false;
                    }
                    if(bdExNumb == true)
                    {
                        numb.setText(Math.pow(numb1, numb2)+"");
                        bdExNumb = false;
                    }
                    if(bdMode == true)
                    {
                        numb.setText(numb1%numb2+"");
                        bdMode = false;
                    }

                    if(bdFact == true)
                    {
                        int sayi = 1;
                        for(int i=1;i<=numb1;i++)
                        {
                            sayi = sayi * i;
                        }
                        numb.setText(sayi+"");
                        bdFact = false;
                    }

                    if(bdRoot == true)
                    {
                        numb.setText(Math.sqrt(numb2)+"");
                        bdRoot = false;

                    }



                }
                else
                {
                    numb.setText("0");
                }
            }
        });







    }
}