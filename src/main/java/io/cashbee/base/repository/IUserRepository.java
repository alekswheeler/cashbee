package io.cashbee.base.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import io.cashbee.base.domain.User;

public interface IUserRepository extends JpaRepository<User, Long>{

	Optional<User> findByUsername(String username);
}
