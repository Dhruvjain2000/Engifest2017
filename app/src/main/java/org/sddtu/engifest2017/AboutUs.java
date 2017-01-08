package org.sddtu.engifest2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.sddtu.engifest2017.Adapters.AboutUsAdapter;
import org.sddtu.engifest2017.DataProviders.AboutUsData;

import java.util.ArrayList;

public class AboutUs extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<AboutUsData> arrayList = new ArrayList<AboutUsData>();

    String[] name = {"Krishna Rai","Nikhil Pandey","Ashish Kumar","Mohit Kumar","Saksham Sandhu","Kabir Singh","Rohit Kumar"};
    String[] designaton = {"Chairperson  SD-DTU","BackBone SD-DTU","Head Android Development SD-DTU","Co-Head Android Development SD_DTU","Head of Management","Head of Designing SD-DTU","Logistics Head SD-DTU"};
    String[] email = {"krishna@sddtu.org","nikhil.pandey@sddtu.org","ashish@sddtu.org","kumar.mohit983@gmail.com","saksham@sddtu.org","kabir@sddtu.org","rohit@sddtu.org"};
    String[] mobile = {"9999777779","9999777879","9999777879","9999777879","9999777879","9999777879","9999777879"};
    int[] images = {R.drawable.mohit,R.drawable.mohit,R.drawable.mohit,R.drawable.mohit,R.drawable.mohit,R.drawable.mohit,R.drawable.mohit};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        recyclerView  =(RecyclerView)findViewById(R.id.recyc_about);
        int i=0;
        for(String n:name) {
            AboutUsData aboutUsData = new AboutUsData(name[i],designaton[i],email[i],mobile[i],images[i]);
            arrayList.add(aboutUsData);
            i++;
        }
        layoutManager = new LinearLayoutManager(AboutUs.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new AboutUsAdapter(AboutUs.this,arrayList);
        recyclerView.setAdapter(adapter);
    }
}
