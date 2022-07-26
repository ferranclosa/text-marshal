package com.example.flatobjets.model.descriptors;


import com.example.flatobjets.model.converters.ToDateFromText;
import com.example.flatobjets.model.converters.ToNumberFromText;
import com.example.flatobjets.model.converters.ToStringFromText;
import com.example.flatobjets.model.enums.DatePatterns;
import com.example.flatobjets.model.enums.PadPosition;

public abstract class SupplierAnswerDesriptor  {
    private  ToStringFromText version  = new ToStringFromText(1, 2, Character.valueOf('0'), PadPosition.B);

    private  ToStringFromText header = new ToStringFromText(3, 8);

    private ToStringFromText returnStatus = new ToStringFromText(11, 3 );


    private ToStringFromText woperationCode = new ToStringFromText(14, 12);
    private ToStringFromText wproductName = new ToStringFromText(27, 100);
    private ToNumberFromText wproductCost = new ToNumberFromText(127, 8, Character.valueOf('0'), PadPosition.B);
    private ToDateFromText productAppearedOn = new ToDateFromText(135, DatePatterns.Y4MD);

    public SupplierAnswerDesriptor() {
        super();

    }

    public ToStringFromText getVersion() {
        return version;
    }

    public ToStringFromText getHeader() {
        return header;
    }

    public ToStringFromText getReturnStatus() {
        return returnStatus;
    }

    public ToStringFromText getWoperationCode() {
        return woperationCode;
    }

    public void setWoperationCode(ToStringFromText woperationCode) {
        this.woperationCode = woperationCode;
    }

    public ToStringFromText getWproductName() {
        return wproductName;
    }

    public void setWproductName(ToStringFromText wproductName) {
        this.wproductName = wproductName;
    }


    public ToNumberFromText getWproductCost() {
        return wproductCost;
    }

    public void setWproductCost(ToNumberFromText wproductCost) {
        this.wproductCost = wproductCost;
    }

    public ToDateFromText getProductAppearedOn() {
        return productAppearedOn;
    }
}
