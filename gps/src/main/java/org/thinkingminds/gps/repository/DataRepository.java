package org.thinkingminds.gps.repository;

import org.springframework.data.repository.CrudRepository;
import org.thinkingminds.gps.domain.Data;

public interface DataRepository extends CrudRepository<Data, Integer> {
	
}
