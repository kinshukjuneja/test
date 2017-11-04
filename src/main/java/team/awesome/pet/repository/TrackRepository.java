package team.awesome.pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import team.awesome.pet.model.Track;

/**
 * This is an interface of Track Repository where all the functions will be inherited from calling
 * Jpa Repository. Thus no need for explicit calling those functions here but rather at the Service
 * layer.
 *
 *
 */
public interface TrackRepository extends JpaRepository<Track, Integer> {

}
