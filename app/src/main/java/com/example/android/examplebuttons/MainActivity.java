package com.example.android.examplebuttons;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton fl;
    Button xmlButton;
    ImageView imageView;
    boolean imageClicked = false;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fl = findViewById(R.id.floating_button);
        fl.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this,"FloatingActionButton was clicked", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP, 50, 925);
                toast.show();
            }
        });
        xmlButton = findViewById(R.id.xml_button);
        xmlButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this,"XmlButton was clicked", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP, 200, 1300);
                toast.show();
            }
        });
        imageView = (ImageView) findViewById(R.id.image_as_button);
        imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (!imageClicked) {
                    imageClicked = true;
                    imageView.setImageResource(R.drawable.ic_action_balloon);
                } else {
                    imageClicked = false;
                    imageView.setImageResource(R.drawable.ic_action_ball);
                }
                return false;
            }
        });
    }

    public void imageButtonClick(View view) {
        Toast toast = Toast.makeText(this,"ImageButton was clicked", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP, 50, 575);
        toast.show();
    }
}
