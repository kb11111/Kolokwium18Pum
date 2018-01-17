package com.example.student.rejestracja;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by student on 2018-01-17.
 */

public class DoctorAdapter  extends RecyclerView.Adapter<DoctorAdapter.ViewHolder>{
    ArrayList<Doctors> doctors=new ArrayList<>();

    public DoctorAdapter(ArrayList<Doctors> doctors) {
        this.doctors = doctors;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, null);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setName(doctors.get(position).getNazwa());
        holder.setPrice(doctors.get(position).getSpec() + "");
    }

    @Override
    public int getItemCount() {
        return doctors.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
