package team.awesome.pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import team.awesome.pet.model.Shelter;

/**
 * This is an interface of Shelter Repository where all the common functions will be inherited from
 * calling Jpa Repository to work with the database. Thus no need for explicit calling those
 * functions here but rather at the Service layer.
 *
 *
 */
public interface ShelterRepository extends JpaRepository<Shelter, Integer> {

}
