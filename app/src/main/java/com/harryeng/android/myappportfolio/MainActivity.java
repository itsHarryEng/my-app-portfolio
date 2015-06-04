package com.harryeng.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onTap((Button) findViewById(R.id.media_streamer));
        onTap((Button) findViewById(R.id.super_duo1));
        onTap((Button) findViewById(R.id.super_duo2));
        onTap((Button) findViewById(R.id.ant_terminator));
        onTap((Button) findViewById(R.id.materialize));
        onTap((Button) findViewById(R.id.capstone));
    }

    private void onTap(Button button) {
        final String appName;

        int id = button.getId();
        switch (id) {
            case R.id.media_streamer:
                appName = "Spotify Streamer";
                break;
            case R.id.super_duo1:
                appName = "Scores";
                break;
            case R.id.super_duo2:
                appName = "Library";
                break;
            case R.id.ant_terminator:
                appName = "Build It Bigger";
                break;
            case R.id.materialize:
                appName = "XYZ Reader";
                break;
            case R.id.capstone:
                appName = "Capstone";
                break;
            default:
                appName = "Non-Existent...";
                break;
        }

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String toastMessage = "Coming Soon: The " + appName + " App!";
                Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
            }
        });
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
