package com.phonebook.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "CONTACT_DETAILS_INFORMATION")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CONTACT_ID",length = 10)
    private int contactId;
    @Column(name = "CONTACT_NAME",length = 50)
    private String name;
    @Column(name = "CONTACT_EMAIL",length = 50)
    private String email;
    @Column(name = "CONTACT_NUMBER",length = 10)
    private String phoneNo;
}
