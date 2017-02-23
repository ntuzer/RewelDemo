package com.ntuzer.reweldemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.ntuzer.reweldemo.adapter.ViewPagerAdapter;
import com.ntuzer.reweldemo.bean.Book;
import com.ntuzer.reweldemo.fragment.ContentFragment;
import com.ntuzer.reweldemo.fragment.HistoryFragment;
import com.ntuzer.reweldemo.fragment.LoginFragment;
import com.ntuzer.reweldemo.fragment2.OneImageFragment;
import com.ntuzer.reweldemo.fragment2.ThreeImageFragment;
import com.ntuzer.reweldemo.fragment2.TwoImageFragment;
import com.ntuzer.reweldemo.util.UtilLog;

import java.util.ArrayList;

public class ViewPager2 extends AppCompatActivity {

    private ViewPager viewPager;
    private ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();
    //private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager2);



        initial();
    }

    private void initial(){
        viewPager = (ViewPager) findViewById(R.id.view_pager2);
        fragmentList.add(new OneImageFragment());
        fragmentList.add(new TwoImageFragment());
        fragmentList.add(new ThreeImageFragment());
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this.getSupportFragmentManager());
        viewPagerAdapter.setContent(fragmentList);
        viewPager.setAdapter(viewPagerAdapter);

        //tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        //tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("message","ViewPager");
        setResult(RESULT_OK,intent);
        super.onBackPressed();

    }
}
