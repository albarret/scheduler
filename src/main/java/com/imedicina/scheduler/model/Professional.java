package com.imedicina.scheduler.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "professional")
public class Professional {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    @Enumerated(EnumType.STRING)
    private ProfessionalStatus status;

    @Column
    private String rating;

    @Column
    private String crm;

    @Column
    private String password;

    public Professional() {
        super();
    }

    public Professional(String crm, String password) {
        this.crm = crm;
        this.password = password;
    }

    public Professional(Long id, String crm, String password, String rating, ProfessionalStatus status) {
        this.id = id;
        this.crm = crm;
        this.password = password;
        this.rating = rating;
        this.status = status;
    }

}
