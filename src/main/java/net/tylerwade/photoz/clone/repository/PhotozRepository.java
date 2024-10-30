package net.tylerwade.photoz.clone.repository;

import net.tylerwade.photoz.clone.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotozRepository extends CrudRepository<Photo, Integer> {

}
