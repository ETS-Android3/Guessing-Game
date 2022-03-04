package com.example.guessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn;
    int n, number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        n = rand.nextInt(10)+1;

        editText = findViewById(R.id.userEditText);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = editText.getText().toString().trim();

                number = Integer.parseInt(num);

                if(number<n){
                    Toast.makeText(MainActivity.this, "Enter a higher number",Toast.LENGTH_SHORT).show();
                    editText.setText(" ");
                }
                else if(number>n){
                    Toast.makeText(MainActivity.this, "Enter a lower number",Toast.LENGTH_SHORT).show();
                    editText.setText(" ");
                }
                else{
                    Toast.makeText(MainActivity.this, "Congrats! Your number is correct",Toast.LENGTH_SHORT).show();

                    editText.setText(" ");
                    Random rand = new Random();
                    n = rand.nextInt(10)+1;
                }
            }
        });
    }
}