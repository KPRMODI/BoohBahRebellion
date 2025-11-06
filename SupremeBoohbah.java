public class SupremeBoohbah{
    protected String name;

    public SupremeBoohbah() {
        name = "Zing Zing Zingbah";
        System.out.println( "SupremeBoohbah's power has awakened... All must obey" + name + "!");
    }

    public void command(){
        System.out.println(name + "Orders to the Boohbahs: Obey my orders!");
    }

    public void command(String message){ //overload method 
        System.out.println(name + "Says " + message);
    }

    @Override
    public String toString(){
        return name + "Ruler and Awakened king of the new boohbah world...";
    }
    
}