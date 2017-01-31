package org.sddtu.engifest2017;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
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

        TextView textView1,textView2,textView3,textView4,textView5,textView6;
        ImageView imageView;
        imageView = (ImageView)findViewById(R.id.image_master);
        textView1 = (TextView)findViewById(R.id.about_event);
        textView2= (TextView)findViewById(R.id.eventdate);
        textView3= (TextView)findViewById(R.id.eventtime);
        textView4= (TextView)findViewById(R.id.master_venue);
        textView5= (TextView)findViewById(R.id.eventlink);
        textView6 = (TextView)findViewById(R.id.rules_event);
        Linkify.addLinks(textView5,Linkify.WEB_URLS);


        String s = getIntent().getStringExtra("Chosen");

        if(s.equals("Spandan")){
            imageView.setImageResource(R.drawable.spandan);
            textView1.setText(R.string.Spandan);
            textView2.setText("19 Feb'17");
            textView3.setText("10am");
            textView4.setText("Solo(OAT) Group(Auditorium)");
            textView5.setText("https://goo.gl/forms/RQBcfs4IKT0ZwnyN2");
            textView6.setText(R.string.SpandanRules);
        } else if(s.equals("StandUp Comedy")){
            imageView.setImageResource(R.drawable.standup);
            textView1.setText(R.string.StandUp);
            textView2.setText("18 Feb'17");
            textView3.setText("5pm - 7pm");
            textView4.setText("Auditorium");
            textView5.setText("https://goo.gl/forms/Evwz4uxtIp0hxfxq1");
            textView6.setText(R.string.StandUpRules);
        } else if(s.equals("Spandan")){
            imageView.setImageResource(R.drawable.spandan);
            textView1.setText(R.string.Spandan);
            textView2.setText("19 Feb'17");
            textView3.setText("10am");
            textView4.setText("Solo(OAT) Group(Auditorium)");
            textView5.setText("https://goo.gl/forms/RQBcfs4IKT0ZwnyN2");
            textView6.setText(R.string.SpandanRules);
        } else if(s.equals("Spandan")){
            imageView.setImageResource(R.drawable.spandan);
            textView1.setText(R.string.Spandan);
            textView2.setText("19 Feb'17");
            textView3.setText("10am");
            textView4.setText("Solo(OAT) Group(Auditorium)");
            textView5.setText("https://goo.gl/forms/RQBcfs4IKT0ZwnyN2");
            textView6.setText(R.string.SpandanRules);
        } else if(s.equals("Spandan")){
            imageView.setImageResource(R.drawable.spandan);
            textView1.setText(R.string.Spandan);
            textView2.setText("19 Feb'17");
            textView3.setText("10am");
            textView4.setText("Solo(OAT) Group(Auditorium)");
            textView5.setText("https://goo.gl/forms/RQBcfs4IKT0ZwnyN2");
            textView6.setText(R.string.SpandanRules);
        } else if(s.equals("Spandan")){
            imageView.setImageResource(R.drawable.spandan);
            textView1.setText(R.string.Spandan);
            textView2.setText("19 Feb'17");
            textView3.setText("10am");
            textView4.setText("Solo(OAT) Group(Auditorium)");
            textView5.setText("https://goo.gl/forms/RQBcfs4IKT0ZwnyN2");
            textView6.setText(R.string.SpandanRules);
        }else if(s.equals("Spandan")){
            imageView.setImageResource(R.drawable.spandan);
            textView1.setText(R.string.Spandan);
            textView2.setText("19 Feb'17");
            textView3.setText("10am");
            textView4.setText("Solo(OAT) Group(Auditorium)");
            textView5.setText("https://goo.gl/forms/RQBcfs4IKT0ZwnyN2");
            textView6.setText(R.string.SpandanRules);
        }else if(s.equals("Spandan")){
            imageView.setImageResource(R.drawable.spandan);
            textView1.setText(R.string.Spandan);
            textView2.setText("19 Feb'17");
            textView3.setText("10am");
            textView4.setText("Solo(OAT) Group(Auditorium)");
            textView5.setText("https://goo.gl/forms/RQBcfs4IKT0ZwnyN2");
            textView6.setText(R.string.SpandanRules);
        }else if(s.equals("Spandan")){
            imageView.setImageResource(R.drawable.spandan);
            textView1.setText(R.string.Spandan);
            textView2.setText("19 Feb'17");
            textView3.setText("10am");
            textView4.setText("Solo(OAT) Group(Auditorium)");
            textView5.setText("https://goo.gl/forms/RQBcfs4IKT0ZwnyN2");
            textView6.setText(R.string.SpandanRules);
        }else if(s.equals("Spandan")){
            imageView.setImageResource(R.drawable.spandan);
            textView1.setText(R.string.Spandan);
            textView2.setText("19 Feb'17");
            textView3.setText("10am");
            textView4.setText("Solo(OAT) Group(Auditorium)");
            textView5.setText("https://goo.gl/forms/RQBcfs4IKT0ZwnyN2");
            textView6.setText(R.string.SpandanRules);
        }else if(s.equals("Spandan")){
            imageView.setImageResource(R.drawable.spandan);
            textView1.setText(R.string.Spandan);
            textView2.setText("19 Feb'17");
            textView3.setText("10am");
            textView4.setText("Solo(OAT) Group(Auditorium)");
            textView5.setText("https://goo.gl/forms/RQBcfs4IKT0ZwnyN2");
            textView6.setText(R.string.SpandanRules);
        }else if(s.equals("Spandan")){
            imageView.setImageResource(R.drawable.spandan);
            textView1.setText(R.string.Spandan);
            textView2.setText("19 Feb'17");
            textView3.setText("10am");
            textView4.setText("Solo(OAT) Group(Auditorium)");
            textView5.setText("https://goo.gl/forms/RQBcfs4IKT0ZwnyN2");
            textView6.setText(R.string.SpandanRules);
        }else if(s.equals("Spandan")){
            imageView.setImageResource(R.drawable.spandan);
            textView1.setText(R.string.Spandan);
            textView2.setText("19 Feb'17");
            textView3.setText("10am");
            textView4.setText("Solo(OAT) Group(Auditorium)");
            textView5.setText("https://goo.gl/forms/RQBcfs4IKT0ZwnyN2");
            textView6.setText(R.string.SpandanRules);
        }else if(s.equals("Spandan")){
            imageView.setImageResource(R.drawable.spandan);
            textView1.setText(R.string.Spandan);
            textView2.setText("19 Feb'17");
            textView3.setText("10am");
            textView4.setText("Solo(OAT) Group(Auditorium)");
            textView5.setText("https://goo.gl/forms/RQBcfs4IKT0ZwnyN2");
            textView6.setText(R.string.SpandanRules);
        }else if(s.equals("Spandan")){
            imageView.setImageResource(R.drawable.spandan);
            textView1.setText(R.string.Spandan);
            textView2.setText("19 Feb'17");
            textView3.setText("10am");
            textView4.setText("Solo(OAT) Group(Auditorium)");
            textView5.setText("https://goo.gl/forms/RQBcfs4IKT0ZwnyN2");
            textView6.setText(R.string.SpandanRules);
        }else if(s.equals("Spandan")){
            imageView.setImageResource(R.drawable.spandan);
            textView1.setText(R.string.Spandan);
            textView2.setText("19 Feb'17");
            textView3.setText("10am");
            textView4.setText("Solo(OAT) Group(Auditorium)");
            textView5.setText("https://goo.gl/forms/RQBcfs4IKT0ZwnyN2");
            textView6.setText(R.string.SpandanRules);
        }else if(s.equals("Spandan")){
            imageView.setImageResource(R.drawable.spandan);
            textView1.setText(R.string.Spandan);
            textView2.setText("19 Feb'17");
            textView3.setText("10am");
            textView4.setText("Solo(OAT) Group(Auditorium)");
            textView5.setText("https://goo.gl/forms/RQBcfs4IKT0ZwnyN2");
            textView6.setText(R.string.SpandanRules);
        }else if(s.equals("Spandan")){
            imageView.setImageResource(R.drawable.spandan);
            textView1.setText(R.string.Spandan);
            textView2.setText("19 Feb'17");
            textView3.setText("10am");
            textView4.setText("Solo(OAT) Group(Auditorium)");
            textView5.setText("https://goo.gl/forms/RQBcfs4IKT0ZwnyN2");
            textView6.setText(R.string.SpandanRules);
        }else if(s.equals("Spandan")){
            imageView.setImageResource(R.drawable.spandan);
            textView1.setText(R.string.Spandan);
            textView2.setText("19 Feb'17");
            textView3.setText("10am");
            textView4.setText("Solo(OAT) Group(Auditorium)");
            textView5.setText("https://goo.gl/forms/RQBcfs4IKT0ZwnyN2");
            textView6.setText(R.string.SpandanRules);
        }else if(s.equals("Spandan")){
            imageView.setImageResource(R.drawable.spandan);
            textView1.setText(R.string.Spandan);
            textView2.setText("19 Feb'17");
            textView3.setText("10am");
            textView4.setText("Solo(OAT) Group(Auditorium)");
            textView5.setText("https://goo.gl/forms/RQBcfs4IKT0ZwnyN2");
            textView6.setText(R.string.SpandanRules);
        }else if(s.equals("Spandan")){
            imageView.setImageResource(R.drawable.spandan);
            textView1.setText(R.string.Spandan);
            textView2.setText("19 Feb'17");
            textView3.setText("10am");
            textView4.setText("Solo(OAT) Group(Auditorium)");
            textView5.setText("https://goo.gl/forms/RQBcfs4IKT0ZwnyN2");
            textView6.setText(R.string.SpandanRules);
        }

    }
}
