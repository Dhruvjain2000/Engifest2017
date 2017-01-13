package org.sddtu.engifest2017;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

import me.anwarshahriar.calligrapher.Calligrapher;

public class EngiActivity extends AppCompatActivity {


    TextView textView1,textView2;
    FloatingActionButton navigate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engi);

        getSupportActionBar().setTitle("About Engifest Infinity");
        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this, "fonts/OpenSans-Regular.ttf", true);

        textView1 = (TextView) findViewById(R.id.web_url);
        navigate = (FloatingActionButton) findViewById(R.id.nav_button);
        Linkify.addLinks(textView1,Linkify.WEB_URLS);

        navigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uri = String.format(Locale.ENGLISH,"geo:0,0?q="+"Delhi Technological University,Delhi-110042,India");
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });


    }
}
