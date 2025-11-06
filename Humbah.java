public class Humbah extends SupremeBoohbah{
    public Humbah(){
        super();
        name = "Humbah";
        System.out.println(name + " kneels before the king.");
    }

    @Override
    public void command() {
        System.out.println(name + " follows orders without question.");      
    }    
}