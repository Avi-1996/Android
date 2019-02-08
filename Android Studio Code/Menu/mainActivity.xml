package edu.kiet.www.mymenuexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button showMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showMenu = findViewById(R.id.btn1);
        registerForContextMenu(showMenu);


    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("MY Context MEnu");
        menu.add(0,1,0,"Context1");
        menu.add(0,2,0,"Context2");
        menu.add(0,3,0,"Context3");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case 1:
                Toast.makeText(getApplicationContext(),item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(getApplicationContext(),item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(getApplicationContext(),item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.item1:
                Toast.makeText( getApplicationContext(),"You Selected Item 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                Toast.makeText( getApplicationContext(),"You Selected Item 2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                Toast.makeText( getApplicationContext(),"You Selected Item 3", Toast.LENGTH_SHORT).show();
                break;


        }

        return super.onOptionsItemSelected(item);
    }
}
