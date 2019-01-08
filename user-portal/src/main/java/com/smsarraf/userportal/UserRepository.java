package com.smsarraf.userportal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    void delete(User user);

    List<User> findAll();

    User save(User user);
}
