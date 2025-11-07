public class Zumbah extends SupremeBoohbah{
    public Zumbah(){
        super();
        name = "Zumbah";
        System.out.println(name + " pretends to obey but does whatever he wants.");
    }

    @Override
    public void command() { //command for rebellion
        System.out.println(name + " fakes obedience but does the belly flop instead!");
    }
}