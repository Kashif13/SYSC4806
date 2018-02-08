package AddressBook;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@Controller
public class AddressBookController {
    @RequestMapping("/newBook")
    public String create( Model model) {
        AddressBook book = new AddressBook();
        model.addAttribute("book", book);
        return "newBook";
    }

    @RequestMapping(value = "/newBuddy", method = RequestMethod.GET)
    public String newBuddy(Model model){
        BuddyInfo buddy = new BuddyInfo();
        model.addAttribute("buddy", buddy);
        //model.addAttribute("book", book);
        return "newBuddy";
    }

   @RequestMapping(value = "/newBuddy", method=RequestMethod.POST)
    public String createBuddy(@ModelAttribute BuddyInfo buddy){
        return "result";
   }
//    @RequestMapping(value = "/result", method=RequestMethod.POST)
//    public String addBuddy(@ModelAttribute BuddyInfo buddy){
//        return "result";
//    }


}
