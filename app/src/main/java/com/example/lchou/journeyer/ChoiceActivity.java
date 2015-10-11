package com.example.lchou.journeyer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;

public class ChoiceActivity extends AppCompatActivity implements View.OnClickListener
{
    ImageButton hostButton, journeyerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        hostButton =(ImageButton)findViewById(R.id.hostButton);
        hostButton.setOnClickListener(this);

        journeyerButton = (ImageButton)findViewById(R.id.journeyerButton);
        journeyerButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()) {
            case R.id.hostButton:
                try {
                    startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.journeyerButton:
                try {
                    startActivity(new Intent(getApplicationContext(), BackUpActivity.class));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }
    }


}
