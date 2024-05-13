package cat.prateducacio.app03.ciutats.model.reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cat.prateducacio.app03.ciutats.model.domain.Ciutat;

@Repository
public interface CiutatRepository extends JpaRepository<Ciutat, Integer> {

}
