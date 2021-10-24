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
import jsm.reto3versionfinal.reto3versionfinal.Model.Auditorio;
import jsm.reto3versionfinal.reto3versionfinal.Services.AuditorioServicio;

@RestController
@RequestMapping("/api/Audience")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class AuditorioControlador {
    @Autowired
    private AuditorioServicio auditorioServicio;
    @GetMapping("/all")
    public List<Auditorio>getAuditorios(){
        return auditorioServicio.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Auditorio>getAuditorio(@PathVariable("id")int auditorioId){
        return auditorioServicio.getAuditorio(auditorioId);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Auditorio save(@RequestBody Auditorio audience){
        return auditorioServicio.save(audience);
    }
    
}

