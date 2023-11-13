package com.chilgang.quizzApp.QuizWorkflow;

import com.chilgang.quizzApp.model.QnA;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class RandomQuestionFetcher {

    public ArrayList<QnA> getRandomQuesAns() {
        ArrayList<QnA> qnAList = new ArrayList<>();
        QnA qnA = new QnA();
        qnA.setQuestion("Whats your age ?");
        qnA.setAnswer("69");
        qnA.setOption1("1");
        qnA.setOption2("2");
        qnA.setOption3("69");
        qnA.setOption4("4");
        qnAList.add(qnA);
        return qnAList;
    }

}
