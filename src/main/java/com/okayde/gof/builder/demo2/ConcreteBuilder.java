package com.okayde.gof.builder.demo2;

public class ConcreteBuilder {
    private String contractId;
    private String personName;
    private String companyName;
    private long beginDate;
    private long endDate;
    private String otherData;

    public ConcreteBuilder(String contractId, long beginDate, long endDate) {
        this.contractId = contractId;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public InsuranceContract builder(){
        return new InsuranceContract(this);
    }

    public String getContractId() {
        return contractId;
    }

    public String getPersonName() {
        return personName;
    }

    public ConcreteBuilder setPersonName(String personName) {
        this.personName = personName;
        return this;
    }

    public String getCompanyName() {
        return companyName;
    }

    public ConcreteBuilder setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public long getBeginDate() {
        return beginDate;
    }

    public long getEndDate() {
        return endDate;
    }

    public String getOtherData() {
        return otherData;
    }

    public ConcreteBuilder setOtherData(String otherData) {
        this.otherData = otherData;
        return this;
    }
}
