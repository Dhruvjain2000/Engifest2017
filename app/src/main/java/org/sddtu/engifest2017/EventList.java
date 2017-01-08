package org.sddtu.engifest2017;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.sddtu.engifest2017.Adapters.ViewPagerAdapter;
import org.sddtu.engifest2017.Fragments.day1;
import org.sddtu.engifest2017.Fragments.day2;
import org.sddtu.engifest2017.Fragments.day3;

public class EventList extends AppCompatActivity {


    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.AddFragments(new day1());
        viewPagerAdapter.AddFragments(new day2());
        viewPagerAdapter.AddFragments(new day3());
        viewPager.setAdapter(viewPagerAdapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }
}