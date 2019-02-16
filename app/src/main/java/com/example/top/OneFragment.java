package com.example.top;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.hjm.bottomtabbar.BottomTabBar;

import java.util.ArrayList;
import java.util.List;


public class OneFragment extends BaseFragment {





    private String[] titles = {"精选", "体育"};

    private TabLayout tablayout;

    private ViewPager viewpager;

    private List<Fragment> fragments;

    private MyAdapter adapter;



    @Override

    protected int getLayoutID() {

        return R.layout.layout_one;

    }



    @Override

    protected void initView(View view) {

        tablayout = view.findViewById(R.id.tablayout);

        viewpager = view.findViewById(R.id.viewpager);

        //页面，数据源

        fragments = new ArrayList<>();

        fragments.add(new OneFragment1());

        fragments.add(new OneFragment2());

        //ViewPager的适配器

        adapter = new MyAdapter(getActivity().getSupportFragmentManager());

        viewpager.setAdapter(adapter);

        //绑定

        tablayout.setupWithViewPager(viewpager);



    }



    @Override

    protected void initData() {



    }

    class MyAdapter extends FragmentPagerAdapter {



        public MyAdapter(FragmentManager fm) {

            super(fm);

        }

        @Override

        public Fragment getItem(int position) {

            return fragments.get(position);

        }



        @Override

        public int getCount() {

            return fragments.size();

        }



        //重写这个方法，将设置每个Tab的标题

        @Override

        public CharSequence getPageTitle(int position) {

            return titles[position];

        }

    }

}
