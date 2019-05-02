package com.example.recycler__view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter_char extends RecyclerView.Adapter<Adapter_char.PlayerStatViewHolder> {
    private ArrayList<PlayerStat> datalist;


    public Adapter_char(ArrayList<PlayerStat> datalist) {
        this.datalist = datalist;
    }


    @Override
    public PlayerStatViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_view, parent, false);
        return new PlayerStatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PlayerStatViewHolder holder, int position) {
        holder.txtName.setText(datalist.get(position).getName());
        holder.txtcLass.setText(datalist.get(position).getcLass());
        holder.txtSkill.setText(datalist.get(position).getskill());

    }

    @Override
    public int getItemCount() {
        return (datalist != null) ? datalist.size() : 0;

    }

    public class PlayerStatViewHolder extends RecyclerView.ViewHolder{
        private TextView txtName, txtcLass, txtSkill;

        public PlayerStatViewHolder(View itemView) {
            super(itemView);
            txtName = (TextView) itemView.findViewById(R.id.txt_nameChar);
            txtcLass = (TextView) itemView.findViewById(R.id.txt_cLass);
            txtSkill= (TextView) itemView.findViewById(R.id.txt_skill);

        }
    }
}
