import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Макаркин Сергей Сергеевич РИБО-01-21 ");

        Gardener gardener = new Gardener();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter plant name: ");
        gardener.name = in.nextLine();

        System.out.println("Enter plant colour: ");
        gardener.colour = in.nextLine();

        System.out.println("Enter cell type: ");
        gardener.setType(in.nextLine());

        System.out.println("Enter protein solubility: ");
        gardener.setSolubility(in.next());

        System.out.println(gardener.toString());
        gardener.filter();
        System.out.println(gardener.toString());

    }
}