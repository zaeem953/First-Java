package org.example.jpa.dao;

import org.example.jpa.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Integer> {

    @Query(value = "select * from user", nativeQuery = true)
    public List<User> getAllUser();

    @Query(value = "select * from user where city=:city AND status=:status", nativeQuery = true)
    public List<User> getByCity(@Param("city") String city,@Param("status") String status);
}
