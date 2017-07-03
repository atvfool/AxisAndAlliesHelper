package com.atvfool.axisandallies;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ahayden on 4/21/2017.
 */

public class MyAdapter extends ArrayAdapter<String> {

    public MyAdapter(@NonNull Context context, @LayoutRes String[] values) {
        super(context, R.layout.row_layout, values);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater theInflater = LayoutInflater.from(getContext());
        View theView = theInflater.inflate(R.layout.row_layout, parent, false);
        String tvShow = getItem(position);
        TextView theTextView = (TextView) theView.findViewById(R.id.textView1);

        theTextView.setText(tvShow);
        ImageView theImageView = (ImageView) theView.findViewById(R.id.imageView1);

        //theImageView.setImageResource(R.drawable.);

        return theView;
    }
}
