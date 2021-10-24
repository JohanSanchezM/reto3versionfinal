package jsm.reto3versionfinal.reto3versionfinal.Web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import jsm.reto3versionfinal.reto3versionfinal.Model.Mensaje;
import jsm.reto3versionfinal.reto3versionfinal.Services.MensajeServicio;

@RestController
@RequestMapping("/api/Message")
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class MensajeControlador {
    @Autowired
    private MensajeServicio mensajeServicio;
    @GetMapping("/all")
    public List<Mensaje>getMessages(){
        return mensajeServicio.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Mensaje>getMessage(@PathVariable("id")int messageId){
        return mensajeServicio.getMessage(messageId);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Mensaje save(@RequestBody Mensaje message){
        return mensajeServicio.save(message);
    }
    
}

