package jsm.reto3versionfinal.reto3versionfinal.Services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jsm.reto3versionfinal.reto3versionfinal.Model.Tipo;
import jsm.reto3versionfinal.reto3versionfinal.Repository.TipoRepositorio;

@Service
public class TipoServicio {
    @Autowired
    private TipoRepositorio tipoRepositorio;

    public List<Tipo>getAll(){
        return tipoRepositorio.getAll();
    }
    public Optional<Tipo>getTipo(int tipoId){
        return tipoRepositorio.getTipo(tipoId);
    }
    public Tipo save (Tipo tipo){
        if(tipo.getId()==null){
            return tipoRepositorio.save(tipo);
        }else{
            Optional<Tipo> consulta=tipoRepositorio.getTipo(tipo.getId());
            if(consulta.isEmpty()){
                return tipoRepositorio.save(tipo);
            }else{
                return tipo;
            }
        }
    }
    
}

