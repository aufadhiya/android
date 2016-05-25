package com.kappa.piece.gamenetjogja;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class list_single extends ArrayAdapter<String>{

    private final Activity context;
    private final String[] web;
    private final String[] dist;
    private final Integer[] imageId;
    public list_single(Activity context,
                      String[] web, Integer[] imageId) {
        super(context, R.layout.single_list, web);
        this.context = context;
        this.web = web;
       // this.dist = dist;
        this.imageId = imageId;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.single_list, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
        TextView txtJarak = (TextView) rowView.findViewById(R.id.txtJarak);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        txtTitle.setText(web[position]);

        imageView.setImageResource(imageId[position]);
        return rowView;
    }
}