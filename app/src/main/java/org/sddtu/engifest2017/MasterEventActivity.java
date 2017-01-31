package org.sddtu.engifest2017;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
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
        } else if(s.equals("Anushtaan")){
            imageView.setImageResource(R.drawable.anushthaan);
            textView1.setText(R.string.Anusanthan);
            textView2.setText("18 Feb'17");
            textView3.setText("10am");
            textView4.setText("BR Ambedkar Auditorium)");
            textView5.setText("https://goo.gl/forms/3vyaN0YukfkJOVim1");
            textView6.setVisibility(View.GONE);
            //textView6.setText(R.string);
        } else if(s.equals("Switch the funk up")){
            imageView.setImageResource(R.drawable.spandan);
            textView1.setText(R.string.STFU);
            textView2.setText("20 Feb'17");
            textView3.setText("10am");
            textView4.setText("OAT");
            textView5.setText("https://docs.google.com/forms/d/e/1FAIpQLSev8bTXZFsaXf3MJvtp02buMZmwRLZ_EKiOV95d_FiWu3UofQ/viewform?c=0&w=1\n");
            textView6.setText(R.string.stfurules);
        } else if(s.equals("Engi-Idol")){
            imageView.setImageResource(R.drawable.engi);
            textView1.setText(R.string.EngiIdol);
            textView2.setText("19 Feb'17");
            textView3.setText("2pm");
            textView4.setText("Convo Hall");
            textView5.setText("https://goo.gl/forms/wOkab01SW0mKD0pb2");
            textView6.setText(R.string.engiidolrules);
        } else if(s.equals("Vocalicious")){
            imageView.setImageResource(R.drawable.engi);
            textView1.setText(R.string.Vocalicious);
            textView2.setText("18 Feb'17");
            textView3.setText("2pm");
            textView4.setText("Convo Hall");
            textView5.setText("https://goo.gl/forms/HQl47owDBb2P3VqS2");
            textView6.setText(R.string.vocaliciousrules);
        }else if(s.equals("BallaDeers")){
            imageView.setImageResource(R.drawable.engi);
            textView1.setText(R.string.Balladeers);
            textView2.setText("18 Feb'17");
            textView3.setText("9am");
            textView4.setText("Convo Hall");
            textView5.setText("https://goo.gl/forms/Y1FV6mG1HIohE5Si2");
            textView6.setText(R.string.Balladeersrules);
        }else if(s.equals("Vrind")){
            imageView.setImageResource(R.drawable.engi);
            textView1.setText(R.string.Vrind);
            textView2.setText("19 Feb'17");
            textView3.setText("9am");
            textView4.setText("Convo Hall");
            textView5.setText("https://goo.gl/forms/24wp6CcgVbFikP9E3");
            textView6.setText(R.string.Vrindrules);
        }else if(s.equals("Two's A Show")){
            imageView.setImageResource(R.drawable.engi);
            textView1.setText(R.string.twoAShow);
            textView2.setText("20 Feb'17");
            textView3.setText("10am");
            textView4.setText("Convo Hall");
            textView5.setText("https://goo.gl/forms/edJPZQ8Dvw7UDyNw1");
            textView6.setText(R.string.twoashowrules);
        }else if(s.equals("Acoustic Alchemy")){
            imageView.setImageResource(R.drawable.engi);
            textView1.setText(R.string.Acoustic);
            textView2.setText("20 Feb'17");
            textView3.setText("2pm");
            textView4.setText("Wind Point");
            textView5.setText("https://goo.gl/forms/bjCM89DelW9WGYfZ2");
            textView6.setText(R.string.acousticrules);
        }else if(s.equals("Nukkad")){
            imageView.setImageResource(R.drawable.dramatics);
            textView1.setText(R.string.nukkad);
            textView2.setText("19 Feb'17");
            textView3.setText("10am");
            textView4.setText("MechC Parking(Prelims - 14th Feb)");
            textView5.setText("https://goo.gl/forms/alPqX2f90B3C2TK62");
            textView6.setText(R.string.nukkadrules);
        }else if(s.equals("Natya")){
            imageView.setImageResource(R.drawable.dramatics);
            textView1.setText(R.string.natya);
            textView2.setText("20 Feb'17");
            textView3.setText("10am");
            textView4.setText("Auditorium");
            textView5.setText("https://goo.gl/forms/as6xlcC5uSjpCGg33");
            textView6.setText(R.string.natyarules);
        }else if(s.equals("Paridhan")){
            imageView.setImageResource(R.drawable.fashion);
            textView1.setText(R.string.paridhan);
            textView2.setText("19 Feb'17");
            textView3.setText("4pm");
            textView4.setText("Sports Complex");
            textView5.setText("https://goo.gl/forms/dDkRYD4abwoWhwjf1");
            textView6.setVisibility(View.GONE);
        }else if(s.equals("The Future of Fashion")){
            imageView.setImageResource(R.drawable.fashion);
            textView1.setText(R.string.futureoffashion);
            textView2.setText("");
            textView3.setText("");
            textView5.setText("https://goo.gl/forms/Uzpun8s0SRHVdPYK2");
            textView4.setText("");
            textView6.setText(R.string.futurefashionrules);
        }else if(s.equals("The Selfie Brag")){
            imageView.setImageResource(R.drawable.fashion);
            textView1.setText(R.string.selfiebrag);
            textView2.setText("");
            textView3.setText("");
            textView4.setText("");
            textView5.setText("");
            textView6.setText(R.string.selfierules);
        }else if(s.equals("EDM Night-NUCLEYA")){
            imageView.setImageResource(R.drawable.engi);
            textView1.setText("NUCLEYA");
            textView2.setText("20 Feb'17");
            textView3.setText("7pm onwards");
            textView4.setText("Sports Complex");
            textView5.setVisibility(View.GONE);
            textView6.setVisibility(View.GONE);
        }else if(s.equals("War of Words")){
            imageView.setImageResource(R.drawable.syaahi);
            textView1.setText(R.string.WOW);
            textView2.setText("18 Feb'17");
            textView3.setText("10am - 5pm");
            textView4.setText("SPS Hall");
            textView5.setText("https://goo.gl/forms/QEM9meb1nrfWxSCm1");
            textView6.setText(R.string.WOWrules);
        }else if(s.equals("Creative Writing")){
            imageView.setImageResource(R.drawable.syaahi);
            textView1.setText(R.string.creative);
            textView2.setText("19 Feb'17");
            textView3.setText("3pm - 5pm");
            textView4.setText("SPS Hall");
            textView5.setText("https://goo.gl/forms/jQ6clm4ZpgYAA5Rr2");
            textView6.setText(R.string.Creativerules);
        }else if(s.equals("Mixed Bag")){
            imageView.setImageResource(R.drawable.syaahi);
            textView1.setText(R.string.mixedbag);
            textView2.setText("20 Feb'17");
            textView3.setText("2pm - 4pm");
            textView4.setText("SPS Hall");
            textView5.setText("https://goo.gl/forms/xt7I0CYeghtEvtRV2");
            textView6.setVisibility(View.INVISIBLE);
        }else if(s.equals("Kavyanjana")){
            imageView.setImageResource(R.drawable.syaahi);
            textView1.setText(R.string.Hindilit);
            textView2.setText("20 Feb'17");
            textView3.setText("11am - 1pm");
            textView4.setText("SPS Hall");
            textView5.setText("https://goo.gl/forms/vro4gBaxSv4RBfKC2");
            textView6.setVisibility(View.GONE);
        }else if(s.equals("JAM(Just a Minute)")){
            imageView.setImageResource(R.drawable.syaahi);
            textView1.setText(R.string.jam);
            textView2.setText("19 Feb'17");
            textView3.setText("10am - 5pm");
            textView4.setText("SPS Hall");
            textView5.setText("https://goo.gl/forms/C4FvoMOHZrN2KFre2");
            textView6.setText(R.string.jamrules);
        }else if(s.equals("DrishtiKon")){
            imageView.setImageResource(R.drawable.syaahi);
            textView1.setText(R.string.hindilit2);
            textView2.setText("18 Feb'17");
            textView3.setText("10am - 2pm");
            textView4.setText("Solo(OAT) Group(Auditorium)");
            textView5.setText("https://goo.gl/forms/pJdnF23No4IcBHRl1");
            textView6.setVisibility(View.GONE);
        }else if(s.equals("Film-Making Kaleidoscope")){
            imageView.setImageResource(R.drawable.);
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
