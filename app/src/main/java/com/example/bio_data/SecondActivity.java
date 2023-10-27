package com.example.bio_data;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView re1,per1,na1,ad1,bi1,em1,co1,ed1,de1,col1,pas1,sc1,hob,hob1,hob2,hob3,ski,ski1,ski2,ski3,obj,obj1,gender;

    Button btnsumbit;
    RadioButton male1,female1,other1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        re1=findViewById(R.id.re1);
        per1 = findViewById(R.id.per1);
        na1 = findViewById(R.id.na1);
        ad1 = findViewById(R.id.ad1);
        bi1 = findViewById(R.id.bi1);
        em1 = findViewById(R.id.em1);
        co1 = findViewById(R.id.co1);
        ed1 = findViewById(R.id.ed1);
        de1 = findViewById(R.id.de1);
        col1 = findViewById(R.id.col1);
        pas1 = findViewById(R.id.pas1);
        sc1 = findViewById(R.id.sc1);
        hob1 = findViewById(R.id.hob1);
        hob2 =findViewById(R.id.hob2);
        hob3 = findViewById(R.id.hob3);
        ski = findViewById(R.id.ski);
        ski1 = findViewById(R.id.ski1);
        ski2 = findViewById(R.id.ski2);
        ski3 = findViewById(R.id.ski3);

        male1 = findViewById(R.id.male1);
        female1 = findViewById(R.id.female1);
        other1 = findViewById(R.id.other1);
        btnsumbit = findViewById(R.id.btnsumbit);
    }
}