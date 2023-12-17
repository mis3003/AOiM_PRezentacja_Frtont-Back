package com.example.demo.contact;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContactService {
    private final ContactRepository contactRepository;
@Autowired
    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public List<Contact> getContacts()
    {
        return contactRepository.findAll();
    }

    public void addNewContact(Contact contact) {
        System.out.println(contact);
        contactRepository.save(contact);
    }

    public void deleteContact(int contactId) {

    if(!contactRepository.existsById(contactId))
    {
        return;
    }
    contactRepository.deleteById(contactId);
    }
@Transactional
    public void updateContact(int contactId, String name, String number, String email) {
        Contact contact = contactRepository.findById(contactId).orElseThrow(() ->new IllegalStateException("no contact"));
        contact.setName(name);
        contact.setNumber(number);
        contact.setEmail(email);
    }
}
