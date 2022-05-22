package com.chepiv.answerservice.repository;

import com.chepiv.answerservice.documents.Answer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by chepiv on 27/04/2022.
 * Contact: chepurin.ivan@gmail.com
 * Github:chepiv
 */
@RepositoryRestResource(collectionResourceRel = "answer", path = "answer")
public interface AnswerRepository extends MongoRepository<Answer, String> {
    @Query(value = "{'survey.title': ?0}")
    List<Answer> findAllBySurveyTitle(String title);

    List<Answer> findAllBySurveyId(@Param("surveyId") String surveyId);
}
