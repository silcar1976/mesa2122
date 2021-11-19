


package jpatutorial.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity


public class Perro {
 @Id
 
private String raza;
private String pelaje1;
    public Perro() {
    }

    public Perro(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
  
}
