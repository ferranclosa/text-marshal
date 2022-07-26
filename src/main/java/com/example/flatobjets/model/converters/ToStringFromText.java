package com.example.flatobjets.model.converters;

import com.example.flatobjets.model.enums.PadPosition;
import com.google.common.base.Strings;


public class ToStringFromText {
    private Integer theFrom;
    private Integer theLength;
    private Character thePad;
    private PadPosition thePadPosition;


    public ToStringFromText(Integer theFrom, Integer theLength, Character thePad, PadPosition thePadPosition) {
        this.theFrom = theFrom;
        this.theLength = theLength;
        this.thePad = thePad;
        this.thePadPosition = thePadPosition;
    }

    public ToStringFromText(Integer theFrom, Integer theLength) {
        this.theFrom = theFrom;
        this.theLength = theLength;
        this.thePad = Character.valueOf(' ');
        this.thePadPosition = PadPosition.E;
    }


    public String toString(String theText) {
        Integer endIndex = this.getTheFrom() - 1 + this.getTheLength();
        String result = theText.substring(this.getTheFrom() - 1, endIndex);
        switch (thePadPosition) {
            case E:
                return result.replace(thePad.toString(), "").trim();
            case B:
                return result.replace(thePad.toString(), "").trim();
            default:
                return result.trim();
        }
    }


    public Integer getTheFrom() {
        return theFrom;
    }

    public void setTheFrom(Integer theFrom) {
        this.theFrom = theFrom;
    }

    public Integer getTheLength() {
        return theLength;
    }

    public void setTheLength(Integer theLength) {
        this.theLength = theLength;
    }


    public void setThePad(Character thePad) {
        this.thePad = thePad;
    }

    public PadPosition getThePadPosition() {
        return thePadPosition;
    }

    public void setThePadPosition(PadPosition thePadPosition) {
        this.thePadPosition = thePadPosition;
    }
}
