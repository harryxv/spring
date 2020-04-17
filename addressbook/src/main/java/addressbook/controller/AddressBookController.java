package addressbook.controller;

import addressbook.model.Contact;
import addressbook.repository.AddressBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(path = "/contacts")
public class AddressBookController {
    private AddressBookRepo addressBookRepo;

    @Autowired
    public AddressBookController(AddressBookRepo addressBookRepo) {
        this.addressBookRepo = addressBookRepo;
    }

    @GetMapping(path = "")
    public List<Contact> findAll() {
        return addressBookRepo.findAll();
    }

    @PostMapping(path = "/")
    public Contact add(Contact pojo) {
        return addressBookRepo.add(pojo);
    }
}
