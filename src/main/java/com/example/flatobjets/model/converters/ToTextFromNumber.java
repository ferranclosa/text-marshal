package com.example.flatobjets.model.converters;

import com.example.flatobjets.model.enums.PadPosition;
import com.google.common.base.Strings;


public class ToTextFromNumber {
    private Long theNumber;
    private  Integer theLength ;
    private  Character thePad ;
    private PadPosition thePadPosition ;

    public ToTextFromNumber(Long theNumber, Integer theLength, Character thePad, PadPosition thePadPosition) {
        this.theNumber = theNumber;
        this.theLength = theLength;
        this.thePad = thePad;
        this.thePadPosition = thePadPosition;
    }

    public ToTextFromNumber(Integer theLength, Character thePad, PadPosition thePadPosition) {
        this.theLength = theLength;
        this.thePad = thePad;
        this.thePadPosition = thePadPosition;
    }


    public ToTextFromNumber(Integer theLength) {
        this.theLength = theLength;
        this.thePad = Character.valueOf('0');
        this.thePadPosition = PadPosition.B;
    }


    public String toText() {
        switch (this.thePadPosition) {
            case E:
                return Strings.padEnd(this.theNumber.toString(), this.theLength, this.thePad);
            case B:
                return Strings.padStart(this.theNumber.toString(), this.theLength, this.thePad);
            default:
                return theNumber.toString();
        }

    }
    public void setTheNumber(Long theNumber) {
        this.theNumber = theNumber;
    }


    public void setTheString(Long theNumber) {
        this.theNumber = theNumber;
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


}
