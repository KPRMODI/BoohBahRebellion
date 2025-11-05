public class SupremeBoohbah{
    protected String name;

    public SupremeBoohbah() {
        name = "Zing Zing Zingbah";
        System.out.print( "SupremeBoohbah's power has awakened...");
    }

    public void command(){
        System.out.println("All Boohbahs must obey" + name);
    }

    public void command(String message){ //overload method 
        System.out.println(message);
    }

    @Override
    public String toString(){
        return "i am a boohbah";
    }
    
}