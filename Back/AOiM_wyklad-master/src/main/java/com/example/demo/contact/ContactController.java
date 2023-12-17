package com.example.demo.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "api/v1/contact")
public class ContactController {
private final ContactService contactService;

@Autowired
public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping
    public List<Contact> getContacts()
    {
        return contactService.getContacts();
    }
    @PostMapping
    public void registerNewContact(@RequestBody Contact contact)
    {
        contactService.addNewContact(contact);
    }
    @DeleteMapping(path = "/{contactId}")
    public void deleteContact(@PathVariable("contactId") int contactId)
    {
        contactService.deleteContact(contactId);
    }
    @PutMapping(path = "/{contactId}")
    public void updateContact(@PathVariable("contactId")int contactId,@RequestBody Contact contact)
    {
        contactService.updateContact(contactId, contact.getName(), contact.getNumber(), contact.getEmail());
    }
}
