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
public class BulletinCourrier extends AbstractVote implements CheckSigneBulletin, CheckDateBulletin{

    public BulletinCourrier(HommePolitique hommePolitique, int dateBulletin, int dateScrutin, boolean signature) {
        super(hommePolitique,dateBulletin,dateScrutin);
        this.signature = signature;
    }

    private boolean signature;

    @Override
    public boolean estInvalide() {
        return !(this.checkSigne() && this.checkDate());
    }

    @Override
    public boolean checkSigne() {
        return this.signature;
    }

    @Override
    public boolean checkDate() {
        int dateLimite = 0;
        return (this.dateScrutin - this.dateBulletin) >= dateLimite;
    }
    
    
    
}
