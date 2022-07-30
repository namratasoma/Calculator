package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText editText1;
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,btDot,btEq,btAdd,btSub,btMul,btDiv,btClr;
    Float r1,r2;
    Float r;
    boolean add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.et);
        editText1 = (EditText)findViewById(R.id.et2);

        bt1 = (Button) findViewById(R.id.b1);
        bt2 = (Button) findViewById(R.id.b2);
        bt3 = (Button) findViewById(R.id.b3);
        bt4 = (Button) findViewById(R.id.b4);
        bt5 = (Button) findViewById(R.id.b5);
        bt6 = (Button) findViewById(R.id.b6);
        bt7 = (Button) findViewById(R.id.b7);
        bt8 = (Button) findViewById(R.id.b8);
        bt9 = (Button) findViewById(R.id.b9);
        bt0 = (Button) findViewById(R.id.b0);

        btDot = (Button) findViewById(R.id.bDot);
        btEq = (Button) findViewById(R.id.bEq);
        btClr = (Button) findViewById(R.id.bClr);

        btAdd = (Button) findViewById(R.id.bAdd);
        btSub = (Button) findViewById(R.id.bSub);
        btMul = (Button) findViewById(R.id.bMul);
        btDiv = (Button) findViewById(R.id.bDiv);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText()+"1");
                r = Float.parseFloat("1");
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText()+"2");
                r = Float.parseFloat("2");
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText()+"3");
                r = Float.parseFloat("3");
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText()+"4");
                r = Float.parseFloat("4");
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText()+"5");
                r = Float.parseFloat("5");
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText()+"6");
                r = Float.parseFloat("6");
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText()+"7");
                r = Float.parseFloat("7");
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText()+"8");
                r = Float.parseFloat("8");
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText()+"9");
                r = Float.parseFloat("9");
            }
        });

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText()+"0");
                r = Float.parseFloat("0");
            }
        });

        btDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText()+".");
                r = Float.parseFloat(".");
            }
        });

        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText1==null)
                {
                    editText1.setText("");
                }
                else
                {
                    r1 = Float.parseFloat(editText1.getText()+"");
                    add = true;
                    editText1.setText(r1+"+");
                }
            }
        });

        btSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText1==null)
                {
                    editText1.setText("");
                }
                else
                {
                    r1 = Float.parseFloat(editText1.getText()+"");
                    sub = true;
                    editText1.setText(r1+"-");
                }
            }
        });

        btMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText1==null)
                {
                    editText1.setText("");
                }
                else
                {
                    r1 = Float.parseFloat(editText1.getText()+"");
                    mul = true;
                    editText1.setText(r1+"*");
                }
            }
        });

        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText1==null)
                {
                    editText1.setText("");
                }
                else
                {
                    r1 = Float.parseFloat(editText1.getText()+"");
                    div = true;
                    editText1.setText(r1+"/");
                }
            }
        });

        btEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r2 = r;

                if(add==true)
                {
                    editText1.setText(null);
                    editText1.setText(r1+"+"+r2);
                    editText.setText(r1+r+"");
                    add = false;
                }

                if(sub==true)
                {
                    editText1.setText(null);
                    editText1.setText(r1+"-"+r2);
                    editText.setText(r1-r2+"");
                     sub = false;
                }

                if(mul==true)
                {
                    editText1.setText(null);
                    editText1.setText(r1+"*"+r2);
                    editText.setText(r1*r2+"");
                    mul = false;
                }

                if(div==true)
                {
                    editText1.setText(null);
                    editText1.setText(r1+"/"+r2);
                    editText.setText(r1/r2+"");
                    div = false;
                }
            }
        });

        btClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText("");
                editText.setText("");
            }
        });


    }
}