package com.example.mybuddy;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    ImageView ImageView;
    private Button sad;
    private Button happy;
    private Button angry;
    private Button sleepy;
    private Button worried;
    private Button overwhelmed;

    FloatingActionButton cam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //all of our buttons, this helps find the id that the button
        //is associated with

        cam = (FloatingActionButton)findViewById(R.id.Camera);
        cam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCamera();
            }
        });


        sad = (Button)findViewById(R.id.Sad);
        sad.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openSadActivity();
            }
        });


        happy = (Button)findViewById(R.id.Happy);
        happy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openHappyActivity();
            }
        });

        angry = (Button)findViewById(R.id.Angry);
        angry.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openAngryActivity();
            }
        });

        sleepy = (Button)findViewById(R.id.Sleepy);
        sleepy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openSleepyActivity();
            }
        });

        worried = (Button)findViewById(R.id.Worried);
        worried.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openWorriedActivity();
            }
        });

        overwhelmed = (Button)findViewById(R.id.Overwhelmed);
        overwhelmed.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openOverwhelmedActivity();
            }
        });
    }

//*************Start of functions to open emotion activities*************//

    public void openCamera(){
        Intent intent = new Intent(this, CameraActivity.class);
        startActivity(intent);
    }

    public void openSadActivity(){
        Intent intent = new Intent(this, Sad.class);
        startActivity(intent);
    }

    public void openHappyActivity(){
        Intent intent = new Intent(this, Happy.class);
        startActivity(intent);
    }

    public void openAngryActivity(){
        Intent intent = new Intent(this, Angry.class);
        startActivity(intent);
    }

    public void openSleepyActivity(){
        Intent intent = new Intent(this, Sleepy.class);
        startActivity(intent);
    }

    public void openWorriedActivity(){
        Intent intent = new Intent(this, Worried.class);
        startActivity(intent);
    }

    public void openOverwhelmedActivity(){
        Intent intent = new Intent(this, Overwhelmed.class);
        startActivity(intent);
    }

//*************End of functions to open emotion activities**************


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
