package com.bci.users.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "USERS")
public class User {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME", nullable = false, length = 50)
    private String name;

    @Column(name = "EMAIL", nullable = false, length = 50)
    private String email;

    @Column(name = "PASSWORD", nullable = false, length = 50)
    private String password;

    @JsonManagedReference
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Phone> phones = new ArrayList<>();

    //private String id; TODO ver si hago algo con esto

    private LocalDateTime created = LocalDateTime.now();

    private LocalDateTime modified = LocalDateTime.now();

    private LocalDateTime last_login = LocalDateTime.now();

    private String token;

    private boolean isActive;

}
