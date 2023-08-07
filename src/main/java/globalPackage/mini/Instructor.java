package globalPackage.mini;

public class Instructor implements Peaksoft {
    private String name;
    private Peaksoft peaksoft;

    public Instructor() {
    }

    public Instructor(String name, Peaksoft peaksoft) {
        this.name = name;
        this.peaksoft = peaksoft;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Peaksoft getPeaksoft() {
        return peaksoft;
    }

    public void setPeaksoft(Peaksoft peaksoft) {
        this.peaksoft = peaksoft;
    }

    @Override
    public String whichLanguage() {
        return "INSTRUCTORS LANGUAGE : Java";
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                ", peaksoft=" + peaksoft +
                '}';
    }


}