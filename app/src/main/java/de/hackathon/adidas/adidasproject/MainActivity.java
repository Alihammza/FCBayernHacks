package de.hackathon.adidas.adidasproject;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.choice_pager);
        PagerAdapter pagerAdapter = new TabsPagerAdapter(getSupportFragmentManager(), this);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setOffscreenPageLimit(5);

        TabLayout tabLayout = findViewById(R.id.choice_layout);
        tabLayout.setTabTextColors(
                getResources().getColor(R.color.white),
                getResources().getColor(R.color.white));
        tabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.fcb_blue));
        tabLayout.setupWithViewPager(viewPager);
    }

}