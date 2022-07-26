package com.example.flatobjets.model.converters;

import com.example.flatobjets.model.enums.PadPosition;
import com.google.common.base.Strings;


public class ToTextFromString {
    private String theString;
    private  Integer theLength ;
    private  Character thePad ;
    private PadPosition thePadPosition ;

    public ToTextFromString(String theString, Integer theLength, Character thePad, PadPosition thePadPosition) {
        this.theString = theString;
        this.theLength = theLength;
        this.thePad = thePad;
        this.thePadPosition = thePadPosition;
    }

    public ToTextFromString(Integer theLength, Character thePad, PadPosition thePadPosition) {
        this.theLength = theLength;
        this.thePad = thePad;
        this.thePadPosition = thePadPosition;
    }

    public ToTextFromString(Integer theLength) {
        this.theLength = theLength;
        this.thePad = Character.valueOf(' ');
        this.thePadPosition = PadPosition.E;

    }

    public ToTextFromString() {

    }

    public ToTextFromString(ToTextFromString codeSiren) {
    }


    public String toText() {
        switch (this.thePadPosition) {
            case E:
                return Strings.padEnd(this.theString, this.theLength, this.thePad);
            case B:
                return Strings.padStart(this.theString, this.theLength, this.thePad);
            default:
                return theString;
        }

    }

    public void setTheString(String theString) {
        this.theString = theString;
    }

    public void setTheLength(Integer theLength) {
        this.theLength = theLength;
    }

    public void setThePad(Character thePad) {
        this.thePad = thePad;
    }

    public void setThePadPosition(PadPosition thePadPosition) {
        this.thePadPosition = thePadPosition;
    }

    public String setTheFormattedText(String theString) {
        switch (thePadPosition) {
            case E:
                return   Strings.padEnd(theString, theLength, thePad);
            case B:
                return   Strings.padStart(theString, theLength, thePad);
            default:
                return theString;
        }
    }
}
