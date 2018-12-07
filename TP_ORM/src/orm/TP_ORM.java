/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orm;

import controlador.GestorPersona;
import modelo.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sanfrarow
 */
public class TP_ORM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            GestorPersona gestor = new GestorPersona();
            Medico medico = new Medico();
            Empleado empleado = new Empleado();
            Paciente paciente = new Paciente();
            Especialidad especialidad1 = new Especialidad();
            Especialidad especialidad2 = new Especialidad();
            
            Turno turno = new Turno();
            HistoriaClinica historiaClinica = new HistoriaClinica();
            DetalleHistoriaClinica detalleHC = new DetalleHistoriaClinica();
            List<DetalleHistoriaClinica> listaDetalleHC = new ArrayList<>();
            List<Especialidad> listaEspecialidades = new ArrayList<>();
            
            especialidad1.setDenominacion("Cardiologo");
            especialidad2.setDenominacion("Neurocirujano");
            listaEspecialidades.add(especialidad1);
            listaEspecialidades.add(especialidad2);
            
                    
            medico.setApellido("Sosa");
            medico.setNombre("Jose");
            medico.setCelular(261471182);
            medico.setMatricula(1234);
            medico.setDni(31286526);
            
            empleado.setNombre("Juan");
            empleado.setApellido("Mariani");
            empleado.setSueldo(15000);
            
            paciente.setNombre("Dana");
            paciente.setApellido("Veronica");
            paciente.setNroSocio(47521);
            
            turno.setHora(16);
            turno.setMinutos(30);
            turno.setMedico(medico);
            turno.setPaciente(paciente);
            
            historiaClinica.setNumero(15);
            
            detalleHC.setSintomas("Fiebre");
            detalleHC.setDiagnostico("Gripe");
            detalleHC.setObservaciones("Se recomienda reposo");

            listaDetalleHC.add(detalleHC);
            
            gestor.guardar(medico);
            gestor.guardar(paciente);
            gestor.guardar(empleado);
            gestor.guardar(turno);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
