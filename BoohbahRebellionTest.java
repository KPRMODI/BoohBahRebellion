public class BoohbahRebellionTest {
    public static void main(String[] args) {
        SupremeBoohbah[] boohbahs = {new Humbah(), new Zumbah(), new Jumbah(), new Jingbah()};


        System.out.println("\n--- Boohbah Rebellion Begins ---");
        for (SupremeBoohbah b : boohbahs) {
            b.command();
        }

        System.out.println("\n--- Overloaded Commands ---");
        // Call overloaded command from superclass
        boohbahs[0].command("Dance in perfect unison!");

        // Call Jingbah’s overloaded method
        if (boohbahs[3] instanceof Jingbah) {
            ((Jingbah) boohbahs[3]).command("Please, no fighting!", true);
        }
    
    }
}