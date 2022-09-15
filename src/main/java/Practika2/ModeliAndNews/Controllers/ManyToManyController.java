package Practika2.ModeliAndNews.Controllers;

import Practika2.ModeliAndNews.Models.manytomany.Noyt;
import Practika2.ModeliAndNews.Models.manytomany.Person;
import Practika2.ModeliAndNews.Repository.NoytRepository;
import Practika2.ModeliAndNews.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/ManyToMany")
@PreAuthorize("hasAnyAuthority('USER', 'ADMIN')")
public class ManyToManyController {
    @Autowired
    private NoytRepository noytRepository;
    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/")
    private String Main(Model model){
        Iterable<Noyt> noyt = noytRepository.findAll();
        model.addAttribute("noyt", noyt);
        Iterable<Person> person = personRepository.findAll();
        model.addAttribute("person", person);
        return "ManyToMany/index";
    }

    @PostMapping("/add")
    public String blogPostAdd(@RequestParam String person, @RequestParam String noyt, Model model)
    {
        Person person2 = personRepository.findByName(person);
        Noyt noyt2 = noytRepository.findByName(noyt);
        person2.getNoyt().add(noyt2);
        personRepository.save(person2);
        Iterable<Person> persons = personRepository.findAll();
        model.addAttribute("person", persons);
        Iterable<Noyt> noyts = noytRepository.findAll();
        model.addAttribute("noyt", noyts);
        return "ManyToMany/index";
    }
}