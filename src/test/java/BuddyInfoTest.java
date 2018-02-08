import AddressBook.BuddyInfo;

import static org.junit.Assert.*;

public class BuddyInfoTest {
    BuddyInfo bud1;
    BuddyInfo bud2;
    BuddyInfo bud3;
    @org.junit.Before
    public void setUp() throws Exception {
        bud1 = new BuddyInfo("Adam", "Earth", "123");
        bud2 = new BuddyInfo("Thomas", "Jupiter", "321");
        bud3 = new BuddyInfo("Alias");
    }

    @org.junit.Test
    public void testGetName() throws Exception {
        assertEquals("Buddy 1 name should be Adam", "Adam", bud1.getName());
    }

    @org.junit.Test
    public void testGetAddress() throws Exception {
        assertEquals("Buddy 2 address should be Jupiter", "Jupiter", bud2.getAddress());
    }

    @org.junit.Test
    public void testSetName() throws Exception {
        bud3.setName("Banana");
        assertEquals("Buddy 3 name should now be Banana", "Banana", bud3.getName());
    }

    @org.junit.Test
    public void testSetAddress() throws Exception {
        bud3.setAddress("Far");
        assertEquals("Buddy 3 address should now be Far", "Far", bud3.getAddress());
    }

    @org.junit.Test
    public void testGetPhoneNumber() throws Exception {
        assertEquals("Buddy 1 Phone Number should be 123", "123", bud1.getPhoneNumber());
    }

    @org.junit.Test
    public void testSetPhoneNumber() throws Exception {
        bud3.setPhoneNumber("552");
        assertEquals("Buddy 3 Phone Number should now be 552", "552", bud3.getPhoneNumber());
    }
}