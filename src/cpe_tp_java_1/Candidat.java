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
public class Candidat implements Comparable<Candidat>{

    public Candidat(CandidatScrutin candidatScrutin, int nbVotes) {
        this.candidatScrutin = candidatScrutin;
        this.pourcentage = (candidatScrutin.getNbVoix() * 100) / nbVotes;
    }

    public double getPourcentage() {
        return pourcentage;
    }

    @Override
    public int compareTo(Candidat o) {
        return this.candidatScrutin.compareTo(o.candidatScrutin);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.candidatScrutin);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.pourcentage) ^ (Double.doubleToLongBits(this.pourcentage) >>> 32));
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
        final Candidat other = (Candidat) obj;
        if (Double.doubleToLongBits(this.pourcentage) != Double.doubleToLongBits(other.pourcentage)) {
            return false;
        }
        if (!Objects.equals(this.candidatScrutin, other.candidatScrutin)) {
            return false;
        }
        return true;
    }
    
    public String getParti() {
        return this.candidatScrutin.getParti();
    }

    public String getNom() {
        return this.candidatScrutin.getNom();
    }
    
    public String getPrenom() {
        return this.candidatScrutin.getPrenom();
    }
    
    public Civilite getCivilite() {
        return this.candidatScrutin.getCivilite();
    }
    
    private CandidatScrutin candidatScrutin;

    private double pourcentage;

    @Override
    public String toString() {
        return "Candidat{" + "candidatScrutin=" + candidatScrutin + ", pourcentage=" + pourcentage + '}';
    }
    
    


}
