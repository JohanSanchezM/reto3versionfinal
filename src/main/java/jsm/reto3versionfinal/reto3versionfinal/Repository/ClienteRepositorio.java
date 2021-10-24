package jsm.reto3versionfinal.reto3versionfinal.Repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import jsm.reto3versionfinal.reto3versionfinal.Model.Cliente;
import jsm.reto3versionfinal.reto3versionfinal.Repository.crud.ClienteCrudRepositorio;

@Repository
public class ClienteRepositorio {
    @Autowired
    private ClienteCrudRepositorio clienteCrudRepositorio;

    public List<Cliente>getAll(){
        return(List<Cliente>) clienteCrudRepositorio.findAll();
    }
    public Optional<Cliente>getCliente(int id){
        return clienteCrudRepositorio.findById(id);
    }
    public Cliente save(Cliente cliente){
        return clienteCrudRepositorio.save(cliente);
    }
}

