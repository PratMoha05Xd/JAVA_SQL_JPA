package cat.prateducacio.app03.ciutats.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.prateducacio.app03.ciutats.model.domain.Ciutat;
import cat.prateducacio.app03.ciutats.model.reposiroty.CiutatRepository;

@Service
public class CiutatServiceImpl implements ICiutatService {

	@Autowired
	CiutatRepository ciutatRepository;

	@Override
	public Ciutat add(Ciutat ciutat) {
		return ciutatRepository.save(ciutat);
	}

	@Override
	public Ciutat update(Ciutat ciutat) {
		return ciutatRepository.save(ciutat);
	}

	@Override
	public void delete(int id) {
		ciutatRepository.deleteById(id);

	}

	@Override
	public Ciutat findById(int id) {

		Ciutat ciutat = null;

		Optional<Ciutat> ciutatOptional = ciutatRepository.findById(id);
		if (ciutatOptional.isPresent()) {
			ciutat = ciutatOptional.get();
		}

		return ciutat;
	}

	@Override
	public List<Ciutat> getAll() {
		return ciutatRepository.findAll();
	}

}
