/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpe_tp_java_1;

/**
 *
 * @author nathanael
 */
public class HommePolitique
{

    public HommePolitique(String parti, String nom, String prenom, Civilite civilite) {
        this.parti = parti;
        this.nom = nom;
        this.prenom = prenom;
        this.civilite = civilite;
    }
    

    private String parti;
    
    private String nom;
    
    private String prenom;
    
    private Civilite civilite;

    /**
     * Get the value of parti
     *
     * @return the value of parti
     */
    public String getParti() {
        return parti;
    }

    /**
     * Set the value of parti
     *
     * @param parti new value of parti
     */
    public void setParti(String parti) {
        this.parti = parti;
    }   

    /**
     * Get the value of nom
     *
     * @return the value of nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Set the value of nom
     *
     * @param nom new value of nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }   

    /**
     * Get the value of prenom
     *
     * @return the value of prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Set the value of prenom
     *
     * @param prenom new value of prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }    

    /**
     * Get the value of civilite
     *
     * @return the value of civilite
     */
    public Civilite getCivilite() {
        return civilite;
    }

    /**
     * Set the value of civilite
     *
     * @param civilite new value of civilite
     */
    public void setCivilite(Civilite civilite) {
        this.civilite = civilite;
    }

    @Override
    public String toString() {
        String civilite = "";
        if(this.civilite == Civilite.HOMME)
        {
            civilite = "homme";
        }
        else
        {
            civilite = "femme";
        }
        return("Homme Politique : "+this.prenom+" "+this.nom+" ; civilité : "+civilite+" ; parti : "+this.parti);
    }
    
    

}
