package view;

import mapping.dtos.ContactDTO;
import services.ContactService;
import services.impl.ContactServiceImpl;

import java.util.List;

public class Agenda {
    public static void main(String[] args) throws Exception {
        ContactService contactService = new ContactServiceImpl();
        List<ContactDTO> contacts = contactService.listContacts();

       // System.out.println(contacts.stream().map(ContactDTO::name).toList());

        contactService.addContact(new ContactDTO("Monica","123"));
        contactService.addContact(new ContactDTO("Carlos","34565"));
        contacts = contactService.listContacts();
        System.out.println(contacts.stream().map(ContactDTO::name).toList());
    }

}
