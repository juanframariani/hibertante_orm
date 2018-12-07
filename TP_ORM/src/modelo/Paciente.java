/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author sanfrarow
 */
@Entity
public class Paciente extends Persona implements Serializable{
    
    //private int idPaciente;
    private int nroSocio;
    
    private HistoriaClinica historiaClinica;
    private List<Turno> turno;

    public int getNroSocio() {
        return nroSocio;
    }

    public void setNroSocio(int nroSocio) {
        this.nroSocio = nroSocio;
    }

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "idPaciente")
    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    @OneToMany (mappedBy = "paciente", cascade = CascadeType.ALL)
    public List<Turno> getTurno() {
        return turno;
    }

    public void setTurno(List<Turno> turno) {
        this.turno = turno;
    }
    
}
