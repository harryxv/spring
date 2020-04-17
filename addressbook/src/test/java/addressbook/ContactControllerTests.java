package addressbook;

import addressbook.controller.ContactController;
import addressbook.entity.Contact;
import addressbook.model.ContactDTO;
import addressbook.repository.ContactRepository;
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

@WebMvcTest(ContactController.class)
public class ContactControllerTests {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ContactRepository contactRepository;

    @Test
    public void findAll_returnNonEmptyContacts() throws Exception {
        List<Contact> result = new ArrayList<>();
        Contact c = new Contact();
        c.setName("John");
        c.setTelephone("416-1234567");
        result.add(c);
        when(contactRepository.findAll()).thenReturn(result);
        mockMvc.perform(request(HttpMethod.GET, "/contacts"))
                .andExpect(status().isOk())
                .andDo(print());
    }
}
