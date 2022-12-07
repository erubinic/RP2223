package hr.unipu.rpii.backendfinally.providers.impl;

import hr.unipu.rpii.backendfinally.model.student.Student;
import hr.unipu.rpii.backendfinally.repo.student.StudentRepository;
import hr.unipu.rpii.backendfinally.providers.StudentProvider;
import org.springframework.stereotype.Service;

@Service
public class StudentProviderImpl implements StudentProvider {
    private final StudentRepository studentRepository;

    public StudentProviderImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student getById(int id) {
        return studentRepository.findById(id).orElse(new Student());
    }

    @Override
    public Student getByJmbag(String jmbag) {
        return studentRepository.findByJmbag(jmbag).orElse(null);
    }
}
