package addressbook;

import addressbook.controller.AddressBookController;
import addressbook.model.Contact;
import addressbook.repository.AddressBookRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpMethod;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AddressBookController.class)
public class AddressBookControllerTests {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AddressBookRepo addressBookRepo;

    @Test
    public void findAll_returnNonEmptyContacts() throws Exception {
        List<Contact> result = new ArrayList<>();
        Contact c = new Contact();
        c.setFirstName("John");
        c.setLastName("littleford");
        c.setTelephone("416-1234567");
        result.add(c);
        when(addressBookRepo.findAll()).thenReturn(result);
        mockMvc.perform(request(HttpMethod.GET, "/contacts"))
                .andExpect(status().isOk())
                .andDo(print());
    }
}
