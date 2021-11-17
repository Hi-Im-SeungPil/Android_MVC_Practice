package org.jeonfeel.mvc_practice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jeonfeel.mvc_practice.Database.DB;
import org.jeonfeel.mvc_practice.Database.infoDTO;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.CustomViewHolder> {

    List<infoDTO> infoDTOS;

    public RecyclerViewAdapter(List<infoDTO> infoDTOS) {
        this.infoDTOS = infoDTOS;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item,parent,false);

        CustomViewHolder customViewHolder = new CustomViewHolder(view);

        return customViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {

        String name = infoDTOS.get(position).getName();
        String phoneNum = infoDTOS.get(position).getPhoneNum();

        holder.tv_name.setText(name);
        holder.tv_number.setText(phoneNum);

    }

    @Override
    public int getItemCount() {
        return infoDTOS.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder{

        protected TextView tv_name;
        protected TextView tv_number;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_name = itemView.findViewById(R.id.tv_name);
            tv_number = itemView.findViewById(R.id.tv_number);

        }
    }
}
