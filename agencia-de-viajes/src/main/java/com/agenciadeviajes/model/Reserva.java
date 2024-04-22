package com.agenciadeviajes.model;
import lombok.Getter;
import lombok.Setter ;
@Setter
@Getter
public class Reserva {
    private int FechaInicio;
    private int FechaFinal;
    private int FechaReserva;
    private int ClienteId;
    private int EmpleadoId;

}
