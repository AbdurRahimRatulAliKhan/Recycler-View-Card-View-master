package com.example.firoz.recycler_view_card_view.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.firoz.recycler_view_card_view.R;
import com.example.firoz.recycler_view_card_view.model.Cricketer;

import java.util.List;

public class CricketerAdapter extends RecyclerView.Adapter<CricketerAdapter.ViewHolder> {

    private Context context;
    private List<Cricketer> cricketerList;


    public CricketerAdapter(Context context, List<Cricketer> cricketerList) {
        this.cricketerList = cricketerList;
        this.context = context;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(context).inflate(R.layout.recycler_view_layout, null);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        viewHolder.imageView.setImageResource(cricketerList.get(i).getImage());
        viewHolder.textView.setText(cricketerList.get(i).getName());

    }

    @Override
    public int getItemCount() {

        return cricketerList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id._imageView);
            textView = itemView.findViewById(R.id._title);

        }
    }
}
