package edu.kiet.www.myactivitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final String appname = "Tesiting Life Cycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(appname,"Started");
        Toast.makeText(getApplicationContext(),"Activit start", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        Log.d(appname,"Stopped");

        Toast.makeText(getApplicationContext(),"Activity stopped", Toast.LENGTH_LONG).show();
        super.onStop();

    }

    @Override
    protected void onDestroy() {
        Log.d(appname,"Destroyed");
        Toast.makeText(getApplicationContext(),"Activity Destoyed", Toast.LENGTH_LONG).show();
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.d(appname,"PAused");
        Toast.makeText(getApplicationContext(),"Activity Paused", Toast.LENGTH_LONG).show();
        super.onPause();
    }

    @Override
    protected void onPostResume() {
        Log.d(appname,"Resumed");
        Toast.makeText(getApplicationContext(),"Activity Resumed",Toast.LENGTH_LONG).show();
        super.onPostResume();
    }
}
