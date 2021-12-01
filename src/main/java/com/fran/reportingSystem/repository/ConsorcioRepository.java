package com.fran.reportingSystem.repository;

import com.fran.reportingSystem.model.Consorcio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ConsorcioRepository extends JpaRepository<Consorcio,Integer> {

    @Query(value = "SELECT * FROM consorcio",nativeQuery = true)
    List<Consorcio>selectAllConsorcio();

    @Query(value = "SELECT* FROM consorcio WHERE id= :idUser", nativeQuery = true)
    Optional<Consorcio> selectAllConsorcioById(@Param("idUser") long id);


    @Query(value = "exec createConsorcio @Name= :nameuser , @Cuit= :cuituser, @Cbu= :cbuuser," +
            " @Email= :emailuser , @IdInspector= :idinspectoruser, @IdBank= :idbankuser" , nativeQuery = true)
    Consorcio insertConsorcio(@Param("nameuser") String name,@Param("cuituser") String cuit,
                              @Param("cbuuser") String cbu,@Param("emailuser") String email,
                              @Param("idinspectoruser") long idInspector, @Param("idbankuser") int idBank);


    @Query(value = "exec updateConsorcio @Id = :iduser , @Name= :nameuser, @Cuit= :cuituser , @Cbu= :cbuuser ," +
            " @Email= :emailuser , @IdInspector= :idinspectoruser , @IdBank= :idbankuser "
            ,nativeQuery = true)
    Consorcio updateConsorcioById(@Param("iduser") long id, @Param("nameuser") String name,
                                  @Param("cuituser") String cuit, @Param("cbuuser") String cbu,
                                  @Param("emailuser") String email, @Param("idinspectoruser") long idInspector,
                                  @Param("idbankuser") int idBank);


    @Query(value = " exec deleteConsorcio @id= :id ",nativeQuery = true)
    String deleteConsorcioById(@Param("id") long id);

}
