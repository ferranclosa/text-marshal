package com.example.flatobjets.model.messages;


import com.example.flatobjets.model.converters.ToStringFromText;
import com.example.flatobjets.model.descriptors.SupplierAnswerDesriptor;
import com.example.flatobjets.model.enums.PadPosition;

import java.time.LocalDate;

public class SupplierAnswer extends SupplierAnswerDesriptor {


    private String version  ;

    private  String  header;
    private String returnStatus ;

    private String operationCode;
    private String productName;
    private Integer productCost;
    private LocalDate productAppearedOn;

    public SupplierAnswer() {
        super();
    }

    public SupplierAnswer(String theText) {
        unmarshal(theText);
    }

    private String getOperationCode() {
        return operationCode;
    }

    private void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }


    public void unmarshal(String theText) {
        this.version = super.getVersion().getTheString(theText);
        this.header = super.getHeader().getTheString(theText);
        this.returnStatus = super.getReturnStatus().getTheString(theText);
        this.productName = super.getWproductName().getTheString(theText);
        this.operationCode = super.getWoperationCode().getTheString(theText);
        this.productCost = Math.toIntExact(super.getWproductCost().getTheNumber(theText));
        this.productAppearedOn = super.getProductAppearedOn().getTheDate(theText);
    }

    @Override
    public String toString() {
        return  "SupplierAnswer{" +

                "version=  '" + version +'\'' +
                ", header=  '" + header +'\'' +
                ", returnCode= '" + returnStatus+'\'' +
                ", operationCode='" + operationCode + '\'' +
                ", productName='" + productName + '\'' +
                ", productCost=" + productCost + '\'' +
                ", appeareance Date=" + productAppearedOn +
                '}';
    }
}
