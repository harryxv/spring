import java.util.*;

public class AddressBookImpl implements AddressBook {
    @Override
    public Set<Contact> getContacts() {
        return contacts;
    }

    private Set<Contact> contacts = new TreeSet<>(); //All existing contacts without duplication
    private Integer nextId = 1;

    public AddressBookImpl() {
        initialize();
    }

    @Override
    public boolean add(Contact contact) {
        if (contacts.contains(contact)) {
            return false;
        }

        contact.setId(nextId++);
        return contacts.add(contact);
    }

    @Override
    public Iterator<Contact> listAll() {
        return contacts.iterator();
    }

    @Override
    public void update(Contact contact) {
        Contact current = this.loadContactById(contact.getId());
        if (current != null) {
            current.setCompany(contact.getCompany());
            current.setName(contact.getName());
            current.setTelephone(contact.getTelephone());
        }
    }

    private Contact loadContactById(Integer id) {
        for (Contact contact : contacts) {
            if (contact.getId().equals(id)) {
                return contact;
            }
        }
        return null;
    }

    @Override
    public void remove(Contact contact) {
        Contact current = this.loadContactById(contact.getId());
        if (current != null) {
            contacts.remove(current);
        }
    }

    @Override
    public Integer size() {
        return contacts.size();
    }

    /**
     * initialize AddressBook with some existing contacts
     */
    private void initialize() {
        this.add(new Contact("Maria Anders", "Alfreds Futterkiste", "213-000-1234"));
        this.add(new Contact("Francisco Chang", "Centro comercial Moctezuma", "010-234-5678"));
        this.add(new Contact("Helen Bennett", "Island Trading", "416-234-5678"));
    }
}
