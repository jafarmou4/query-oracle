package ir.babno.datinwarehousecaller;

public class InsuranceInformationInquiryDto {
    private String name;
    private String nationalCode;
    private Long issuanceDate;
    private Long startDate;
    private Long endDate;
    private String insuranceCode;
    private String insuranceType;
    private String loanContractCode;
    private String issuanceUnit;
    private String issuanceUnitCode;
    private Long prepayment;
    private Long amount;

    public InsuranceInformationInquiryDto(String name, String nationalCode, Long issuanceDate, Long startDate, Long endDate, String insuranceCode, String insuranceType, String loanContractCode, String issuanceUnit, String issuanceUnitCode, Long prepayment, Long amount) {
        this.name = name;
        this.nationalCode = nationalCode;
        this.issuanceDate = issuanceDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.insuranceCode = insuranceCode;
        this.insuranceType = insuranceType;
        this.loanContractCode = loanContractCode;
        this.issuanceUnit = issuanceUnit;
        this.issuanceUnitCode = issuanceUnitCode;
        this.prepayment = prepayment;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public Long getIssuanceDate() {
        return issuanceDate;
    }

    public void setIssuanceDate(Long issuanceDate) {
        this.issuanceDate = issuanceDate;
    }

    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public Long getEndDate() {
        return endDate;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    public String getInsuranceCode() {
        return insuranceCode;
    }

    public void setInsuranceCode(String insuranceCode) {
        this.insuranceCode = insuranceCode;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public String getLoanContractCode() {
        return loanContractCode;
    }

    public void setLoanContractCode(String loanContractCode) {
        this.loanContractCode = loanContractCode;
    }

    public String getIssuanceUnit() {
        return issuanceUnit;
    }

    public void setIssuanceUnit(String issuanceUnit) {
        this.issuanceUnit = issuanceUnit;
    }

    public String getIssuanceUnitCode() {
        return issuanceUnitCode;
    }

    public void setIssuanceUnitCode(String issuanceUnitCode) {
        this.issuanceUnitCode = issuanceUnitCode;
    }

    public Long getPrepayment() {
        return prepayment;
    }

    public void setPrepayment(Long prepayment) {
        this.prepayment = prepayment;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
