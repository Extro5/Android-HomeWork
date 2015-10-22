package com.example.coole.spisokpost.spisokpost;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    Context cntxt;
    LayoutInflater inflater;
    ArrayList<ElementActivity> espisok;

    MyAdapter(Context context, ArrayList<ElementActivity> ea) {
        cntxt = context;
        espisok = ea;
        inflater = (LayoutInflater) cntxt.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return espisok.size();
    }


    public Object getItem(int position) {
        return espisok.get(position);
    }


    public long getItemId(int position) {
        return position;
    }


    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            view = inflater.inflate(R.layout.activity_element, parent, false);
        }

        ElementActivity p = getElements(position);

        ((ImageView) view.findViewById(R.id.iv1)).setImageResource(p.img1);
        ((ImageView) view.findViewById(R.id.iv2)).setImageResource(p.img2);
        ((ImageView) view.findViewById(R.id.iv3)).setImageResource(p.img3);
        ((ImageView) view.findViewById(R.id.iv4)).setImageResource(p.img4);
        ((ImageView) view.findViewById(R.id.iv5)).setImageResource(p.img5);
        ((TextView) view.findViewById(R.id.tv1)).setText(p.name);
        ((TextView) view.findViewById(R.id.tv2)).setText(p.descr);
        ((TextView) view.findViewById(R.id.tv3)).setText(p.date);

        return view;
    }

    ElementActivity getElements(int position) {
        return ((ElementActivity) getItem(position));
    }


}
