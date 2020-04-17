package addressbook.repository;

import addressbook.model.Contact;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AddressBookRepo {
    public List<Contact> findAll() {
        List<Contact> result = new ArrayList<>();
        Contact c = new Contact();
        c.setFirstName("John");
        c.setLastName("littleford");
        c.setTelephone("416-1234567");
        result.add(c);
        return result;
    }

    public Contact add(Contact pojo) {
        Contact contact = new Contact();
        contact.setTelephone(pojo.getTelephone());
        contact.setFirstName(pojo.getFirstName());
        contact.setLastName(pojo.getLastName());
        return contact;
    }
}
