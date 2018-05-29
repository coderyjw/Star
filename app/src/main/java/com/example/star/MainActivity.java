package com.example.star;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.star.adapter.ViewPagerAdapter;
import com.example.star.bean.FragmentInfo;
import com.example.star.fragment.MonthFragment;
import com.example.star.fragment.TodayFragment;
import com.example.star.fragment.TomorrowFragment;
import com.example.star.fragment.WeekFragment;
import com.example.star.fragment.YearFragment;
import com.wang.avi.AVLoadingIndicatorView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.tool_bar)
    Toolbar mToolBar;
    @BindView(R.id.tab_layout)
    TabLayout mTabLayout;
    @BindView(R.id.view_pager)
    ViewPager mViewPager;

    private List<FragmentInfo> mFragments = new ArrayList(5);


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initTabLayout();
        setUpViewPager();


    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void initTabLayout() {
        //   mToolBar.inflateMenu(R.menu.toolbar_menu);
        mToolBar.setLogo(R.mipmap.ic_star);
        mToolBar.setTitleMargin(120, 0, 0, 0);
        setSupportActionBar(mToolBar);
        //设置状态栏颜色
        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getResources().getColor(R.color.colorAccent));


    }


    private void setUpViewPager()   {
        mFragments.add(new FragmentInfo("今日", new TodayFragment()));
        mFragments.add(new FragmentInfo("明日", new TomorrowFragment()));
        mFragments.add(new FragmentInfo("本周", new WeekFragment()));
        mFragments.add(new FragmentInfo("本月", new MonthFragment()));
        mFragments.add(new FragmentInfo("今年", new YearFragment()));

        PagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), mFragments);
        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_change:
                CustomDialog customDialog = new CustomDialog(this) {
                    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                    @Override
                    protected void onShareItemClick(int position) {
                        Utility.star = Utility.ConvertToStar1(Utility.getStarInfoList().get(position).getName());
                        refresh();
                    }
                };
                customDialog.showDialog();
                break;
        }
        return true;
    }

    /**
     * 刷新
     */
    private void refresh() {
        finish();
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);
    }
}

