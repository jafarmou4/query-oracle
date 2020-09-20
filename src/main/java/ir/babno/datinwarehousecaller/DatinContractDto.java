package ir.babno.datinwarehousecaller;

public class DatinContractDto {
    private Long id;
    private String companyName;
    private String contractDescription;
    private Long contractStartDate;
    private Long contractEndDate;
    private String contractCode;

    public DatinContractDto(Long id, String companyName, String contractDescription, Long contractStartDate, Long contractEndDate, String contractCode) {
        this.id = id;
        this.companyName = companyName;
        this.contractDescription = contractDescription;
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
        this.contractCode = contractCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContractDescription() {
        return contractDescription;
    }

    public void setContractDescription(String contractDescription) {
        this.contractDescription = contractDescription;
    }

    public Long getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(Long contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public Long getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(Long contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }
}
