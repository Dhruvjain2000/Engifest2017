package org.sddtu.engifest2017;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;


public class MasterEventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master_event);

        TextView textView1,textView2,textView3,textView4,textView5;
        ImageView imageView;
        String s;
        textView1= (TextView)findViewById(R.id.rules_details);
        textView2= (TextView)findViewById(R.id.eventdate);
        textView3= (TextView)findViewById(R.id.eventtime);
        textView4= (TextView)findViewById(R.id.eventvenue);
        textView5= (TextView)findViewById(R.id.eventlink);
        s="xyz";
        if(s.equals("film")){


        }

    }
}
