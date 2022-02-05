package com.bilgeadam.odevpersonelapp.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Personel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long no;
    private String ad;
    private String soyad;
    private long bolumNo;
}
