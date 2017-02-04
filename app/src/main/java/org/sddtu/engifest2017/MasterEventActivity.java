package org.sddtu.engifest2017;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import me.anwarshahriar.calligrapher.Calligrapher;


public class MasterEventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        setContentView(R.layout.activity_master_event);

        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this, "fonts/OpenSans-Regular.ttf", true);

        TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8;
        ImageView imageView;
        imageView = (ImageView)findViewById(R.id.image_master);
        textView1 = (TextView)findViewById(R.id.about_event);
        textView2= (TextView)findViewById(R.id.eventdate);
        textView3= (TextView)findViewById(R.id.eventtime);
        textView4= (TextView)findViewById(R.id.master_venue);
        textView5= (TextView)findViewById(R.id.eventlink);
        textView7 = (TextView)findViewById(R.id.rulesregul);
        textView6 = (TextView)findViewById(R.id.rules_event);
        textView8 = (TextView)findViewById(R.id.offlink);
        Linkify.addLinks(textView5,Linkify.WEB_URLS);


        String s = getIntent().getStringExtra("Chosen");
        getSupportActionBar().setTitle(s);

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
            textView7.setVisibility(View.GONE);
            textView4.setText("BR Ambedkar Auditorium)");
            textView5.setText("https://goo.gl/forms/3vyaN0YukfkJOVim1");
            textView6.setVisibility(View.GONE);
            //textView6.setText(R.string);
        } else if(s.equals("Switch the funk up")){
            imageView.setImageResource(R.drawable.eng);
            textView1.setText(R.string.STFU);
            textView2.setText("20 Feb'17");
            textView3.setText("10am");
            textView4.setText("OAT");
            textView5.setText("https://docs.google.com/forms/d/e/1FAIpQLSev8bTXZFsaXf3MJvtp02buMZmwRLZ_EKiOV95d_FiWu3UofQ/viewform?c=0&w=1\n");
            textView6.setText(R.string.stfurules);
        } else if(s.equals("Engi-Idol")){
            imageView.setImageResource(R.drawable.doremipa1);
            textView1.setText(R.string.EngiIdol);
            textView2.setText("19 Feb'17");
            textView3.setText("2pm");
            textView4.setText("Convo Hall");
            textView5.setText("https://goo.gl/forms/wOkab01SW0mKD0pb2");
            textView6.setText(R.string.engiidolrules);
        } else if(s.equals("Vocalicious")){
            imageView.setImageResource(R.drawable.doremipa1);
            textView1.setText(R.string.Vocalicious);
            textView2.setText("18 Feb'17");
            textView3.setText("2pm");
            textView4.setText("Convo Hall");
            textView5.setText("https://goo.gl/forms/HQl47owDBb2P3VqS2");
            textView6.setText(R.string.vocaliciousrules);
        }else if(s.equals("BallaDeers")){
            imageView.setImageResource(R.drawable.doremipa1);
            textView1.setText(R.string.Balladeers);
            textView2.setText("18 Feb'17");
            textView3.setText("9am");
            textView4.setText("Convo Hall");
            textView5.setText("https://goo.gl/forms/Y1FV6mG1HIohE5Si2");
            textView6.setText(R.string.Balladeersrules);
        }else if(s.equals("Vrind")){
            imageView.setImageResource(R.drawable.doremipa1);
            textView1.setText(R.string.Vrind);
            textView2.setText("19 Feb'17");
            textView3.setText("9am");
            textView4.setText("Convo Hall");
            textView5.setText("https://goo.gl/forms/24wp6CcgVbFikP9E3");
            textView6.setText(R.string.Vrindrules);
        }else if(s.equals("Two's A Show")){
            imageView.setImageResource(R.drawable.doremipa1);
            textView1.setText(R.string.twoAShow);
            textView2.setText("20 Feb'17");
            textView3.setText("10am");
            textView4.setText("Convo Hall");
            textView5.setText("https://goo.gl/forms/edJPZQ8Dvw7UDyNw1");
            textView6.setText(R.string.twoashowrules);
        }else if(s.equals("Acoustic Alchemy")){
            imageView.setImageResource(R.drawable.doremipa1);
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
            textView7.setVisibility(View.GONE);
        }else if(s.equals("The Future of Fashion")){
            imageView.setImageResource(R.drawable.fashion);
            textView1.setText(R.string.futureoffashion);
            textView2.setText("TBA");
            textView3.setText("TBA");
            textView5.setText("https://goo.gl/forms/Uzpun8s0SRHVdPYK2");
            textView4.setText("");
            textView6.setText(R.string.futurefashionrules);
        }else if(s.equals("The Selfie Brag")){
            imageView.setImageResource(R.drawable.fashion);
            textView1.setText(R.string.selfiebrag);
            textView2.setText("All 3 days");
            textView3.setText("All time");
            textView4.setText("");
            textView5.setText("");
            textView8.setVisibility(View.GONE);
            textView6.setText(R.string.selfierules);
        }else if(s.equals("EDM Night-NUCLEYA")){
            imageView.setImageResource(R.drawable.pnight);
            textView1.setText("Adhbudh. Anokha. Aelaan.\n" +
                    "\n" +
                    "Akkad Bakkad Bambe Bo.\n" +
                    "Engi main dekho aa gaya woh.\n" +
                    "Aaja thoda Chennai Bass bajva de.\n" +
                    "Bass Rani ke saath Raja Baja bhi bulva de.\n" +
                    "Aao Engifest ka Scene Set Karwa De!\n" +
                    "\n" +
                    "Engifest 2017 and Pokerbaazi.com present to you one of the most exciting, experimental and engaging electronic music producers in the Indian Scene – NUCLEYA! \n" +
                    "\n" +
                    "This 20th February, get ready to groove, get ready to headbang at Engifest, DTU. GET READY TO EXPERIENCE THE INFINITE!\n" +
                    "\n" +
                    "We are thankful to 7Entertainment for all the help and artist co-ordination.\n" +
                    "\n" +
                    "#EngifestInfinity #AaGayaWoh");
            textView2.setText("20th February");
            textView3.setText("7 PM");
            textView4.setText("Sports Complex");
            textView7.setVisibility(View.GONE);
            textView5.setText("");
            textView8.setVisibility(View.GONE);
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
            textView6.setText(R.string.mixedbagrules);
        }else if(s.equals("Kavyanjana")){
            imageView.setImageResource(R.drawable.syaahi);
            textView1.setText(R.string.Hindilit);
            textView2.setText("20 Feb'17");
            textView3.setText("11am - 1pm");
            textView4.setText("SPS Hall");
            textView5.setText("https://goo.gl/forms/vro4gBaxSv4RBfKC2");
            textView6.setVisibility(View.GONE);
            textView7.setVisibility(View.GONE);
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
            textView4.setText("");
            textView5.setText("https://goo.gl/forms/pJdnF23No4IcBHRl1");
            textView6.setVisibility(View.GONE);
            textView7.setVisibility(View.GONE);
        }else if(s.equals("Rock Night")){
            imageView.setImageResource(R.drawable.pnight);
            textView1.setText("“Rock and roll is a nuclear blast of reality in a mundane world where no-one is allowed to be magnificent.” -Kim Fowley \n" +
                    "Engifest’17 brings you Lagori for a sonically exhilarating experience that will leave your senses absolutely spellbound! You won’t be able to resist banging your heads to the powerful beats and tapping your feet with the intense music; so overwhelmingly influencing will be the aura at this event! \n");
            textView2.setText("19th February");
            textView3.setText("7 PM");
            textView4.setText("Sports Complex");
            textView5.setText("");
            textView6.setVisibility(View.GONE);
            textView7.setVisibility(View.GONE);
            textView8.setVisibility(View.GONE);
        }else if(s.equals("Film-Making Kaleidoscope")){
            imageView.setImageResource(R.drawable.engievents);
            textView1.setText(R.string.film_Making);
            textView2.setText("19 Feb'17");
            textView3.setText("10am onwards");
            textView4.setText("SPS 13");
            textView5.setText("https://goo.gl/S7umWT");
            textView6.setText(R.string.filmmakingrules);
        }else if(s.equals("ShakeDown")){
            imageView.setImageResource(R.drawable.engif);
            textView1.setText(R.string.shakedown);
            textView2.setText("18 Feb'17");
            textView3.setText("12pm");
            textView4.setText("Hostel Road");
            textView5.setVisibility(View.GONE);
            textView6.setVisibility(View.GONE);
            textView7.setVisibility(View.GONE);
            textView8.setVisibility(View.GONE);
        }else if(s.equals("Arte Fotographia")) {
            imageView.setImageResource(R.drawable.eng);
            textView1.setText("Event description: Arte fotographia is the official Online photography competition of engifest conducted by parchhayi, the photography and film making society of DTU.\n");
            textView2.setText("TBA");
            textView3.setText("TBA");
            textView4.setText("");
            textView6.setText("");
            textView7.setVisibility(View.GONE);
            textView5.setText("https://goo.gl/1W47bp");
        } else if(s.equals("Kavi Sammelan")) {
            imageView.setImageResource(R.drawable.eng);
            textView1.setText(R.string.kavisammelan);
            textView2.setText("20 Feb'17");
            textView3.setText("4pm");
            textView4.setText("OAT");
            textView5.setVisibility(View.GONE);
            textView8.setVisibility(View.GONE);
            textView7.setVisibility(View.GONE);
            textView6.setVisibility(View.GONE);
        } else if(s.equals("Shoe painting")){
            imageView.setImageResource(R.drawable.eng);
            textView1.setText(R.string.shoepainting);
            textView2.setText("18 Feb'17");
            textView3.setText("10am");
            textView4.setText("EduSat Hall");
            textView5.setText("https://goo.gl/aKT2Rk");
            textView6.setVisibility(View.GONE);
            textView7.setVisibility(View.GONE);
        } else if(s.equals("Live Wire")){
            imageView.setImageResource(R.drawable.pnight);
            textView1.setText("Sunidhi Chauhan is there to enrich your night with their presence. All gonna rock n roll their bodies and join them with zest and enthusiam. So put your hands up and welcome engi'17!");
            textView2.setText("18th February");
            textView3.setText("7 PM");
            textView4.setText("Sports Complex");
            textView7.setVisibility(View.GONE);
            textView5.setText("");
            textView8.setVisibility(View.GONE);

        }else if(s.equals("Art & Furious")){
            imageView.setImageResource(R.drawable.eng);
            textView1.setText(R.string.Artfurious);
            textView2.setText("19 Feb'17");
            textView3.setText("11am");
            textView4.setText("EduSat Hall");
            textView5.setText("https://goo.gl/eaa6As");
            textView6.setText(R.string.artfuriousrules);
        }else if(s.equals("3 Dimensional Art")){
            imageView.setImageResource(R.drawable.eng);
            textView1.setText(R.string.threedart);
            textView2.setText("20 Feb'17");
            textView3.setText("11am");
            textView4.setText("EduSat Hall");
            textView5.setText("https://goo.gl/5xLdsN");
            textView6.setText(R.string.threedartrules);
        }
    }
}
