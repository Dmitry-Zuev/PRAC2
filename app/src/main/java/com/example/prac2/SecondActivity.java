package com.example.prac2;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        String group = intent.getStringExtra("group");
        int age = intent.getIntExtra("age", 0);
        float grade = intent.getFloatExtra("grade", 0.0f);

        TextView textViewName = findViewById(R.id.textViewName);
        TextView textViewGroup = findViewById(R.id.textViewGroup);
        TextView textViewAge = findViewById(R.id.textViewAge);
        TextView textViewGrade = findViewById(R.id.textViewGrade);

        textViewName.setText("ФИО: " + name);
        textViewGroup.setText("Группа: " + group);
        textViewAge.setText("Возраст: " + age);
        textViewGrade.setText("Оценка: " + grade);
    }
}
