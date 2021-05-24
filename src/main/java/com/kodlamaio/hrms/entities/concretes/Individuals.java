package com.kodlamaio.hrms.entities.concretes;

import com.kodlamaio.hrms.entities.abstracts.User;
import lombok.*;
import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "individuals")
public class Individuals extends User {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "identity_number")
    private String identityNum;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "create_date")
    private LocalDate createDate;

}
