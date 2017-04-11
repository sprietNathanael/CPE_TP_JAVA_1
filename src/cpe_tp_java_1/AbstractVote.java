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
abstract class AbstractVote implements Vote{
    
    public AbstractVote(HommePolitique hommePolitique, int dateBulletin, int dateScrutin) {
        this.hommePolitique = hommePolitique;
        this.dateBulletin = dateBulletin;
        this.dateScrutin = dateScrutin;
    }
    
    protected HommePolitique hommePolitique;

    protected int dateBulletin;

    protected int dateScrutin;


    @Override
    public abstract boolean estInvalide();

    @Override
    public HommePolitique getHommePolitique() {
        return this.hommePolitique;
    }

    @Override
    public int getDate() {
        return this.dateBulletin;
    }    
    
    @Override
    public String toString() {
        return "Vote par "+this.getClass().getSimpleName()+" le "+this.dateBulletin+" pour le scrutin du "+this.dateScrutin+" pour " + this.hommePolitique + " -> "+(this.estInvalide()? "invalide":"valide");
    }
    
}
