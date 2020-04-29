package addressbook.repository;

import addressbook.model.ContactDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AddressBookRepo {
    public List<ContactDTO> findAll() {
        List<ContactDTO> result = new ArrayList<>();
        ContactDTO c = new ContactDTO();
        c.setName("John");
        c.setTelephone("416-1234567");
        result.add(c);
        return result;
    }

    public ContactDTO add(ContactDTO pojo) {
        ContactDTO contactDTO = new ContactDTO();
        contactDTO.setTelephone(pojo.getTelephone());
        contactDTO.setName(pojo.getName());
        return contactDTO;
    }
}
