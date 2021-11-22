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


    //falta configurar bien el esotr procedure CREARlo y agregar la conf en parametros
    @Query(value = "PROCEDURE", nativeQuery = true)
    Consorcio insertConsorcio(String name,String cuit,String cbu,String email,long idInspector, int idBank);


    //falta configurar bien el esotr procedure CREARlo y agregar la conf en parametros
    @Query(value = "PROCEDURE",nativeQuery = true)
    Consorcio updateConsorcioById(long id, String name, String cuit,
                                  String cbu,String email,long idInspector,int idBank);


    @Query(value = "DELETE * FROM consorcio WHERE id= :id",nativeQuery = true)
    void deleteConsorcioById(@Param("id") long id);

}
