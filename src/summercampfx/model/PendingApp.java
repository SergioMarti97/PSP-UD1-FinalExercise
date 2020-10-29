package summercampfx.model;

import java.time.LocalDate;
import java.time.Month;

/**
 * This class is for the student
 *
 * @class PendingApp
 * @author Sergio Martí Torregrosa
 * @date 26/10/2020
 */
public class PendingApp {

    /**
     * The name of the student
     */
    private String name;

    /**
     * Student's surnames
     */
    private String surnames;

    /**
     * Student's birth date
     */
    private LocalDate birthdate;

    /**
     * The course which the student wants to enrol
     */
    private String course;

    /**
     * The month which is going to go the student
     */
    private Month month;

    /**
     * The duration (in weeks) what is going to be the student
     * in the camp
     */
    private int weekDuration;

    /**
     * Constructor full parametrized
     * @param name the name of the student
     * @param surnames the surnames of the student
     * @param birthdate the birth date of the student
     * @param course the course of the student
     * @param month the month which is going to be the student
     * @param weekDuration the time in weeks what the student is going to spent on the camp
     */
    public PendingApp(String name, String surnames, LocalDate birthdate, String course, Month month, int weekDuration) {
        this.name = name;
        this.surnames = surnames;
        this.birthdate = birthdate;
        this.course = course;
        this.month = month;
        this.weekDuration = weekDuration;
    }

    public String getName() {
        return name;
    }

    public String getSurnames() {
        return surnames;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getCourse() {
        return course;
    }

    public Month getMonth() {
        return month;
    }

    public int getWeekDuration() {
        return weekDuration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public void setWeekDuration(int weekDuration) {
        this.weekDuration = weekDuration;
    }

    @Override
    public String toString() {
        return name + " " + surnames + " " + birthdate + " " + course + " " + month + " " + weekDuration;
    }

}
