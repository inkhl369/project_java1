/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientforkyrsach;

import java.awt.Color;
import java.awt.Point;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ilya
 */
public class jframe22 extends javax.swing.JFrame {
ObjectOutputStream coos;
ObjectInputStream  cois;
ArrayList<computertechnika> spisok;
PieChart a;
    /**
     * Creates new form jframe22
     * @param coos
     * @param cois
     * @param point
     */
    public jframe22(ObjectOutputStream coos,ObjectInputStream  cois,Point point) {
        initComponents();
        this.coos=coos;
        this.cois=cois;
        setBounds(point.x, point.y, 516, 539);
        delete.setEnabled(false);
        redaction.setEnabled(false);
        maintable.getTableHeader().setReorderingAllowed(false);
        tablica1();
        tablica3();
          userstable.getTableHeader().setReorderingAllowed(false);
        tovartable.getTableHeader().setReorderingAllowed(false);
    }
private void tablica1()
    {
    try
       {  
            ArrayList<String[]> ResultSets;
            coos.writeObject("данныеглавнойтаблицы");
            ResultSets=(ArrayList<String[]>) cois.readObject();
            maintable.setModel(new  Table(ResultSets)); 
       }
       catch(IOException | ClassNotFoundException e)
       {
        
       }
    }
private void tablica3()
    {
    try
       {  
           spisok = new ArrayList<>();
            ArrayList<String[]> ResultSets;           
            coos.writeObject("данныеизтаблиц");
            ResultSets=(ArrayList<String[]>)cois.readObject(); 
        for (String[] ResultSet : ResultSets) {
            PK pk=new PK(ResultSet[0],ResultSet[1],ResultSet[2],Double.parseDouble(ResultSet[3]),ResultSet[4],Double.parseDouble(ResultSet[5]));
            spisok.add(pk);
        }
         ResultSets = new ArrayList<>();
         ResultSets=(ArrayList<String[]>)cois.readObject();
         for (String[] ResultSet : ResultSets) {
            laptod pk=new laptod(ResultSet[0],ResultSet[1],ResultSet[2],Double.parseDouble(ResultSet[3]),ResultSet[4],ResultSet[5]);
            spisok.add(pk);
        }
         ResultSets = new ArrayList<>();
         ResultSets=(ArrayList<String[]>)cois.readObject();
         for (String[] ResultSet : ResultSets) {
            mobile pk=new mobile(ResultSet[0],ResultSet[1],ResultSet[2],Double.parseDouble(ResultSet[3]),ResultSet[4],ResultSet[5]);
            spisok.add(pk);
        }
         ResultSets = new ArrayList<>();
         ResultSets=(ArrayList<String[]>)cois.readObject();
         for (String[] ResultSet : ResultSets) {
            computersperiphery pk=new computersperiphery(ResultSet[0],ResultSet[1],ResultSet[2],Double.parseDouble(ResultSet[3]),ResultSet[5],ResultSet[4]);
            spisok.add(pk);
        }      
       }
       catch(IOException | ClassNotFoundException e)
       {
        
       } 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        redactframe = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelid = new javax.swing.JLabel();
        labelname = new javax.swing.JLabel();
        model = new javax.swing.JTextField();
        description = new javax.swing.JTextField();
        other = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        price = new javax.swing.JTextField();
        addframe = new javax.swing.JFrame();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        addname = new javax.swing.JComboBox();
        addmodel = new javax.swing.JTextField();
        adddesc = new javax.swing.JTextField();
        addother = new javax.swing.JTextField();
        addbutton = new javax.swing.JButton();
        addprice = new javax.swing.JTextField();
        zaprosframe = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        userstable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tovartable = new javax.swing.JTable();
        cell = new javax.swing.JButton();
        prodan = new javax.swing.JFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        prodtable = new javax.swing.JTable();
        schet = new javax.swing.JButton();
        kolv = new javax.swing.JLabel();
        diagramma = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        maintable = new javax.swing.JTable();
        add = new javax.swing.JButton();
        redaction = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        zapros = new javax.swing.JMenuItem();
        technikaprod = new javax.swing.JMenuItem();
        diagr = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        redactframe.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                redactframeWindowClosing(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("Название");

        jLabel3.setText("Модель");

        jLabel4.setText("Цена");

        jLabel5.setText("Описание");

        jLabel6.setText("jLabel6");

        labelid.setText("jLabel7");

        labelname.setText("jLabel8");

        model.setText("jTextField1");

        description.setText("jTextField3");

        other.setText("jTextField4");

        save.setText("Сохранить изменения");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        price.setText("jTextField1");

        javax.swing.GroupLayout redactframeLayout = new javax.swing.GroupLayout(redactframe.getContentPane());
        redactframe.getContentPane().setLayout(redactframeLayout);
        redactframeLayout.setHorizontalGroup(
            redactframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redactframeLayout.createSequentialGroup()
                .addGroup(redactframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(redactframeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(redactframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(redactframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelname)
                            .addComponent(labelid)
                            .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(other, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(redactframeLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(save)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        redactframeLayout.setVerticalGroup(
            redactframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redactframeLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(redactframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelid))
                .addGap(18, 18, 18)
                .addGroup(redactframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(redactframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(redactframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(redactframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(redactframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(other, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(save)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        addframe.setAlwaysOnTop(true);

        jLabel7.setText("Название");

        jLabel8.setText("Модель");

        jLabel9.setText("Цена");

        jLabel10.setText("Описание");

        jLabel11.setText("jLabel11");

        addname.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "  ", "кроссовер", "седан", "внедорожник", "хетчбэк" }));
        addname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnameActionPerformed(evt);
            }
        });

        addbutton.setText("Добавить товар");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addframeLayout = new javax.swing.GroupLayout(addframe.getContentPane());
        addframe.getContentPane().setLayout(addframeLayout);
        addframeLayout.setHorizontalGroup(
            addframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addframeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(addframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adddesc)
                    .addGroup(addframeLayout.createSequentialGroup()
                        .addGroup(addframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addother, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addprice, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 124, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addframeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addbutton)
                .addGap(140, 140, 140))
        );
        addframeLayout.setVerticalGroup(
            addframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addframeLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(addframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(addname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(addmodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(addprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(addframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(adddesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(addframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(addother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(addbutton)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        userstable.setAutoCreateRowSorter(true);
        userstable.setModel(new Table1());
        jScrollPane2.setViewportView(userstable);

        tovartable.setAutoCreateRowSorter(true);
        tovartable.setModel(new Table2());
        tovartable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tovartableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tovartable);

        cell.setText("Продать ");
        cell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout zaprosframeLayout = new javax.swing.GroupLayout(zaprosframe.getContentPane());
        zaprosframe.getContentPane().setLayout(zaprosframeLayout);
        zaprosframeLayout.setHorizontalGroup(
            zaprosframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(zaprosframeLayout.createSequentialGroup()
                .addGroup(zaprosframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(zaprosframeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(zaprosframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(zaprosframeLayout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(cell, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        zaprosframeLayout.setVerticalGroup(
            zaprosframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, zaprosframeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cell)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        prodtable.setModel(new Table2());
        jScrollPane4.setViewportView(prodtable);

        schet.setText("Подсчитать полученную прибыль");
        schet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schetActionPerformed(evt);
            }
        });

        kolv.setText("0");

        javax.swing.GroupLayout prodanLayout = new javax.swing.GroupLayout(prodan.getContentPane());
        prodan.getContentPane().setLayout(prodanLayout);
        prodanLayout.setHorizontalGroup(
            prodanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prodanLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(prodanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(prodanLayout.createSequentialGroup()
                        .addComponent(schet)
                        .addGap(41, 41, 41)
                        .addComponent(kolv, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        prodanLayout.setVerticalGroup(
            prodanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prodanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(prodanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(schet)
                    .addComponent(kolv))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        diagramma.setAlwaysOnTop(true);
        diagramma.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout diagrammaLayout = new javax.swing.GroupLayout(diagramma.getContentPane());
        diagramma.getContentPane().setLayout(diagrammaLayout);
        diagrammaLayout.setHorizontalGroup(
            diagrammaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        diagrammaLayout.setVerticalGroup(
            diagrammaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        maintable.setAutoCreateRowSorter(true);
        maintable.setModel(new Table());
        maintable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maintableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(maintable);

        add.setText("Добавить");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        redaction.setText("Редактировать");
        redaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redactionActionPerformed(evt);
            }
        });

        delete.setText("Удалить");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jMenu1.setText("Меню");

        zapros.setText("Запросы");
        zapros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zaprosActionPerformed(evt);
            }
        });
        jMenu1.add(zapros);

        technikaprod.setText("Проданная техника");
        technikaprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                technikaprodActionPerformed(evt);
            }
        });
        jMenu1.add(technikaprod);

        diagr.setText("Диаграмма популярности товаров");
        diagr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagrActionPerformed(evt);
            }
        });
        jMenu1.add(diagr);

        jMenuItem3.setText("Выйти");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add)
                        .addGap(84, 84, 84)
                        .addComponent(redaction)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(delete))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(redaction)
                    .addComponent(delete))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        setBounds(0, 0, 516, 539);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
        coos.writeObject("quit");
    } catch (IOException ex) {
        Logger.getLogger(jframe1.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
        Thread.sleep(300);
    } catch (InterruptedException ex) {
        Logger.getLogger(jframe2.class.getName()).log(Level.SEVERE, null, ex);
    }
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                                    
    }//GEN-LAST:event_formWindowClosing

    private void maintableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maintableMouseClicked
       if(maintable.getSelectedRowCount() > 0)
        {
            delete.setEnabled(true);
            redaction.setEnabled(true);
        }
        else
        {
            delete.setEnabled(false);
            redaction.setEnabled(false);
        }
    }//GEN-LAST:event_maintableMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
         try
        {
            int ID = (int)maintable.getValueAt(maintable.getSelectedRow(), 0);
            coos.writeObject("удалитьизтаблицытоваров");
            coos.writeObject(ID);
        }
        catch(Exception e)
        {
            System.out.println("Ошибка");
        }
        tablica1();
        maintable.clearSelection();
        delete.setEnabled(false);
        redaction.setEnabled(false);
        tablica3();
    }//GEN-LAST:event_deleteActionPerformed

    private void redactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redactionActionPerformed
save.setBackground(Color.white);
        Point point;
            point= getLocation();
        redactframe.setVisible(true);
       redactframe.setBounds(point.x+60, point.y+90, 400, 400);
       String Name1=(String)maintable.getValueAt(maintable.getSelectedRow(), 1);
       String ID = Integer.toString((Integer)maintable.getValueAt(maintable.getSelectedRow(), 0));
       for(int i=0;i<spisok.size();i++)
       {
           if(spisok.get(i).getID().equals(ID) && spisok.get(i).getName().equals(Name1))
           {
               if (Name1.equals("кроссовер"))
               {
                   labelid.setText(ID);
                   labelname.setText(Name1);
                   model.setText(spisok.get(i).getModel());
                   price.setText(Double.toString(spisok.get(i).getPrice()));
                   description.setText(spisok.get(i).getDescription());
                   other.setText(Double.toString(spisok.get(i).getComputpower()));
                   jLabel6.setText("Мощность(тф)");
               }
               if (Name1.equals("седан"))
               {
                   labelid.setText(ID);
                   labelname.setText(Name1);
                   model.setText(spisok.get(i).getModel());
                   price.setText(Double.toString(spisok.get(i).getPrice()));
                   description.setText(spisok.get(i).getDescription());
                   other.setText(spisok.get(i).getSensorpanel());
                   jLabel6.setText("Тачпад");
               }
               if (Name1.equals("внедорожник"))
               {
                   labelid.setText(ID);
                   labelname.setText(Name1);
                   model.setText(spisok.get(i).getModel());
                   price.setText(Double.toString(spisok.get(i).getPrice()));
                   description.setText(spisok.get(i).getDescription());
                   other.setText(spisok.get(i).getSupcomgen());
                   jLabel6.setText("Связь");
               }
               if (Name1.equals("хетчбэк"))
               {
                   labelid.setText(ID);
                   labelname.setText(Name1);
                   model.setText(spisok.get(i).getModel());
                   price.setText(Double.toString(spisok.get(i).getPrice()));
                   description.setText(spisok.get(i).getDescription());
                   other.setText(spisok.get(i).getType());
                   jLabel6.setText("Тип периферии");
               }
           }
       }
    }//GEN-LAST:event_redactionActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

        try {
            if(model.getText().length()>2 &&  price.getText().length()>2){
            if(isDouble(price.getText())){
                if (jLabel6.getText().equals("Мощность(тф)"))
               {
                   if(isDouble(other.getText())){
             save.setBackground(Color.white);
        coos.writeObject("обновитьданныетаблицы");
        String Name1=labelname.getText();
        String ID=labelid.getText();
        String Model=model.getText();
        String Price=price.getText();
        String Desc=description.getText();
        String Other=other.getText();
        coos.writeObject(Name1);
        coos.writeObject(ID);
        coos.writeObject(Model);
        coos.writeObject(Price);
        coos.writeObject(Desc);
        coos.writeObject(Other);
         tablica1();
         tablica3();
                   } else save.setBackground(Color.RED);
            }
                else{save.setBackground(Color.white);
        coos.writeObject("обновитьданныетаблицы");
        String Name1=labelname.getText();
        String ID=labelid.getText();
        String Model=model.getText();
        String Price=price.getText();
        String Desc=description.getText();
        String Other=other.getText();
        coos.writeObject(Name1);
        coos.writeObject(ID);
        coos.writeObject(Model);
        coos.writeObject(Price);
        coos.writeObject(Desc);
        coos.writeObject(Other);
         tablica1();
         tablica3();}
            }
            else save.setBackground(Color.RED);
            }
            else save.setBackground(Color.RED);
    } catch (IOException ex) {
        Logger.getLogger(jframe22.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_saveActionPerformed

    private void redactframeWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_redactframeWindowClosing
       delete.setEnabled(false);
        redaction.setEnabled(false);
    }//GEN-LAST:event_redactframeWindowClosing

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        Point point;
        addbutton.setBackground(Color.white);
            point= getLocation();
        addframe.setVisible(true);
       addframe.setBounds(point.x+60, point.y+90, 400, 400);
       jLabel11.setVisible(false);
       addother.setVisible(false);
       addmodel.setText("");
       addprice.setText("");
       adddesc.setText("");
       addother.setText("");
       addbutton.setVisible(false);
    }//GEN-LAST:event_addActionPerformed

    private void addnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnameActionPerformed
        if (addname.getSelectedItem().equals("кроссовер"))
        {
            addmodel.setText("");
       addprice.setText("");
       adddesc.setText("");
       addother.setText("");
        jLabel11.setVisible(true);
        jLabel11.setText("Мощность(тф)");
        addother.setVisible(true); 
        addbutton.setVisible(true);
        }
        if (addname.getSelectedIndex()==0)
        {
            addmodel.setText("");
       addprice.setText("");
       adddesc.setText("");
       addother.setText("");
        jLabel11.setVisible(false);
        addother.setVisible(false); 
        addbutton.setVisible(false);
        }
        if (addname.getSelectedItem().equals("седан"))
        {
            addmodel.setText("");
       addprice.setText("");
       adddesc.setText("");
       addother.setText("");
        jLabel11.setVisible(true);
        jLabel11.setText("Тачпад");
        addother.setVisible(true); 
         addbutton.setVisible(true);
        }
        if (addname.getSelectedItem().equals("внедорожник"))
        {
            addmodel.setText("");
       addprice.setText("");
       adddesc.setText("");
       addother.setText("");
        jLabel11.setVisible(true);
        jLabel11.setText("Связь");
        addother.setVisible(true); 
         addbutton.setVisible(true);
        }
        if (addname.getSelectedItem().equals("хетчбэк"))
        {
            addmodel.setText("");
       addprice.setText("");
       adddesc.setText("");
       addother.setText("");
       jLabel11.setVisible(true);
        jLabel11.setText("Тип");
        addother.setVisible(true); 
         addbutton.setVisible(true);
        }
        
    }//GEN-LAST:event_addnameActionPerformed
public static boolean isDouble(String x) throws NumberFormatException
{
    try {
        Double.parseDouble(x);
        return true;
    } catch(Exception e) {
        return false;
    }
}
    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
      try{
        if(addmodel.getText().length()>0 && addprice.getText().length()>0 && adddesc.getText().length()>0 && addother.getText().length()>0)
       {
           if(isDouble(addprice.getText())){
               if (jLabel11.getText().equals("Мощность(тф)"))
               {
                   if(isDouble(addother.getText())){
               addbutton.setBackground(Color.white);
                coos.writeObject("добавлениетовара");
                coos.writeObject(addname.getSelectedItem());
                coos.writeObject(addmodel.getText());
                coos.writeObject(addprice.getText());
                coos.writeObject(adddesc.getText());
                coos.writeObject(addother.getText());
                   } else addbutton.setBackground(Color.RED);
                   
               }
               else {  addbutton.setBackground(Color.white);
                coos.writeObject("добавлениетовара");
                coos.writeObject(addname.getSelectedItem());
                coos.writeObject(addmodel.getText());
                coos.writeObject(addprice.getText());
                coos.writeObject(adddesc.getText());
                coos.writeObject(addother.getText());}
               
           }
           else addbutton.setBackground(Color.RED);
                   
       }
        else addbutton.setBackground(Color.RED);
      }catch (IOException ex) {
        Logger.getLogger(jframe22.class.getName()).log(Level.SEVERE, null, ex);
    }
      
      tablica1();
      tablica3();
      
    }//GEN-LAST:event_addbuttonActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
   Point point ;
            point= getLocation();
        new jframe1(coos,cois,point).setVisible(true);
         setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void zaprosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zaprosActionPerformed
    Point point;
            point= getLocation();
        zaprosframe.setVisible(true);
       zaprosframe.setBounds(point.x+10, point.y+40, 600, 500);
       cell.setVisible(false);
        try{
            ArrayList<String[]> ResultSets;
                coos.writeObject("СписокЗапросов");
                ResultSets=(ArrayList<String[]>) cois.readObject();
                tovartable.setModel(new  Table2(ResultSets));        
      }catch (IOException | ClassNotFoundException ex) {
        Logger.getLogger(jframe22.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_zaprosActionPerformed

    private void tovartableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tovartableMouseClicked
       if(tovartable.getSelectedRowCount()>0)
        {
            cell.setVisible(true);
           try {
               ArrayList<String[]> ResultSets;
               String ID=Integer.toString((Integer)tovartable.getValueAt(tovartable.getSelectedRow(), 0));
               coos.writeObject("СписокЗаказчиков");
               coos.writeObject(ID);
               ResultSets=(ArrayList<String[]>) cois.readObject();
               userstable.setModel(new  Table1(ResultSets));
           } catch (IOException | ClassNotFoundException ex) {
               Logger.getLogger(jframe22.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    }//GEN-LAST:event_tovartableMouseClicked

    private void cellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellActionPerformed
               try {
               String ID=Integer.toString((Integer)tovartable.getValueAt(tovartable.getSelectedRow(), 0));
               coos.writeObject("Продажатехники");
               coos.writeObject(ID);
               ArrayList<String[]> ResultSets;
                coos.writeObject("СписокЗапросов");
                ResultSets=(ArrayList<String[]>) cois.readObject();
                tovartable.setModel(new  Table2(ResultSets));
                userstable.setModel(new Table1());
           } catch (IOException | ClassNotFoundException ex) {
               Logger.getLogger(jframe22.class.getName()).log(Level.SEVERE, null, ex);
           }      
        cell.setVisible(false);
        
    }//GEN-LAST:event_cellActionPerformed

    private void technikaprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_technikaprodActionPerformed
       Point point;
            point= getLocation();
        prodan.setVisible(true);
       prodan.setBounds(point.x+10, point.y+40, 500, 300);
       try{
            ArrayList<String[]> ResultSets;
                coos.writeObject("Списокпроданнойтехники");
                ResultSets=(ArrayList<String[]>) cois.readObject();
                prodtable.setModel(new  Table2(ResultSets));        
      }catch (IOException | ClassNotFoundException ex) {
        Logger.getLogger(jframe22.class.getName()).log(Level.SEVERE, null, ex);
    }
       
    }//GEN-LAST:event_technikaprodActionPerformed

    private void schetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schetActionPerformed
        try{
                coos.writeObject("Полученнаяприбыль");
                String q=(String) cois.readObject(); 
                kolv.setText(q);
      }catch (IOException | ClassNotFoundException ex) {
        Logger.getLogger(jframe22.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_schetActionPerformed

    private void diagrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagrActionPerformed
        diagramma.getContentPane().removeAll();
        diagramma.getContentPane().repaint();
        Point point;
        point= getLocation();
        diagramma.setVisible(true);
        diagramma.setBounds(point.x+60, point.y+90, 400, 300);
        try
        {
            coos.writeObject("админдиаграмма"); 
            Double[] qwer=new Double[4];
            qwer[0]=(Double) cois.readObject();
            qwer[1]=(Double) cois.readObject();
            qwer[2]=(Double) cois.readObject();  
            qwer[3]=(Double) cois.readObject();       
             a=  new PieChart(qwer);
            diagramma.add(a);
            
        }
        catch(IOException | ClassNotFoundException e)
        {
            System.out.println("Ошибка диаграммы");
        }
    }//GEN-LAST:event_diagrActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton addbutton;
    private javax.swing.JTextField adddesc;
    private javax.swing.JFrame addframe;
    private javax.swing.JTextField addmodel;
    private javax.swing.JComboBox addname;
    private javax.swing.JTextField addother;
    private javax.swing.JTextField addprice;
    private javax.swing.JButton cell;
    private javax.swing.JButton delete;
    private javax.swing.JTextField description;
    private javax.swing.JMenuItem diagr;
    private javax.swing.JFrame diagramma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel kolv;
    private javax.swing.JLabel labelid;
    private javax.swing.JLabel labelname;
    private javax.swing.JTable maintable;
    private javax.swing.JTextField model;
    private javax.swing.JTextField other;
    private javax.swing.JTextField price;
    private javax.swing.JFrame prodan;
    private javax.swing.JTable prodtable;
    private javax.swing.JFrame redactframe;
    private javax.swing.JButton redaction;
    private javax.swing.JButton save;
    private javax.swing.JButton schet;
    private javax.swing.JMenuItem technikaprod;
    private javax.swing.JTable tovartable;
    private javax.swing.JTable userstable;
    private javax.swing.JMenuItem zapros;
    private javax.swing.JFrame zaprosframe;
    // End of variables declaration//GEN-END:variables

}