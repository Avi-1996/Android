package edu.kiet.www.myintentexample;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    Button btn,btn1;
    EditText PhoneNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn  = findViewById(R.id.btnOpenGoogle);
        btn1 = findViewById(R.id.btnCall);
        PhoneNumber = findViewById(R.id.txtPhoneNo);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_CALL);
                if(PhoneNumber.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Enter Number",Toast.LENGTH_SHORT).show();
                }
                else{
                    String phone = PhoneNumber.getText().toString();
                    i.setData(Uri.parse("tel:" + phone));
                    if(ActivityCompat.checkSelfPermission(getApplicationContext(),Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                        Toast.makeText(getApplicationContext(),"Grant the permission",Toast.LENGTH_SHORT).show();
                        allowPermission();
                    }

                    else {
                        startActivity(i);
                    }
                }

            }
            public void allowPermission(){
                ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.CALL_PHONE},1);


            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.google.com"));
                startActivity(i);
            }
        });


    }
}
