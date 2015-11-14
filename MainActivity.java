package com.example.andrewpincock.andrewhttpsandbox;

import android.app.Activity;
import android.os.*;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import java.io.InputStream;ecl
import android.widget.EditText;
import android.widget.TextView;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.util.*;

public class MainActivity extends Activity {
    private Button retrieveimagebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        retrieveimagebutton = (Button) findViewById(R.id.retreiveimagebutton);
        addListenerOnClickOpenURL();
    }

    public void addListenerOnClickOpenURL() {


        retrieveimagebutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                try {
                    URL url = new URL("http://i.imgur.com/zf2U2My.jpg");
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                public static Drawable LoadImageFromWebOperations(String url) {
                    try {
                        InputStream is = (InputStream) new URL(url).getContent();
                        Drawable d = Drawable.createFromStream(is, "src name");
                        return d;
                    } catch (Exception e) {
                        return null;
                    }
                }

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
