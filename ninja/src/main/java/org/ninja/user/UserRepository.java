package org.ninja.user;

import org.ninja.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
//    @Query("SELECT u FROM User u WHERE u.email = ?1")
//    public User findByEmail(String email);

    Optional<User> findByEmail(String email);
}