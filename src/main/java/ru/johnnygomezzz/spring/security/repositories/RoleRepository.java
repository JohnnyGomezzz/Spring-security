package ru.johnnygomezzz.spring.security.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.johnnygomezzz.spring.security.entities.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
}
