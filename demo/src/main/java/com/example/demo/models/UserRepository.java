package com.example.demo.models;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	@Override
	@Query("SELECT user.name, user.age FROM User user WHERE user.id = :id")
	Optional<User> findById(@Param("id") Long id);
}
