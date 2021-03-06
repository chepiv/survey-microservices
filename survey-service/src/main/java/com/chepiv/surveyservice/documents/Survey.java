package com.chepiv.surveyservice.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by chepiv on 26/04/2022.
 * Contact: chepurin.ivan@gmail.com
 * Github:chepiv
 */
@Document
@Data
public class Survey {

    @Id
    private String id;
    private String title;
    private String email;
    private List<Question> questions;

}
