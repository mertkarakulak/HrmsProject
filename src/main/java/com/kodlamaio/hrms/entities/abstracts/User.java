package com.kodlamaio.hrms.entities.abstracts;

import lombok.*;
import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="users")
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="verify_id")
    private Integer verifyId;

}

