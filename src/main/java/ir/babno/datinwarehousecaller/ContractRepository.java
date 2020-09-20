package ir.babno.datinwarehousecaller;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface ContractRepository extends CrudRepository<MovafeghatNameh, Long> {

    @Query(value = "select h. Id, h.NAAM, h.SHOMAREH from hekmatdb.dwh_movafeghatnameh h", nativeQuery = true)
    List<Object[]> getContractList();

    @Query(value = "select h.Id, h.NAAM, h.SHOMAREH, h.TARIKHSHOROO, h.TARIKHPAYAN from hekmatdb.dwh_movafeghatnameh h where h.ID=:id", nativeQuery = true)
    List<Object[]> getContractById(@Param("id") BigDecimal id);

    @Query(value = "select a3.naam, a3.naamkhanevadegi, a3.shenasehmelli, a.shomarehbimehnameh, a8.naam as noebimehnameh, " +
            " a.tarikhsodoor, a.tarikhshoroo, a.tarikhpayan, a9.naam as vahedesodoor, a9.code as codevahedesodoor, a.haghBimehGhabelPardakht, a1.shomareh as shomaremovafeghatnameh" +
            " from HEKMATDB.Dwh_Gharardadbimeh a" +
            " left join HEKMATDB.DWH_MOVAFEGHATNAMEH a1 on a1.id=a.tavafoghnameh" +
            " left join HEKMATDB.DWH_TARAFGHARARDAD a2 on a2.gharardadbimeh=a.id" +
            " left join HEKMATDB.DWH_SHAKHS a3 on a3.id=a2.shakhs" +
            " left join hekmatdb.dwh_asnadmaali a4 on a4.gharardadbimeh=a.id" +
            " left join hekmatdb.dwh_taahodatmovafeghatnameh a5 on a5.id=a.taahodatmovafeghatnameh" +
            " left join hekmatdb.dwh_olguyemaali a6 on a6.id=a.olguyemaali" +
            " left join hekmatdb.dwh_gardeshasnadmaali a7 on a7.rishe=a4.id" +
            " left join HEKMATDB.DWH_NOEBIMEH a8 on a8.id=a.noebimeh" +
            " left join HEKMATDB.DWH_VAHEDBIMEH a9 on a9.id=a.vahedsodoor" +
            " where a.shomarehbimehnameh=:insuranceCode and a2.istarafasli=1",
            nativeQuery = true)
    List<Object[]> insuranceInformationInquiry(@Param("insuranceCode") String insuranceCode);


}
