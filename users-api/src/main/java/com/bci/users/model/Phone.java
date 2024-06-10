package com.bci.users.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PHONES")
public class Phone {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NUMBER", nullable = false, length = 12)
    private String number;


    @Column(name = "CITYCODE", nullable = false, length = 5)
    private String cityCode;

    @Column(name = "COUNTRYCODE", nullable = false, length = 5)
    private String countryCode;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    public Phone(String number, String cityCode, String countryCode, User user) {
        this.number = number;
        this.cityCode = cityCode;
        this.countryCode = countryCode;
        this.user = user;
    }
}
