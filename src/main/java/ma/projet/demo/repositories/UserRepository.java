package ma.projet.demo.repositories;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ma.projet.demo.entities.User;
import ma.projet.demo.entities.Ville;
import ma.projet.demo.entities.Zone;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findById(int id);	
	//List<User> findByRoleUser(RoleUser roleUser);
	
	/*Zone findByNomAndVille(int villeId,String zone);*/
//	@Query(value = "select * from Zone where ville_id = :villeId and nom = :zone")
//	Zone findByZoneNameAndVille(@Param("villeId") int villeId,@Param("zone") String zone);
//	
//	@Query(value = "select * from Pharmacie p where p.zone_id = :id", nativeQuery = true)
//	Collection<?> findPharmaciesByZone(@Param("id") int id);
	
}


