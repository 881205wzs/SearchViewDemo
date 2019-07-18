package com.davis.searchviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.davis.searchview.SearchEditText;

public class MainActivity extends AppCompatActivity implements SearchEditText.OnSearchClickListener {

    private SearchEditText search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        search = (SearchEditText)findViewById(R.id.search);
        search.setOnSearchClickListener(this);
    }

    @Override
    public void onSearchClick(View view) {

    }
}
