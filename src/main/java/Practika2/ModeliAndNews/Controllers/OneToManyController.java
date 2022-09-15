package Practika2.ModeliAndNews.Controllers;

import Practika2.ModeliAndNews.Models.onetomany.Shop;
import Practika2.ModeliAndNews.Models.onetomany.Tc;
import Practika2.ModeliAndNews.Repository.ShopRepository;
import Practika2.ModeliAndNews.Repository.TcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/OneToMany")
@PreAuthorize("hasAnyAuthority('USER', 'ADMIN')")
public class OneToManyController {
    @Autowired
    public ShopRepository shopRepository;
    @Autowired
    public TcRepository tcRepository;

    @GetMapping("/")
    public String Main(Model model){
        Iterable<Shop> shop = shopRepository.findAll();
        model.addAttribute("shop",shop);

        Iterable<Tc> tc = tcRepository.findAll();
        model.addAttribute("tc",tc);

        return "OneToMany/index";
    }

    @PostMapping("/add")
        public String blogPostAdd(@RequestParam String namet, @RequestParam String street, Model model)
    {
        Shop shop = shopRepository.findByStreet(street);
        Tc tc = new Tc(namet, shop);
        tcRepository.save(tc);

        Iterable<Shop> shops = shopRepository.findAll();
        model.addAttribute("shop",shops);

        Iterable<Tc> tcs = tcRepository.findAll();
        model.addAttribute("tc",tcs);
        return "OneToMany/index";
    }
}