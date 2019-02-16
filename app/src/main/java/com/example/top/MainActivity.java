package com.example.top;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hjm.bottomtabbar.BottomTabBar;

public class MainActivity extends BaseActivity{
    private BottomTabBar bottomTabBar;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }

    @Override
    protected int getViewID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
       bottomTabBar=findViewById(R.id.bottom_tab_bar);
    }

    @Override
    protected void initData() {
         bottomTabBar.init(getSupportFragmentManager())
                 .setImgSize(50,50)
                 .setFontSize(8)
                 .setTabPadding(4,6,10)
                 .setChangeColor(Color.RED,Color.DKGRAY)
                 .addTabItem("首页",R.drawable.a,OneFragment.class)
                 .addTabItem("优惠",R.drawable.b,TwoFragment.class)
                 .addTabItem("分类",R.drawable.c,ThreeFragment.class)
                 .addTabItem("我的",R.drawable.d,ForFragment.class)
                 .isShowDivider(false)
                 .setOnTabChangeListener(new BottomTabBar.OnTabChangeListener() {
                     @Override
                     public void onTabChange(int position, String name) {

                     }
                 });
    }

    @Override
    protected Object getPersenter() {
        return null;
    }
}
