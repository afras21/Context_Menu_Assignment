package com.afrasali.afras.menu_assignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option,menu);
        return true;
//return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.nbroadcast){
            Toast.makeText(this, "new Broadcast Created", Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.webservices){
            Toast.makeText(this, "Activating Web Services", Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.ngroup){
            Toast.makeText(this, "New Group created ", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
