public class BoohbahRebellionTest {
    public static void main(String[] args) {
        SupremeBoohbah[] boohbahs = {new Humbah(), new Zumbah(), new Jumbah(), new Jingbah()};


        System.out.println("\n--- Boohbah Rebellion Begins ---");
        for (SupremeBoohbah b : boohbahs) {
            b.command();
        }

        System.out.println("\n--- Overloaded Commands ---");
        boohbahs[1].command("Mannn I ain't listening to Zing Zing Zingbah, i'm finna do the belly flop.");
        // I had to use ai for this command, for  some reason when running jingbahs command it doesnt take the boolean and you have to add (jingbah)
        ((Jingbah) boohbahs[3]).command("Please, no fighting!", true);
    }
}