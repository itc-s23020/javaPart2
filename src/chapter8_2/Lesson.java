package chapter8_2;

import java.sql.Struct;

public class Lesson {
    private

    String lessonId;
    String lessonName;
    public Lesson(String lessonId, String lessonName) {
        lessonId = lessonId;
        lessonName= lessonName;
    }
    public int Fee(){
        return 1000;
    }

    public String getLessonId() {
        return lessonId;
    }

    public String getLessonName() {
        return lessonName;
    }
}
