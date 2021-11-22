package com.fran.reportingSystem.repository;

import com.fran.reportingSystem.model.Inspector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;
import java.util.List;

public interface InspectorRepository extends JpaRepository<Inspector,Integer> {

    @Query(value = "SELECT * FROM inspector", nativeQuery = true)
    List<Inspector> selectAllInspector();

    @Query(value = "SELECT * FROM inspector WHERE id= :idUser", nativeQuery = true)
    Inspector selectAllInspectById(@Param("idUser") long id);

    @Query(value = "EXECPROCEDURE", nativeQuery = true)
    Inspector insertInspector (String name, Date startDate, String phone, String email);

    @Query(value = "EXECPROCEDURE", nativeQuery = true)
    Inspector updateInspectorById(long id,String name, Date startDate, String phone, String email);

    @Query(value = "DELETE * FROM inspector WHERE id= :idusuario", nativeQuery = true)
    void deleteInspectorById(@Param("idusuario") long id);



}
