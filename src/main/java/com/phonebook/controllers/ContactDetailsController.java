package com.phonebook.controllers;

import com.phonebook.model.Contact;
import com.phonebook.services.ContactDetailsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/contactsdetails")
public class ContactDetailsController {
    @Autowired
    private ContactDetailsService contactDetailsService;

    private static final Logger LOGGER= LoggerFactory.getLogger(ContactDetailsService.class);

    @PostMapping("/contact")
    public void saveContactInformation(@RequestBody Contact contact)
    {
        LOGGER.info("saving contact details of "+contact.getName());
        LOGGER.trace("saving contact details of (TRACE)"+contact.getName());
        contactDetailsService.saveContactInformation(contact);
        LOGGER.debug("contact details saved successfully");
    }
    @GetMapping("contacts")
    public List<Contact> getAllContactDetailInformation()
    {
        return contactDetailsService.getAllContactsDetails();
    }
    @PutMapping("updatecontact")
    public Contact updateExistingContact(@RequestBody Contact contact)
    {
        return contactDetailsService.UpdateContactDetails(contact);
    }
    @DeleteMapping("deletecontact/{id}")
    public void deleteContactById(@PathVariable("id") int id)
    {
         contactDetailsService.deleteExistingContactById(id);
    }
}
