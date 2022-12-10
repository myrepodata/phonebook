package com.phonebook.services;

import com.phonebook.model.Contact;

import java.util.List;

public interface ContactDetailsService {
    void saveContactInformation(Contact contact);

    List<Contact> getAllContactsDetails();

    Contact UpdateContactDetails(Contact contact);

    void deleteExistingContactById(int id);
}
