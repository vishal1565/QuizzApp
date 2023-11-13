package com.chilgang.quizzApp.controller;

import com.chilgang.quizzApp.QuizWorkflow.RandomQuestionFetcher;
import com.chilgang.quizzApp.model.QnA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class QuizController {
    @Autowired
    RandomQuestionFetcher randomQuestionFetcher;

    @RequestMapping("/fetchQnA")
    public ArrayList<QnA> fetchQnA() {
        ArrayList<QnA>qnAList  = randomQuestionFetcher.getRandomQuesAns();
        return qnAList;
    }
}
