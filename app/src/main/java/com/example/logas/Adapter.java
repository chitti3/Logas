package com.example.logas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.logas.Model.Datum;
import com.example.logas.Model.MyListData;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.Viewholder> {

    private MyListData[] listdata;
    private List<Datum> data;

    public Adapter(MyListData[] listdata,List<Datum> data) {
        this.listdata = listdata;this.data=data;
    }


    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        final MyListData myListData = listdata[position];

      //  holder.productimage.setImageResource(data.get(position).getImage());

            Glide.with(holder.itemView)
                    .load(data.get(position).getImage())
                    .fitCenter()
                    .into(holder.productimage);



    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        ImageView productimage;
        Button productbutton;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            productimage=itemView.findViewById(R.id.imageView);
        }
    }
}
