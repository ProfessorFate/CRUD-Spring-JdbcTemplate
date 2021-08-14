package contact.controller;
import contact.dao.ContactDao;
import contact.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private ContactDao contactDao;

    @Autowired
    public MainController(ContactDao contactDao){
        this.contactDao=contactDao;
    }

    @GetMapping("/contact")
    public String geAllContact(Model model){
        model.addAttribute("contacts",contactDao.list());
        return "contact";
    }

    @GetMapping("newContact")
    public String createContact(){
        return "addContact";
    }

    @PostMapping("/newContact")
    public String addContact(@ModelAttribute("contact")Contact contact){
        contactDao.save(contact);
        return "redirect:/contact";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") int id, Model model){
        model.addAttribute("contact",contactDao.get(id));
        return "editContact";
    }

    @PostMapping("/editContact")
    public String editContact(@ModelAttribute("contact") Contact contact){
        contactDao.edit(contact);
        return "redirect:/contact";
    }

    @GetMapping("/delete/{id}")
    public String deleteContact(@PathVariable("id") int id){
        contactDao.delete(id);
        return "redirect:/contact";
    }








    }




