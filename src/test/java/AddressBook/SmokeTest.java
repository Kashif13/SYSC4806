package AddressBook;

import static org.assertj.core.api.Assertions.assertThat;

import AddressBook.AddressBookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AddressBookController.class)
public class SmokeTest {

    @Autowired
    private AddressBookController controller;

    @Test
    public void contexLoads() throws Exception {
        assertThat(controller).isNotNull();
    }
}