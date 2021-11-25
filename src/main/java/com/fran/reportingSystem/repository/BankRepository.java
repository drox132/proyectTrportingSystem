package com.fran.reportingSystem.repository;

import com.fran.reportingSystem.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BankRepository extends JpaRepository<Bank,Integer> {


    @Query(value = "SELECT* FROM bank", nativeQuery = true)
    List<Bank> selectAllBank();

    @Query(value = "SELECT * FROM bank WHERE id = :idUser", nativeQuery = true)
    Bank selectAllBankById(@Param("idUser") long id);

    @Query(value = "createBank @Name= :nameuser ", nativeQuery = true)
    Bank insertBank (@Param("nameuser")String name);

    @Query(value = "DELETE FROM bank WHERE id= :id",nativeQuery = true)
    void deleteBankById(@Param("id") long id);

}
