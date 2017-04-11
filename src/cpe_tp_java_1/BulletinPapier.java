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
public class BulletinPapier implements Vote, CheckSigneBulletin{

    public BulletinPapier(HommePolitique hommePolitique, int dateBulletin, int dateScrutin, boolean signature) {
        this.hommePolitique = hommePolitique;
        this.dateBulletin = dateBulletin;
        this.dateScrutin = dateScrutin;
        this.signature = signature;
    }

    private HommePolitique hommePolitique;
    
    private boolean signature;

    private int dateBulletin;

    private int dateScrutin;

    @Override
    public boolean estInvalide() {
        return !this.checkSigne();
    }

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

    @Override
    public boolean checkSigne() {
        return this.signature;
    }
    
    
    
}
