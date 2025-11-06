public class Jumbah extends SupremeBoohbah{
    public Jumbah(){
        name = "Jumbah";
        super.command("We will rebel!");
    }

    @Override
    public void command() {
        System.out.println(name + " shouts: FOR THE REBELLION, NO MORE OPPRESSION!");        
    }
}