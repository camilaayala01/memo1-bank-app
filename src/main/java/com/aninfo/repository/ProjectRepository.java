package com.aninfo.repository;

import com.aninfo.model.Account;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProjectRepository extends CrudRepository<Project, Long> {

    Optional<Project> findProjectByName(String name);

    @Override
    List<Account> findAll();

}
