package com.appGefa.gefa.Utils;

import lombok.Data;

import java.util.Date;

@Data
public class EmployePayload {
    private Long numEmploye;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private Date dateEmbauche;
    private String qualification;
    private int Contact;
    private String numCin;
}
