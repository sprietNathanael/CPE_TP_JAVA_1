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
public class BulletinElectronique extends AbstractVote implements CheckDateBulletin{

    public BulletinElectronique(HommePolitique hommePolitique, int dateBulletin, int dateScrutin) {
        super(hommePolitique,dateBulletin,dateScrutin);
    }

    @Override
    public boolean estInvalide() {
        return !this.checkDate();
    }

    

    @Override
    public boolean checkDate() {
        int dateLimite = 2;
        return (this.dateScrutin - this.dateBulletin) >= dateLimite;
    }

    
    
    
}
