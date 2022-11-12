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

import FragmentCoupon.*;

public class CouPonActivity extends AppCompatActivity {

    ImageView back304;

    private ViewPager viewPager304;
    private TabLayout tabLayout304;

    private FragmentChuaSD chuaSD304;
    private FragmentDaSD daSD304;
    private FragmentHetHan hetHan304;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupon);

        viewPager304 = findViewById(R.id.viewPager);
        tabLayout304 = findViewById(R.id.tabLayout);

        chuaSD304 = new FragmentChuaSD();
        daSD304 = new FragmentDaSD();
        hetHan304 = new FragmentHetHan();

        tabLayout304.setupWithViewPager(viewPager304);

        ViewPagerAdapter viewPagerAdapter304 = new ViewPagerAdapter(getSupportFragmentManager(), 0);
        viewPagerAdapter304.addFragment(chuaSD304, "Chưa sử dụng");
        viewPagerAdapter304.addFragment(daSD304, "Đã sử dụng");
        viewPagerAdapter304.addFragment(hetHan304, "Đã hết hạn");
        viewPager304.setAdapter(viewPagerAdapter304);

        back304 = findViewById(R.id.back);
        back304.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplication(), HomeActivity.class);
                startActivity(intent1);
            }
        });

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
