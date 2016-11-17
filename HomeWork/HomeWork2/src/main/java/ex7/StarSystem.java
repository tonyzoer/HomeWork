package ex7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mafio on 08.11.2016.
 */
public class StarSystem extends AbstractObject{
    private List<Planet> planets;
    private List<Star> stars;
    private Star centralStar;
    public StarSystem(String name,List<Planet> planets, List<Star> stars,  Star centralStar) {
        this.planets = planets;
        this.stars = stars;
        this.name = name;
        this.centralStar = centralStar;
    }

    public StarSystem(String name){
        planets=new ArrayList<Planet>();
        stars=new ArrayList<Star>();
        centralStar=new Star(name);
        this.name=name;
    }

    public List<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(List<Planet> planets) {
        this.planets = planets;
    }

    public List<Star> getStars() {
        return stars;
    }

    public void setStars(List<Star> stars) {
        this.stars = stars;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Star getCentralStar() {
        return centralStar;
    }

    public void setCentralStar(Star centralStar) {
        this.centralStar = centralStar;
    }
    public int cmountOfPlanets(){
        return planets.size();
    }
    public String showStarsName(){
        StringBuilder str=new StringBuilder();
        for (Star s:
             stars) {
            str.append(s.getName());
        }
return str.toString();
    }
public String centralStarName(){
    return centralStar.getName();
}
public void addPlanet(Planet p){
    planets.add(p);
}
}
