/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpe_tp_java_1;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nathanael
 */
public class CandidatScrutin implements Comparable<CandidatScrutin>{
    
        private HommePolitique hommePolitique;

    public String getParti() {
        return this.hommePolitique.getParti();
    }

    public String getNom() {
        return this.hommePolitique.getNom();
    }
    
    public String getPrenom() {
        return this.hommePolitique.getPrenom();
    }
    
    public Civilite getCivilite() {
        return this.hommePolitique.getCivilite();
    }
    
    private int nbVoix;

    /**
     * Get the value of nbVoix
     *
     * @return the value of nbVoix
     */
    public int getNbVoix() {
        return nbVoix;
    }


    private int date;

    /**
     * Get the value of date
     *
     * @return the value of date
     */
    public int getDate() {
        return date;
    }


    public CandidatScrutin(HommePolitique hommePolitique, int date) {
        try {
            this.hommePolitique = (HommePolitique) hommePolitique.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(CandidatScrutin.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.nbVoix = 0;
        this.date = date;
    }

    @Override
    public String toString() {
        return "CandidatScrutin{" + "Candidat = " + hommePolitique + ", nbVoix=" + nbVoix + ", date=" + date + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.hommePolitique);
        hash = 97 * hash + this.nbVoix;
        hash = 97 * hash + this.date;
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
        final CandidatScrutin other = (CandidatScrutin) obj;
        if (this.nbVoix != other.nbVoix) {
            return false;
        }
        if (this.date != other.date) {
            return false;
        }
        if (!Objects.equals(this.hommePolitique, other.hommePolitique)) {
            return false;
        }
        return true;
    }

    public void incrementeVoix() {
        this.nbVoix++;
    }

    public boolean compareCandidat(CandidatScrutin cd) {
        if(this.hommePolitique.compareTo(cd.hommePolitique) == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int compareTo(CandidatScrutin o) {
        return this.hommePolitique.compareTo(o.hommePolitique);
    }
    
    
    
}
