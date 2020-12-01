/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverforkyrsach;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import static serverforkyrsach.MultiThreadServer.count;
import static serverforkyrsach.MultiThreadServer.countminus;

public class MonoThreadClientHandler implements Runnable{

    private static Socket serverSocket;
    MyBDConnection mdbc;
    java.sql.Statement stmt;
    String login;
    String password;
    String ID;
    public MonoThreadClientHandler(Socket client,java.sql.Statement stmt,MyBDConnection mdbc) {
        serverSocket = client;
        this.mdbc=mdbc;
        this.stmt=stmt;
    }
    public ResultSet getResultFromAuthentication()
    {
     ResultSet rs = null;
     String b ;
     b="SELECT * FROM users Where Login LIKE '"+login+"' && Password LIKE '"+password+"'";
    // System.out.print(b);
     try
     {
      rs = stmt.executeQuery(b);
     }
     catch(SQLException e){}
     return rs;
    }
     public ResultSet getResultFromData()
    {
     ResultSet rs = null;
     String b ;
     b="SELECT * FROM users"
             + " INNER JOIN acarddata on users.KodUsers=acarddata.KodUsers "
             + "where users.KodUsers="+ID;
     //System.out.print(b);
     try
     {
      rs = stmt.executeQuery(b);
     }
     catch(SQLException e){
     System.out.println("Ошибка запроса для данных");
     }
     return rs;
    }
      public ResultSet getResultFromKorzina()
    {
     ResultSet rs = null;
     String b ;
     b="SELECT * FROM apannier INNER JOIN spisok on apannier.KodSpisok=spisok.KodSpisok where apannier.KodUsers="+ID;
     //System.out.print(b);
     try
     {
      rs = stmt.executeQuery(b);
     }
     catch(SQLException e){
     System.out.println("Ошибка запроса для корзины");
     }
     return rs;
    }
      public ResultSet getResultFromOrders(String ID1)
    {
     ResultSet rs = null;
     String b ;
     b="SELECT * FROM orders INNER JOIN users on orders.KodUsers=users.KodUsers where KodOrders="+ID1;
     //System.out.print(b);
     try
     {
      rs = stmt.executeQuery(b);
     }
     catch(SQLException e){
     System.out.println("Ошибка запроса для корзины");
     }
     return rs;
    }
       public ResultSet getResultFromOrders1()
    {
     ResultSet rs = null;
     String b ;
     b="SELECT * FROM orders INNER JOIN spisok on orders.KodSpisok=spisok.KodSpisok where Descriptionoforder != 'продано'";
     //System.out.print(b);
     try
     {
      rs = stmt.executeQuery(b);
     }
     catch(SQLException e){
     System.out.println("Ошибка запроса заказа");
     }
     return rs;
    }
        public ResultSet getResultFromOrders2()
    {
     ResultSet rs = null;
     String b ;
     b="SELECT * FROM orders INNER JOIN spisok on orders.KodSpisok=spisok.KodSpisok where Descriptionoforder != 'не продано'";
     //System.out.print(b);
     try
     {
      rs = stmt.executeQuery(b);
     }
     catch(SQLException e){
     System.out.println("Ошибка запроса заказа");
     }
     return rs;
    }
       public ResultSet getResultFromSpisokTovarov()
    {
     ResultSet rs = null;
     String b ;
     b="SELECT * FROM spisok";
     //System.out.print(b);
     try
     {
      rs = stmt.executeQuery(b);
     }
     catch(SQLException e){
     System.out.println("Ошибка запроса для списка товаров");
     }
     return rs;
    }
       public ResultSet getResultFromSpisokTovarov4()
    {
     ResultSet rs = null;
     String b ;
     b="SELECT * FROM spisok INNER JOIN spisokpk on spisok.KodSpisok=spisokpk.KodSpisok ";
     //System.out.print(b);
     try
     {
      rs = stmt.executeQuery(b);
     }
     catch(SQLException e){
     System.out.println("Ошибка запроса для списка товаров");
     }
     return rs;
    }
         public ResultSet getResultFromSpisokTovarov1()
    {
     ResultSet rs = null;
     String b ;
     b="SELECT * FROM spisok INNER JOIN spisoklaptod on spisok.KodSpisok=spisoklaptod.KodSpisok ";
     //System.out.print(b);
     try
     {
      rs = stmt.executeQuery(b);
     }
     catch(SQLException e){
     System.out.println("Ошибка запроса для списка товаров");
     }
     return rs;
    }
           public ResultSet getResultFromSpisokTovarov2()
    {
     ResultSet rs = null;
     String b ;
     b="SELECT * FROM spisok INNER JOIN spisokmobilephone on spisok.KodSpisok=spisokmobilephone.KodSpisok";
     //System.out.print(b);
     try
     {
      rs = stmt.executeQuery(b);
     }
     catch(SQLException e){
     System.out.println("Ошибка запроса для списка товаров");
     }
     return rs;
    }
             public ResultSet getResultFromSpisokTovarov3()
    {
     ResultSet rs = null;
     String b ;
     b="SELECT * FROM spisok INNER JOIN spisokperipherii on spisok.KodSpisok=spisokperipherii.KodSpisok";
     //System.out.print(b);
     try
     {
      rs = stmt.executeQuery(b);
     }
     catch(SQLException e){
     System.out.println("Ошибка запроса для списка товаров");
     }
     return rs;
    }
        public ResultSet getResultFromSpisokTovarov1(String data)
    {
     ResultSet rs = null;
     String b ;
     b="SELECT * FROM spisok where Name1 like '%"+data+"%' or Model like '%"+data+"%' or Description like '%"+data+"%'";
     //System.out.print(b);
     try
     {
      rs = stmt.executeQuery(b);
     }
     catch(SQLException e){
     System.out.println("Ошибка запроса для списка товаров");
     }
     return rs;
    }
    public ResultSet getResultFromAuthentication1()
    {
     ResultSet rs = null;
     String b ;
     b="SELECT * FROM users Where Login LIKE '"+login+"'";
    // System.out.print(b);
     try
     {
      rs = stmt.executeQuery(b);
     }
     catch(SQLException e){}
     return rs;
    }
    public int getResultFromRegistration()
    {
     int q = 0;
     String b;
     b="INSERT INTO users (Login,Password,roles,lastname,firstname,otchestvo,adres) VALUES ( '"+login+"','"+password+"','клиент','','','','')";        
  //   System.out.print(b);
     try
     {
      q = stmt.executeUpdate(b);
     }
     catch(SQLException e){
     System.out.println("Ошибка регистрации");
     }
     return q;
    }
    public int getResultFromRegistration1()
    {
     int q = 0;
     String d;
     d="INSERT INTO acarddata(KodUsers,nomerkard,srok1,srok2,cvv2) VALUES ("+ID+",'',1,2018,0)";    
  //   System.out.print(b);
     try
     {
     q= stmt.executeUpdate(d);
     }
     catch(SQLException e){
     System.out.println("Ошибка регистрации");
     }
     return q;
    }
    @Override
    public void run() {
        try {
            ObjectInputStream  sois;
            ObjectOutputStream soos;
            sois = new ObjectInputStream(serverSocket.getInputStream()); 
            soos = new ObjectOutputStream(serverSocket.getOutputStream());
            String clientMessageRecieved = (String)sois.readObject();

            while (!serverSocket.isClosed()) {
                if (clientMessageRecieved.equals("войти"))
{
    login = (String)sois.readObject();
    password = (String)sois.readObject(); 
    try
       {
        ResultSet rs = getResultFromAuthentication();
        String login1 ="",password1 = "",role="";
         try
  {   
   while(rs.next())
   {
    ID=rs.getString("KodUsers");
    login1=rs.getString("Login");
    password1=rs.getString("Password");
    role=rs.getString("roles");
   } 
  }
  catch(Exception e)
  {
   System.out.println("Ошибка при считывании логина и пароля");
  }
        if (login1.equals(login) && password1.equals(password))
        {
            if(role.equals("админ"))
            soos.writeObject("входкакадмин");
            else soos.writeObject("входкакпользователь");   
        }
        else soos.writeObject("0");
        mdbc.close(rs);       
       }
       catch(Exception e)
       {
           System.out.print("Ошибка 1");
       }  
}
 if (clientMessageRecieved.equals("получитьданные"))
 {
 ResultSet rs1 = getResultFromData();
         try
  {   
   while(rs1.next())
   {
    String[] row = 
    {
     rs1.getString("KodUsers"), rs1.getString("Login"),
     rs1.getString("Password"), rs1.getString("lastname"),rs1.getString("firstname"),rs1.getString("otchestvo"),
     rs1.getString("adres"),rs1.getString("nomerkard"),rs1.getString("srok1"),rs1.getString("srok2"),rs1.getString("cvv2")
    };
       for (String row1 : row) 
       {
           soos.writeObject(row1);
       }
   } 
  }
  catch(SQLException | IOException e)
  {
   System.out.println("Exception in data");
  }
        mdbc.close(rs1);
 }
if (clientMessageRecieved.equals("корзина"))
{ 
    ResultSet rs1 = getResultFromKorzina();    
         try
  {   
      ArrayList<String[]> ResultSets=new ArrayList<>();
    while(rs1.next())
   {
    String[] row = 
    {
     rs1.getString("KodPannier"),rs1.getString("Name1"), rs1.getString("Model"),
     rs1.getString("Price")
    };
    ResultSets.add(row);
   } 
    soos.writeObject(ResultSets);
  }
  catch(SQLException | NumberFormatException | IOException e)
  {
   System.out.println("Ошибка при считывании корзины");
  }
        mdbc.close(rs1);
} 
if (clientMessageRecieved.equals("стоимостьвкорзине"))
{ 
    ResultSet rs1 = getResultFromKorzina();    
         try
  {   
      Double cost=0.0;
    while(rs1.next())
   {
    cost+=Double.valueOf(rs1.getString("Price"));
   } 
    String formattedDouble = new DecimalFormat("#0.00").format(cost);
    soos.writeObject(formattedDouble);
  }
  catch(SQLException | NumberFormatException | IOException e)
  {
   System.out.println("Ошибка при считывании корзины");
  }
        mdbc.close(rs1);
} 
if (clientMessageRecieved.equals("корзина12"))
{ 
    ResultSet rs1 = getResultFromKorzina();
    
         try
  {   
      ArrayList<String[]> ResultSets=new ArrayList<>();
    while(rs1.next())
   {
    String[] row = 
    {
     rs1.getString("KodPannier"),rs1.getString("Name1"), rs1.getString("Model"),
     rs1.getString("Price")
    };
    ResultSets.add(row);
   } 
    soos.writeObject(ResultSets);
    if(ResultSets.size()>=1){
                 Double[] qwer=new Double[ResultSets.size()];
                 String[] qwer2=new String[ResultSets.size()];
                    for ( int i=0;i<ResultSets.size();i++) {
                        String qwer1[]=ResultSets.get(i);
                        qwer[i]=Double.parseDouble(qwer1[3]);
                        qwer2[i]=qwer1[2];
                    }
      soos.writeObject(qwer);   
       soos.writeObject(qwer2);  
    }
    
  }
  catch(SQLException | IOException e)
  {
   System.out.println("Exception in korzina");
  }
        mdbc.close(rs1);
} 

if (clientMessageRecieved.equals("корзина1"))
{ 
    ResultSet rs1 = getResultFromKorzina();
    
         try
  {   
      ArrayList<String[]> ResultSets=new ArrayList<>();
    while(rs1.next())
   {
    String[] row = 
    {
     rs1.getString("KodPannier"),rs1.getString("Name1"), rs1.getString("Model"),
     rs1.getString("Price")
    };
    ResultSets.add(row);
   } 
    soos.writeObject(ResultSets);
  }
  catch(SQLException | IOException e)
  {
   System.out.println("Exception in korzina");
  }
        mdbc.close(rs1);
} 
if (clientMessageRecieved.equals("купить"))
{ 
    ResultSet rs1 = getResultFromKorzina();
    
         try
  {   
      ArrayList<String[]> ResultSets=new ArrayList<>();
    while(rs1.next())
   {
    String[] row = 
    {
     rs1.getString("KodPannier"),rs1.getString("KodUsers"), rs1.getString("KodSpisok")
    };
    ResultSets.add(row);
   } 
    GregorianCalendar calendar = new GregorianCalendar();
    int year,month,date;
    year=calendar.get(Calendar.YEAR);
    month=calendar.get(Calendar.MONTH);
    date=calendar.get(Calendar.DATE);
    String b ;  
        for (String[] ResultSet : ResultSets) {
            b = "INSERT INTO orders(KodUsers,KodSpisok,Data1,Descriptionoforder) values (" + ResultSet[1] + "," + ResultSet[2] +",'"+year+"."+month+"."+date+"','не продано')";
            stmt.executeUpdate(b);
            b="DELETE FROM apannier WHERE KodPannier=" + ResultSet[0];
            stmt.executeUpdate(b);
        }      
  }
  catch(SQLException e)
  {
   System.out.println("Ошибка при покупке");
  }
        mdbc.close(rs1);
} 
if (clientMessageRecieved.equals("СписокЗаказчиков"))
{ 
    String ID1=(String)sois.readObject();
    ResultSet rs1 = getResultFromOrders(ID1); 
         try
  {   
      ArrayList<String[]> ResultSets=new ArrayList<>();
    while(rs1.next())
   {
    String[] row = 
    {
     rs1.getString("KodUsers"),rs1.getString("lastname"), rs1.getString("firstname"),
     rs1.getString("otchestvo"),rs1.getString("adres")
    };
    ResultSets.add(row);
   } 
    soos.writeObject(ResultSets);
  }
  catch(SQLException | IOException e)
  {
   System.out.println("Exception in orders table");
  }
        mdbc.close(rs1);
}
if (clientMessageRecieved.equals("Продажатехники"))
{ 
    String ID1=(String)sois.readObject();
    
         try
  {   
     String b;
     b="Update orders set Descriptionoforder='продано' where KodOrders="+ID1;
     stmt.executeUpdate(b);
  }
  catch(SQLException e)
  {
   System.out.println("Exception in orders table");
  }
        
}
if (clientMessageRecieved.equals("СписокЗапросов"))
{ 
    
    ResultSet rs1 = getResultFromOrders1(); 
         try
  {   
      ArrayList<String[]> ResultSets=new ArrayList<>();
    while(rs1.next())
   {
    String[] row = 
    {
     rs1.getString("KodOrders"),rs1.getString("Data1"),rs1.getString("Name1"), rs1.getString("Model"),
     rs1.getString("Price"),rs1.getString("Description")
    };
    ResultSets.add(row);
   } 
    soos.writeObject(ResultSets);
  }
  catch(SQLException | IOException e)
  {
   System.out.println("Exception in orders table");
  }
        mdbc.close(rs1);
}
if (clientMessageRecieved.equals("Списокпроданнойтехники"))
{ 
    ResultSet rs1 = getResultFromOrders2(); 
         try
  {   
      ArrayList<String[]> ResultSets=new ArrayList<>();
    while(rs1.next())
   {
    String[] row = 
    {
     rs1.getString("KodOrders"),rs1.getString("Data1"),rs1.getString("Name1"), rs1.getString("Model"),
     rs1.getString("Price"),rs1.getString("Description")
    };
    ResultSets.add(row);
   } 
    soos.writeObject(ResultSets);
  }
  catch(SQLException | IOException e)
  {
   System.out.println("Exception in orders table");
  }
        mdbc.close(rs1);
}
if (clientMessageRecieved.equals("админдиаграмма"))
{ 
    ResultSet rs1 = getResultFromOrders2(); 
         try
  {   
      double q=0,w=0,e=0,s=0;
    while(rs1.next())
   {
       if(rs1.getString("Name1").equals("кроссовер"))
           q++;
       if(rs1.getString("Name1").equals("внедорожник"))
           w++;
       if(rs1.getString("Name1").equals("седан"))
           e++;
       if(rs1.getString("Name1").equals("хетчбэк"))
           s++;
   } 
    soos.writeObject(q);
    soos.writeObject(w);
    soos.writeObject(e);
    soos.writeObject(s);
  }
  catch(SQLException | IOException e)
  {
   System.out.println("Ошибка в диаграмме для админа");
  }
        mdbc.close(rs1);
}
if (clientMessageRecieved.equals("Полученнаяприбыль"))
{ 
    ResultSet rs1 = getResultFromOrders2(); 
         try
  {   
      Double pribl=0.0;
    while(rs1.next())
   {
    pribl+=rs1.getDouble("Price")*0.1;
   } 
   String formattedDouble = new DecimalFormat("#0.00").format(pribl);
    soos.writeObject(formattedDouble);
  }
  catch(SQLException | IOException e)
  {
   System.out.println("Exception in orders table");
  }
        mdbc.close(rs1);
}
if (clientMessageRecieved.equals("данныевкорзину"))
{ 
   String ID2 = (String)sois.readObject();
     try
     { 
         String b ;  
         b="INSERT INTO apannier(KodUsers,KodSpisok) values ("+ID+","+ID2+")";   
      stmt.executeUpdate(b);
     }
     catch(SQLException e){
     System.out.println("добавление данных в корзину не удачно");
     }
}
if (clientMessageRecieved.equals("добавлениетовара"))
{ 
   String Name1 = (String)sois.readObject();
   String Model = (String)sois.readObject();
   String Price = (String)sois.readObject();
   String Description = (String)sois.readObject();
   String other = (String)sois.readObject();
     try
     { 
         String b ;
         
         b="INSERT INTO spisok(Name1,Model,Price,Description) values ('"+Name1+"','"+Model+"',"+Price+",'"+Description+"')"; 
         stmt.executeUpdate(b);  
         
         ResultSet rs;
      b="SELECT * FROM spisok where Name1 like '"+Name1+"' and Model like '"+Model+"'";
      rs = stmt.executeQuery(b);
      String id = "";
    while(rs.next())
    {
        id=rs.getString("KodSpisok");
    }
            if (Name1.equals("кроссовер"))
                 b="INSERT INTO spisokpk(KodSpisok,Computpower) values ("+id+","+other+")";   
            if ( Name1.equals("внедорожник"))
                 b="INSERT INTO spisokmobilephone(KodSpisok,Typecommunicate) values ("+id+",'"+other+"')";
            if (Name1.equals("седан"))
                 b="INSERT INTO spisoklaptod(KodSpisok,TachPad) values ("+id+",'"+other+"')";
            if (Name1.equals("хетчбэк"))
                 b="INSERT INTO spisokperipherii(KodSpisok,Types) values ("+id+",'"+other+"')";            
            stmt.executeUpdate(b);
     }
     catch(SQLException e){
     System.out.println("добавление данных в таблицу не удачно");
     }
}
if (clientMessageRecieved.equals("данныеглавнойтаблицы"))
{ 
    ResultSet rs1 = getResultFromSpisokTovarov();   
         try
  {   
      ArrayList<String[]> ResultSets=new ArrayList<>();
    while(rs1.next())
   {
    String[] row = 
    {
     rs1.getString("KodSpisok"),rs1.getString("Name1"), rs1.getString("Model"),
     rs1.getString("Price")
    };
    ResultSets.add(row);
   }     
    soos.writeObject(ResultSets);
  }
  catch(SQLException | IOException e)
  {
   System.out.println("Exception in spisok tovarov");
  }
        mdbc.close(rs1);      
}

if (clientMessageRecieved.equals("данныеизтаблиц"))
{ 
    ResultSet rs1 = getResultFromSpisokTovarov4();   
         try
  {   
      ArrayList<String[]> ResultSets=new ArrayList<>();
      ArrayList<String[]> ResultSets1=new ArrayList<>();
      ArrayList<String[]> ResultSets2=new ArrayList<>();
      ArrayList<String[]> ResultSets3=new ArrayList<>();
    while(rs1.next())
   {
    String[] row = 
    {
     rs1.getString("KodSpisok"),rs1.getString("Name1"), rs1.getString("Model"),
     rs1.getString("Price"),rs1.getString("Description"),rs1.getString("Computpower")
    };
    ResultSets.add(row);
   } 
    soos.writeObject(ResultSets);
    ResultSet rs2 = getResultFromSpisokTovarov1();
     while(rs2.next())
   {
    String[] row = 
    {
     rs2.getString("KodSpisok"),rs2.getString("Name1"), rs2.getString("Model"),
     rs2.getString("Price"),rs2.getString("Description"),rs2.getString("TachPad")
    };
    ResultSets1.add(row);
   }
     mdbc.close(rs2);
      soos.writeObject(ResultSets1);
     ResultSet rs3 = getResultFromSpisokTovarov2();
      while(rs3.next())
   {
    String[] row = 
    {
     rs3.getString("KodSpisok"),rs3.getString("Name1"), rs3.getString("Model"),
     rs3.getString("Price"),rs3.getString("Description"),rs3.getString("Typecommunicate")
    };
    ResultSets2.add(row);
   }
        mdbc.close(rs3);
       soos.writeObject(ResultSets2);  
          ResultSet rs4 = getResultFromSpisokTovarov3();
       while(rs4.next())
   {
    String[] row = 
    {
     rs4.getString("KodSpisok"),rs4.getString("Name1"), rs4.getString("Model"),
     rs4.getString("Price"),rs4.getString("Description"),rs4.getString("Types")
    };
    ResultSets3.add(row);
   }
      mdbc.close(rs4); 
    soos.writeObject(ResultSets3);
  }
  catch(SQLException | IOException e)
  {
   System.out.println("Exception in spisok tovarov");
  }
        mdbc.close(rs1);
        
}
if (clientMessageRecieved.equals("поисквглавнойтаблице"))
{ 
    String data=(String)sois.readObject();
    ResultSet rs1 = getResultFromSpisokTovarov1(data); 
     ArrayList<String[]> ResultSets=new ArrayList<>();
         try
  {   
     
    while(rs1.next())
   {
    String[] row = 
    {
     rs1.getString("KodSpisok"),rs1.getString("Name1"), rs1.getString("Model"),
     rs1.getString("Price")
    };
    ResultSets.add(row);    
   }  
   }
  catch(Exception e)
  {
   System.out.println("Ошибка при поиске");
  }
          soos.writeObject(ResultSets);
        mdbc.close(rs1);
} 
if (clientMessageRecieved.equals("удалитьизкорзины"))
{    
     try
     { int id = (int)sois.readObject();
         String b ;  
     b="DELETE FROM apannier WHERE KodPannier=" + id;
      stmt.executeUpdate(b);
     }
     catch(SQLException e){
     System.out.println("удаление данных не удачно");
     }
}
if (clientMessageRecieved.equals("удалитьизтаблицытоваров"))
{    
     try
     { int id = (int)sois.readObject();
         String b = "";
         b="DELETE FROM spisok WHERE KodSpisok=" + id;
      stmt.executeUpdate(b);
     }
     catch(SQLException e){
     System.out.println("удаление данных не удачно");
     }
}
if (clientMessageRecieved.equals("обновитьданные"))
{  
     try
     { String b ;
         String data;
     data=(String)sois.readObject(); 
   
     b=" UPDATE users SET lastname = '" +data+ "' WHERE KodUsers ="+ID ;
      stmt.executeUpdate(b);
       data=(String)sois.readObject();   
     b="UPDATE users SET firstname = '" +data+ "' WHERE KodUsers ="+ID ;
      stmt.executeUpdate(b);
       data=(String)sois.readObject();   
     b="UPDATE users SET otchestvo = '" +data+ "' WHERE KodUsers ="+ID ;
      stmt.executeUpdate(b);
       data=(String)sois.readObject();   
     b="UPDATE users SET adres = '" +data+ "' WHERE KodUsers ="+ID ;
      stmt.executeUpdate(b);
       data=(String)sois.readObject();   
     b="UPDATE acarddata SET nomerkard = '" +data+ "' WHERE KodUsers ="+ID ;
      stmt.executeUpdate(b);
      data=(String)sois.readObject();   
     b="UPDATE acarddata SET cvv2 = '" +data+ "' WHERE KodUsers ="+ID ;
      stmt.executeUpdate(b);
      data=(String)sois.readObject();   
     b="UPDATE acarddata SET srok1 = '" +data+ "' WHERE KodUsers ="+ID ;
      stmt.executeUpdate(b);
      data=(String)sois.readObject();   
     b="UPDATE acarddata SET srok2 = '" +data+ "' WHERE KodUsers ="+ID ;
      stmt.executeUpdate(b);
     }
     catch(SQLException e){
     System.out.println("Обновление данных не удачно");
     }
} 
if (clientMessageRecieved.equals("обновитьданныетаблицы"))
{  
     try
     { String b ;
         String id,name,model,price,desc,other;
     name=(String)sois.readObject(); 
     id=(String)sois.readObject(); 
     model=(String)sois.readObject();
     price=(String)sois.readObject(); 
     desc=(String)sois.readObject(); 
     other=(String)sois.readObject(); 
     b=" UPDATE spisok SET Model = '" +model+ "' WHERE KodSpisok ="+id ;
      stmt.executeUpdate(b);
      b=" UPDATE spisok SET Price = '" +price+ "' WHERE KodSpisok ="+id ;
      stmt.executeUpdate(b);
      b=" UPDATE spisok SET Description = '" +desc+ "' WHERE KodSpisok ="+id ;
      stmt.executeUpdate(b);
     
   if (name.equals("кроссовер"))
   { 
      b=" UPDATE spisokpk SET Computpower = '" +other+ "' WHERE KodSpisok ="+id ;
      stmt.executeUpdate(b);
   }
   if (name.equals("седан"))
   {
      b=" UPDATE spisoklaptod SET TachPad = '" +other+ "' WHERE KodSpisok ="+id ;
      stmt.executeUpdate(b);
   }       
   if (name.equals("внедорожник"))
   {
      b=" UPDATE spisoklaptod SET Typecommunicate = '" +other+ "' WHERE KodSpisok ="+id ;
      stmt.executeUpdate(b);
   }    
   if (name.equals("хетчбэк"))
   {
      b=" UPDATE spisokperipherii SET Types = '" +other+ "' WHERE KodSpisok ="+id ;
      stmt.executeUpdate(b);
   }
     }
     catch(SQLException e){
     System.out.println("Обновление данных не удачно");
     }
} 
if (clientMessageRecieved.equals("зарегистрировать"))
{
    login = (String)sois.readObject();
    password = (String)sois.readObject();
     try
       {
        ResultSet rs = getResultFromAuthentication1();
        String login1 ="";
         try {    
   while(rs.next())
   {
    String[] row = 
    {
     rs.getString("KodUsers"), rs.getString("Login"),
     rs.getString("Password")
    };
    login1=row[1];
   } 
  }
  catch(Exception e)
  {
   System.out.println("Ошибка при регистрации ");
  }
        if (login1.equals(login)){
            soos.writeObject("такойлогинесть");}
        else 
        {
            int q;
         q = getResultFromRegistration();
         ResultSet rs1 = getResultFromAuthentication1();    
   while(rs1.next())
   { 
     ID=rs1.getString("KodUsers");
   }
   q = getResultFromRegistration1();
         soos.writeObject("регистрацияуспешна");
        }
        mdbc.close(rs);         
       }
       catch(IOException | SQLException e)
       {
           System.out.print("Ошибка 2");
       }
}
      if (clientMessageRecieved.equalsIgnoreCase("quit")) 
      {
                    Thread.sleep(1000);
                    break;
       }
    clientMessageRecieved = (String)sois.readObject();
            }

            System.out.println("Клиент отключился");
            sois.close();
           soos.close();
           countminus();
            System.out.println("Количество клиентов "+count);
         //   serverSocket.close();

        } catch (IOException | InterruptedException e) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MonoThreadClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
