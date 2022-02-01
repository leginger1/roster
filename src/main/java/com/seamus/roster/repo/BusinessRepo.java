package com.seamus.roster.repo;

import com.seamus.roster.data.Business;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessRepo extends CrudRepository<Business, Long> {
}
