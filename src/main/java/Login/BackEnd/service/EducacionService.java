package Login.BackEnd.service;


import Login.BackEnd.model.Educacion;
import Login.BackEnd.repository.EduacacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EducacionService {
  private final EduacacionRepository eduacacionRepository;

  @Autowired
    public EducacionService(EduacacionRepository eduacacionRepository) {
        this.eduacacionRepository = eduacacionRepository;
    }
   public Educacion addEducacion (Educacion educacion){
      return eduacacionRepository.save(educacion);
   }
   public List<Educacion> buscarEducacion(){
      return eduacacionRepository.findAll();
   }
   public Educacion editarEducacion (Educacion educacion){
      return eduacacionRepository.save(educacion);
   }
   public void borrarEducacion (Long id){
      eduacacionRepository.deleteById(id);
   }
}
