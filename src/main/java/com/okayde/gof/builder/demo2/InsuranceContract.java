package com.okayde.gof.builder.demo2;

public class InsuranceContract {
    private String contractId;
    private String personName;
    private String companyName;
    private long beginDate;
    private long endDate;
    private String otherData;

    InsuranceContract(ConcreteBuilder builder) {
        this.contractId = builder.getContractId();
        this.personName = builder.getPersonName();
        this.companyName = builder.getCompanyName();
        this.beginDate = builder.getBeginDate();
        this.endDate = builder.getEndDate();
        this.otherData = builder.getOtherData();
    }

    public void someOperation(){
        System.out.println("InsuranceContract");
    }
}
