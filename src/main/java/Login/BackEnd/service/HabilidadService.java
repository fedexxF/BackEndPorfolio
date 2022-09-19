package Login.BackEnd.service;

import Login.BackEnd.model.Habilidad;
import Login.BackEnd.repository.HabilidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HabilidadService {

    private final HabilidadRepository habilidadRepository;

    @Autowired
    public HabilidadService(HabilidadRepository habilidadRepository) {
        this.habilidadRepository = habilidadRepository;
    }


    public Habilidad addHabilidad (Habilidad habilidad){
        return habilidadRepository.save(habilidad);
    }
    public List<Habilidad> buscarHablidad(){
        return habilidadRepository.findAll();
    }
    public Habilidad editarHabilidad (Habilidad habilidad){
        return habilidadRepository.save(habilidad);
    }
    public void borrarHabilidad (Long id){
        habilidadRepository.deleteById(id);
    }
}

