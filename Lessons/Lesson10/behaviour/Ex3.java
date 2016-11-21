/**
 * @author Maksym Dmytriiev
 * @since 18.11.16, 16:27
 */
public class Ex3 {
    public static void main(String[] args) {
        Builder builder = new CottageBuilder();
        Foreman foreman = new Foreman(builder);

        foreman.createBuilding();

        Building building = builder.getBuilding();
        building.show();
    }
}

class Foreman {
    Builder builder;

    public Foreman(Builder builder) {
        this.builder = builder;
    }

    public void createBuilding() {
        builder.buildBase();
        builder.buildWalls();
        builder.buildRoof();
    }
}

abstract class Builder {
    Building building;

    abstract public void buildBase();
    abstract public void buildWalls();
    abstract public void buildRoof();

    public Building getBuilding() {
        return building;
    }
}

class CottageBuilder extends Builder {

    public CottageBuilder() {
        building = new Cottage();
    }

    public void buildBase() {
        building.setBase("Cottage Base");
    }

    public void buildWalls() {
        building.setWalls("Cottage Walls");
    }

    public void buildRoof() {
        building.setRoof("Cottage Roof");
    }
}
class OfficeBuilder extends Builder {

    public OfficeBuilder() {
        building = new Office();
    }

    public void buildBase() {
        building.setBase("Office Base");
    }

    public void buildWalls() {
        building.setWalls("Office Walls");
    }

    public void buildRoof() {
        building.setRoof("Office Roof");
    }
}

abstract class Building {
    protected String base;
    protected String walls;
    protected String roof;
    public abstract void show();

    public void setBase(String base) {
        this.base = base;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }
}

class Cottage extends Building {
    public void show() {
        System.out.println("Cottage: " + base + "; " + walls + "; " + roof);
    }
}

class Office extends Building {
    public void show() {
        System.out.println("Office: " + base + "; " + walls + "; " + roof);
    }
}

