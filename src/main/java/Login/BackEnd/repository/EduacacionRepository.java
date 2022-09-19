package Login.BackEnd.repository;

import Login.BackEnd.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EduacacionRepository extends JpaRepository<Educacion,Long> {
}
