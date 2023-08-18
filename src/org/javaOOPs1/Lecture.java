
package org.javaOOPs1;

import java.util.Date;

public class Lecture {
    public static int numberOfStudent = 12;
    String TeacherName;
    int noOfLecture;
    Date batchDate;
    String topic;
    String status;

    public Lecture() {
    }

    public static int getNumberOfStudent() {
        return numberOfStudent;
    }

    public static void setNumberOfStudent(int numberOfStudent) {
        Lecture.numberOfStudent = numberOfStudent;
    }

    public String getTeacherName() {
        return this.TeacherName;
    }

    public void setTeacherName(String teacherName) {
        this.TeacherName = teacherName;
    }

    public int getNoOfLecture() {
        return this.noOfLecture;
    }

    public void setNoOfLecture(int noOfLecture) {
        this.noOfLecture = noOfLecture;
    }

    public Date getBatchDate() {
        return this.batchDate;
    }

    public void setBatchDate(Date batchDate) {
        this.batchDate = batchDate;
    }

    public String getTopic() {
        return this.topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String joinNow() {
        return "joinNow";
    }
}
