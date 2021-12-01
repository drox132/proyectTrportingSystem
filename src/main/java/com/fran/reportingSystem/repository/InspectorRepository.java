package com.fran.reportingSystem.repository;

import com.fran.reportingSystem.model.Inspector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;
import java.util.List;
@Repository
public interface InspectorRepository extends JpaRepository<Inspector,Integer> {

    @Query(value = "SELECT * FROM inspector", nativeQuery = true)
    List<Inspector> selectAllInspector();

    @Query(value = "SELECT * FROM inspector WHERE id= :idUser", nativeQuery = true)
    Inspector selectAllInspectById(@Param("idUser") long id);

    @Query(value = "exec createInspector @Name = :nameuser, @StartDate= :startdateuser, @Phone = :phoneuser, @Email= :emailuser ", nativeQuery = true)
    Inspector insertInspector (@Param("nameuser") String name, @Param("startdateuser") Date startDate, @Param("phoneuser") String phone, @Param("emailuser") String email);

    @Query(value = "updateInspectorById @Id= :iduser , @Name= :nameuser , @StartDate= :startdateuser , @Phone= :phoneuser , @Email= :emailuser ", nativeQuery = true)
    Inspector updateInspectorById(@Param("iduser") long id, @Param("nameuser") String name, @Param("startdateuser") Date startDate, @Param("phoneuser") String phone, @Param("emailuser") String email);

    @Query(value = "exec deleteInspector @Id= :iduser", nativeQuery = true)
    String deleteInspectorById(@Param("iduser") long id);


}
