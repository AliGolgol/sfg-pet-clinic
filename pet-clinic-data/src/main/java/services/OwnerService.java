package services;

import Model.sfgpetclinic.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnerService extends CrudRepository<Owner,Long> {
    Owner findByLastName(String lastName);
    List<Owner> findAllByLastNameLike(String lastName);
}
