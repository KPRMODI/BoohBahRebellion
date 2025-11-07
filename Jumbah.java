public class Jumbah extends SupremeBoohbah{
    public Jumbah(){
        super();
        name = "Jumbah";
        System.out.println(name + " Refuses to obey!"); // he refuses to obey
    }

    @Override
    public void command() {
        System.out.println(name + " shouts: FOR THE REBELLION, NO MORE OPPRESSION!");        
    }
}