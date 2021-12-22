package com.manifestcorp.onsrestservice.repositories;

import com.manifestcorp.onsrestservice.models.OnsRestModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnsRestRepo extends CrudRepository<OnsRestModel, String> {

}
