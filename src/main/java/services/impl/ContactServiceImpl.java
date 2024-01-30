package services.impl;

import mapping.dtos.ContactDTO;
import mapping.mappers.ContactMapper;
import model.Contact;
import services.ContactService;

import java.util.ArrayList;
import java.util.List;

public class ContactServiceImpl implements ContactService {

    private List<Contact> contactList = new ArrayList<Contact>();

    public List<ContactDTO> listContacts() {

        return contactList.stream().map(ContactMapper::mapFrom).toList();
    }

    @Override
    public List<ContactDTO> addContact(ContactDTO contact) {
        contactList.add(ContactMapper.mapFrom(contact));

        return contactList.stream().map(ContactMapper::mapFrom).toList();
    }
}
