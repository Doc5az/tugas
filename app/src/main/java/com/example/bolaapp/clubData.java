package com.example.bolaapp;

public class clubData {
    private int clubLogo;
    private String namaClub;
    private String lokasiClub;
    private String clubDetails;
    private String pendaptanClub;
    private int clubImage;

    public clubData() {
    }

    public clubData(int clubLogo, String namaClub, String lokasiClub, String clubDetails, String pendaptanClub, int clubImage) {
        this.clubLogo = clubLogo;
        this.namaClub = namaClub;
        this.lokasiClub = lokasiClub;
        this.clubDetails = clubDetails;
        this.pendaptanClub = pendaptanClub;
        this.clubImage = clubImage;
    }

    public int getClubLogo() {
        return clubLogo;
    }

    public void setClubLogo(int clubLogo) {
        this.clubLogo = clubLogo;
    }

    public String getNamaClub() {
        return namaClub;
    }

    public void setNamaClub(String namaClub) {
        this.namaClub = namaClub;
    }

    public String getLokasiClub() {
        return lokasiClub;
    }

    public void setLokasiClub(String lokasiClub) {
        this.lokasiClub = lokasiClub;
    }

    public String getClubDetails() {
        return clubDetails;
    }

    public void setClubDetails(String clubDetails) {
        this.clubDetails = clubDetails;
    }

    public String getPendaptanClub() {
        return pendaptanClub;
    }

    public void setPendaptanClub(String pendaptanClub) {
        this.pendaptanClub = pendaptanClub;
    }

    public int getClubImage() {
        return clubImage;
    }

    public void setClubImage(int clubImage) {
        this.clubImage = clubImage;
    }
}
