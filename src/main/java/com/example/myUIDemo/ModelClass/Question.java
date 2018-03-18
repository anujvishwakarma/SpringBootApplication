package com.example.myUIDemo.ModelClass;

import javax.persistence.*;

/**
 * @author Anuj Kumar Vishwakarma(Zeref)
 * @Time 18/03/18 : 9:00 AM
 */

@Entity
public class Question {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String question;
    private String inputTestCase;
    private String outputTestCase;
    private String info;

    public Question() {

    }

    public Question(Integer id, String question, String inputTestCase, String outputTestCase, String info) {
        Id = id;
        this.question = question;
        this.inputTestCase = inputTestCase;
        this.outputTestCase = outputTestCase;
        this.info = info;
    }

    public Question(String question, String inputTestCase, String outputTestCase, String info) {
        this.question = question;
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

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
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
