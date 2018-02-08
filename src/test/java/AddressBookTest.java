import AddressBook.AddressBook;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import AddressBook.*;

public class AddressBookTest {
    BuddyInfo bud1;
    BuddyInfo bud2;
    AddressBook addr;
    @Before
    public void setUp() throws Exception {
        bud1 = new BuddyInfo("Mike", "Pluto, 123 Icicle", "6139999999");
        bud2 = new BuddyInfo("Tom", "Mars, 56 Dessert", "6138888888");
        addr = new AddressBook();
        addr.addBuddy(bud1);
        addr.addBuddy(bud2);
    }

    @Test
    public void testAddBuddy() throws Exception {
        BuddyInfo bud3 = new BuddyInfo("A", "B", "1");
        addr.addBuddy(bud3);
        assertTrue(addr.getSize() == 3);

    }

    @Test
    public void testRemoveBuddy() throws Exception {
        addr.removeBuddy(bud1);
        assertTrue(addr.getSize() == 1);
    }

}