package com.example.passio_caffee;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

import FragmentTheThanhvien.*;

public class TheThanhvienActivity extends AppCompatActivity {

    Button coupon304;
    ImageView back304;

    private ViewPager viewPager304;
    private TabLayout tabLayout304;

    FragmentSilver silver304;
    FragmentGold gold304;
    FragmentPlatinum platinum304;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_thanhvien);

        back304 = findViewById(R.id.back);
        back304.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplication(), HomeActivity.class);
                startActivity(intent1);
            }
        });

        coupon304 = findViewById(R.id.ttv_coupon);
        coupon304.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplication(), CouPonActivity.class);
                startActivity(intent1);
            }
        });

        tabLayout304 = findViewById(R.id.tabLayout);
        viewPager304 = findViewById(R.id.viewPager);

        tabLayout304.setupWithViewPager(viewPager304);

        silver304 = new FragmentSilver();
        gold304 = new FragmentGold();
        platinum304 = new FragmentPlatinum();

        ViewPagerAdapter viewPagerAdapter304 = new ViewPagerAdapter(getSupportFragmentManager(), 0);
        viewPagerAdapter304.addFragment(silver304, "Silver");
        viewPagerAdapter304.addFragment(gold304, "Gold");
        viewPagerAdapter304.addFragment(platinum304, "Platinum");
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
