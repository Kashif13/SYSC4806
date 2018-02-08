package ui.button;

import java.awt.event.ActionEvent;
import AddressBook.BuddyInfo;


public class AddNewButtonActionListener extends ListTableActionListener {
    public void actionPerformed(ActionEvent e) {
        BuddyInfo b = new BuddyInfo("1", "2","22");
        list.add(b.toString());
        table.revalidate();
    }
}