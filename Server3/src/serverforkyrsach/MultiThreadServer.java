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
     public static void countminus()
    {
        count--;
    }

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
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
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
            System.out.println("Сервер запущен"); 
            System.out.println("Порт сервера "+ socket); 
            System.out.println("Сервер готов для работы"); 
            while (!server.isClosed()) {               
                if (br.ready()) {                  
                    System.out.println("Сервер нашел сообщение");
                    String serverCommand = br.readLine();
                    if (serverCommand.equalsIgnoreCase("quit")) {
                        System.out.println("Происходит закрытие сервера...");                        
                        break;
                    }
                }
                  Socket clientAccepted = server.accept();
                countplus();
                System.out.println("Количество клиентов "+count);
                executeIt.execute(new MonoThreadClientHandler(clientAccepted,stmt,mdbc));
                System.out.println("Соединение с клиентом установлено");
            }
            executeIt.shutdown();
            server.close();
        } catch (IOException e) {
        }
    }
        catch (UnsupportedEncodingException ex) {Logger.getLogger(MultiThreadServer.class.getName()).log(Level.SEVERE, null, ex);}
    }
}
