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
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author sanfrarow
 */
@Entity
public class Medico extends Persona implements Serializable{
    
    //private int idMedico;
    private int matricula;
    private long celular;
    
    private List<Especialidad> especialidad;
    private List<Turno> turno;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }
    
    @ManyToMany(fetch = FetchType.LAZY, targetEntity = Especialidad.class,
            cascade = CascadeType.ALL)
    //@JoinTable
    public List<Especialidad> getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(List<Especialidad> especialidad) {
        this.especialidad = especialidad;
    }

    @OneToMany (mappedBy = "medico", cascade = CascadeType.ALL)
    public List<Turno> getTurno() {
        return turno;
    }

    public void setTurno(List<Turno> turno) {
        this.turno = turno;
    }
    
       
}
