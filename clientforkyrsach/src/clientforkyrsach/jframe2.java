package clientforkyrsach;

import java.awt.Color;
import java.awt.Point;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class jframe2 extends javax.swing.JFrame {
ObjectOutputStream coos;
ObjectInputStream  cois;
user user1;
PieChart3 a;
ArrayList<cars> list = new ArrayList<>();
      public jframe2(ObjectOutputStream coos,ObjectInputStream  cois,Point point) {
        this.coos=coos;
        this.cois=cois;
        initComponents(); 
        setBounds(point.x, point.y, 516, 539);
        user1=new user();
        try{
        coos.writeObject("получитьданные");
        user1.setID((String)cois.readObject());
        user1.setLogin((String)cois.readObject());
        user1.setPassword((String)cois.readObject());
        user1.setlastname((String)cois.readObject());
        user1.setName((String)cois.readObject());
        user1.setmiddlename((String)cois.readObject());
        user1.setAdres((String)cois.readObject());
        user1.setNomercard((String)cois.readObject());
        user1.setvalidity1((String)cois.readObject());
        user1.setvalidity2((String)cois.readObject());
        user1.setCvv2((String)cois.readObject());
        
        jLabel10.setVisible(false);
        tablica1();
        tablica3();
        addbut.setEnabled(false);
        DeleteButton.setEnabled(false);
        seeallinfo.setEnabled(false);
        maintable.getTableHeader().setReorderingAllowed(false);
        klienttable.getTableHeader().setReorderingAllowed(false);
        }
          catch (IOException ex) {        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(jframe1.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }

    private void initComponents() {

        secondframe = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        month = new javax.swing.JComboBox();
        year = new javax.swing.JComboBox();
        name = new javax.swing.JTextField();
        middlename = new javax.swing.JTextField();
        adres = new javax.swing.JTextField();
        cardnumber = new javax.swing.JTextField();
        confirm = new javax.swing.JButton();
        cvv2 = new javax.swing.JFormattedTextField();
        lastname = new javax.swing.JTextField();
        thirdframe = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        klienttable = new javax.swing.JTable();
        BuyButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        cost = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        button = new javax.swing.JButton();
        qaz = new javax.swing.JCheckBox();
        diagrammframe = new javax.swing.JFrame();
        seeframe = new javax.swing.JFrame();
        labelid = new javax.swing.JLabel();
        labelname = new javax.swing.JLabel();
        labelmodel = new javax.swing.JLabel();
        labelprice = new javax.swing.JLabel();
        labeldescription = new javax.swing.JLabel();
        otherlabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        addbut = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        maintable = new javax.swing.JTable();
        poisk = new javax.swing.JButton();
        update = new javax.swing.JButton();
        seeallinfo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menubutton1 = new javax.swing.JMenuItem();
        menubutton2 = new javax.swing.JMenuItem();
        diagramma = new javax.swing.JMenuItem();
        menubutton3 = new javax.swing.JMenuItem();

        secondframe.setTitle("Личные данные");

        jLabel1.setText("Фамилия");

        jLabel2.setText("Имя");

        jLabel3.setText("Отчество");

        jLabel4.setText("Адрес");

        jLabel5.setText("Номер карты");

        jLabel6.setText("Срок действия");

        jLabel7.setText("CVV2/CVC2");

        month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2020", "2021", "2022", "2023", "2024", "2025" }));

        name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameMouseClicked(evt);
            }
        });

        middlename.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                middlenameMouseClicked(evt);
            }
        });

        confirm.setText("Подтвердить");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        cvv2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0"))));

        lastname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lastnameMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout secondframeLayout = new javax.swing.GroupLayout(secondframe.getContentPane());
        secondframe.getContentPane().setLayout(secondframeLayout);
        secondframeLayout.setHorizontalGroup(
            secondframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(secondframeLayout.createSequentialGroup()
                .addGroup(secondframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(secondframeLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(secondframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(secondframeLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(48, 48, 48)
                                .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addGroup(secondframeLayout.createSequentialGroup()
                                .addGroup(secondframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(40, 40, 40)
                                .addGroup(secondframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(name)
                                    .addComponent(middlename)
                                    .addComponent(adres, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(lastname)))
                            .addComponent(jLabel7)))
                    .addGroup(secondframeLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(secondframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirm)
                            .addComponent(cardnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cvv2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        secondframeLayout.setVerticalGroup(
            secondframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondframeLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(secondframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(secondframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(secondframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(middlename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(secondframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(adres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(secondframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cardnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(secondframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(secondframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cvv2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(confirm)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        thirdframe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thirdframeMouseClicked(evt);
            }
        });
        thirdframe.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                thirdframeWindowClosing(evt);
            }
        });

        klienttable.setModel(new Table());
        klienttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                klienttableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(klienttable);

        BuyButton.setText("Купить");
        BuyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Удалить");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        cost.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cost.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cost.setText("0");
        cost.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cost.setMaximumSize(new java.awt.Dimension(4, 4));
        cost.setMinimumSize(new java.awt.Dimension(0, 4));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setLabelFor(BuyButton);
        jLabel10.setText("Введите корректные личные данные");

        button.setText("Подсчитать стоимость автомобилей");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        qaz.setText("Сохранить данные корзины при покупке?");

        javax.swing.GroupLayout thirdframeLayout = new javax.swing.GroupLayout(thirdframe.getContentPane());
        thirdframe.getContentPane().setLayout(thirdframeLayout);
        thirdframeLayout.setHorizontalGroup(
            thirdframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thirdframeLayout.createSequentialGroup()
                .addGroup(thirdframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(thirdframeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(thirdframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, thirdframeLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(DeleteButton))))
                    .addGroup(thirdframeLayout.createSequentialGroup()
                        .addGroup(thirdframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(thirdframeLayout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(BuyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(thirdframeLayout.createSequentialGroup()
                                .addComponent(button)
                                .addGap(18, 18, 18)
                                .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 76, Short.MAX_VALUE)))
                .addGap(31, 31, 31))
            .addGroup(thirdframeLayout.createSequentialGroup()
                .addGroup(thirdframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(thirdframeLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(thirdframeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(qaz)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        thirdframeLayout.setVerticalGroup(
            thirdframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, thirdframeLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(thirdframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteButton)
                .addGap(11, 11, 11)
                .addComponent(qaz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(BuyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        diagrammframe.setAlwaysOnTop(true);

        javax.swing.GroupLayout diagrammframeLayout = new javax.swing.GroupLayout(diagrammframe.getContentPane());
        diagrammframe.getContentPane().setLayout(diagrammframeLayout);
        diagrammframeLayout.setHorizontalGroup(
            diagrammframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        diagrammframeLayout.setVerticalGroup(
            diagrammframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        labelid.setText("jLabel11");

        labelname.setText("jLabel12");

        labelmodel.setText("jLabel13");

        labelprice.setText("jLabel14");

        labeldescription.setText("jLabel15");

        otherlabel.setText("jLabel16");

        jLabel11.setText("ID");

        jLabel12.setText("Название");

        jLabel13.setText("Модель");

        jLabel14.setText("Цена");

        jLabel15.setText("Описание");

        jLabel16.setText("jLabel16");

        javax.swing.GroupLayout seeframeLayout = new javax.swing.GroupLayout(seeframe.getContentPane());
        seeframe.getContentPane().setLayout(seeframeLayout);
        seeframeLayout.setHorizontalGroup(
            seeframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seeframeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(seeframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 14, Short.MAX_VALUE)
                .addGroup(seeframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(otherlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelprice, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelname, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelid, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labeldescription, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
                .addContainerGap())
        );
        seeframeLayout.setVerticalGroup(
            seeframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seeframeLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(seeframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelid)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(seeframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelname)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(seeframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelmodel)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(seeframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelprice)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(seeframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeldescription)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(seeframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(otherlabel)
                    .addComponent(jLabel16))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocationByPlatform(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel8.setText("Введите данные для поиска");

        addbut.setText("Добавить в корзину");
        addbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbutActionPerformed(evt);
            }
        });

        maintable.setAutoCreateRowSorter(true);
        maintable.setModel(new Table());
        maintable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maintableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(maintable);

        poisk.setText("Поиск");
        poisk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poiskActionPerformed(evt);
            }
        });

        update.setText("Обновить");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        seeallinfo.setText("Посмотреть всю информацию");
        seeallinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeallinfoActionPerformed(evt);
            }
        });

        jMenu1.setText("Меню");

        menubutton1.setText("Личные данные");
        menubutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menubutton1ActionPerformed(evt);
            }
        });
        jMenu1.add(menubutton1);

        menubutton2.setText("Корзина");
        menubutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menubutton2ActionPerformed(evt);
            }
        });
        jMenu1.add(menubutton2);

        diagramma.setText("Диаграмма автомобилей в корзине");
        diagramma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagrammaActionPerformed(evt);
            }
        });
        jMenu1.add(diagramma);

        menubutton3.setText("Разлогиниться");
        menubutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menubutton3ActionPerformed(evt);
            }
        });
        jMenu1.add(menubutton3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(update)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(poisk))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(seeallinfo)
                        .addGap(67, 67, 67)
                        .addComponent(addbut))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(poisk))
                .addGap(7, 7, 7)
                .addComponent(update)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbut)
                    .addComponent(seeallinfo))
                .addGap(26, 26, 26))
        );

        setBounds(0, 0, 516, 539);
    }

    private void menubutton3ActionPerformed(java.awt.event.ActionEvent evt) {
    
        try {
        coos.writeObject("обновитьданные");
        coos.writeObject(user1.getlastname());
        coos.writeObject(user1.getName());
        coos.writeObject(user1.getmiddlename());
        coos.writeObject(user1.getAdres());
        coos.writeObject(user1.getNomercard());
        coos.writeObject(user1.getCvv2());
        coos.writeObject(user1.getvalidity1());
        coos.writeObject(user1.getvalidity2());
    } catch (IOException ex) {
        Logger.getLogger(jframe1.class.getName()).log(Level.SEVERE, null, ex);
    }
        Point point ;
            point= getLocation();
        new jframe1(coos,cois,point).setVisible(true);
         setVisible(false);
    }

    private void menubutton1ActionPerformed(java.awt.event.ActionEvent evt) {
     Point point;
            point= getLocation();
        secondframe.setVisible(true);
       secondframe.setBounds(point.x+60, point.y+90, 400, 400);
       jLabel10.setVisible(false);
       lastname.setText(user1.getlastname());
       name.setText(user1.getName());
       middlename.setText(user1.getmiddlename());
       adres.setText(user1.getAdres());
       cardnumber.setText(user1.getNomercard());
       cvv2.setText(user1.getCvv2());
       month.setSelectedItem(user1.getvalidity1());
       year.setSelectedItem(user1.getvalidity2());
    }

    
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {
      
        try {
        coos.writeObject("обновитьданные");
        coos.writeObject(user1.getlastname());
        coos.writeObject(user1.getName());
        coos.writeObject(user1.getmiddlename());
        coos.writeObject(user1.getAdres());
        coos.writeObject(user1.getNomercard());
        coos.writeObject(user1.getCvv2());
        coos.writeObject(user1.getvalidity1());
        coos.writeObject(user1.getvalidity2());
        coos.writeObject("quit");
    } catch (IOException ex) {
        Logger.getLogger(jframe1.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
        Thread.sleep(1000);
    } catch (InterruptedException ex) {
        Logger.getLogger(jframe2.class.getName()).log(Level.SEVERE, null, ex);
    }
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing

    private void menubutton2ActionPerformed(java.awt.event.ActionEvent evt) {
    
        Point point;
            point= getLocation();
        thirdframe.setVisible(true);
       thirdframe.setBounds(point.x+60, point.y+90, 400, 400);
    tablica();   
       BuyButton.setBackground(Color.WHITE);
    }

    private void tablica()
    {
    try
       {  
            ArrayList<String[]> ResultSets;
            coos.writeObject("корзина");
            ResultSets=(ArrayList<String[]>) cois.readObject();
            klienttable.setModel(new  Table(ResultSets)); 
       }
       catch(IOException | ClassNotFoundException e)
       {
        
       }
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
            ArrayList<String[]> ResultSets;
            
            coos.writeObject("данныеизтаблиц");
            ResultSets=(ArrayList<String[]>)cois.readObject(); 
        for (String[] ResultSet : ResultSets) {
            crossover pk=new crossover(ResultSet[0],ResultSet[1],ResultSet[2],Double.parseDouble(ResultSet[3]),ResultSet[4],Double.parseDouble(ResultSet[5]));
            list.add(pk);
        }
         ResultSets = new ArrayList<>();
         ResultSets=(ArrayList<String[]>)cois.readObject();
         for (String[] ResultSet : ResultSets) {
            sedan pk=new sedan(ResultSet[0],ResultSet[1],ResultSet[2],Double.parseDouble(ResultSet[3]),ResultSet[4],ResultSet[5]);
            list.add(pk);
        }
         ResultSets = new ArrayList<>();
         ResultSets=(ArrayList<String[]>)cois.readObject();
         for (String[] ResultSet : ResultSets) {
            suv pk=new suv(ResultSet[0],ResultSet[1],ResultSet[2],Double.parseDouble(ResultSet[3]),ResultSet[4],ResultSet[5]);
            list.add(pk);
        }
         ResultSets = new ArrayList<>();
         ResultSets=(ArrayList<String[]>)cois.readObject();
         for (String[] ResultSet : ResultSets) {
            hatchback pk=new hatchback(ResultSet[0],ResultSet[1],ResultSet[2],Double.parseDouble(ResultSet[3]),ResultSet[5],ResultSet[4]);
            list.add(pk);
        }          
       }
       catch(IOException | ClassNotFoundException e)
       {
        
       } 
    }
    private void tablica2()
    {
    try
       {  
            ArrayList<String[]> ResultSets;
            coos.writeObject("поисквглавнойтаблице");
            String data=search.getText();
            coos.writeObject(data);
            ResultSets=(ArrayList<String[]>) cois.readObject();
            maintable.setModel(new  Table(ResultSets)); 
       }
       catch(IOException | ClassNotFoundException e)
       {
       }
    }
    
    public static boolean isString(String x) throws NumberFormatException
{
    try {
        Integer.parseInt(x);
        return false;
    } catch(Exception e) {
        return true;
    }
}
    
    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {
       if(isString(lastname.getText()))
        user1.setlastname(lastname.getText());
       else lastname.setText("Ошибка");
       if(isString(name.getText())) 
        user1.setName(name.getText());
       else name.setText("Ошибка");
       if(isString(middlename.getText()))
        user1.setmiddlename(middlename.getText());
       else name.setText("Ошибка");
        user1.setAdres(adres.getText());
        user1.setNomercard(cardnumber.getText());
        user1.setvalidity1((String)month.getSelectedItem());
        user1.setvalidity2((String)year.getSelectedItem());
        user1.setCvv2(cvv2.getText());
        
    }

    private void thirdframeMouseClicked(java.awt.event.MouseEvent evt) {

            klienttable.clearSelection();
             DeleteButton.setEnabled(false);
        
    }

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {

        try
        {
            int ID = (int)klienttable.getValueAt(klienttable.getSelectedRow(), 0);
            coos.writeObject("удалитьизкорзины");
            coos.writeObject(ID);
            tablica();
        klienttable.clearSelection();
        DeleteButton.setEnabled(false);
        }
        catch(Exception e)
        {
            System.out.println("Ошибка");
        }
        
    }

    private void BuyButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if(user1.getlastname().length()>3 && user1.getName().length()>3
                && user1.getmiddlename().length()>3 && user1.getAdres().length()>10
                && user1.getNomercard().length()>=16 &&( user1.getCvv2().length()>2 &&
                user1.getCvv2().length()<5 ) )
        {
            if(klienttable.getRowCount()>0){
            try
        {
            ArrayList<String[]> ResultSets;
            coos.writeObject("корзина1");
            ResultSets=(ArrayList<String[]>) cois.readObject();
            if(ResultSets.size()>=1 && qaz.isSelected()){
            File file = new File(user1.getLogin()+".txt");
            if(!file.exists())
            {
		file.createNewFile();
                 try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(user1.getLogin()+"0.txt")))
                      {
                         oos.writeObject(user1);
                         }
                catch(Exception ex){
                System.out.println(ex.getMessage());
                 } 
            }
                try (FileWriter out = new FileWriter(file, true)) {
                    for (String[] row : ResultSets) {
                        for (String row1 : row) {
                            out.write("  "+row1+"  ");
                        }
                    }
                    out.write("\n");
                }
            }
            coos.writeObject("купить");
        }
        catch(IOException | ClassNotFoundException e)
        {
        }
        }
            else BuyButton.setBackground(Color.RED);
             }
        else {
            jLabel10.setVisible(true);
        }
          tablica();
    }

    private void klienttableMouseClicked(java.awt.event.MouseEvent evt) {
        if(klienttable.getSelectedRowCount() > 0)
        {
            DeleteButton.setEnabled(true);
        }
        else DeleteButton.setEnabled(false);
        
    }

    private void maintableMouseClicked(java.awt.event.MouseEvent evt) {
        if(maintable.getSelectedRowCount()>0)
        {addbut.setEnabled(true);
        seeallinfo.setEnabled(true);}
        else
        {addbut.setEnabled(false);
        seeallinfo.setEnabled(false);}
    }
 
    private void addbutActionPerformed(java.awt.event.ActionEvent evt) {
       try
       {  
          String ID=Integer.toString((Integer)maintable.getValueAt(maintable.getSelectedRow(), 0));
            coos.writeObject("данныевкорзину");
            coos.writeObject(ID);
            maintable.clearSelection();
            addbut.setEnabled(false);
            seeallinfo.setEnabled(false);
       }
       catch(Exception e)
       {
        System.out.println("Ошибка");
       }
    }

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {
      search.setText("");
      tablica1();
      addbut.setEnabled(false);
      seeallinfo.setEnabled(false);
      maintable.clearSelection();
      tablica3();
    }

    private void poiskActionPerformed(java.awt.event.ActionEvent evt) {
     tablica2();
    }

    private void diagrammaActionPerformed(java.awt.event.ActionEvent evt) {
   diagrammframe.getContentPane().removeAll();
diagrammframe.getContentPane().repaint();
        Point point;
            point= getLocation();
        diagrammframe.setVisible(true);
       diagrammframe.setBounds(point.x+60, point.y+90, 400, 400);
      
       try
        {
            ArrayList<String[]> ResultSets;
            coos.writeObject("корзина12");
            ResultSets=(ArrayList<String[]>) cois.readObject();  
            if(ResultSets.size()>=1){
                 Double[] qwer=(Double[]) cois.readObject();
                 String[] qwer2=(String[]) cois.readObject();
                    
           
             a=  new PieChart3(qwer,qwer2);
            diagrammframe.add(a);
            }
        }
        catch(IOException | ClassNotFoundException e)
        {
            System.out.println("Chart error");//"Ошибка диаграммы"
        }
    }

    private void formMouseClicked(java.awt.event.MouseEvent evt) {
        addbut.setEnabled(false);
      seeallinfo.setEnabled(false);
      maintable.clearSelection();
    }

    private void seeallinfoActionPerformed(java.awt.event.ActionEvent evt) {
       Point point;
            point= getLocation();
        seeframe.setVisible(true);
       seeframe.setBounds(point.x+60, point.y+90, 400, 400);
       String Name1=(String)maintable.getValueAt(maintable.getSelectedRow(), 1);
       String ID = Integer.toString((Integer)maintable.getValueAt(maintable.getSelectedRow(), 0));
       for(int i=0;i<list.size();i++)
       {
           if(list.get(i).getID().equals(ID) && list.get(i).getName().equals(Name1))
           {
               if (Name1.equals("кроссовер"))
               {
                   labelid.setText(ID);
                   labelname.setText(Name1);
                   labelmodel.setText(list.get(i).getModel());
                   labelprice.setText(Double.toString(list.get(i).getPrice()));
                   labeldescription.setText(list.get(i).getDescription());
                   otherlabel.setText(Double.toString(list.get(i).getvolumeTrunk()));
                   jLabel16.setText("Объём багажника(л)");
               }
               if (Name1.equals("седан"))
               {
                   labelid.setText(ID);
                   labelname.setText(Name1);
                   labelmodel.setText(list.get(i).getModel());
                   labelprice.setText(Double.toString(list.get(i).getPrice()));
                   labeldescription.setText(list.get(i).getDescription());
                   otherlabel.setText(list.get(i).getTypeOfDrive());
                   jLabel16.setText("Тип привода");
               }
               if (Name1.equals("внедорожник"))
               {
                   labelid.setText(ID);
                   labelname.setText(Name1);
                   labelmodel.setText(list.get(i).getModel());
                   labelprice.setText(Double.toString(list.get(i).getPrice()));
                   labeldescription.setText(list.get(i).getDescription());
                   otherlabel.setText(list.get(i).getTypeSuspension());
                   jLabel16.setText("Тип сцепления");
               }
               if (Name1.equals("хетчбэк"))
               {
                   labelid.setText(ID);
                   labelname.setText(Name1);
                   labelmodel.setText(list.get(i).getModel());
                   labelprice.setText(Double.toString(list.get(i).getPrice()));
                   labeldescription.setText(list.get(i).getDescription());
                   otherlabel.setText(list.get(i).getType());
                   jLabel16.setText("Наличие пятой двери");
                   
               }
           }
       }
    }

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {
        try
       {  
            coos.writeObject("стоимостьвкорзине");
            cost.setText((String) cois.readObject());
       }
       catch(IOException | ClassNotFoundException e)
       {
        
       }
    }

    private void thirdframeWindowClosing(java.awt.event.WindowEvent evt) {
        DeleteButton.setEnabled(false);
    }

    private void lastnameMouseClicked(java.awt.event.MouseEvent evt) {
        if(lastname.getText().equals("Ошибка"))
            lastname.setText("");
    }

    private void nameMouseClicked(java.awt.event.MouseEvent evt) {
        if(name.getText().equals("Ошибка"))
            name.setText("");
    }

    private void middlenameMouseClicked(java.awt.event.MouseEvent evt) {
        if(middlename.getText().equals("Ошибка"))
            middlename.setText("");
    }

    private javax.swing.JButton BuyButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton addbut;
    private javax.swing.JTextField adres;
    private javax.swing.JButton button;
    private javax.swing.JTextField cardnumber;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel cost;
    private javax.swing.JFormattedTextField cvv2;
    private javax.swing.JMenuItem diagramma;
    private javax.swing.JFrame diagrammframe;
    private javax.swing.JTextField lastname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable klienttable;
    private javax.swing.JLabel labeldescription;
    private javax.swing.JLabel labelid;
    private javax.swing.JLabel labelmodel;
    private javax.swing.JLabel labelname;
    private javax.swing.JLabel labelprice;
    private javax.swing.JTable maintable;
    private javax.swing.JMenuItem menubutton1;
    private javax.swing.JMenuItem menubutton2;
    private javax.swing.JMenuItem menubutton3;
    private javax.swing.JComboBox month;
    private javax.swing.JTextField name;
    private javax.swing.JTextField middlename;
    private javax.swing.JLabel otherlabel;
    private javax.swing.JButton poisk;
    private javax.swing.JCheckBox qaz;
    private javax.swing.JTextField search;
    private javax.swing.JFrame secondframe;
    private javax.swing.JButton seeallinfo;
    private javax.swing.JFrame seeframe;
    private javax.swing.JFrame thirdframe;
    private javax.swing.JButton update;
    private javax.swing.JComboBox year;

}
