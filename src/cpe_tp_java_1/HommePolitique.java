/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpe_tp_java_1;

import java.util.Objects;

/**
 *
 * @author nathanael
 */
public class HommePolitique implements Comparable<HommePolitique>, Cloneable
{

    public HommePolitique(String parti, String nom, String prenom, Civilite civilite) {
        this.parti = parti;
        this.nom = nom;
        this.prenom = prenom;
        this.civilite = civilite;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
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
        return("{Homme Politique : "+this.prenom+" "+this.nom+" ; civilité : "+civilite+" ; parti : "+this.parti+"}");
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.parti);
        hash = 97 * hash + Objects.hashCode(this.nom);
        hash = 97 * hash + Objects.hashCode(this.prenom);
        hash = 97 * hash + Objects.hashCode(this.civilite);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HommePolitique other = (HommePolitique) obj;
        if (!Objects.equals(this.parti, other.parti)) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        if (this.civilite != other.civilite) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(HommePolitique o) {
        
        int comparison = 0;
        comparison = comparison + this.parti.compareTo(o.parti);
        comparison = comparison + this.nom.compareTo(o.nom);
        comparison = comparison + this.prenom.compareTo(o.prenom);
        comparison = comparison + this.civilite.compareTo(o.civilite);
        
        return comparison;
    }
}
