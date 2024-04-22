package com.agenciadeviajes.model;
import lombok.Getter;
import lombok.Setter ;
@Setter
@Getter
        
        
public class Cliente {
    private String IdCliente;
    private int ReservaCliente;
    private String EmailCliente;
    private int TelefonoCliente;
    private String NombreCliente;

    public void setNombreCliente(String jay) {
    }
}
