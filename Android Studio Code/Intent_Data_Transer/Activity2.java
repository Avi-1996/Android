package edu.kiet.www.myintentdataexample;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView data;
    Button goback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        data = findViewById(R.id.txtWelcome);
        Bundle intentData = getIntent().getExtras();
        data.setText("Welcome " + intentData.getString("name"));
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent();
                i.putExtra("bye","GOOD BYE");
                setResult(Activity.RESULT_OK,i);
                finish();
            }
        });


    }
}
