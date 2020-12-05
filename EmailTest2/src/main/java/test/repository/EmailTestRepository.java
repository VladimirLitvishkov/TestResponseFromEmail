package test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import test.model.Email;

public interface EmailTestRepository extends JpaRepository<Email, Integer> {

}
