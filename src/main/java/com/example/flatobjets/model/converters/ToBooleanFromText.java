package com.example.flatobjets.model.converters;

import com.example.flatobjets.model.enums.BooleanPatterns;


public class ToBooleanFromText {
    private Integer theFrom;
    private BooleanPatterns theBooleanPattern;


    public ToBooleanFromText(Integer theFrom, BooleanPatterns theBooleanPattern) {
        this.theFrom = theFrom;
    }

    public ToBooleanFromText(Integer theFrom) {
        this.theFrom = theFrom;
        this.theBooleanPattern = BooleanPatterns.YesNo;
    }


    public Boolean getTheBoolean(String theText) {
        Integer endIndex = this.getTheFrom() - 1 + Integer.valueOf(1);
        String result = theText.substring(this.getTheFrom() - 1, endIndex);
        if(result == "1" && this.theBooleanPattern.equals(BooleanPatterns.Binary) ||
        result == "Y" && this.theBooleanPattern.equals(BooleanPatterns.YesNo)){
            return true;
        }
         else
             return false;

    }


    public Integer getTheFrom() {
        return theFrom;
    }

    public void setTheFrom(Integer theFrom) {
        this.theFrom = theFrom;
    }


}
