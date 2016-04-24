package com.haizi.alltool;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.haizi.alltool.base.BaseAvtivity;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends BaseAvtivity {

    @Bind(R.id.rv_function_list)
    RecyclerView rvFunctionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

}
