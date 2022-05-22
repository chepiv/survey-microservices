package com.chepiv.answerservice.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by chepiv on 27/04/2022.
 * Contact: chepurin.ivan@gmail.com
 * Github:chepiv
 */

@Document
@Data
public class Answer {

    @Id
    private String id;
    private String surveyId;
    private String name;
    private String lastName;
    private String email;
    private List<AnswerEntry> entries;
}
