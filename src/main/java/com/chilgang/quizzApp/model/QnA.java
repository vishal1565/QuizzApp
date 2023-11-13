package com.chilgang.quizzApp.model;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class QnA implements Serializable {
    @Serial
    private static final long serialVersionUID = 987654321L;

    private String question;
    private String answer;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
}
