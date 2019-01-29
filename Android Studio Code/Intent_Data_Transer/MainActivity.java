package edu.kiet.www.myintentdataexample;

import android.app.Activity;
import android.content.Intent;
import android.os.ResultReceiver;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnsend;
    EditText name;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1){
            if(requestCode == Activity.RESULT_OK){
                Toast.makeText(getApplicationContext(),data.getStringExtra("bye"),Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsend =findViewById(R.id.sendData);
        name = findViewById(R.id.editText);
        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),SecondActivity.class);
                i.putExtra("name",name.getText().toString());
                startActivityForResult(i,1);
            }
        });


    }
}
