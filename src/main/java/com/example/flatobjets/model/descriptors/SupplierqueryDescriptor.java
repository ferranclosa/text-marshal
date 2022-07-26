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

/**
 * This is the decriptor for the message SupplierQuery? SupplierQuery is of the type 'ToText'
 * meaning that from the object we will create the TEXT message, applying certain rules like
 * length, padding, patterns, formatting etc.
 *
 * Note that each data type has helper classes (ToTextFrom***) that will have the
 * detaills needed when marshaling/unmarshaling, like string lenght , position,  pattern etc
 *
 * After eac declaration, we create the instance with the definition, containing the required
 * parameters that will define the variable. Note that there are quite a few contructors available. The fewer parameters
 * used for initialisation, the more of the values are defaulted: For instance most Strings will be Left-aligned with
 * padding  (defaulted to space) on the right of the String. These defaults are the most common use case, but
 * they can be overriden.
 *
 * Similarly for most Numeric values, where a default is to have the number filled with 0 on the left of the NUmber. And so on.
 *
 * Once all fields have been defined, we need to ONLY create the Getters. Only the Getters. To get access to the methods a
 * associated with the 'type'
 */
public abstract class SupplierqueryDescriptor  {

    /*the Header

     */
    private ToTextFromNumber version  = new ToTextFromNumber( 2, Character.valueOf('0'), PadPosition.B);
    private ToTextFromString header = new ToTextFromString( 8, Character.valueOf(' '), E);
    private ToTextFromString programToCall = new ToTextFromString(12) ;


    private static ToTextFromString codeSiren = new ToTextFromString(14 , Character.valueOf(' '), PadPosition.E);
    private static ToTextFromString supplierName = new ToTextFromString(29);
    private static ToTextFromNumber custBalance = new ToTextFromNumber(18);
    private static ToTextFromDate lastOrderServed = new ToTextFromDate(LocalDate.now(), DatePatterns.Y4MD);
    private static ToTextFromBoolean carmCustomer = new ToTextFromBoolean(false, BooleanPatterns.YesNo);

    public SupplierqueryDescriptor() {
       }

    public  ToTextFromNumber getVersion() {
        return version;
    }

    public ToTextFromString getHeader() {
        return header;
    }

    public ToTextFromDate getLastOrderServed() {
        return lastOrderServed;
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

    public ToTextFromBoolean getCarmCustomer() {
        return carmCustomer;
    }

    public static ToTextFromString getCodeSiren() {
        return codeSiren;
    }

}
