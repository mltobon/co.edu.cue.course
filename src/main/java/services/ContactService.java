package services;

import mapping.dtos.ContactDTO;

import java.util.List;

public interface ContactService {

    List<ContactDTO> addContact(ContactDTO contact) throws Exception;
    List<ContactDTO> listContacts();

    boolean verifyContactExists(String name);

}
