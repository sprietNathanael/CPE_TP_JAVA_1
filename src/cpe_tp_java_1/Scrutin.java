/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpe_tp_java_1;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author nathanael
 */
public class Scrutin {

    public Scrutin(List<HommePolitique> hommePolitiques, int population, int dateSrutin)
    {
        this.population = population;
        this.dateScrutin = dateSrutin;
        this.votes = new LinkedList<Vote>();
        this.candidatScrutins = new LinkedList<CandidatScrutin>();
        this.initListCandidatScrutins(hommePolitiques);
    }

    public Scrutin(int population, int dateScrutin) {
        this.population = population;
        this.dateScrutin = dateScrutin;
        this.votes = new LinkedList<Vote>();
        this.candidatScrutins = new LinkedList<CandidatScrutin>();
    }
    
    private List<CandidatScrutin> candidatScrutins;
    
    private List<Vote> votes;
    
    private int population;
    
    private int nbVotesValides;
    
    private int dateScrutin;

    public int getDateScrutin() {
        return this.dateScrutin;
    }

    private void initListCandidatScrutins(List<HommePolitique> hommesPolitiques) {
        if (hommesPolitiques != null){
            for (HommePolitique hommePolitique : hommesPolitiques ) {
                CandidatScrutin candidatScrutin = null;
                candidatScrutin = new CandidatScrutin(hommePolitique, this.getDateScrutin());
                this.candidatScrutins.add(candidatScrutin);
            }
        }
    }
    
    public void addCandidat(HommePolitique hommePolitique)
    {
        if(hommePolitique != null)
        {
            this.candidatScrutins.add(new CandidatScrutin(hommePolitique, this.getDateScrutin()));
        }
        
    }

    public void addBulletin(Vote vote) {
        if(vote != null)
        {
            this.votes.add(vote);
        }
    }

    @Override
    public String toString() {
        return "Scrutin du "+this.getDateScrutin()+" : "+this.candidatScrutins;
    }
    
    public void countTheVotes()
    {        
        for (Vote vote : this.votes )
        {
            if(!vote.estInvalide())
            {
                this.nbVotesValides++;
                for(CandidatScrutin candidatScructin : this.candidatScrutins)
                {
                    if(candidatScructin.compareCandidat(vote.getHommePolitique()))
                    {
                        candidatScructin.incrementeVoix();
                    }
                }
            }
        }
    }    
    
    public int tauxParticipation()
    {
        return (this.nbVotesValides * 100) / this.population;
    }
    
    
    
}
