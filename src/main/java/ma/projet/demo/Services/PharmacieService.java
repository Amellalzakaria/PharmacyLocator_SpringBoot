package ma.projet.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ma.projet.demo.entities.Pharmacie;
import ma.projet.demo.idao.IDao;
import ma.projet.demo.repositories.PharmacieRepository;

public class PharmacieService implements IDao<Pharmacie>{
	
	@Autowired
	PharmacieRepository pharmacieRepository;

	@Override
	public Pharmacie save(Pharmacie o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pharmacie update(Pharmacie o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Pharmacie o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Pharmacie findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pharmacie> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	

}
