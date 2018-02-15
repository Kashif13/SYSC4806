package AddressBook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import AddressBook.AddressBookRepository.*;
import AddressBook.BuddyRepository.*;


@Controller
public class AddressBookController {

    @Autowired
    private AddressBookRepository addressRepo;

    @Autowired
    private BuddyRepository buddyRepo;

    @GetMapping("/book")
    public String bookForm(Model model){
        AddressBook book = new AddressBook();
        model.addAttribute("book", book);
        return "book";
    }


    @GetMapping("/buddy")
    public String buddyForm(Model model){
        BuddyInfo buddy = new BuddyInfo();
        model.addAttribute("buddy", buddy);
        return "buddy";
    }

    @PostMapping("/buddy")
    public String buddySubmit(@ModelAttribute("buddy") BuddyInfo buddy) {
        buddyRepo.save(buddy);
        for (AddressBook book : addressRepo.findAll()) {
            book.addBuddy(buddy);
            addressRepo.save(book);
        }
        return "result";
    }



}
