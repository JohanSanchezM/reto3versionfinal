package jsm.reto3versionfinal.reto3versionfinal.Services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jsm.reto3versionfinal.reto3versionfinal.Model.Cliente;
import jsm.reto3versionfinal.reto3versionfinal.Repository.ClienteRepositorio;

@Service
public class ClienteServicio {
    @Autowired
    private ClienteRepositorio clienteRepositorio;

    public List<Cliente>getAll(){
        return clienteRepositorio.getAll();
    }
    public Optional<Cliente>getClient(int clientId){
        return clienteRepositorio.getCliente(clientId);
    }
    public Cliente save(Cliente client){
        if(client.getIdClient()==null){
            return clienteRepositorio.save(client);
        }else{
            Optional<Cliente> consulta=clienteRepositorio.getCliente(client.getIdClient());
            if(consulta.isEmpty()){
                return clienteRepositorio.save(client);
            }else{
                return client;
            }
        }
    }
    
}

