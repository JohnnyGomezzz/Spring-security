package ru.johnnygomezzz.spring.security.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.johnnygomezzz.spring.security.entities.Permission;

@Repository
public interface PermissionRepository extends CrudRepository<Permission, Long> {
}
