package com.example.com.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button)findViewById(R.id.Btn1);
        btn2=(Button)findViewById(R.id.Btn2);
        btn3=(Button)findViewById(R.id.Btn3);
        btn4=(Button)findViewById(R.id.Btn4);

        btn1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.nate.com")));
                //Toast.makeText(getApplicationContext()," ")
            }

        });
        btn2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:911")));
                //Toast.makeText(getApplicationContext()," ")
            }

        });
        btn3.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media")));
                //Toast.makeText(getApplicationContext()," ")
            }

        });
        btn4.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                finish();
                //Toast.makeText(getApplicationContext()," ")
            }

        });
    }


//    public void onClick(View view){
//        // Button button = (Button)findViewById(view.getId());
//        switch (view.getId()){
//            case R.id.Btn1: startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.nate.com")));
//                break;
//            case R.id.Btn2: startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:911")));
//                break;
//            case R.id.Btn3: startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media")));
//                break;
//            case R.id.Btn4: finish();
//                break;
//        }
//
//    }
}
