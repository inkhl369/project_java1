package serverforkyrsach;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MultiThreadServer {
    static ExecutorService executeIt = Executors.newFixedThreadPool(10);
    static int count=0;
    static int socket=2525;
    public static void countplus()
    {
        count++;
    }
     public static void countminus() { count--; }

    public static void main(String[] args) { 
        FileInputStream fis;
        Properties property = new Properties();
        String kodirovka = "Cp866";
        try {
            fis = new FileInputStream("src/serverforkyrsach/properties.properties");
            property.load(fis);
            socket = Integer.parseInt(property.getProperty("socket"));
            kodirovka=property.getProperty("kodirovka");
        } catch (IOException e) {
            System.err.println("Error: Properties file is missing!");//ОШИБКА: Файл свойств отсутствует!
        }
    try{ 
        System.setOut(new java.io.PrintStream(System.out, true, kodirovka));
        MyBDConnection mdbc = null;
        Connection conn;
        java.sql.Statement stmt = null;
        try{
            mdbc= new MyBDConnection();
            mdbc.init();
            conn = mdbc.getMyConnection();
            stmt=conn.createStatement(); 
        }
        catch (Exception e) {}
        try (ServerSocket server = new ServerSocket(socket);
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in,"CP866"))) {
            System.out.println("Сервер подключился...");
            System.out.println("Port server "+ socket);
            System.out.println("Server is ready to work");//Сервер готов для работы
            while (!server.isClosed()) {               
                if (br.ready()) {                  
                    System.out.println("The server found the message");//Сервер нашел сообщение
                    String serverCommand = br.readLine();
                    if (serverCommand.equalsIgnoreCase("quit")) {
                        System.out.println("Server is shutting down..."); //Происходит закрытие сервера
                        break;
                    }
                }
                  Socket clientAccepted = server.accept();
                countplus();
                System.out.println("Number of clients "+count);//Количество клиентов
                executeIt.execute(new MonoThreadClientHandler(clientAccepted,stmt,mdbc));
                System.out.println("Client connection established");//Соединение с клиентом установлено
            }
            executeIt.shutdown();
            server.close();
        } catch (IOException e) {
        }
    }
        catch (UnsupportedEncodingException ex) {
        Logger.getLogger(MultiThreadServer.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
}
