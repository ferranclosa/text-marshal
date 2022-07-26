package com.example.flatobjets.model.converters;

import com.example.flatobjets.model.enums.DatePatterns;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class ToTextFromDate {
    private LocalDate theDate;
    private DatePatterns thePattern ;

    public ToTextFromDate(LocalDate theDate, DatePatterns thePattern) {
        this.theDate = theDate;
        this.thePattern = thePattern;
    }



    public String getTheFormattedDate() {
        String patt = null;
        switch (thePattern) {
            case Y4MD:
                patt = "yyyy-MM-dd";
                break;
            case Y2MD:
                patt = "yy-MM-dd";
                break;
            case DMY4:
                patt = "dd-MM-yyyy";
            case DMY2:
                patt = "dd-MM-yy";
                break;
            case MDY2:
                patt = "MM-dd-yy";
                break;
            case MDY4:
                patt = "MM-dd-yyyy";
        }
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(patt);
        String date = dtf.format(this.theDate);
        return date.replace("-", "");
    }

    public void setTheString(LocalDate theDate) {
        this.theDate = theDate;
    }

    public LocalDate getTheDate() {
        return theDate;
    }

    public void setTheDate(LocalDate theDate) {
        this.theDate = theDate;
    }

    public DatePatterns getThePattern() {
        return thePattern;
    }

    public void setThePattern(DatePatterns thePattern) {
        this.thePattern = thePattern;
    }
}
