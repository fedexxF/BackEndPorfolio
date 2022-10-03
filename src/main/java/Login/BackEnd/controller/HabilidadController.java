package Login.BackEnd.controller;

import Login.BackEnd.model.Habilidad;
import Login.BackEnd.service.HabilidadService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/habilidades")
public class HabilidadController {

    private final HabilidadService habilidadService;

    public HabilidadController(HabilidadService habilidadService) {
        this.habilidadService = habilidadService;
    }
    @PostMapping("/update")
    public ResponseEntity<Habilidad> editarHabilidad(@RequestBody Habilidad habilidad){
        Habilidad updateHabilidad=habilidadService.editarHabilidad(habilidad);
        return new ResponseEntity<>(updateHabilidad, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Habilidad>> obtenerHabilidad(){
        List<Habilidad> habilidades = habilidadService.buscarHablidad();
        return new ResponseEntity<>(habilidades, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Habilidad> crearHabilidad(@RequestBody Habilidad habilidad){
        Habilidad nuevaHabilidad = habilidadService.addHabilidad(habilidad);
        return new ResponseEntity<>(nuevaHabilidad, HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarHabilidad(@PathVariable ("id")Long id){
        habilidadService.borrarHabilidad(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

