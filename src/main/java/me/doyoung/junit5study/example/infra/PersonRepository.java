package me.doyoung.junit5study.example.infra;

import me.doyoung.junit5study.example.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
