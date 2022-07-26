package com.example.flatobjets.model.messages;


import com.example.flatobjets.model.descriptors.SupplierAnswerDesriptor;

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
        this.version = super.getVersion().toString(theText);
        this.header = super.getHeader().toString(theText);
        this.returnStatus = super.getReturnStatus().toString(theText);
        this.productName = super.getWproductName().toString(theText);
        this.operationCode = super.getWoperationCode().toString(theText);
        this.productCost = Math.toIntExact(super.getWproductCost().toNumber(theText));
        this.productAppearedOn = super.getProductAppearedOn().toLocalDate(theText);
    }

    @Override
    public String toString() {
        return  "SupplierAnswer{" +

                " version=  '" + version +'\'' +
                ", header=  '" + header +'\'' +
                ", returnCode= '" + returnStatus+'\'' +
                ", operationCode= '" + operationCode + '\'' +
                ", productName= '" + productName + '\'' +
                ", productCost= '" + productCost + '\'' +
                ", appeareance Date= '" + productAppearedOn + '\'' +
                '}';
    }
}
