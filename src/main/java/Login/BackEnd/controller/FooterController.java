package Login.BackEnd.controller;

import Login.BackEnd.model.Footer;
import Login.BackEnd.service.FooterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/footer")
public class FooterController {
    private  final FooterService footerService;

    public FooterController(FooterService footerService) {
        this.footerService = footerService;
    }

    @PostMapping("/update")
    public ResponseEntity<Footer> editarFooter(@RequestBody Footer footer){
        Footer updateFooter=footerService.editarFooter(footer);
        return new ResponseEntity<>(updateFooter, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Footer>> obtenerFooter(){
        List<Footer> Footers = footerService.buscarFooter();
        return new ResponseEntity<>(Footers, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Footer> crearFooter(@RequestBody Footer footer){
        Footer nuevaFooter = footerService.addFooter(footer);
        return new ResponseEntity<>(nuevaFooter, HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarFooter(@PathVariable ("id")Long id){
        footerService.borrarFooter(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
