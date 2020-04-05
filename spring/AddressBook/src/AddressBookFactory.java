/**
 * Factory class to create an instance of AddressBook.
 */
public class AddressBookFactory {
    public static AddressBook createAddressBook() {
        return new AddressBookImpl();
    }
}
