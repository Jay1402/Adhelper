package com.example.omkar.adhelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.ListPopupWindow;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class Banners extends AppCompatActivity {

    RecyclerView recyclerView;
    productAdapter adapter;
    List<product> productList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banners);



        productList = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        productList.add(
                new product(
                        1,
                        "Juhu Millenium Club",
                        "8 by 6 feet at Juhu Millenium Club, juhu (Prices are per month)",
                        4.1,
                        80000,
                        R.drawable.juhu));

        productList.add(
                new product(
                        1,
                        "Byculla road",
                        "10 by 12 feet at Byculla station road",
                        3.9,
                        50000,
                        R.drawable.by));

        productList.add(
                new product(
                        1,
                        "Andheri sv road",
                        "8 by 6 feet at Andheri Metro construction road",
                        4.2,
                        25000,
                        R.drawable.s));


        adapter = new productAdapter(this, productList);


        recyclerView.setAdapter(adapter);
    }
}