import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Festmeny
{
    private String cim;
    private String festo;
    private String stilus;
    private int licitekSzama;
    private int legmagasabbLicit;
    private LocalDateTime legutolsoLicitIdeje;
    private boolean elkelt;

    public Festmeny(String cim, String festo, String stilus)
    {
        this.cim = cim;
        this.festo = festo;
        this.stilus = stilus;
        this.licitekSzama = 0;
        this.legmagasabbLicit = 0;
        this.elkelt = false;
    }

    public String getFesto(){
        return this.festo;
    }

    public String getStilus(){
        return this.stilus;
    }

    public int getLicitekSzama(){
        return this.licitekSzama;
    }

    public int getLegmagasabbLicit(){
        return  this.legmagasabbLicit;
    }

    public LocalDateTime getLegutolsoLicitIdeje(){
        return this.legutolsoLicitIdeje;
    }

    public Boolean getElkelt() {
        return this.elkelt;
    }

    public void setElkelt(Boolean elkelt) {
        this.elkelt = elkelt;
    }

    public void licit()
    {
        if (this.elkelt = false)
        {
            System.out.print("Elkelt");
        }
        else if (this.licitekSzama == 0)
        {
            this.legmagasabbLicit = 100;
            this.licitekSzama ++;
            this.legmagasabbLicit =(int) Math.round(this.legmagasabbLicit/100.0) * 100;
            this.legutolsoLicitIdeje = LocalDateTime.now();
        }
        else
        {
            this.legmagasabbLicit = (int) (this.legmagasabbLicit * 1.1);
            this.legmagasabbLicit =(int) Math.round(this.legmagasabbLicit/100.0) * 100;
            this.legutolsoLicitIdeje = LocalDateTime.now();
        }
    }







}