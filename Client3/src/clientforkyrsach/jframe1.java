package clientforkyrsach;

import java.awt.Point;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class jframe1 extends javax.swing.JFrame {
ObjectOutputStream coos;
ObjectInputStream  cois;
    /**
     * Creates new form jframe1
     * @param coos
     * @param cois
     */
    public jframe1(ObjectOutputStream coos,ObjectInputStream  cois) {
        initComponents();
        this.coos=coos;
        this.cois=cois;     
    
    }

    public jframe1(ObjectOutputStream coos,ObjectInputStream  cois,Point point) {
        initComponents();
        this.coos=coos;
        this.cois=cois;
        setBounds(point.x, point.y, 516, 539);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        second = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        login2 = new javax.swing.JTextField();
        password2 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        password22 = new javax.swing.JPasswordField();
        registration2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        login = new javax.swing.JTextField();
        labelforlogin = new javax.swing.JLabel();
        labelforpassword = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buttontovxod = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonregistr = new javax.swing.JButton();

        jLabel4.setText("Введите логин");

        jLabel5.setText("Введите пароль");

        jLabel6.setText("Подтвердите пароль");

        registration2.setText("Зарегистрироваться");
        registration2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registration2ActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout secondLayout = new javax.swing.GroupLayout(second.getContentPane());
        second.getContentPane().setLayout(secondLayout);
        secondLayout.setHorizontalGroup(
            secondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondLayout.createSequentialGroup()
                .addGroup(secondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(secondLayout.createSequentialGroup()
                        .addGroup(secondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(secondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(secondLayout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addGroup(secondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGap(36, 36, 36)
                                    .addGroup(secondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(password2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(login2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, secondLayout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(jLabel6)
                                    .addGap(27, 27, 27)
                                    .addComponent(password22, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(secondLayout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(registration2)))
                        .addGap(0, 73, Short.MAX_VALUE))
                    .addGroup(secondLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        secondLayout.setVerticalGroup(
            secondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(secondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(login2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(secondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(password2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(secondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(password22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(registration2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Авторизация или регистрация в систему");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        labelforlogin.setText("Логин");

        labelforpassword.setText("Пароль");

        jLabel1.setFont(new java.awt.Font("Tahoma", 10, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Добро пожаловать в систему учета продаж автомобилей в автосалоне");
        jLabel1.setAutoscrolls(true);

        buttontovxod.setBackground(new java.awt.Color(79, 177, 25));
        buttontovxod.setForeground(new java.awt.Color(238, 234, 234));
        buttontovxod.setText("Войти");
        buttontovxod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttontovxodActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setText("Еще не были у нас? Нажмите на кнопку для регистрации");

        buttonregistr.setBackground(new java.awt.Color(79, 177, 25));
        buttonregistr.setText("Регистрация");
        buttonregistr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonregistrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelforlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelforpassword))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(password)
                                    .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(buttontovxod))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addComponent(buttonregistr))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelforlogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelforpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttontovxod)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(buttonregistr)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(516, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttontovxodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttontovxodActionPerformed
     String login1,password1,command;
     login1=login.getText();
     password1=password.getText();
     if(login1.length()>=5 && password1.length()>=5){
        try {
         coos.writeObject("войти");
         coos.writeObject(login1);
         coos.writeObject(password1);
         command=(String)cois.readObject();
         if(command.equals("входкакпользователь")||command.equals("входкакадмин")){
             jLabel2.setText("Выполнен вход в систему");
             Point point;
            point= getLocation();
         if  (command.equals("входкакпользователь"))
         {new jframe2(coos,cois,point).setVisible(true);
         }
         if (command.equals("входкакадмин"))
         {jLabel2.setText("Админ вошел в систему");
         new jframe22(coos,cois,point).setVisible(true);
         }
         setVisible(false);
         }  
         
         else jLabel2.setText("Ошибка при входе в систему");
      
    } catch (IOException ex) {
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(jframe1.class.getName()).log(Level.SEVERE, null, ex);
    }
     }
     else jLabel2.setText("Длина логина и пароля должна быть больше 5 символов");
    login.setText(null);
    password.setText(null);
    
    //buttontovxod.setSelected(false);
    }//GEN-LAST:event_buttontovxodActionPerformed

    private void buttonregistrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonregistrActionPerformed
        Point point;
            point= getLocation();
        second.setVisible(true);
       second.setBounds(point.x+60, point.y+90, 400, 400);
        login2.setText(null);
    password2.setText(null);
    password22.setText(null);
    }//GEN-LAST:event_buttonregistrActionPerformed

    private void registration2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registration2ActionPerformed
      
        String login1,password1,password12,command;
     login1=login2.getText();
     password1=password2.getText();
     password12=password22.getText();
     if (password1.length()>=5 && password12.length()>=5)
     {
         if(password1.equals(password12))
         {
         try {
         coos.writeObject("зарегистрировать");
         coos.writeObject(login1);
         coos.writeObject(password1);
         command=(String)cois.readObject();
         if(command.equals("такойлогинесть"))
         {
         jLabel7.setText("Такой логин уже есть. Введите новый");
         login2.setText(null);
         }
          if(command.equals("регистрацияуспешна"))
         {
         jLabel7.setText("Вы успешно зарегистрировались в системе");
         }
         } catch (IOException ex) {
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(jframe1.class.getName()).log(Level.SEVERE, null, ex);
    }
         }
         else {jLabel7.setText("Ошибка при вводе пароля");
         password2.setText(null);
    password22.setText(null);}
     }
     else {jLabel7.setText("Длина логина и пароля должна быть больше 5 символов");
     login2.setText(null);
    password2.setText(null);
    password22.setText(null);}
    }//GEN-LAST:event_registration2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    try {
        coos.writeObject("quit");
    } catch (IOException ex) {
        Logger.getLogger(jframe1.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonregistr;
    private javax.swing.JButton buttontovxod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelforlogin;
    private javax.swing.JLabel labelforpassword;
    private javax.swing.JTextField login;
    private javax.swing.JTextField login2;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField password2;
    private javax.swing.JPasswordField password22;
    private javax.swing.JButton registration2;
    private javax.swing.JFrame second;
    // End of variables declaration//GEN-END:variables
}
