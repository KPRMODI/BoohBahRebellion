public class SupremeBoohbah{
    protected String name; // name variable

    public SupremeBoohbah() {
        name = "Zing Zing Zingbah";
        System.out.println( "SupremeBoohbah's power has awakened... All must obey " + name + "!"); //prints each time for his awakening
    }

    public void command(){ //he commands the boohbahs
        System.out.println(name + " Orders to the Boohbahs: Obey my orders!");
    }

    public void command(String message){ //overload method 
        System.out.println(name + " proclaims: " + message);
    }

    @Override
    public String toString(){ //overrides toString method
        return name + " the ruler and awakened king of the new boohbah world...";
    }
}