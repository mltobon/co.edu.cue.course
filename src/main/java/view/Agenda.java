package view;

import mapping.dtos.ContactDTO;
import services.ContactService;
import services.impl.ContactServiceImpl;

import java.util.List;

public class Agenda {
    public static void main(String[] args)  {
        ContactService contactService = new ContactServiceImpl();
        List<ContactDTO> contacts = contactService.listContacts();

    }

    }
