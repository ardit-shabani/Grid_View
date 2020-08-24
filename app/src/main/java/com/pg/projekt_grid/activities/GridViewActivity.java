package com.pg.projekt_grid.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pg.projekt_grid.R;

import android.widget.GridView;

import com.pg.projekt_grid.adapters.GridAdapter;
import com.pg.projekt_grid.models.Product;

import java.util.ArrayList;

public class GridViewActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<Product> arrayList = new ArrayList<>();
    GridAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        gridView = findViewById(R.id.grid_view);
        populateGridArrayList();
        adapter = new GridAdapter(this,arrayList);
        gridView.setAdapter(adapter);
    }

    private void populateGridArrayList() {
        arrayList.add(new Product(R.mipmap.espresso,"Espresso"));
        arrayList.add(new Product(R.mipmap.espresso,"Espresso"));
        arrayList.add(new Product(R.mipmap.espresso,"Espresso"));
        arrayList.add(new Product(R.mipmap.espresso,"Espresso"));
        arrayList.add(new Product(R.mipmap.espresso,"Espresso"));
        arrayList.add(new Product(R.mipmap.espresso,"Espresso"));


    }
}