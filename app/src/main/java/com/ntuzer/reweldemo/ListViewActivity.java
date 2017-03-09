package com.ntuzer.reweldemo;

import android.content.Intent;
import android.net.Uri;
import android.preference.PreferenceActivity;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.HeaderViewListAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;
import com.ntuzer.reweldemo.adapter.ListViewAdapter;
import com.ntuzer.reweldemo.adapter.ViewPagerAdapter;
import com.ntuzer.reweldemo.fragment.ContentFragment;
import com.ntuzer.reweldemo.fragment.HistoryFragment;
import com.ntuzer.reweldemo.fragment.LoginFragment;
import com.ntuzer.reweldemo.fragment2.OneImageFragment;
import com.ntuzer.reweldemo.fragment2.ThreeImageFragment;
import com.ntuzer.reweldemo.fragment2.TwoImageFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.ntuzer.reweldemo.R.*;

public class ListViewActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;
    private ArrayList<String> listResult;
    private ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();
    private ViewPager viewPager2;



    /*
    //viewpager2
    private ViewPager viewPager;
    private ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();
    //viewpager2
*/
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        ButterKnife.bind(this);

        listResult = new ArrayList<String>();
        creatFakeResult();

        initialView();
    }
    private void creatFakeResult(){
        listResult.add("AAAAAAAAAAAAAAAAAAAAA");
        listResult.add("BBBBBBBBB");
        listResult.add("CCCCCCCCC");
        listResult.add("DDDDDDDDD");
        listResult.add("EEEEEEEEEE");
        listResult.add("FFFFFFFFFF");
        listResult.add("G");
        listResult.add("H");
        listResult.add("I");
        listResult.add("J");
        listResult.add("K");
        listResult.add("L");
        listResult.add("M");
        listResult.add("N");
        listResult.add("O");
        listResult.add("P");
        listResult.add("Q");

    }

    private void initialView(){
        listView = (ListView) findViewById(R.id.list_view);
        View view = getLayoutInflater().inflate(R.layout.list_view_header, null);

        viewPager2 = (ViewPager) view.findViewById(R.id.view_pager3);
        fragmentList.add(new LoginFragment());
        fragmentList.add(new ContentFragment());
        fragmentList.add(new HistoryFragment());
        ViewPagerAdapter viewPagerAdapter2 = new ViewPagerAdapter(this.getSupportFragmentManager());
        viewPagerAdapter2.setContent(fragmentList);
        //viewPager2.setAdapter(viewPagerAdapter);
        viewPager2.setAdapter(viewPagerAdapter2);

        LinearLayout listViewHeader = (LinearLayout)view.findViewById(R.id.list_view_header);
        ListViewAdapter listViewAdapter = new ListViewAdapter(this,listResult);
        listView.addHeaderView(listViewHeader);
        listView.setAdapter(listViewAdapter);



        TextView tv = new TextView(this);
        tv.setText("We have no more content.");
        tv.setTextSize(28);
        tv.setGravity(Gravity.CENTER);
        listView.addFooterView(tv);

        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener(this);


    }


    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
        Toast.makeText(this, "listView was clicked at position: "+position,Toast.LENGTH_LONG).show();
        Log.d("testListViewActivity",String.valueOf(position));

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}