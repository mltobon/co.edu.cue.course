package services;

import mapping.dtos.ContactDTO;

import java.util.List;

public interface ContactService {

    List<ContactDTO> addContact(ContactDTO contact);
    List<ContactDTO> listContacts();

}
