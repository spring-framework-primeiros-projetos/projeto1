package natan.io.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import natan.io.projeto1.entity.User;

public interface Userrepository extends JpaRepository<User, Long> {

}
