package jsm.reto3versionfinal.reto3versionfinal.Repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import jsm.reto3versionfinal.reto3versionfinal.Model.Mensaje;
import jsm.reto3versionfinal.reto3versionfinal.Repository.crud.MensajeCrudRepositorio;

@Repository
public class MensajeRepositorio {
    @Autowired
    private MensajeCrudRepositorio mensajeCrudRepositorio;
    public List<Mensaje>getAll(){
        return (List<Mensaje>) mensajeCrudRepositorio.findAll();
    }
    public Optional<Mensaje>getMessage(int id){
        return mensajeCrudRepositorio.findById(id);
    }
    public Mensaje save(Mensaje message){
        return mensajeCrudRepositorio.save(message);
    }   
}

