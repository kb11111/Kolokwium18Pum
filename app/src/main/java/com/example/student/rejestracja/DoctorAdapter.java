package com.example.student.rejestracja;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

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
        holder.setNazwa(doctors.get(position).getNazwa());
        holder.setSpec(doctors.get(position).getSpec() + "");
    }

    @Override
    public int getItemCount() {
        return doctors.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.txt_nazwa)
        TextView txt_nazwa;
        @BindView(R.id.txt_specjalizacja)
        TextView txt_specjalizacja;
        @BindView(R.id.btn_wybierz)
        Button btn_wybierz;
        @OnClick(R.id.btn_wybierz)
        void onNameClick(){
            if(btn_wybierz.getText()=="WYBRANO"){
                btn_wybierz.setText("WYBIERZ");
            }
            else{
                btn_wybierz.setText("WYBRANO");
            }
        }

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void setNazwa(String nazwa) {
          txt_nazwa.setText(nazwa);
        }

        public void setSpec(String spec) {
            txt_specjalizacja.setText(spec);
        }
    }
}
