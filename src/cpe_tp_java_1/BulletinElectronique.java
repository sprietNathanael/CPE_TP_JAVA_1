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
public class BulletinElectronique implements Vote, CheckDateBulletin{

    public BulletinElectronique(HommePolitique hommePolitique, int dateBulletin, int dateScrutin) {
        this.hommePolitique = hommePolitique;
        this.dateBulletin = dateBulletin;
        this.dateScrutin = dateScrutin;
    }

    private HommePolitique hommePolitique;

    private int dateBulletin;

    private int dateScrutin;

    @Override
    public boolean estInvalide() {
        return !this.checkDate();
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
    public boolean checkDate() {
        int dateLimite = 2;
        return (this.dateScrutin - this.dateBulletin) >= dateLimite;
    }
    
}
