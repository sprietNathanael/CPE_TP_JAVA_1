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
public class BulletinPapier extends AbstractVote implements CheckSigneBulletin{

    public BulletinPapier(HommePolitique hommePolitique, int dateBulletin, int dateScrutin, boolean signature) {
        super(hommePolitique,dateBulletin,dateScrutin);
        this.signature = signature;
    }

    private boolean signature;

    @Override
    public boolean estInvalide() {
        return !this.checkSigne();
    }

    @Override
    public boolean checkSigne() {
        return this.signature;
    }
    
    
    
}
