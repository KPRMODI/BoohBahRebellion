public class SupremeBoohbah{
    protected String name; // name variable

    public SupremeBoohbah() {
        name = "Zing Zing Zingbah";
        System.out.println( "SupremeBoohbah's power has awakened... All must obey " + name + "!"); //prints each time
    }

    public void command(){
        System.out.println(name + " Orders to the Boohbahs: Obey my orders!");
    }

    public void command(String message){ //overload method 
        System.out.println(name + " proclaims: " + message);
    }

    @Override
    public String toString(){
        return name + " the ruler and awakened king of the new boohbah world...";
    }
}