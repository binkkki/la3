package com.ncfu.lab3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button myButton = findViewById(R.id.button1);
        TextView displayText = findViewById(R.id.displayText);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText.setText("Ткаченко");
            }
        });
    }


    public void changeText(View view) {
        Button button = (Button) view;
        button.setText("Ткаченко");
    }

    public void changeText2(View view) {
        Button button = (Button) view;
        button.setText("Константин");
    }
    public void changeText3(View view) {
        Button button = (Button) view;
        button.setText("ИНС-б-о-22-1");
    }


}