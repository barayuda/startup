package com.barayuda.startup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Startup> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(StartupData.getListData());
        showRecylerCardView();

    }

    private void showRecylerCardView() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewStartupAdapter cardViewPresidentAdapter= new CardViewStartupAdapter(this);
        cardViewPresidentAdapter.setListStartup(list);
        rvCategory.setAdapter(cardViewPresidentAdapter);

    }
}
