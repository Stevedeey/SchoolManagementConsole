package services.serviceImplementation;

import enums.Roles;
import model.Person;
import services.PrincipalService;
import utilities.PersonData;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;


public class PrincipalServiceImpl implements PrincipalService {
    @Override
    public int admitApplicant(Person principal, Person applicant) {
        if (principal.getRole().equalsIgnoreCase("Principal")) {
            Roles value;
            Random random = new Random();

            int randomInt = 0;

            try {
                value = Roles.valueOf(applicant.getApplicantRole().toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Enter valid Role:\n e.g NON_TEACHING_STAFF,\n" +
                        "    TEACHER,\n" +
                        "    STUDENT");
                return 0;
            }
            switch (value) {
                case STUDENT:
                    if (applicant.getApplicantAge() >= 7 && applicant.getApplicantAge() <= 25) {
                        randomInt = Math.abs(random.nextInt()) % 680 + 14;
                        PersonData.setIdList(randomInt);
                        System.out.print("Congratulations " + applicant.getApplicantName() + "!!! Your Student id is " +
                                randomInt + "\nLogin with it to accept admission, You can update your name when you login \n");
                    } else {
                        System.out.println("Sorry " + applicant.getApplicantName() + ", we can't proceed with your admission");
                    }
                    break;
                case TEACHER:
                case NON_TEACHING_STAFF:
                    if (applicant.getApplicantAge() >= 24 && applicant.getApplicantAge() <= 65) {
                        randomInt = Math.abs(random.nextInt()) % 680 + 14;
                        PersonData.setIdList(randomInt);
                        System.out.print("Congratulations " + applicant.getApplicantName() + ", Your Staff id is " +
                                randomInt + "\nLogin with it to accept an appointment, You can update your name when you login\n");
                    } else {
                        System.out.println("Sorry " + applicant.getApplicantName() + ", we can't proceed with your appointment");
                    }
                    break;

            }
            return randomInt;
        } else {
            return 0;
        }
    }

    @Override
    public void expelStudent(Person principal, Person student) {
        if(principal.getRole().equalsIgnoreCase("Principal")){
            System.out.println("Announcement!! Announcement!! Announcement!!!");
            System.out.println(student.getFullname()+ "has been expelled");

            var idList = PersonData.getIds();
            boolean isValid = false;

            for (int i = 0; i < idList.size(); i++) {
                if(idList.get(i) == student.getId()){
                    idList.remove(i);
                }
            }

        }
        else {
            System.out.println("You are not privileged to perform this action!!!");

        }
    }

    @Override
    public void expelTeacher(Person principal, Person teacher) {

        if(principal.getRole().equalsIgnoreCase("Principal")){
            System.out.println("Attention Please!!!");
            System.out.println("Termination of appointment!!! \n"+ teacher.getFullname()+"'s " +
                    "appointment has been terminated immediately");

            ArrayList<Integer> listOfIds = PersonData.getIds();
            boolean isValid = false;
            for (int i = 0; i < listOfIds.size(); i++) {
                if(teacher.getId() == listOfIds.get(i)){
                    listOfIds.remove(i);
                }
            }

        }
        else {
            System.out.println("You are not privileged to perform this action!!!");
        }

    }

    @Override
    public void expelNonTeachingStaff(Person principal, Person nonTeacher) {

        if(principal.getRole().equalsIgnoreCase("Principal")){
        System.out.println("Attention Please!!!");
        System.out.println("Termination of appointment!!! \n"+ nonTeacher.getFullname()+"'s " +
                "appointment has been terminated immediately");

        ArrayList<Integer> list = PersonData.getIds();
        boolean isValid = false;
            for (int i = 0; i < list.size(); i++) {
                if(nonTeacher.getId() == list.get(i)){
                    list.remove(i);
                }
            }

        }else {
            System.out.println("You are not privileged to perform this action");
        }



    }
}
