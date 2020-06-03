package com.example.fragmentexample;

import java.io.Serializable;

public class SinhVien implements Serializable {
    private String Name;
    private int NamSinh;
    private String DiaChi;
    private String Email;

    public SinhVien(String name, int namSinh, String diaChi, String email) {
        Name = name;
        NamSinh = namSinh;
        DiaChi = diaChi;
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int namSinh) {
        NamSinh = namSinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
