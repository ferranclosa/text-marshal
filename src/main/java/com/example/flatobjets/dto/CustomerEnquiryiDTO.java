package com.example.flatobjets.dto;

import com.sun.istack.NotNull;

import java.util.Date;

public class CustomerEnquiryiDTO {
    @NotNull
    private String customerName;
    private String siren;
    private Boolean carmrelated;
    private Long salary;
    private Date enrolmentDate;

    public CustomerEnquiryiDTO() {
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getSiren() {
        return siren;
    }

    public void setSiren(String siren) {
        this.siren = siren;
    }

    public Boolean getCarmrelated() {
        return carmrelated;
    }

    public void setCarmrelated(Boolean carmrelated) {
        this.carmrelated = carmrelated;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Date getEnrolmentDate() {
        return enrolmentDate;
    }

    public void setEnrolmentDate(Date enrolmentDate) {
        this.enrolmentDate = enrolmentDate;
    }
}
