package six.lab.service;

import java.util.List;

import org.springframework.stereotype.Service;

import response.CustomResponse;
import six.lab.entity.Student;

@Service
public interface StudentService {

    CustomResponse<List<Student>> getAllStudents();

    CustomResponse<Student> saveStudent(Student student);

    CustomResponse<Student> getStudent(int id);

    void deleteStudent(int id);

}
