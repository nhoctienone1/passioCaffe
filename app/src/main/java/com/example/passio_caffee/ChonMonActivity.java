package com.example.passio_caffee;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import FragmentChonMon.*;

public class ChonMonActivity extends AppCompatActivity {

    ImageView back304;

    private ViewPager viewPager304;
    private TabLayout tabLayout304;

    private FragmentGreenXmas greenXmas304;
    private FragmentIceBlended iceBlended304;
    private FragmentTeaSoda teaSoda304;
    private FragmentPassioCaffee passioCaffee304;
    private FragmentFreshEasy freshEasy304;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chonmon);

        back304 = findViewById(R.id.back);
        back304.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplication(), HomeActivity.class);
                startActivity(intent1);
            }
        });

        tabLayout304 = findViewById(R.id.tabLayout);
        viewPager304 = findViewById(R.id.viewPager);

        greenXmas304 = new FragmentGreenXmas();
        iceBlended304 = new FragmentIceBlended();
        teaSoda304 = new FragmentTeaSoda();
        passioCaffee304 = new FragmentPassioCaffee();
        freshEasy304 = new FragmentFreshEasy();

        tabLayout304.setupWithViewPager(viewPager304);

        ViewPagerAdapter viewPagerAdapter304 = new ViewPagerAdapter(getSupportFragmentManager(), 0);
        viewPagerAdapter304.addFragment(greenXmas304, "Green xmas");
        viewPagerAdapter304.addFragment(iceBlended304, "Ice blended");
        viewPagerAdapter304.addFragment(teaSoda304, "Tea/soda");
        viewPagerAdapter304.addFragment(passioCaffee304, "Passio coffee");
        viewPagerAdapter304.addFragment(freshEasy304, "Fresh & easy");
        viewPager304.setAdapter(viewPagerAdapter304);
    }
    private class ViewPagerAdapter extends FragmentPagerAdapter {

        private List<Fragment> fragments304 = new ArrayList<>();
        private List<String> fragmentTitle304 = new ArrayList<>();

        public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        public void addFragment(Fragment fragment, String title) {
            fragments304.add(fragment);
            fragmentTitle304.add(title);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragments304.get(position);
        }

        @Override
        public int getCount() {
            return fragments304.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return fragmentTitle304.get(position);
        }
    }
}
