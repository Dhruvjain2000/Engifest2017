package org.sddtu.engifest2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Accomodation extends AppCompatActivity {


    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webView = (WebView) findViewById(R.id.web_view1);
        //webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("www.pokerbaazi.com/pbuser?campaigncode=ENGIFEST");
    }
}
