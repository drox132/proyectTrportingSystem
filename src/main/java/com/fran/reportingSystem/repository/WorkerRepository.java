package com.fran.reportingSystem.repository;


import com.fran.reportingSystem.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface WorkerRepository extends JpaRepository<Worker,Integer> {

    @Query(value = "SELECT *FROM worker", nativeQuery = true)
    List<Worker>selectAllWorker();

    @Query(value = "SELECT * FROM worker WHERE id= :idUser",nativeQuery = true)
    Worker selectAllWorkerById(long id);

    @Query(value = "EXECPROCEDURE", nativeQuery = true)
    Worker insertWorker (String name, String cuil, String cbu, String phone, Date startDate, Long idConsorcio);

    @Query(value = "EXECPROCEDURE", nativeQuery = true)
    Worker updateWorkerById(long id,String name, String cuil, String cbu, String phone, Date startDate, Long idConsorcio);

    @Query(value = "DELETE * FROM worker WHERE id= :idusuario", nativeQuery = true)
    void deleteWorkerById(@Param("idusuario") long id);
}
