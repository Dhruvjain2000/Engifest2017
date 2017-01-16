package org.sddtu.engifest2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.sddtu.engifest2017.Adapters.EventListAdapter;
import org.sddtu.engifest2017.Adapters.ListViewAdapter;
import org.sddtu.engifest2017.DataProviders.EventProvider;
import org.sddtu.engifest2017.DataProviders.ListViewData;

public class BeforeMaster extends AppCompatActivity {

    ListView listView;
    String[] events,date,time,venue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_before_master);

        String s = getIntent().getStringExtra("Choose");

        if(s.equals("Dance")){
            events = new String[]{"Spandan","Anushtaan","Switch the funk up"};
            venue = new String[]{"B R Ambedkar Auditorium","B R Ambedkar Auditorium","OAT"};
            time = new String[]{"Tu daal dalle","Tu daal dalle","Tu daal dalle"};
            date = new String[]{"18 Feb'17","19 Feb'17","20 Feb'17"};
        } else if(s.equals("Music")) {
            events = new String[]{"Engi-Idol","Vocalicious","BallaDeers","Vrind","Two's a show","Acoustic Alchemy"};
            venue = new String[]{"B R Ambedkar Auditorium","B R Ambedkar Auditorium","OAT","B R Ambedkar Auditorium","B R Ambedkar Auditorium","B R Ambedkar Auditorium"};
            time = new String[]{"Tu daal dalle","Tu daal dalle","Tu daal dalle","Tu daal dalle","Tu daal dalle","Tu daal dalle"};
            date = new String[]{"18 Feb'17","19 Feb'17","20 Feb'17","20 Feb'17","19 Feb'17","18 Feb'17"};
        } else if(s.equals("Miscellaneous")) {
            events = new String[]{"Film-Making Kaleidoscope","ShakeDown","Stand Up Comedy","Kavi Sammelan","Arte Fotographia"};
            venue = new String[]{"B R Ambedkar Auditorium","B R Ambedkar Auditorium","OAT","B R Ambedkar Auditorium","B R Ambedkar Auditorium"};
            time = new String[]{"Tu daal dalle","Tu daal dalle","Tu daal dalle","Tu daal dalle","Tu daal dalle","Tu daal dalle"};
            date = new String[]{"18 Feb'17","19 Feb'17","20 Feb'17","20 Feb'17","19 Feb'17","18 Feb'17"};
        } else if(s.equals("Literary")){
            events = new String[]{"War of Words","Creative Writing","Mixed Bag","Kavyanjana","JAM(Just a Minute)","DrishtiKon"};
            venue = new String[]{"B R Ambedkar Auditorium","B R Ambedkar Auditorium","OAT","B R Ambedkar Auditorium","B R Ambedkar Auditorium","B R Ambedkar Auditorium"};
            time = new String[]{"Tu daal dalle","Tu daal dalle","Tu daal dalle","Tu daal dalle","Tu daal dalle","Tu daal dalle",""};
            date = new String[]{"18 Feb'17","19 Feb'17","20 Feb'17","20 Feb'17","19 Feb'17","18 Feb'17",""};
        } else if(s.equals("Pro Night")){
            events = new String[]{"Live Wire","EDM Night","Rock Night"};
            venue = new String[]{"Sports Complex","Sports Complex","OAT","B R Ambedkar Auditorium","B R Ambedkar Auditorium","B R Ambedkar Auditorium"};
            time = new String[]{"Tu daal dalle","Tu daal dalle","Tu daal dalle","Tu daal dalle","Tu daal dalle","Tu daal dalle",""};
            date = new String[]{"18 Feb'17","19 Feb'17","20 Feb'17","20 Feb'17","19 Feb'17","18 Feb'17",""};
        } else if(s.equals("Drama")) {
            events = new String[]{"Nukkad","Natya",};
            venue = new String[]{"B R Ambedkar Auditorium","B R Ambedkar Auditorium","OAT","B R Ambedkar Auditorium","B R Ambedkar Auditorium","B R Ambedkar Auditorium"};
            time = new String[]{"Tu daal dalle","Tu daal dalle","Tu daal dalle","Tu daal dalle","Tu daal dalle","Tu daal dalle",""};
            date = new String[]{"18 Feb'17","19 Feb'17","20 Feb'17","20 Feb'17","19 Feb'17","18 Feb'17",""};
        } else if(s.equals("Fashion")){
            events = new String[]{"Paridhan","The Future of Fashion","The Selfie Brag"};
            venue = new String[]{"Sports Complex","Sports Complex","OAT","B R Ambedkar Auditorium","B R Ambedkar Auditorium","B R Ambedkar Auditorium"};
            time = new String[]{"Tu daal dalle","Tu daal dalle","Tu daal dalle","Tu daal dalle","Tu daal dalle","Tu daal dalle",""};
            date = new String[]{"18 Feb'17","19 Feb'17","20 Feb'17","20 Feb'17","19 Feb'17","18 Feb'17",""};
        } else if(s.equals("Informal")) {
            Toast.makeText(getApplicationContext(),"Dalle Content to de",Toast.LENGTH_LONG).show();
        }

        listView = (ListView)findViewById(R.id.list_event1);
        EventListAdapter eventListAdapter = new EventListAdapter(getApplicationContext(),R.layout.cutom_alert_list);
        listView.setAdapter(eventListAdapter);
        for(int i=0;i<events.length;i++)
        {
            EventProvider data = new EventProvider(events[i],venue[i],time[i],date[i]);
            eventListAdapter.add(data);
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(BeforeMaster.this,MasterEventActivity.class);
                startActivity(intent);
            }
        });
    }
}
