public class Jumbah extends SupremeBoohbah{
    public Jumbah(){
        name = "Jumbah";
        super.command("We will rebel!"); // from the instructions I assumed you had to call the overloaded method but it looks different from everything else
        // It also said to print before the rebellion statements so I assumed that this was correct according to the instructions
    }

    @Override
    public void command() {
        System.out.println(name + " shouts: FOR THE REBELLION, NO MORE OPPRESSION!");        
    }
}