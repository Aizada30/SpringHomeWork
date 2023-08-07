package globalPackage.mini;

import lombok.*;
@Getter
@Setter
public class Group implements Peaksoft {
    private String name;
    private Peaksoft peaksoft;

    public Group() {
    }

    public Group(String name, Peaksoft peaksoft) {
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
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", peaksoft=" + peaksoft +
                '}';
    }

    @Override
    public String whichLanguage() {
        return "LANGUAGE BY GROUP : Java";
    }
}
