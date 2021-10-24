package jsm.reto3versionfinal.reto3versionfinal.Services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jsm.reto3versionfinal.reto3versionfinal.Model.Auditorio;
import jsm.reto3versionfinal.reto3versionfinal.Repository.AuditorioRepositorio;

@Service
public class AuditorioServicio {
    @Autowired
    private AuditorioRepositorio auditorioRepositorio;

    public List<Auditorio>getAll(){
        return auditorioRepositorio.getAll();
    }
    public Optional<Auditorio> getAuditorio(int auditorioId){
        return auditorioRepositorio.getAuditorio(auditorioId);
    }
    public Auditorio save(Auditorio audience){
        if(audience.getId()==null){
            return auditorioRepositorio.save(audience);
        }else{
            Optional<Auditorio>consulta=auditorioRepositorio.getAuditorio(audience.getId());
            if(consulta.isEmpty()){
                return auditorioRepositorio.save(audience);
            }else{
                return audience;
            }

        }
    }
    
}

