package com.rameez.springbootneo4jexample1.repository;

import com.rameez.springbootneo4jexample1.model.User;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Collection;

public interface UserRepository extends Neo4jRepository<User, Long> {

    @Query("MATCH (u:User)<-[r:USES]-(m:Vehicle) RETURN u,r,m")
    Collection<User> getAllUsers();
}
