package Practika2.ModeliAndNews.Controllers;


import Practika2.ModeliAndNews.Models.onetoone.Jojo;
import Practika2.ModeliAndNews.Models.onetoone.Stand;
import Practika2.ModeliAndNews.Repository.JojoRepository;
import Practika2.ModeliAndNews.Repository.StandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/OneToOne")
@PreAuthorize("hasAnyAuthority('USER', 'ADMIN')")
public class OneToOneController {

    @Autowired
    private StandRepository standRepository;
    @Autowired
    private JojoRepository jojoRepository;

    @GetMapping("/")
    public  String Index(Model model){
        Iterable<Stand> stands = standRepository.findAll();
        model.addAttribute("stand", stands);

        Iterable<Jojo> jojos = jojoRepository.findAll();
        model.addAttribute("jojo",jojos);
        return "OneToOne/index";
    }

    @PostMapping("/add")
    public String blogPostAdd(@RequestParam String namej, @RequestParam String ima, Model model)
    {
        System.out.println(namej);
        Stand stand = standRepository.findByIma(ima);
        System.out.println(stand.getId());
        Jojo jojo = new Jojo(namej, stand);
        jojoRepository.save(jojo);

        Iterable<Stand> stand1 = standRepository.findAll();
        model.addAttribute("stand", stand1);

        Iterable<Jojo> jojo1 = jojoRepository.findAll();
        model.addAttribute("jojo",jojo1);
        return "OneToOne/index";
    }


}
