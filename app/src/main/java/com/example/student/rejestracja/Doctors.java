package com.example.student.rejestracja;

/**
 * Created by student on 2018-01-17.
 */

public class Doctors {
    private String nazwa;
    private String spec;

    public Doctors(String nazwa, String spec) {
        this.nazwa = nazwa;
        this.spec = spec;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }
}
