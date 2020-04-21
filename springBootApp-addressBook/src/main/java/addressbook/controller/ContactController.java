package addressbook.controller;

import addressbook.entity.Contact;
import addressbook.model.ContactDTO;
import addressbook.repository.ContactRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/contacts")
public class ContactController {
    private ContactRepository contactRepository;

    @Autowired
    public ContactController(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping(path = "")
    public Iterable<Contact> findAll() {
        return contactRepository.findAll();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(path = "")
    public Contact add(@RequestBody ContactDTO contactDTO) {
        System.out.println(contactDTO);
        System.out.println(contactDTO.getEmail());
        Contact contact = new Contact();
        BeanUtils.copyProperties(contactDTO, contact);
        return contactRepository.save(contact);
    }
}
