package jsm.reto3versionfinal.reto3versionfinal.Services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jsm.reto3versionfinal.reto3versionfinal.Model.Reservaciones;
import jsm.reto3versionfinal.reto3versionfinal.Repository.ReservacionesRepositorio;

@Service
public class ReservacionesServicio {
    @Autowired
    private ReservacionesRepositorio reservacionesRepositorio;

    public List<Reservaciones>getAll(){
        return reservacionesRepositorio.getAll();
    }
    public Optional<Reservaciones>getReservation(int reservationId){
        return reservacionesRepositorio.getReservation(reservationId);
    }
    public Reservaciones save (Reservaciones reservation){
        if(reservation.getIdReservation()==null){
            return reservacionesRepositorio.save(reservation);
        }else{
            Optional<Reservaciones> consulta=reservacionesRepositorio.getReservation(reservation.getIdReservation());
            if(consulta.isEmpty()){
                return reservacionesRepositorio.save(reservation);
            }else{
                return reservation;
            }
        }
    }
    
}

