package com.example.ieltsprepuz.ielts.converter;

import com.example.ieltsprepuz.ielts.entity.Essay;
import com.example.ieltsprepuz.ielts.model.EssayDTO;

public class EssayConverter {

    public static Essay fromDTO(EssayDTO essayDTO)
    {
        return new Essay(essayDTO.getTile(), essayDTO.getDescription(), essayDTO.getWordLimit(),
                essayDTO.getDuration(), essayDTO.getEssay());
    }

    public static EssayDTO toDTO(Essay essay)
    {
        return new EssayDTO(essay.getId(), essay.getTitle(), essay.getDescription(), essay.getWordLimit(), essay.getDuration(), essay.getEssay());
    }
}
