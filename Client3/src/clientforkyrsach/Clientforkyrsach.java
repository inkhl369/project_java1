/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientforkyrsach;
import java.io.*;//импорт пакета, содержащего классы для ввода/вывода
import java.net.*;//импорт пакета, содержащего классы для работы в сети Internet
/**
 *
 * @author ilya
 */
public class Clientforkyrsach {

    public static void main(String[] args) {
   try {
final Socket clientSocket = new Socket("127.0.0.1",2525);
 final ObjectOutputStream coos = new ObjectOutputStream(clientSocket.getOutputStream());
 final ObjectInputStream  cois = new ObjectInputStream(clientSocket.getInputStream());
   java.awt.EventQueue.invokeLater(new Runnable() 
  {
   @Override
   public void run() 
   {
    try
    {
    new jframe1(coos,cois).setVisible(true);
    }
    catch(Exception e){}
   }
  });
}catch(Exception e)	{
}   
    } 
}
