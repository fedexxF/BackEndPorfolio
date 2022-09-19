package Login.BackEnd.service;

import Login.BackEnd.model.Footer;
import Login.BackEnd.repository.FooterRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FooterService {
    private final FooterRepository footerRepository;

    public FooterService(FooterRepository footerRepository) {
        this.footerRepository = footerRepository;
    }

    public Footer addFooter (Footer footer){
        return footerRepository.save(footer);
    }
    public List<Footer> buscarFooter(){
        return footerRepository.findAll();
    }
    public Footer editarFooter (Footer footer){
        return footerRepository.save(footer);
    }
    public void borrarFooter (Long id){
        footerRepository.deleteById(id);
    }
}


