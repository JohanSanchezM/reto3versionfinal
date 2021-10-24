package jsm.reto3versionfinal.reto3versionfinal.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import jsm.reto3versionfinal.reto3versionfinal.Model.Reservaciones;
import jsm.reto3versionfinal.reto3versionfinal.Repository.crud.ReservacionesCrudRepositorio;


@Repository
public class ReservacionesRepositorio {
    @Autowired
    private ReservacionesCrudRepositorio reservacionesCrudRepositorio;
    public List<Reservaciones>getAll(){
        return (List<Reservaciones>) reservacionesCrudRepositorio.findAll();
    }
    public Optional<Reservaciones>getReservation(int id){
        return reservacionesCrudRepositorio.findById(id);
    }
    public Reservaciones save (Reservaciones reservation){
        return reservacionesCrudRepositorio.save(reservation);
    }    
}

