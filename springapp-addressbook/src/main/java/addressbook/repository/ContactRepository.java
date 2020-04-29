package addressbook.repository;

import addressbook.entity.Contact;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContactRepository extends CrudRepository<Contact, Integer> {
    List<Contact> findByEmail(String email);
    List<Contact> findByNameOrEmail( String name,String email);
    long countByEmail(String email);

    @Query("select u from Contact u where u.email = ?1")
    List<Contact> findByName( String name);
}
