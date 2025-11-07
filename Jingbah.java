public class Jingbah extends SupremeBoohbah{
    public Jingbah(){
        super();
        name = "Jingbah";
        System.out.println(name + " wants peace between the rebels and kingdom.");
    }

    @Override
    public void command() {
        System.out.println(name + " says: Let's all calm down!");
    }
    
    public void command(String message, boolean whisper) {
        if (whisper == true){ //if true whisper, else shouts for peace
            System.out.println(name + " softly says: " + message);
        }
        else {
            System.out.println(name + " shouts: " + message);
        }
    }
}