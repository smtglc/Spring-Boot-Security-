package com.KayKayProjesi.Profil.models;


import jakarta.persistence.*;

@Entity
@Table(name ="profil_bilgileri")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "Ad")
    private String ad;

    @Column(name = "Soyad")
    private String soyad;

    @Column(name = "email")
    private String email;

    @Column(name = "Telefon_numarası")
    private String telefonNum;

    @Column(name = "Tc_Kimlik")
    private String tc_kimlik;

    @Column(name = "Şifre")
    private String password;

    @Column(name = "Adres")
    private String adres;
    public Profile(){

    }

    public Profile(String ad, String soyad, String email, String telefonNum, String tc_kimlik, String password, String adres) {
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.telefonNum = telefonNum;
        this.tc_kimlik = tc_kimlik;
        this.password = password;
        this.adres = adres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonNum() {
        return telefonNum;
    }

    public void setTelefonNum(String telefonNum) {
        this.telefonNum = telefonNum;
    }

    public String getTc_kimlik() {
        return tc_kimlik;
    }

    public void setTc_kimlik(String tc_kimlik) {
        this.tc_kimlik = tc_kimlik;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", email='" + email + '\'' +
                ", telefonNum='" + telefonNum + '\'' +
                ", tc_kimlik='" + tc_kimlik + '\'' +
                ", password='" + password + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }
}
