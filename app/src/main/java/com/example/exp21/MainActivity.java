package com.example.exp21;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public EditText nameText;
    public EditText ageText;
    public Button button;
    public String name;
    private int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameText = findViewById(R.id.mName);
        ageText = findViewById(R.id.mAge);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sendData();
            }
        });
    }
    public void sendData() {
        name = nameText.getText().toString().trim();
        age = Integer.parseInt(ageText.getText().toString().trim());

        Intent i = new Intent(MainActivity.this, second.class);

        i.putExtra(second.NAME, name);
        i.putExtra(second.AGE, age);

        startActivity(i);
    }
}