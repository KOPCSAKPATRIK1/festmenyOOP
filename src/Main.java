import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Festmeny f1 = new Festmeny("proba1", "NiggaTron", "Transniggas");
        Festmeny f2 = new Festmeny("proba2", "OptimusPrimNigga", "Transniggas");

        Scanner sc = new Scanner(System.in);

        System.out.print("Hany darab festmeny szeretnel hozzaadni?");
        int db = sc.nextInt();

        for (int i = 0 ; db > i; i++)
        {
            System.out.print("add meg a festmeny cimet");
            String ujcim =  sc.nextLine();
            System.out.print("add meg a festmeny festojet");
            String ujfesto =  sc.nextLine();
            System.out.print("add meg a festmeny stilusat");
            String ujstilus =  sc.nextLine();

            Festmeny ujfestmeny = new Festmeny(ujcim, ujfesto, ujstilus);

        }
    }
}
