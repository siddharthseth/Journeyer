package com.example.lchou.journeyer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;

public class ChoiceActivity extends AppCompatActivity implements View.OnClickListener
{
    ImageButton hostButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        hostButton =(ImageButton)findViewById(R.id.hostButton);
        hostButton.setOnClickListener(this);
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
        }
    }
}
