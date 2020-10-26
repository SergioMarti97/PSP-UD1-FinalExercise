package summercampfx.utils;

import summercampfx.model.Course;
import summercampfx.model.PendingApp;

import java.util.List;

/**
 * This class is needed for save and write the information
 * inside the text files
 *
 * @class FileUtils
 * @author Sergio Martí Torregrosa
 * @date 26/10/2020
 */
public class FileUtils {

    /**
     * This method loads the applications for the summer courses from a given text file
     * @return the applications for the courses
     */
    public static List<PendingApp> loadApps() {
        return null;
    }

    /**
     * This method loads the courses from a text file
     * @return the courses of the summer camp
     */
    public static List<Course> loadCourses() {
        return null;
    }

    /**
     * This method saves the pending applications not processed again in the text file
     * before exiting the program
     */
    public static void saveApps() {

    }

    /**
     * This method saves a new application created in our program
     * @param line the information of the new application
     */
    public static void saveApp(String line) {

    }

    /**
     * This method saves a new course created
     * @param line the information of the new application
     */
    public static void saveCourse(String line) {

    }

    /**
     * This method saves the students assigned to a cabin in the file
     * "./cabins/" + situation + ".txt"
     * @param situation the situation of the cabin
     */
    public static void saveCabin(String situation) {

    }

}
