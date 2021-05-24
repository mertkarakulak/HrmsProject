package com.kodlamaio.hrms.entities.concretes;

import com.kodlamaio.hrms.entities.abstracts.User;
import lombok.*;
import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "companies")
public class Companies extends User {

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "web_address")
    private String webAddress;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "create_date")
    private LocalDate createDate;

    @Column(name = "is_approved")
    private boolean isApproved;
}
