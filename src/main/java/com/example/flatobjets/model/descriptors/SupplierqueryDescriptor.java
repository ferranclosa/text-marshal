package com.example.flatobjets.model.descriptors;


import com.example.flatobjets.model.converters.ToTextFromBoolean;
import com.example.flatobjets.model.converters.ToTextFromDate;
import com.example.flatobjets.model.converters.ToTextFromNumber;
import com.example.flatobjets.model.converters.ToTextFromString;
import com.example.flatobjets.model.enums.BooleanPatterns;
import com.example.flatobjets.model.enums.DatePatterns;
import com.example.flatobjets.model.enums.PadPosition;

import java.time.LocalDate;

import static com.example.flatobjets.model.enums.PadPosition.E;

public abstract class SupplierqueryDescriptor  {

    /*the Header

     */
    private ToTextFromNumber version  = new ToTextFromNumber( 2, Character.valueOf('0'), PadPosition.B);
    private ToTextFromString header = new ToTextFromString( 8, Character.valueOf(' '), E);
    private ToTextFromString programToCall = new ToTextFromString(12) ;


    private static ToTextFromString codeSiren = new ToTextFromString(14 , Character.valueOf(' '), PadPosition.E);
    private static ToTextFromString supplierName = new ToTextFromString(29);
    private static ToTextFromNumber custBalance = new ToTextFromNumber(18);
    private static ToTextFromDate lastOrderServerd = new ToTextFromDate(LocalDate.now(), DatePatterns.Y4MD);
    private static ToTextFromBoolean carmCustomer = new ToTextFromBoolean(false, BooleanPatterns.YesNo);

    public SupplierqueryDescriptor() {
        super();

    }

    public  ToTextFromNumber getVersion() {
        return version;
    }

    public  ToTextFromString getHeader() {
        return header;
    }

    public ToTextFromString getProgramToCall() {
        return programToCall;
    }

    public ToTextFromNumber getCustBalance() {
        return custBalance;
    }

    public ToTextFromString getSupplierName() {
        return supplierName;
    }

    public ToTextFromDate getlastOrderServerd() {
        return lastOrderServerd;
    }

    public void setlastOrderServerd(ToTextFromDate lastOrderServerd) {
        this.lastOrderServerd = lastOrderServerd;
    }

    public void setCarmCustomer(ToTextFromBoolean carmCustomer) {
        this.carmCustomer = carmCustomer;
    }

    public ToTextFromDate getLastOrderServerd() {
        return lastOrderServerd;
    }

    public ToTextFromBoolean getCarmCustomer() {
        return carmCustomer;
    }

    public static ToTextFromString getCodeSiren() {
        return codeSiren;
    }

}
