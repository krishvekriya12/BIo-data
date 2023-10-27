package com.example.bio_data;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView re1,per1,na1,ad1,bi1,em1,co1,ed1,de1,col1,pas1,sc1,hob,hob1,hob2,hob3,ski,ski1,ski2,ski3,obj,obj1,gender;

    Button btnsumbit;
    RadioButton male1,female1,other1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        re1 =  findViewById(R.id.re1);
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

        btnsumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Resume = String.valueOf(Integer.parseInt(re1.toString()));
                String PersonalDetails   = String.valueOf(Integer.parseInt(per1.toString()));
                String Name = String.valueOf(Integer.parseInt(na1.toString()));
                String Address = String.valueOf(Integer.parseInt(ad1.toString()));
                String BirthDate = String.valueOf(Integer.parseInt(bi1.toString()));
                String EMailId = String.valueOf(Integer.parseInt(em1.toString()));
                String ContectNumber = String.valueOf(Integer.parseInt(co1.toString()));
                String EducationDetails = String.valueOf(Integer.parseInt(ed1.toString()));
                String Degree = String.valueOf(Integer.parseInt(de1.toString()));
                String CollegeSchoolUni = String.valueOf(Integer.parseInt(col1.toString()));
                String PassingYear = String.valueOf(Integer.parseInt(pas1.toString()));
                String Score = String.valueOf(Integer.parseInt(sc1.toString()));
                String HobbyDetails = String.valueOf(Integer.parseInt(hob.toString()));
                String Hobby1 = String.valueOf(Integer.parseInt(hob1.toString()));
                String Hobby2 = String.valueOf(Integer.parseInt(hob2.toString()));
                String Hobby3 = String.valueOf(Integer.parseInt(hob3.toString()));
                String SkillDetails = String.valueOf(Integer.parseInt(ski.toString()));
                String Skill1 = String.valueOf(Integer.parseInt(ski1.toString()));
                String Skill2 = String.valueOf(Integer.parseInt(ski2.toString()));
                String Skill3 = String.valueOf(Integer.parseInt(ski3.toString()));
                String ObjectivDetails = String.valueOf(Integer.parseInt(obj.toString()));
                String ObjectivDetails1= String.valueOf(Integer.parseInt(obj1.toString()));
                String GenderDetails = String.valueOf(Integer.parseInt(gender.toString()));
                String Male= String.valueOf(Integer.parseInt(male1.toString()));
                String Female= String.valueOf(Integer.parseInt(female1.toString()));
                String Other= String.valueOf(Integer.parseInt(other1.toString()));

                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra(Resume,Resume);
                i.putExtra(PersonalDetails,PersonalDetails);
                i.putExtra(Name,Name);
                i.putExtra(Address,Address);
                i.putExtra(BirthDate,BirthDate);
                i.putExtra(EMailId,EMailId);
                i.putExtra(ContectNumber,ContectNumber);
                i.putExtra(EducationDetails,EducationDetails);
                i.putExtra(Degree,Degree);
                i.putExtra(CollegeSchoolUni,CollegeSchoolUni);
                i.putExtra(PassingYear,PassingYear);
                i.putExtra(Score,Score);
                i.putExtra(HobbyDetails,HobbyDetails);
                i.putExtra(Hobby1,Hobby1);
                i.putExtra(Hobby2,Hobby2);
                i.putExtra(Hobby3,Hobby3);
                i.putExtra(SkillDetails,SkillDetails);
                i.putExtra(Skill1,Skill1);
                i.putExtra(Skill2,Skill2);
                i.putExtra(Skill3,Skill3);
                i.putExtra(ObjectivDetails,ObjectivDetails);
                i.putExtra(ObjectivDetails1,ObjectivDetails1);
                i.putExtra(GenderDetails,GenderDetails);
                i.putExtra(Male,Male);
                i.putExtra(Female,Female);
                i.putExtra(Other,Other);
            }
        });

    }
}