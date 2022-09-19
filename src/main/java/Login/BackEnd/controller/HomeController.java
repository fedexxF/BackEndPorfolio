package Login.BackEnd.controller;

import Login.BackEnd.model.Educacion;
import Login.BackEnd.model.Home;
import Login.BackEnd.service.EducacionService;
import Login.BackEnd.service.HomeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/home")
public class HomeController {


        private final HomeService homeService;

        public HomeController(HomeService homeService) {
            this.homeService = homeService;
        }

        @PutMapping("/update")
        public ResponseEntity<Home> editarHome(@RequestBody Home home) {
            Home updateHome = homeService.editarHome(home);
            return new ResponseEntity<>(updateHome, HttpStatus.OK);
        }

        @GetMapping("/all")
        public ResponseEntity<List<Home>> obtenerHome() {
            List<Home> homes = homeService.buscarHome();
            return new ResponseEntity<>(homes, HttpStatus.OK);
        }

        @PostMapping("/add")
        public ResponseEntity<Home> crearHome(@RequestBody Home home) {
            Home nuevaHome = homeService.addHome(home);
            return new ResponseEntity<>(nuevaHome, HttpStatus.CREATED);
        }

        @DeleteMapping("/delete/{id}")
        public ResponseEntity<?> borrarHome(@PathVariable("id") Long id) {
            homeService.borrarHome(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }




