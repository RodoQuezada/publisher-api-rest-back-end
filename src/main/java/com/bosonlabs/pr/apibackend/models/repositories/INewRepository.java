package com.bosonlabs.pr.apibackend.models.repositories;

import com.bosonlabs.pr.apibackend.models.entity.New;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INewRepository extends JpaRepository<New , Long> {


}
