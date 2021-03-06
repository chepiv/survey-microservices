package com.chepiv.surveyservice.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by chepiv on 26/04/2022.
 * Contact: chepurin.ivan@gmail.com
 * Github:chepiv
 */

@Data
public class Question {
    @Id
    private String id;
    private String name;
    private String type;
    private List<Option> options;

}
