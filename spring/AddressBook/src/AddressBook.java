import java.util.Iterator;
import java.util.Set;

/**
 * public APIs for address book application. a high-level functionality list.
 */
public interface AddressBook {
    public boolean add(Contact contact);  //add new contact

    public Iterator<Contact> listAll(); //list all contacts in addressbook

    public void update(Contact contact);

    public void remove(Contact contact);

    public Integer size();
    public Set<Contact> getContacts();

}
