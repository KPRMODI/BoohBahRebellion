public class Humbah extends SupremeBoohbah{
    public Humbah(){
        super(); // calls super
        name = "Humbah";
        System.out.println(name + " kneels before the king.");
    }

    @Override
    public void command() { //ovveride for rebellion
        System.out.println(name + " follows orders without question.");      
    }    
}