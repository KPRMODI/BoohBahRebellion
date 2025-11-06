public class BoohbahRebellionTest {
    public static void main(String[] args) {
        SupremeBoohbah[] boohbahs = {new Humbah(), new Zumbah(), new Jumbah(), new Jingbah()};


        System.out.println("\n--- Boohbah Rebellion Begins ---");
        for (SupremeBoohbah b : boohbahs) {
            b.command();
        }

        System.out.println("\n--- Overloaded Commands ---");
        boohbahs[1].command("Mannn I ain't listening to Zing Zing Zingbah, i'm finna do the belly flop.");
        // Thank you for telling me to cast this I got very confused
        ((Jingbah) boohbahs[3]).command("Please, no fighting!", true);
    }
}