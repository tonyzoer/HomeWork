package Ex10;

/**
 * Created by mafio on 10.11.2016.
 */
public class Computer {
    OS os=new OS();
    Proccesor proccesor=new Proccesor();
    Memmory memmory=new Memmory();

    public Computer(OS os, Proccesor proccesor, Memmory memmory) {
        this.os = os;
        this.proccesor = proccesor;
        this.memmory = memmory;
    }
    public Computer() {
        //free constructor
    }

    public OS getOs() {
        return os;
    }

    public void setOs(OS os) {
        this.os = os;
    }
    public void setOs(String name,String version){
    this.os.setName(name);
        this.os.setVersion(version);
    }

    public Proccesor getProccesor() {
        return proccesor;
    }

    public void setProccesor(Proccesor proccesor) {
        this.proccesor = proccesor;
    }
    public void setProccesor(String name, Double frequency, Double year, int cores){this.proccesor.name = name;
        this.proccesor.frequency = frequency;
        this.proccesor.year = year;
        this.proccesor.cores = cores;}
    public Memmory getMemmory() {
        return memmory;
    }

    public void setMemmory(Memmory memmory) {
        this.memmory = memmory;
    }
    public void setMemmory(String name, int size, Double frequency) {
        this.memmory.name = name;
        this.memmory.size = size;
        this.memmory.frequency = frequency;
    }
    public int getSummaryPower(){
        return (int) (((proccesor.cores*proccesor.frequency)*(proccesor.year-2000))*memmory.size*memmory.frequency)/1000;

    }
    class OS{
        String name;

        String version;

        public OS() {
            //free constructor
        }

        public OS(String name, String version) {
            this.name = name;
            this.version = version;
        }

        public OS(String name) {
            this.name = name;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getVersion() {
            return version;
        }
        public void setVersion(String version) {
            this.version = version;
        }
    }
    class Proccesor{
        String name;
        Double frequency;
        Double year;

        int cores;

        public Proccesor(String name, Double frequency, Double year, int cores) {
            this.name = name;
            this.frequency = frequency;
            this.year = year;
            this.cores = cores;
        }

        public Proccesor(String name) {
            this.name = name;
            this.frequency = 1d;
            this.year = 2000d;
            this.cores = 1;
        }

        public Proccesor() {
            this.name = "NoName";
            this.frequency = 1d;
            this.year = 2000d;
            this.cores = 1;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getFrequency() {
            return frequency;
        }

        public void setFrequency(Double frequency) {
            this.frequency = frequency;
        }

        public Double getYear() {
            return year;
        }

        public void setYear(Double year) {
            this.year = year;
        }

        public int getCores() {
            return cores;
        }
        public void setCores(int cores) {
            this.cores = cores;
        }
    }
    class Memmory{
        String name;

        int size;
        Double frequency;

        public Memmory() {
            this.name = "Noname";
            this.size = 1;
            this.frequency = 1d;
        }

        public Memmory(String name) {
            this.name = name;
            this.size = 1;
            this.frequency = 1d;
        }

        public Memmory(String name, int size, Double frequency) {
            this.name = name;
            this.size = size;
            this.frequency = frequency;
        }


        public Double getFrequency() {
            return frequency;
        }

        public void setFrequency(Double frequency) {
            this.frequency = frequency;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSize() {
            return size;
        }
        public void setSize(int size) {
            this.size = size;
        }
    }
}
