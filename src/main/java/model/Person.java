package model;

import utilities.PersonData;

import javax.naming.NoPermissionException;
import java.util.ArrayList;

public class Person {
    private long id;
    private String fullname;
    private String role;
    private String applicantRole;
    private String address;
    private String gender;
    private String applicantName;
    private int applicantAge;

    public Person(String applicantRole, String applicantName, int applicantAge) {
        this.applicantRole = applicantRole;
        this.applicantName = applicantName;
        this.applicantAge = applicantAge;
    }

    public Person(long id, String fullname, String role, String gender) throws NoPermissionException {
        this.id = id;
        this.fullname = fullname;
        this.role = role;
        this.gender = gender;


        if(!role.equalsIgnoreCase("Principal")){
            ArrayList<Integer> checkId = PersonData.getIds();
            boolean validId = true;

            for (int i = 0; i < checkId.size(); i++) {
                if(id == checkId.get(i)){
                    validId = true;
                    break;
                }

            }
            if(!validId || id ==0){
                throw  new NoPermissionException("Invalid Id");
            }
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getApplicantRole() {
        return applicantRole;
    }

    public void setApplicantRole(String applicantRole) {
        this.applicantRole = applicantRole;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public int getApplicantAge() {
        return applicantAge;
    }

    public void setApplicantAge(int applicantAge) {
        this.applicantAge = applicantAge;
    }
}
