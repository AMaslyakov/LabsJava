package six.lab.service;

import java.util.List;

import org.springframework.stereotype.Service;

import six.lab.entity.Student;

@Service
public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);

}
