package jsm.reto3versionfinal.reto3versionfinal.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import jsm.reto3versionfinal.reto3versionfinal.Model.Tipo;
import jsm.reto3versionfinal.reto3versionfinal.Repository.crud.TipoCrudRepositorio;

@Repository
public class TipoRepositorio {
    @Autowired
    private TipoCrudRepositorio tipoCrudRepositorio;
    public List<Tipo>getAll(){
        return(List<Tipo>)tipoCrudRepositorio.findAll();
    }
    public Optional<Tipo>getTipo(int id){
        return tipoCrudRepositorio.findById(id);
    }
    public Tipo save (Tipo tipo){
        return tipoCrudRepositorio.save(tipo);
    }
        
}

