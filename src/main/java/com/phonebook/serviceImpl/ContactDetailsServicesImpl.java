package com.phonebook.serviceImpl;

import com.phonebook.model.Contact;
import com.phonebook.repositories.ContactDetailsRepository;
import com.phonebook.services.ContactDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactDetailsServicesImpl implements ContactDetailsService {
    @Autowired
    private ContactDetailsRepository contactDetailsRepository;
    @Override
    public void saveContactInformation(Contact contact) {
        contactDetailsRepository.save(contact);
    }

    @Override
    public List<Contact> getAllContactsDetails() {
        return contactDetailsRepository.findAll();
    }

    @Override
    public Contact UpdateContactDetails(Contact contact) {
        Contact contact1=contactDetailsRepository.findByContactId(contact.getContactId());
        contact1.setName(contact.getName());
        contact1.setEmail(contact.getEmail());
        contact1.setPhoneNo(contact.getPhoneNo());
        contactDetailsRepository.save(contact1);
        return contact1;
    }

    @Override
    public void deleteExistingContactById(int id) {
        contactDetailsRepository.deleteById(id);
    }
}
