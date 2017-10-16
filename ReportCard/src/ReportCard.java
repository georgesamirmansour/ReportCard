
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gogos
 */
public class ReportCard {
    
    private ArrayList<String> data;
    private char grade;
    private int gradeScore;
    private String nameOfStudent;
    private char historyGrade;

    public ReportCard(ArrayList<String> data, char grade, int gradeScore, String nameOfStudent, char historyGrade) {
        this.data = data;
        this.grade = grade;
        this.gradeScore = gradeScore;
        this.nameOfStudent = nameOfStudent;
        this.historyGrade = historyGrade;
    }

    public ArrayList<String> getData() {
        return data;
    }

    public char getGrade() {
        return grade;
    }

    public int getGradeScore() {
        return gradeScore;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public char getHistoryGrade() {
        return historyGrade;
    }

    public void setData(ArrayList<String> data) {
        this.data = data;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void setGradeScore(int gradeScore) {
        this.gradeScore = gradeScore;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public void setHistoryGrade(char historyGrade) {
        this.historyGrade = historyGrade;
    }

    @Override
    public String toString() {
        return "ReportCard{"
                + "data=" + data + ""
                + ", grade=" + grade + ""
                + ", gradeScore=" + gradeScore + ""
                + ", nameOfStudent=" + nameOfStudent + ""
                + ", historyGrade="
                + historyGrade + '}';
    }

}





