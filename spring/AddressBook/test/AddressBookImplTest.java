import org.junit.*;

import java.util.Iterator;

import static org.junit.Assert.*;

public class AddressBookImplTest {
    private static AddressBook addressBook;


    @Before
    public void setUpEachTest() throws Exception {
        addressBook = AddressBookFactory.createAddressBook();
    }

    @After
    public void tearDownEachTest() throws Exception {
        addressBook = null;
    }


    @Test
    public void testAddBrandNew() {
        Integer sizeBefore = addressBook.size();
        Contact contact = new Contact("new_name", "new_company", "new_phone");
        addressBook.add(contact);
        Integer sizeAfter = addressBook.size();
        assert (sizeAfter == sizeBefore + 1);
        displayContacts("testAddBrandNew");
    }

    @Test
    public void testAddDuplicate() {
        Integer sizeBefore = addressBook.size();
        Contact contact = new Contact("new_name", "new_company", "new_phone");
        addressBook.add(contact);
        Integer sizeAfter = addressBook.size();
        assert (sizeAfter == sizeBefore + 1);


        sizeBefore = addressBook.size();
        boolean result = addressBook.add(contact);
        assertFalse(result);
        displayContacts("testAddDuplicate");

    }

    @Test
    public void testAddSameName() {
        Integer sizeBefore = addressBook.size();
        Contact contact = new Contact("new_name", "new_company", "new_phone");
        addressBook.add(contact);
        Integer sizeAfter = addressBook.size();
        assert (sizeAfter == sizeBefore + 1);

        //contact.setCompany("different_company");
        //contact.setTelephone("different_phone");
        Contact newcontact = new Contact("new_name", "different_company", "different_phone");
        System.out.println(addressBook.getContacts().contains(newcontact));
        boolean result = addressBook.add(newcontact);
        assertTrue(result);
        displayContacts("testAddSameName");
    }

    private void displayContacts(String testMessage) {
        System.out.println(testMessage);
        Iterator<Contact> allContacts = addressBook.listAll();
        while (allContacts.hasNext()) {
            Contact c = allContacts.next();
            System.out.format("ID = %s, Name = %s Company= %s\n", c.getId(), c.getName(), c.getCompany());
        }
    }


    @Test
    public void testUpdateExistingContact() {
        Contact contact = new Contact("test_name", "test_company", "test_phone");
        // addressBook.update();
    }

    @Test
    public void remove() {
    }
}