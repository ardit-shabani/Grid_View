package com.pg.projekt_grid.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.pg.projekt_grid.R;

import com.pg.projekt_grid.models.Product;

import java.util.ArrayList;

public class GridAdapter extends BaseAdapter {
    Context context;
    ArrayList<Product> arrayList;
    LayoutInflater layoutInflater;

    public GridAdapter(Context context, ArrayList<Product> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
        layoutInflater = (LayoutInflater.from(context));
    }


    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.gridview_cell,null);

        ImageView ivCompany = convertView.findViewById(R.id.ivProduct);
        TextView tvCompany = convertView.findViewById(R.id.tvProduct);


        Product company = arrayList.get(position);

        ivCompany.setImageResource(company.getProductImage());
        tvCompany.setText(company.getProductName());



        return convertView;
    }
}

