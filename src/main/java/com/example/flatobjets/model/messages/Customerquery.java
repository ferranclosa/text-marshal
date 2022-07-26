package com.example.flatobjets.model.messages;


import com.example.flatobjets.model.BooleanConvert;
import com.example.flatobjets.model.enums.DatePatterns;
import com.example.flatobjets.model.enums.PadPosition;
import com.example.flatobjets.model.headers.RCIHeader;
import com.google.common.base.Strings;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.example.flatobjets.model.enums.PadPosition.B;
import static com.example.flatobjets.model.enums.PadPosition.E;

public class Customerquery extends RCIHeader {

    private String codeSiren;
    private static Integer csLen = 7;
    private static Character csPad = Character.valueOf(' ');
    private static PadPosition csPos = E;

    private String custName;
    private static Integer cnLen = 100;
    private static Character cnPad = Character.valueOf(' ');
    private static PadPosition cnPos = E;

    private Long custBalance;
    private static Integer cbLen = 18;
    private static Character cbPad = Character.valueOf('0');
    private static PadPosition cbPos = B;

    private LocalDate engagedDate;
    private static DatePatterns edPattern = DatePatterns.Y4MD;

    private Boolean carmCustomer;

    public String getCodeSiren() {
        return codeSiren;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Long getCustBalance() {
        return custBalance;
    }

    public void setCustBalance(Long custBalance) {
        this.custBalance = custBalance;
    }




    public LocalDate getEngagedDate() {
        return engagedDate;
    }


    public Boolean getCarmCustomer() {
        return carmCustomer;
    }

    public String getTextCarmCustomer() {
        return this.carmCustomer ? BooleanConvert.Y.toString() : BooleanConvert.N.toString();
    }

    public String getTextEngagedDate() {
        String patt = null;
        switch (edPattern) {
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

        //SimpleDateFormat sdf = new SimpleDateFormat(patt);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(patt);
        String date = dtf.format(this.engagedDate);
        return date.replace("-", "");
    }

    public void setEngagedDate(LocalDate engagedDate) {
        this.engagedDate = engagedDate;
    }

    public void setCarmCustomer(Boolean carmCustomer) {
        this.carmCustomer = carmCustomer;
    }

    public String getTXTCodeSiren() {
        switch (csPos) {
            case E:
                return Strings.padEnd(this.codeSiren, csLen, csPad);
            case B:
                return Strings.padStart(this.codeSiren, csLen, csPad);
            default:
                return codeSiren;
        }
    }


    public String getTXTCustomerBalance() {
        switch (cbPos) {
            case E:
                return Strings.padEnd(this.custBalance.toString(), cbLen, cbPad);
            case B:
                return Strings.padStart(this.custBalance.toString(), cbLen, cbPad);
            default:
                return this.custBalance.toString();
        }
    }


    public void setCodeSiren(String codeSiren) {
        switch (csPos) {
            case E:
                this.codeSiren = Strings.padEnd(codeSiren, csLen, csPad);
            case B:
                this.codeSiren = Strings.padStart(codeSiren, csLen, csPad);
            default:
                this.codeSiren = codeSiren;
        }
    }

    public String getTXTCustName() {
        switch (cnPos) {
            case E:
                return Strings.padEnd(this.custName, cnLen, cnPad);
            case B:
                return Strings.padStart(this.custName, cnLen, cnPad);
            default:
                return this.custName;
        }
    }

    public void setTXTCustName(String custName) {
        switch (cnPos) {
            case E:
                this.custName = Strings.padEnd(custName, cnLen, cnPad);
            case B:
                this.custName = Strings.padStart(custName, cnLen, cnPad);
            default:
                this.custName = custName;
        }
    }


    @Override
    public String toString() {
        return super.toString() + this.getTXTCodeSiren() + this.getTXTCustName() + this.getTXTCustomerBalance() + this.getTextCarmCustomer() + this.getTextEngagedDate();
    }
}
