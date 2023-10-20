import java.net.URI;
import java.io.IOException;

interface URLHandler {
    String handleRequest(URI url);
}

class Handler implements URLHandler {
    private String str = "";
    private int number = 0;

    @Override
    public String handleRequest(URI url) {
        //checks if path ends with the right 
        if (url.getPath().equals("/add-message")) {
            String[] parameters = url.getQuery().split("=");
            if (parameters[0].equals("s")) {
                str += ++number + ". " + parameters[1] + "\n";
                return str;
            } else {
                return "Invalid parameter!";
            }
        } else {
            return "404 Not Found!";
        }
    }
}

class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
