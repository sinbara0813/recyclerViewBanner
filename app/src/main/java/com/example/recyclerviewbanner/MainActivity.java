package com.example.recyclerviewbanner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Banner banner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        banner=findViewById(R.id.banner);
        init();
    }

    private void init() {
        List<String> list=new ArrayList<>();
        for (int i=0;i<4;i++){
            list.add("xxx");
        }
        banner.setSource(list).startScroll();
    }
}
