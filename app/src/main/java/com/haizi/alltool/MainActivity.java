package com.haizi.alltool;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.haizi.alltool.base.BaseActivity;

import butterknife.Bind;

public class MainActivity extends BaseActivity {

    @Bind(R.id.rv_function_list)
    RecyclerView rvFunctionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
