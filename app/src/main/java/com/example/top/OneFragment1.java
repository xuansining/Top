package com.example.top;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class OneFragment1 extends BaseFragment {
    String []date={"A","B","C","D","E","F","G","H","i","j","k","h"};
    @Override
    protected int getLayoutID() {
        return R.layout.layoutone1;
    }

    @Override
    protected void initView(View view) {
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1
        ,date);
        ListView listView=(ListView)view.findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }

    @Override
    protected void initData() {

    }
}
