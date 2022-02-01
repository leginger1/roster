package com.seamus.roster.repo;

import com.seamus.roster.data.Shift;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShiftRepo extends CrudRepository<Shift, Long> {
}
