package com.phonebook.repositories;

import com.phonebook.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactDetailsRepository extends JpaRepository<Contact,Integer> {
    Contact findByContactId(int contactId);

}
