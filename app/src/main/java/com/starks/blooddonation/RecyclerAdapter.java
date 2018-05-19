package com.starks.blooddonation;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by RCP on 5/16/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyHolder>{

    List<Postfeed> listdata;

    public RecyclerAdapter(List<Postfeed> listdata) {
        this.listdata = listdata;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);

        MyHolder myHolder = new MyHolder(view);
        return myHolder;
    }


    public void onBindViewHolder(MyHolder holder, int position) {
        Postfeed data = listdata.get(position);
        holder.vname.setText(data.getBloodType());
        holder.vemail.setText(data.getHospitalLoc());
        holder.vaddress.setText(data.getCity());
        holder.vcont.setText(data.getCinfo());
        holder.vdesc.setText(data.getDescription());
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }


    class MyHolder extends RecyclerView.ViewHolder{
        TextView vname,vaddress,vemail,vcont,vdesc;

        public MyHolder(View itemView) {
            super(itemView);
            vname = itemView.findViewById(R.id.vaddress1);
            vemail =  itemView.findViewById(R.id.vaddress2);
            vaddress =  itemView.findViewById(R.id.vaddress3);
            vcont = itemView.findViewById(R.id.vaddress4);
            vdesc = itemView.findViewById(R.id.vaddress5);

        }
    }


}
