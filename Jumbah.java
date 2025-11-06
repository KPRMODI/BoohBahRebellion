public class Jumbah extends SupremeBoohbah{
    public Jumbah(){
        super();
        name = "Jumbah";
        System.out.println(name + "Refuses to obey");
    }

    @Override
    public void command() {
        super.command("We will rebel for our freedom");
        System.out.println(name + " shouts: FOR THE REBELLION!");
    }
    
}