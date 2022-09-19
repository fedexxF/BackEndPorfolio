package Login.BackEnd.service;

import Login.BackEnd.model.Proyectos;
import Login.BackEnd.repository.ProyectosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProyectosService {
    public final ProyectosRepository proyectosRepository;

    @Autowired
    public ProyectosService(ProyectosRepository proyectosRepository) {
        this.proyectosRepository = proyectosRepository;
    }

    public Proyectos addProyectos (Proyectos proyectos){
        return proyectosRepository.save(proyectos);
    }
    public List<Proyectos> buscarProyectos(){
        return proyectosRepository.findAll();
    }
    public Proyectos editarProyectos (Proyectos proyectos){
        return proyectosRepository.save(proyectos);
    }
    public void borrarProyectos (Long id){
        proyectosRepository.deleteById(id);
    }
}

