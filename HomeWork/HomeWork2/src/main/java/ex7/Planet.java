package ex7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mafio on 08.11.2016.
 */
public class Planet extends AbstractObject{
    private List<Continent> continents;
    private List<Ocean> oceans;
    private List<Island> islands;

    private List<Moon> moons;

    public Planet(String name){
        this.name=name;
        continents=new ArrayList<Continent>();
        oceans=new ArrayList<Ocean>();
        islands=new ArrayList<Island>();
        moons=new ArrayList<Moon>();
    }

    public Planet(String name,List<Continent> continents, List<Ocean> oceans, List<Island> islands,List<Moon> moons) {
        this.name=name;
        this.continents = continents;
        this.oceans = oceans;
        this.islands = islands;
        this.moons=moons;
    }

    public List<Continent> getContinents() {
        return continents;
    }

    public List<Ocean> getOceans() {
        return oceans;
    }

    public List<Island> getIslands() {
        return islands;
    }

    public List<Moon> getMoons() {
        return moons;
    }

    public void setMoons(List<Moon> moons) {
        this.moons = moons;
    }



    public void setContinents(List<Continent> continents) {
        this.continents = continents;
    }

    public void setOceans(List<Ocean> oceans) {
        this.oceans = oceans;
    }

    public void setIslands(List<Island> islands) {
        this.islands = islands;
    }

    public void addMoon(Moon moon){
        moons.add(moon);
    }
    public void addContinent(Continent con){
        continents.add(con);
    }
    public void addIsland(Island is){
        islands.add(is);
    }
    public void addOcean(Ocean oc){
        oceans.add(oc);
    }
    public String showContinents(){
        StringBuilder s=new StringBuilder();
        for (Continent c:
             continents) {
            s.append(c.getName()+" /n");
        }
        return s.toString();
    }
    public String sayMyName(){
        return "My name is:"+this.getName();
    }
    public int amountOfContinents(){
        return continents.size();
    }
    public int amountOfMoons(){
        return moons.size();
    }
}
