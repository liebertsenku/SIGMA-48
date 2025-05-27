package com.sigma48.model;

public class PersonelIntelijen {
    enum StatusOperasional {
        AKTIF,
        NON_AKTIF,
        DILAPANGAN,
        CUTI
    }

    private String idAgen;
    private String nama;
    private String lokasiPenugasan;
    private String spesialisasi;
    private StatusOperasional statusOperasional;
    private String nomorKontak;
    private String email;
    private boolean ditugaskan;

    // Constructor
    public PersonelIntelijen() {
    }

    public PersonelIntelijen(String idAgen, String nama, String lokasiPenugasan, String spesialisasi,
                           StatusOperasional statusOperasional, String nomorKontak, String email,
                           boolean ditugaskan) {
        this.idAgen = idAgen;
        this.nama = nama;
        this.lokasiPenugasan = lokasiPenugasan;
        this.spesialisasi = spesialisasi;
        this.statusOperasional = statusOperasional;
        this.nomorKontak = nomorKontak;
        this.email = email;
        this.ditugaskan = ditugaskan;
    }

    // Getter dan Setter
    public String getIdAgen() {
        return idAgen;
    }

    public void setIdAgen(String idAgen) {
        this.idAgen = idAgen;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLokasiPenugasan() {
        return lokasiPenugasan;
    }

    public void setLokasiPenugasan(String lokasiPenugasan) {
        this.lokasiPenugasan = lokasiPenugasan;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }

    public StatusOperasional getStatusOperasional() {
        return statusOperasional;
    }

    public void setStatusOperasional(StatusOperasional statusOperasional) {
        this.statusOperasional = statusOperasional;
    }

    public String getNomorKontak() {
        return nomorKontak;
    }

    public void setNomorKontak(String nomorKontak) {
        this.nomorKontak = nomorKontak;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isDitugaskan() {
        return ditugaskan;
    }

    public void setDitugaskan(boolean ditugaskan) {
        this.ditugaskan = ditugaskan;
    }

}
