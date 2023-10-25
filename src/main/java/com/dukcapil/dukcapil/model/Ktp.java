package com.dukcapil.ktp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ktp")
public class Ktp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(message = "ID should not be null")
    private String nik;

    @Column(nullable = false)
    private String Provinsi;

    @Column(nullable = false)
    private String kota;

    @Column(nullable = false)
    private String nama;

    @Column(nullable = false)
    private String tempat_lahir;

    @Column(nullable = false)
    private Date tanggal_lahir;

    @Column(nullable = false)
    private String jenis_kelamin;

    @Column(nullable = false)
    private String golongan_darah;

    @Column(nullable = false)
    private String alamat;

    @Column(nullable = false)
    private String rt;

    @Column(nullable = false)
    private String rw;

    @Column(nullable = false)
    private String kelurahan;

    @Column(nullable = false)
    private String agama;

    @Column(nullable = false)
    private String status_perkawinan;

    @Column(nullable = false)
    private String pekerjaan;

    @Column(nullable = false)
    private String kewarganegaraan;

    @Column(nullable = false)
    private String berlaku_hingga;

    @Column(nullable = false)
    private String tanggal_perekaman;

}
