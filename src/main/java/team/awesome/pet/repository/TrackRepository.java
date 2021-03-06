package team.awesome.pet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import team.awesome.pet.model.Track;

/**
 * This is an interface of Track Repository where all the common functions will be inherited from
 * calling Jpa Repository to work with the database. Thus no need for explicit calling those
 * functions here but rather at the Service layer.
 *
 *
 */
public interface TrackRepository extends JpaRepository<Track, Integer> {

  /**
   * This is an extra method to help finding the list of tracks given a petId of where a pet has
   * been
   *
   * @param petId the petId that will be used to find the list of tracks
   * @return list of tracks with the matching petId {@code petId} of where a pet has been
   */
  List<Track> findByPet_PetId(int petId);

}
