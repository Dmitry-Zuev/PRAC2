package com.example.prac2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "QBR";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);
        Log.d(TAG, "onCreate111");

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                String name = ((EditText) findViewById(R.id.editTextName)).getText().toString();
                String group = ((EditText) findViewById(R.id.editTextGroup)).getText().toString();
                int age = Integer.parseInt(((EditText) findViewById(R.id.editTextAge)).getText().toString());
                float grade = Float.parseFloat(((EditText) findViewById(R.id.editTextGrade)).getText().toString());

                intent.putExtra("name", name);
                intent.putExtra("group", group);
                intent.putExtra("age", age);
                intent.putExtra("grade", grade);

                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart222");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume333");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause444");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop555");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy666");
    }
    public void Click(View view){
        Intent intent2 = new Intent(this, SecondActivity.class);
        startActivity(intent2);
    }

}
