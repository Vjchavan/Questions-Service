package com.quiz.Questions_Service.services;

import com.quiz.Questions_Service.model.Question;
import com.quiz.Questions_Service.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionsService {

    @Autowired
    private QuestionRepo questionRepo;

    public Question saveQuestion(Question question){
        questionRepo.save(question);
        return question;
    }

    public List<Question> getQuestion() {
        return questionRepo.findAll();
    }

    public List<Question> getTenQuestions() {
        return questionRepo.getTenRandomQuestionsFromRepo();
    }
}
