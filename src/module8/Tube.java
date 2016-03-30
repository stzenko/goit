package module8;

/**
  * Created by Zenovii on 08.03.2016.
  */

public class Tube extends MusicInstrument{
    public String firm;
    public int volume;
    public String color;
    public String classification;

    public Tube(final String firm, int volume, final String color, final String classification) {
        super(firm,volume,color,classification);
        this.firm = firm;
        this.volume = volume;
        this.color = color;
        this.classification = classification;
    }

    @Override
    public String toString() {
        return ("Tube              " + "\t | \t" + firm + "\t | \t    " + volume + " \t | \t "+ color + "\t | \t"+ classification);
    }
}