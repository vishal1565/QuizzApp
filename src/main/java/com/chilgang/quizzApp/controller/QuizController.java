package com.chilgang.quizzApp.controller;

import com.chilgang.quizzApp.QuizWorkflow.RandomQuestionFetcher;
import com.chilgang.quizzApp.model.QnA;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin
@Slf4j
public class QuizController {
    @Autowired
    RandomQuestionFetcher randomQuestionFetcher;

    @RequestMapping("/fetchQnA")
    public ArrayList<QnA> fetchQnA() {
        ArrayList<QnA>qnAList  = randomQuestionFetcher.getRandomQuesAns();
        log.info(qnAList.toString());
        return qnAList;
    }
}
