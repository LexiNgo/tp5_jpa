package org.example;
import jakarta.persistence.*;

@Embeddable
public class Adresse {


    @Column(name = "numero")
    private int numero;

    @Column(name = "rue")
    private String rue;

    @Column(name = "code_postal")
    private int codePostal;

    @Column(name = "ville")
    private String ville;




    // Standard getters and setters




    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
