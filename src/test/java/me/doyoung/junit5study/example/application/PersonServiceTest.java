package me.doyoung.junit5study.example.application;

import me.doyoung.junit5study.example.domain.Person;
import me.doyoung.junit5study.example.infra.PersonRepository;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(MockitoExtension.class)
class PersonServiceTest {

    @Mock
    PersonRepository personRepository;

    PersonService personService;

    @BeforeEach
    void setup() {
        this.personService = new PersonService(personRepository);
    }


    @Order(1)
    @Test
    @DisplayName("mock test")
    void mock_test() {

        Optional<Person> person = Optional.of(Person.builder().firstName("doyoung").lastName("kim").build());

        when(personRepository.findById(anyLong())).thenReturn(person);
        assertEquals(personService.findById(1L).getLastName(), "kim");

    }

    @Order(2)
    @Test
    @DisplayName("stubbing verify 테스트")
    void verify_stub_test() {

        // given
        Optional<Person> person = Optional.of(Person.builder().firstName("doyoung").lastName("kim").build());

        // when
        when(personRepository.findById(anyLong())).thenReturn(person);
        assertEquals(personService.findById(1L).getLastName(), "kim");


        // then

        // 목 객체의 findById 가 한번 실행되었는지 검증
        verify(personRepository, times(1)).findById(1L);

        // findAll 이 한번도 실행하지 않았는지 검증
        verify(personRepository, never()).findAll();

        // 해당 Mock 이 더 이상 interactional 발생되지 않아야 한다.
        verifyNoMoreInteractions(personRepository);

    }


    @Test
    @DisplayName("BDD 테스트")
    void bdd() {
        // given
        Optional<Person> person = Optional.of(Person.builder().id(1L).firstName("doyoung").lastName("kim").build());
        given(personRepository.findById(1L)).willReturn(person);

        // when
        Person selectPerson = personService.findById(1L);

        // then
        assertEquals(person.get(), selectPerson);

    }

}
