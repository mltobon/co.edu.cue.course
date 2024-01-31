package services.impl;

import mapping.dtos.ContactDTO;
import mapping.mappers.ContactMapper;
import model.Contact;
import services.ContactService;
import utils.Constants;
import utils.FileUtils;

import java.io.File;
import java.util.List;

public class ContactServiceImpl implements ContactService {

    private List<Contact> contactList;
    public ContactServiceImpl() {
     contactList = FileUtils.getContacts(new File(Constants.PATH_CONTACTS));
    }

    public List<ContactDTO> listContacts() {
        return contactList.stream().map(ContactMapper::mapFrom).toList();
    }

    @Override
    public boolean verifyContactExists(String name) {
        return contactList.stream()
                .anyMatch(e->e.getName().equalsIgnoreCase(name));
    }

    @Override
    public List<ContactDTO> addContact(ContactDTO contact) throws Exception {
        if(!verifyContactExists(contact.name())){
            contactList.add(ContactMapper.mapFrom(contact));
            FileUtils.saveContacts(new File(Constants.PATH_CONTACTS), contactList);
            return contactList.stream().map(ContactMapper::mapFrom).toList();
        }
        throw new Exception("ese contacto ya esta creado en la agenda");
    }
}
