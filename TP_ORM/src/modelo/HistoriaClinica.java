/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author sanfrarow
 */
@Entity
public class HistoriaClinica extends EntityBean implements Serializable{
    
    //private int idHistoriaClinica;
    private int numero;
    private Date fechaAlta;
    
    private Paciente paciente;
    private List<DetalleHistoriaClinica> detalleHC;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    //RELACION UNA HISTORIA CLINICA A MUCHOS DETALLES HISTORIA CLINICA
    @OneToMany (mappedBy = "historiaClinica", cascade = CascadeType.ALL)
    public List<DetalleHistoriaClinica> getDetalleHC() {
        return detalleHC;
    }

    public void setDetalleHC(List<DetalleHistoriaClinica> detalleHC) {
        this.detalleHC = detalleHC;
    }
    
    
    
    
}
