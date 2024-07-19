package com.example.DemoSecurityMVC.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Authority {
    @Id
    private String name;

    private String description;

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "account_authority",
            joinColumns = @JoinColumn(name = "authority_name"),
            inverseJoinColumns = @JoinColumn(name = "account_id"))
    private List<Account> authority_account = new ArrayList<>();
}
