/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Inheritance (strategy = InheritanceType.JOINED)

public abstract class EntityBean implements Serializable{
    
    protected Long id;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    
    public Long getId(){
        return id;
    }
    
    public void setId(Long id){
        this.id = id;
    }
    
    public static String getIdentityPropery(){
        return "id";
    }
}
