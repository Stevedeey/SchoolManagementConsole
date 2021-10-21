package services;

import model.Person;

public interface TeacherService {

    public void applyForCourse(Person teacher);

    public String getRegisteredCourse(Person teacher);

    public void courseContents(Person teacher);
}
