package ir.babno.datinwarehousecaller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class ContractController {
    private final ContractService contractService;

    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    @GetMapping("/datin/warehouse/contracts")
    public List<ContractListDto> getContractList() {
        return contractService.getContractList();
    }

    @GetMapping("/datin/warehouse/contract")
    public ResponseEntity<DatinContractDto> getContractById(@RequestParam Long id) {

        try {

            return new ResponseEntity(contractService.getContractById(id), HttpStatus.OK);

        } catch (NoSuchElementException ex) {

            return new ResponseEntity("contractId: " + id + " not found", HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/datin/warehouse/insurance-code")
    public ResponseEntity<InsuranceInformationInquiryDto> insuranceInformationInquiry(@RequestParam String insuranceCode) {

        try {

            return new ResponseEntity(contractService.insuranceInformationInquiry(insuranceCode), HttpStatus.OK);

        } catch (NoSuchElementException ex) {

            return new ResponseEntity("insuranceCode: " + insuranceCode + " not found", HttpStatus.NOT_FOUND);
        }
    }
}
