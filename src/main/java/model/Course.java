package model;

import java.util.ArrayList;

public class Course {

    private static ArrayList<String> mathematics;
    private static ArrayList<String> english;
    private static ArrayList<String> geography;
    private static ArrayList<String> biology;
    private static ArrayList<String> physics;
    private static ArrayList<String> chemistry;
    private static ArrayList<String> agriculture;
    private static String endCourse = "End of the course. See you next time!!!";

    public Course() {
        this.mathematics = null;
        this.english = null;
        this.geography = null;
        this.biology = null;
        this.physics =null;
        this.chemistry = null;
        this.agriculture = null;
    }

    public static void setMathematics() {
        String lessonOne =  "Course Topic: Set Theory\n"+
                "Set Theory is the mathematical theory of well \ndetermined Collection of objects "+
                "that are called members or \nelements of te set. e.g set A = { 2, 3, 4 }"+"\n\t\t"+endCourse;

        String lessonTwo = "Course Topic: Equations\n"+
                "Equation is the mathematical statement containing \nof equal symbol between two algebraic expression "+
                "that has same value. e.g 5x + 9 = 24"+"\n\t\t"+endCourse;

        String lessonThree = "Course Topic: Arithmetic\n"+
                "Arithmetic is a branch of mathematics that deals \n"+
                "with the study of numbers and vary operations on them"+"\n\t\t"+endCourse;

        mathematics = new ArrayList<>();

        mathematics.add(lessonOne);
        mathematics.add(lessonTwo);
        mathematics.add(lessonThree);
    }

    public static void setEnglish() {
        String lessonOne = "Course Topic: Noun\n"+
                "A Noun is a name of person, animal, place or things. \n"+
                "e.g name of person can be Kola, John, Bright e.t.c, name of animal will be Lion, Tiger, Cat e.t.c"
                +"\n\t\t"+endCourse;
        String lessonTwo = "Course Topic: Verb\n"+
                "Verb are action words e.g play, jump, dance e.t.c"+"\n\t\t"+endCourse;
        String lessonThree = "Course Topic: Adjectives\n"+
                "Adjective is a part of speech that qualifies a noun \n"+"\n\t\t"+endCourse;

        english = new ArrayList<String>();

        english.add(lessonOne);
        english.add(lessonTwo);
        english.add(lessonThree);
    }

    public static void setGeography() {

        String lessonOne = "Course Topic: Volcanic Eruption\n"+
                "Volcanic eruptions happens when lava and gas\n"+
                "are discharged from volcanic vent"
                +"\n\t\t"+endCourse;
        String lessonTwo = "Course Topic: Mountains\n"+
                "A large natural elevation of the earth's surface\n"+
                "rising abruptly from th surrounding level. e.gA large steep hill"+"\n\t\t"+endCourse;
        String lessonThree = "Course Topic: Cave\n"+
                "An underground hollow with access from the ground surface,\n"+
                "or from the see, often found in limestone areas and rocky coastlines \n"+"\n\t\t"+endCourse;

        geography = new ArrayList<String>();

        geography.add(lessonOne);
        geography.add(lessonTwo);
        geography.add(lessonThree);
    }

    public static void setBiology() {

        String lessonOne = "Course Topic: Micro Organisms\n"+
                "They are organisms that are microscopic, which means people cannot see them\n"+
                "with naked eyes.e.g bacteria, fungi, archaea and viruses"
                +"\n\t\t"+endCourse;
        String LessonTwo = "Course Topic: Nutrition\n"+
                "Nutrition is the study of nutrients in food, how the body\n"
                +"uses them and the relationship between diet, health and diseases"+"\n\t\t"+endCourse;
        String LessonThree = "Course Topic: Reproduction\n"+
                "This is the biological process by which new individual\n"
                +"organisms(\"offspring\") are produced from their parent"+"\n\t\t"+endCourse;

        biology = new ArrayList<String>();

        biology.add(lessonOne);
        biology.add(LessonTwo);
        biology.add(LessonThree);
    }

    public static void setPhysics() {
        String lessonOne = "Course Topic: Motion\n"+
                "Motion is the change with time of the position or orientation of a body\n"+
                "The types of Motions are: \n"+
                "\t1. Translational Motion\n\t2. Oscillatory Motion\n\t3. Random Motion\n\t4. Linear Motion\n"+
                "Read up on their meanings"+
                "\n\t\t"+endCourse;
        String lessonTwo = "Course Topic: Newton's First Laws\n"+
                "Newton's First Law states that every object will continue in a state\n"+
                "of rest or of uniform motion unless being compelled by an external force" +
                "\n\t\t"+endCourse;
        String lessonThree = "Course Topic: Newton's Third Law\n"+
                "Newton's Third Law states that for every action there is an equal and opposite reaction\n"+
                "or from the see, often found in limestone areas and rocky coastlines \n"+"\n\t\t"+endCourse;

        physics = new ArrayList<String>();

        physics.add(lessonOne);
        physics.add(lessonTwo);
        physics.add(lessonThree);
    }

    public static void setChemistry() {
        String lessonOne = "Course Topic: Periodic Table\n"+
                "A table of chemical elements arranged in order of atomic number.\n"+
                "So element with the same atomic structure appear in vertical role."
                +"\n\t\t"+endCourse;
        String lessonTwo = "Course Topic: Chemical Reaction\n"+
                "A chemical reaction is a process in which one or more substances, \n"
                +"also called reactant are converted to one or more substances known as product."+
                "An irreversible change in state of a matter"+
                "\n\t\t"+endCourse;
        String LessonThree = "Course Topic: Physical Reaction\n"+
                "A physical reaction is a reversible change in state of a matter. e.g freezing of water to ice\n"
                +"organisms(\"offspring\") are produced from their parent"+"\n\t\t"+endCourse;

        chemistry = new ArrayList<String>();

        chemistry.add(lessonOne);
        chemistry.add(lessonTwo);
        chemistry.add(LessonThree);

    }

    public static ArrayList<String> getMathematics() {
        return mathematics;
    }

    public static ArrayList<String> getEnglish() {
        return english;
    }

    public static ArrayList<String> getGeography() {
        return geography;
    }

    public static ArrayList<String> getBiology() {
        return biology;
    }

    public static ArrayList<String> getPhysics() {
        return physics;
    }

    public static ArrayList<String> getChemistry() {
        return chemistry;
    }

    public static ArrayList<String> getAgriculture() {
        return agriculture;
    }

    public static String getEndCourse() {
        return endCourse;
    }

    public static ArrayList<String> setAgriculture(){
        return agriculture;
    }

}


