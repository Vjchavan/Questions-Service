package com.quiz.Questions_Service.repo;

import com.quiz.Questions_Service.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepo extends JpaRepository<Question,Integer> {
    @Query(value = "Select * from questions order by rand() limit 10",nativeQuery = true)
    public List<Question> getTenRandomQuestionsFromRepo();
}
