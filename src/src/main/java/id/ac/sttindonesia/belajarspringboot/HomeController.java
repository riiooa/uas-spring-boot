package id.ac.sttindonesia.belajarspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import id.ac.sttindonesia.belajarspringboot.NilaiMatakuliah;

@Controller
public class HomeController
{
  @GetMapping("/")
  public String index(Model model)
  {
    NilaiMatakuliah pendaftaran = new NilaiMatakuliah();

    model.addAttribute("pendaftaran", pendaftaran);
    return "index";
  }  
  @PostMapping("/store")
  public String store(@ModelAttribute("pendaftaran") NilaiMatakuliah pendaftaran)
  {
    System.out.println(pendaftaran.toString());
    return "pendaftaran_process";
  }
}