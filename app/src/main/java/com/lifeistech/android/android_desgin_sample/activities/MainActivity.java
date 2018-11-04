package com.lifeistech.android.android_desgin_sample.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.lifeistech.android.android_desgin_sample.ActivityAdapter;
import com.lifeistech.android.android_desgin_sample.Item;
import com.lifeistech.android.android_desgin_sample.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private ActivityAdapter mAdapter;
    private List<Item> mAcitivityList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAcitivityList = new ArrayList<>();
        createData();

        mListView = findViewById(R.id.main_listview);
        mAdapter = new ActivityAdapter(this, R.layout.list_item, mAcitivityList);
        mListView.setAdapter(mAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,
                        mAcitivityList.get(i).getCls());
                startActivity(intent);
            }
        });
    }

    private void createData() {
        mAcitivityList.add(new Item("Janken", JankenActivity.class));
        mAcitivityList.add(new Item("TimeTable", TimeTableActivity.class));
    }
}
