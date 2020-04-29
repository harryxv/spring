package addressbook.repository;

import addressbook.entity.Contact;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ContactRepositoryTest {
    @Autowired
    ContactRepository contactRepository;

    @Test
    void findByEmail() {
        List<Contact> contacts = contactRepository.findByEmail("harry.xv@gmail.com");
        assertThat(contacts).isNotEmpty();
        System.out.println(contacts.get(0).getName());
    }
    @Test
    void countByEmail(){
        long count = contactRepository.countByEmail("harry.xv@gmail.com");
        assertThat(count).isBetween(1L,2L);
    }

    @Test
    void findByFirstName() {
        List<Contact> contacts = contactRepository.findByNameOrEmail("harry xu","harry.xv@gmail");
        assertThat(contacts).isNotEmpty();
        System.out.println(contacts.get(0).getName());
    }

    @Test
    void findByName() {
        List<Contact> contacts = contactRepository.findByName("harry.xv@gmail.com");
        assertThat(contacts).isNotEmpty();
        System.out.println(contacts.get(0).getName());
    }
}