package com.example.flatobjets.model.messages;


import com.example.flatobjets.model.descriptors.SupplierqueryDescriptor;

import java.time.LocalDate;

public class Supplierquery extends SupplierqueryDescriptor {

    private  Integer version   ;
    private  String header ;
    private String programToCall ;
    private String codeSiren;
    private String supplierName;
    private Long custBalance;
    private LocalDate lastOrderServed;
    private Boolean carmCustomer;

    public Supplierquery() {

        super();
        setVersion();
        setHeader();
    }

    public void setCodeSiren(String codeSiren) {
        this.codeSiren =  codeSiren;
        super.getCodeSiren().setTheString(codeSiren);
    }

    private void setVersion() {
        this.version = 2;
        super.getVersion().setTheNumber(Long.valueOf(this.version));
    }

    private  void setHeader() {
        this.header = "MQ";
        super.getHeader().setTheString(this.header);
    }

    public void setProgramToCall(String programToCall) {
        this.programToCall = programToCall;
        super.getProgramToCall().setTheString(programToCall);
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        super.getSupplierName().setTheString(supplierName);
    }

    public void setCustBalance(Long custBalance) {
        this.custBalance = custBalance;
        super.getCustBalance().setTheNumber(this.custBalance);
    }

    public void setLastOrderServed(LocalDate lastOrderServed) {
        this.lastOrderServed = lastOrderServed;
        super.getLastOrderServerd().setTheDate(lastOrderServed);
    }

    public void setCarmCustomer(Boolean carmCustomer) {
        this.carmCustomer = carmCustomer;
        super.getCarmCustomer().setTheBoolean(carmCustomer);
    }


    public String marshal() {
        return
                super.getVersion().toText() +
                super.getHeader().toText() +
                super.getProgramToCall().toText() +
                super.getCodeSiren().toText() +
                super.getSupplierName().toText() +
                super.getCustBalance().toText() +
                super.getCarmCustomer().toText() +
                super.getlastOrderServerd().toText();
    }
}
