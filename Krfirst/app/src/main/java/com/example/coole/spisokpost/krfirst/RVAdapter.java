package com.example.coole.spisokpost.krfirst;


import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder> {


    public static class PersonViewHolder extends RecyclerView.ViewHolder {


        TextView zag;
        TextView podzag;
        TextView maintext;

        PersonViewHolder(View itemView) {
            super(itemView);
            zag = (TextView) itemView.findViewById(R.id.tv1);
            podzag = (TextView) itemView.findViewById(R.id.tv2);
            maintext = (TextView) itemView.findViewById(R.id.tv3);
        }
    }

    List<Elem> elems;

    RVAdapter(List<Elem> elems) {
        this.elems = elems;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_element, viewGroup, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder, final int i) {
        personViewHolder.zag.setText(elems.get(i).mtv);
        personViewHolder.podzag.setText(elems.get(i).otv);
        personViewHolder.maintext.setText(elems.get(i).tv);


        personViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ElementtwoActivity.class);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return elems.size();
    }
}