package utilities;

import java.util.ArrayList;

public class PersonData {

    private static ArrayList<Integer> ids = new ArrayList<Integer>();
    private static ArrayList<String> teachersDetails = new ArrayList<String>();
    private static ArrayList<String> studentDetails = new ArrayList<String>();
    private static ArrayList<String> nonTeachingStaffs = new ArrayList<String>();


    public static void setIdList(int studentId) {
        ids.add(studentId);
    }

    public static void setTeachersDetails(String teacherData) {
        teachersDetails.add(teacherData);
    }

    public static void setStudentDetails(String studentData) {
       studentDetails.add(studentData);
    }

    public static void setNonTeachingStaffs(String nonTeachingStaffData) {
        nonTeachingStaffs.add(nonTeachingStaffData);
    }

    public static ArrayList<Integer> getIds() {
        return ids;
    }

    public static ArrayList<String> getTeachersDetails() {
        return teachersDetails;
    }

    public static ArrayList<String> getStudentDetails() {
        return studentDetails;
    }

    public static ArrayList<String> getNonTeachingStaffs() {
        return nonTeachingStaffs;
    }
}
