package com.example.mybuddy;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView ImageView;
    private Button sad;
    private Button happy;
    private Button angry;
    private Button sleepy;
    private Button worried;
    private Button overwhelmed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.Camera);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 0);

            }
        });

        //all of our buttons, this helps find the id that the button
        //is associated with
        sad = (Button)findViewById(R.id.Sad);
        sad.setOnClickListener(new View.OnClickListener(){
            String title = "sad";
            @Override
            public void onClick(View v){
                openPhotosActivity(title);
            }
        });

        happy = (Button)findViewById(R.id.Happy);
        happy.setOnClickListener(new View.OnClickListener(){
            String title = "happy";
            @Override
            public void onClick(View v){
                openPhotosActivity(title);
            }
        });

        angry = (Button)findViewById(R.id.Angry);
        angry.setOnClickListener(new View.OnClickListener(){
            String title = "angry";
            @Override
            public void onClick(View v){
                openPhotosActivity(title);
            }
        });

        sleepy = (Button)findViewById(R.id.Sleepy);
        sleepy.setOnClickListener(new View.OnClickListener(){
            String title = "sleepy";
            @Override
            public void onClick(View v){
                openPhotosActivity(title);
            }
        });
        worried = (Button)findViewById(R.id.Worried);
        worried.setOnClickListener(new View.OnClickListener(){
            String title = "worried";
            @Override
            public void onClick(View v){
                openPhotosActivity(title);
            }
        });

        overwhelmed = (Button)findViewById(R.id.Overwhelmed);
        overwhelmed.setOnClickListener(new View.OnClickListener(){
            String title = "overwhelmed";
            @Override
            public void onClick(View v){
                openPhotosActivity(title);
            }
        });

    }

    //opens the photos screen and sends the text with it
    public void openPhotosActivity(String title){
        Intent intent = new Intent(this, Photos.class);
        intent.putExtra("KEY",title);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
