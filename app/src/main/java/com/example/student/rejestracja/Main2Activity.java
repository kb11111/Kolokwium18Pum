package com.example.student.rejestracja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {
    @BindView(R.id.recycler)
    RecyclerView recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

        Bundle przekazanedane = getIntent().getExtras();
       ArrayList<Doctors>doctors=new ArrayList<>();
        doctors.add(new Doctors("Jan Kowalski","dermatolog"));
        doctors.add(new Doctors("Katarzyna Bielecka","chirurg"));
        doctors.add(new Doctors("Anna Kulacz","stomatolog"));
        doctors.add(new Doctors("Jacek Krasik","pediatra"));

    }
}
