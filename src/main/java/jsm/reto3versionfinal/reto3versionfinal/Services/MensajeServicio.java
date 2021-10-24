package jsm.reto3versionfinal.reto3versionfinal.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jsm.reto3versionfinal.reto3versionfinal.Model.Mensaje;
import jsm.reto3versionfinal.reto3versionfinal.Repository.MensajeRepositorio;

@Service
public class MensajeServicio {
    @Autowired
    private MensajeRepositorio mensajeRepositorio;

    public List<Mensaje>getAll(){
        return mensajeRepositorio.getAll();
    }
    public Optional<Mensaje>getMessage(int messageId){
        return mensajeRepositorio.getMessage(messageId);
    }
    public Mensaje save(Mensaje message){
        if(message.getIdMessage()==null){
            return mensajeRepositorio.save(message);
        }else{
            Optional<Mensaje> consulta=mensajeRepositorio.getMessage(message.getIdMessage());
            if(consulta.isEmpty()){
                return mensajeRepositorio.save(message);
            }else{
                return message;
            }
        }
    }
    
}

