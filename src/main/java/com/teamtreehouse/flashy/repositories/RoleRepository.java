package com.teamtreehouse.flashy.repositories;

import com.teamtreehouse.flashy.domain.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
}
