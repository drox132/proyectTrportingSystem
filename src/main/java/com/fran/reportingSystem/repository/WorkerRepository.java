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

    @Query(value = "SELECT * FROM worker WHERE id= :iduser",nativeQuery = true)
    Worker selectAllWorkerById(@Param("iduser") long id);

    @Query(value = "exec createWorker @Name= :nameuser , @Cuil= :cuiluser ," +
            " @Cbu= :cbuuser , @Phone= :phoneuser , @StartDate= :startdateuser , " +
            "@IdConsorcio= :idconsorciouser , @IdBank= :idbankuser", nativeQuery = true)
    Worker insertWorker (@Param("nameuser") String name, @Param("cuiluser") String cuil,
                         @Param("cbuuser") String cbu, @Param("phoneuser") String phone,
                         @Param("startdateuser") Date startDate,@Param("idconsorciouser") Long idConsorcio,
                         @Param("idbankuser") int idBank);

    @Query(value = "exec updateWorker @Name= :nameuser , @Cuil= :cuiluser ," +
            " @Cbu= :cbuuser , @Phone= :phoneuser , @StartDate= :startdateuser ," +
            "@IdConsorcio= :idconsorciouser , @IdBank= :idbankuser WHERE @Id= :iduser", nativeQuery = true)
    Worker updateWorkerById(@Param("iduser") long id,@Param("nameuser") String name, @Param("cuiluser") String cuil,
                            @Param("cbuuser") String cbu, @Param("phoneuser") String phone,
                            @Param("startdateuser") Date startDate, @Param("idconsorciouser") Long idConsorcio,
                            @Param("idbankuser") int idBank);

    @Query(value = "DELETE FROM worker WHERE id= :idusuario", nativeQuery = true)
    void deleteWorkerById(@Param("idusuario") long id);
}
