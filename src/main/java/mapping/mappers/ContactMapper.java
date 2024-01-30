package mapping.mappers;

import mapping.dtos.ContactDTO;
import model.Contact;

import java.time.LocalDateTime;

public class ContactMapper {
    public static Contact mapFrom(ContactDTO dto){
     return new Contact(dto.name(), dto.phone(), LocalDateTime.now());
    }
    public static ContactDTO mapFrom(Contact model){
        return new ContactDTO(model.getName(), model.getPhone());
    }
}
