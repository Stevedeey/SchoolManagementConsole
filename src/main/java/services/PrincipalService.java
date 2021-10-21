package services;

import model.Person;

public interface PrincipalService {
    int admitApplicant(Person principal, Person applicant);

    void expelStudent(Person principal, Person student);

    void expelTeacher(Person principal, Person teacher);

    void expelNonTeachingStaff(Person principal, Person nonTeacher);

}
