package org.pubpasim.twitter.repository;

import org.pubpasim.twitter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
