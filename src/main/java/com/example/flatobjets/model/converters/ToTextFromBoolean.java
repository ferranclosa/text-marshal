package com.example.flatobjets.model.converters;

import com.example.flatobjets.model.enums.BooleanPatterns;
import com.google.common.base.Strings;


public class ToTextFromBoolean {
    private Boolean theBoolean;
    private BooleanPatterns thePattern ;

    public ToTextFromBoolean(Boolean theBoolean, BooleanPatterns thePattern) {
        this.theBoolean = theBoolean;
        this.thePattern = thePattern;
    }



    public String toText() {
        String truth = null;
        String lie = null;
        switch (this.thePattern) {
            case Binary:
                truth  = "1";
                lie = "O";
                break;
            case YesNo:
                truth  = "Y";
                lie = "N";
                break;

        }
        return this.theBoolean  ? truth: lie;
    }

    public void setTheBoolean(Boolean theBoolean) {
            this.theBoolean = theBoolean;
    }

    public BooleanPatterns getThePattern() {
        return thePattern;
    }

    public void setThePattern(BooleanPatterns thePattern) {
        this.thePattern = thePattern;
    }
}
