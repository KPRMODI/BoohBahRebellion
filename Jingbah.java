public class Jingbah extends SupremeBoohbah{
    public Jingbah(){
        super();
        name = "Jingbah";
        System.out.println(name + "Wants peace between the rebels and kingdom");
    }

    @Override
    public void command() {
        super.command();
        System.out.println(name + " Let's all calm down");
    }
    
    public void command(String message, boolean whisper) {
        if (whisper == true){
            System.out.println(name + "quietely says: dont fight pls!");
        }
        else {
            System.out.println(name + "loudly says: STOP FIGHTING");
        }
    }
}