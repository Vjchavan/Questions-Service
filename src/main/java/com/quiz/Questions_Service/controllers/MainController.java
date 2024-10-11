package com.quiz.Questions_Service.controllers;

import com.quiz.Questions_Service.model.Question;
import com.quiz.Questions_Service.services.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class MainController {

    @Autowired
    private QuestionsService questionsService;
    @PostMapping("/post")
    public ResponseEntity<Question> storeQuestion(@RequestBody Question question){
        return new ResponseEntity<>(questionsService.saveQuestion(question), HttpStatus.OK);
    }

    @GetMapping("/getAllQuestions")
    public ResponseEntity<List<Question>> fetchQuestion(){
        return new ResponseEntity<>(questionsService.getQuestion(), HttpStatus.OK);
    }

    @GetMapping("/getTenQuestions")
    public ResponseEntity<List<Question>> fetchTenQuestions(){
        return new ResponseEntity<>(questionsService.getTenQuestions(),HttpStatus.OK);
    }


}
