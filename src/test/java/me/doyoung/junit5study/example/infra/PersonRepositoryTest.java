package me.doyoung.junit5study.example.infra;

import me.doyoung.junit5study.example.domain.Person;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonRepositoryTest {

    @Autowired
    PersonRepository personRepository;

    @BeforeAll
    static void setUp() {

    }


    @Test
    @DisplayName("Mock test")
    @Commit
    void test() {
        Person person = new Person("doyoung", "kim");

        final Person resultPerson = personRepository.save(person);

        assertAll("save result", () -> {

            assertNotNull(resultPerson, "person not saved");
            assertEquals(resultPerson.getFirstName(), "doyoung", "first name is not doyoung");
            assertEquals(resultPerson.getLastName(), "kim", "last name is not kim");

        });

    }
}
