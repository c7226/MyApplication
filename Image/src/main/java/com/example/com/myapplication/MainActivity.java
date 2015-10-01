package com.example.com.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView text1,text2;
    Switch sw;
    RadioGroup rG;
    RadioButton rB1,rB2,rB3;
    Button exit,re;
    ImageView verImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle(R.string.title);

        text1=(TextView)findViewById(R.id.text1);
        sw=(Switch)findViewById(R.id.sw);

        text2=(TextView)findViewById(R.id.text2);
        rG=(RadioGroup)findViewById(R.id.rGroup1);
        rB1=(RadioButton)findViewById(R.id.rBtn1);
        rB2=(RadioButton)findViewById(R.id.rBtn2);
        rB3=(RadioButton)findViewById(R.id.rBtn3);

        exit=(Button)findViewById(R.id.exit);
        re=(Button)findViewById(R.id.re);

        verImg=(ImageView)findViewById(R.id.verImg);

        sw.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (sw.isChecked() == true) {
                    text2.setVisibility(View.VISIBLE);
                    rG.setVisibility(View.VISIBLE);
                    rB1.setVisibility(View.VISIBLE);
                    rB2.setVisibility(View.VISIBLE);
                    rB3.setVisibility(View.VISIBLE);
                    verImg.setVisibility(View.VISIBLE);

                } else {
                    text2.setVisibility(View.INVISIBLE);
                    rG.setVisibility(View.INVISIBLE);
                    rB1.setVisibility(View.INVISIBLE);
                    rB2.setVisibility(View.INVISIBLE);
                    rB3.setVisibility(View.INVISIBLE);
                    verImg.setVisibility(View.INVISIBLE);
                }

            }


    });

        rG.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                switch (rG.getCheckedRadioButtonId()) {
                    case R.id.rBtn1:
                        verImg.setImageResource(R.drawable.jelly_bean);
                        break;
                    case R.id.rBtn2:
                        verImg.setImageResource(R.drawable.kitkat);
                        break;
                    case R.id.rBtn3:
                        verImg.setImageResource(R.drawable.lollipop);
                        break;
                    default:
                        break;
                }
            }
        });


    }


}
