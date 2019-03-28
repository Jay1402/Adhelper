package com.example.omkar.adhelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class Wsite extends AppCompatActivity {
    RecyclerView recyclerView;
    productAdapter adapter;
    List<product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        productList = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        productList.add(
                new product(
                        1,
                        "Youtube",
                        "video ads will be shown on videos from category of your choice price per view starting price is given below",
                        4.3,
                        10,
                        R.drawable.youtube));

        productList.add(
                new product(
                        1,
                        "Facebook",
                        "image,video ads available, starting per click pricce given below",
                        4.2,
                        25,
                        R.drawable.facebook));

        productList.add(
                new product(
                        1,
                        "Instagram",
                        "image,video ads available, starting per click pricce given below",
                        4.2,
                        15,
                        R.drawable.instagram));

        productList.add(
                new product(
                        1,
                        "9gag",
                        "gif ads available, starting per click pricce given below",
                        4.0,
                        5,
                        R.drawable.gag));


        adapter = new productAdapter(this, productList);


        recyclerView.setAdapter(adapter);
    }
}

