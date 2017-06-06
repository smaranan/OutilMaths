package com.marananseb.outilmathematique;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.ImageButton;

import lal.adhish.gifprogressbar.GifView;

public class OutilMathematique extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outil_mathematique);

       //GifView pGif = (GifView) findViewById(R.id.progressBar);
       // pGif.setImageResource(R.drawable.bg);
      //  WebView wv = (WebView) findViewById(R.id.Webview1);
      //  wv.clearCache(false);
       // String baseUrl = "file:///android_asset/test2.html";
       // wv.setVisibility(View.VISIBLE);
       // wv.loadDataWithBaseURL("file:///android_asset/test.html", "<img align='middle' src='bg.gif' width='100%' />", "text/html", "utf-8", null);
       // wv.reload();



        ImageButton ImgButMoy = (ImageButton) findViewById(R.id.ImgButMoy);
        ImgButMoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), Moyenne.class);
                view.getContext().startActivity(Intent);}
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_outil_mathematique, menu);
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
