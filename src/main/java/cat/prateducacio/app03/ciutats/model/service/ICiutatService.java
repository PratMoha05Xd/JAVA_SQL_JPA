package cat.prateducacio.app03.ciutats.model.service;

import java.util.List;

import cat.prateducacio.app03.ciutats.model.domain.Ciutat;

public interface ICiutatService {
	
	Ciutat add(Ciutat ciutat);
	Ciutat update(Ciutat ciutat);
	void delete(int id);
	Ciutat findById(int id);
	List<Ciutat> getAll();

}
