package com.example.myUIDemo.ModelClass;

import javax.persistence.*;

/**
 * @author Anuj Kumar Vishwakarma(Zeref)
 * @Time 18/03/18 : 9:00 AM
 */

@Entity
@Table(name = "questions")
public class Question {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String questionName;
    private String inputTestCase;
    private String outputTestCase;
    private String info;

    public Question() {

    }

    public Question(Integer id, String questionName, String inputTestCase, String outputTestCase, String info) {
        Id = id;
        this.questionName = questionName;
        this.inputTestCase = inputTestCase;
        this.outputTestCase = outputTestCase;
        this.info = info;
    }

    public Question(String questionName, String inputTestCase, String outputTestCase, String info) {
        this.questionName = questionName;
        this.inputTestCase = inputTestCase;
        this.outputTestCase = outputTestCase;
        this.info = info;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public String getInputTestCase() {
        return inputTestCase;
    }

    public void setInputTestCase(String inputTestCase) {
        this.inputTestCase = inputTestCase;
    }

    public String getOutputTestCase() {
        return outputTestCase;
    }

    public void setOutputTestCase(String outputTestCase) {
        this.outputTestCase = outputTestCase;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
