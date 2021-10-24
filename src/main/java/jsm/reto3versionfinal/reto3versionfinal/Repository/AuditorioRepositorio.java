package jsm.reto3versionfinal.reto3versionfinal.Repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import jsm.reto3versionfinal.reto3versionfinal.Model.Auditorio;
import jsm.reto3versionfinal.reto3versionfinal.Repository.crud.AuditorioCrudRepositorio;

@Repository
public class AuditorioRepositorio {
    @Autowired
    private AuditorioCrudRepositorio auditorioCrudRepositorio;

    public List<Auditorio>getAll(){
        return (List<Auditorio>) auditorioCrudRepositorio.findAll();
    }
    public Optional<Auditorio>getAuditorio(int id){
        return auditorioCrudRepositorio.findById(id);
    }
    public Auditorio save (Auditorio audience){
        return auditorioCrudRepositorio.save(audience);
    }
   
}

