package com.ntuzer.reweldemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ActivityC extends AppCompatActivity {

    private ImageButton toA;
    private ImageButton toB;
    private ImageButton toC;
    private ImageButton toD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        //ButterKnife.bind(this);

        initialView();
        initialListener();
    }




    private void initialView() {
        toA =(ImageButton) findViewById(R.id.toA);
        toB =(ImageButton) findViewById(R.id.toB);
        toC =(ImageButton) findViewById(R.id.toC);
        toD =(ImageButton) findViewById(R.id.toD);

    }


    private void initialListener() {
        toA.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Button toA was clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(v.getContext(), ActivityA.class);
                startActivity(intent);

            }
        });

        toB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Button toB was clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(v.getContext(), ActivityB.class);
                startActivity(intent);

            }
        });

        toC.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Button toC was clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(v.getContext(), ActivityC.class);
                startActivity(intent);

            }
        });

        toD.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Button toD was clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(v.getContext(), ActivityD.class);
                startActivity(intent);

            }
        });

    }
}
