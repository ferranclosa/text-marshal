package com.example.flatobjets.model.converters;


import com.example.flatobjets.model.enums.DatePatterns;

import java.time.LocalDate;
import java.util.InvalidPropertiesFormatException;


public class ToDateFromText {
    private Integer theFrom;
    private DatePatterns theDatePattern;


    public ToDateFromText(Integer theFrom, DatePatterns theDatePattern) {

        this.theFrom = theFrom;
        this.theDatePattern = theDatePattern;
    }

    public ToDateFromText(Integer theFrom) {
        this.theFrom = theFrom;
        this.theDatePattern = DatePatterns.Y4MD;
    }


    public LocalDate toLocalDate(String theText)  {
        Integer day =null;
                Integer month = null;
        Integer year = null;
        Integer lastChar = 0;
        switch (this.theDatePattern){
            case Y4MD:
            case MDY4:
            case DMY4:
                lastChar = 8;
                break;
            case Y2MD:
            case DMY2:
            case MDY2:
                lastChar = 6;
                break;
        }
        Integer endIndex = this.getTheFrom() - 1 + Integer.valueOf(lastChar);
        String result = theText.substring(this.getTheFrom() - 1, endIndex);
        switch (this.theDatePattern){
            case Y4MD:
                year = Integer.valueOf(result.substring(0, 4));
                month = Integer.valueOf(result.substring(4, 6));
                day = Integer.valueOf(result.substring(6));
                break;
            case DMY4:
                year = Integer.valueOf(result.substring(4));
                month = Integer.valueOf(result.substring(2, 4));
                day = Integer.valueOf(result.substring(0, 2));
                break;
            case MDY4:
                year = Integer.valueOf(result.substring(4));
                month = Integer.valueOf(result.substring(0, 2));
                day = Integer.valueOf(result.substring(2, 4));
                break;
            case Y2MD:
                year = Integer.valueOf(result.substring(0, 2));
                month = Integer.valueOf(result.substring(2, 4));
                day = Integer.valueOf(result.substring(4));
                break;
            case MDY2:
                year = Integer.valueOf(result.substring(4));
                month = Integer.valueOf(result.substring(0, 2));
                day = Integer.valueOf(result.substring(2, 4));
                break;
        }
        return LocalDate.of(year, month, day);

    }


    public Integer getTheFrom() {
        return theFrom;
    }

    public void setTheFrom(Integer theFrom) {
        this.theFrom = theFrom;
    }


}
