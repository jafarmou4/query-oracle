package ir.babno.datinwarehousecaller;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ContractService {
    private final ContractRepository contractRepository;

    public ContractService(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    public List<ContractListDto> getContractList() {
        List<Object[]> contractList = contractRepository.getContractList();

        List<ContractListDto> contractListDtos = new ArrayList<>();

        if (contractList.size() > 0)
            contractList.forEach(contract -> contractListDtos.add(new ContractListDto(((BigDecimal) contract[0]).longValue(), (String) contract[1] + "-" + (String) contract[2])));

        return contractListDtos;
    }

    public DatinContractDto getContractById(Long id) {
        List<Object[]> contractById = contractRepository.getContractById(new BigDecimal(id));

        DatinContractDto datinContractDto = null;

        if (contractById.size() == 0) {
            throw new NoSuchElementException("id: " + id + " not found");
        }

        Object[] contract = contractById.get(0);

        if (null != contract && contract.length > 0)
            datinContractDto = new DatinContractDto(((BigDecimal) contract[0]).longValue(), (String) contract[1], "", ((Timestamp) contract[3]).getTime(), ((Timestamp) contract[4]).getTime(), (String) contract[2]);
        return datinContractDto;
    }

    public InsuranceInformationInquiryDto insuranceInformationInquiry(String insuranceCode) {

        List<Object[]> objects;

        try {
            objects = contractRepository.insuranceInformationInquiry(insuranceCode);
        } catch (Exception e) {
            throw new NoSuchElementException("insuranceCode: " + insuranceCode + " not found");
        }

        if (objects.size() == 0)
        {
            throw new NoSuchElementException("insuranceCode: " + insuranceCode + " not found");
        }

        Object[] object = objects.get(0);
        InsuranceInformationInquiryDto insuranceInformationInquiryDto = null;

        if (null != object && object.length > 0)
            insuranceInformationInquiryDto = new InsuranceInformationInquiryDto((String) object[0] + " " + (String) object[1], (String) object[2],
                    ((Timestamp) object[5]).getTime(), ((Timestamp) object[6]).getTime(), ((Timestamp) object[7]).getTime(),
                    (String) object[3], (String) object[4], (String)object[11], (String)object[8], (String) object[9], null, ((BigDecimal) object[10]).longValue());

        return insuranceInformationInquiryDto;
    }
}
