package com.example.flatobjets.model.headers;

import com.example.flatobjets.model.enums.PadPosition;
import com.google.common.base.Strings;

import static com.example.flatobjets.model.enums.PadPosition.E;

public class RCIHeader {

    private static Integer version = 1;
    private static String header = "RCI";
    private static Integer hLen = 12;
    private static Character hPad = Character.valueOf(' ');
    private static PadPosition hPos = E;

    private String programToCall ;
    private static Integer pLen = 8;
    private static Character pPad = Character.valueOf(' ');
    private static PadPosition pPos = E;

    public RCIHeader() {
    }

    public String getTEXTProgramToCall() {
        switch (pPos) {
            case E:
                return Strings.padEnd(this.programToCall, pLen, pPad);
            case B:
                return Strings.padStart(this.programToCall, pLen, pPad);
            default:
                return programToCall;
        }
    }

    public String getTEXTHeader() {
        switch (pPos) {
            case E:
                return Strings.padEnd(header, hLen, hPad);
            case B:
                return Strings.padStart(header, hLen, hPad);
            default:
                return header;
        }
    }

    public void setProgramToCall(String programToCall) {
        this.programToCall = programToCall;
    }

    @Override
    public String toString() {
        return version.toString() + this.getTEXTHeader() + this.getTEXTProgramToCall();
    }
}
