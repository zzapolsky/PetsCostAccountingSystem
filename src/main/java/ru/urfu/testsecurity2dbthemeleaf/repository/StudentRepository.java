package ru.urfu.testsecurity2dbthemeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.urfu.testsecurity2dbthemeleaf.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
