package messageUtil;

public class MessageUtil {
    private String message;

    public MessageUtil(String message){
        this.message=message;
    }
    public String printMessage(){
        System.out.println("Hello World");
        return message;
    }
}
