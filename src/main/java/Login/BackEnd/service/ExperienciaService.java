package Login.BackEnd.service;

import Login.BackEnd.model.Educacion;
import Login.BackEnd.model.Experiencia;
import Login.BackEnd.repository.EduacacionRepository;
import Login.BackEnd.repository.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ExperienciaService {

    private final ExperienciaRepository experienciaRepository;

    @Autowired
    public ExperienciaService(ExperienciaRepository experienciaRepository) {
        this.experienciaRepository = experienciaRepository;
    }

    public Experiencia addExperiencia (Experiencia experiencia){
        return experienciaRepository.save(experiencia);
    }
    public List<Experiencia> buscarExperiencia(){
        return experienciaRepository.findAll();
    }
    public Experiencia editarExperiencia (Experiencia experiencia){
        return experienciaRepository.save(experiencia);
    }
    public void borrarExperiencia (Long id){
        experienciaRepository.deleteById(id);
    }
}