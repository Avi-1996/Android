package edu.kiet.www.myuiwidgetexample;

import android.graphics.Color;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup colorchanger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colorchanger = findViewById(R.id.radioGroup);
        colorchanger.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioRed:
                        getWindow().getDecorView().setBackgroundColor(Color.RED);
                        Toast.makeText(getApplicationContext(),"You Have  selected Green",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioBlue:
                        getWindow().getDecorView().setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.radioGreen:
                        getWindow().getDecorView().setBackgroundColor(Color.GREEN);

                }
            }
        });
    }
}
