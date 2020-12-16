package me.doyoung.junit5study.example.application;
import lombok.RequiredArgsConstructor;
import me.doyoung.junit5study.example.domain.Person;
import me.doyoung.junit5study.example.infra.PersonRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public Person findById(Long id){
        return personRepository.findById(id).orElseThrow(IllegalAccessError::new);
    }


}
