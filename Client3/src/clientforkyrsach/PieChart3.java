package clientforkyrsach;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class PieChart3 extends javax.swing.JPanel {
 Slice[] slices;
 String[] name;
    /**
     * Creates new form PieChart3
     * @param qwer
     * @param qwer2
     */
    public PieChart3(Double qwer[],String qwer2[]) {
        
        Random random = new Random();
        slices= new Slice[qwer.length];
        name=new String[qwer2.length];
        for(int i=0;i<slices.length;i++)
        { int q;
        q=random.nextInt(255)+1;
            slices[i]=new Slice(qwer[i],Color.getHSBColor(random.nextInt(q)+1, random.nextInt(q)+1, random.nextInt(q)+1));  
        name[i]=qwer2[i];}                    
        initComponents();
        setSize(new Dimension(400,400));
    }
 @Override
 public void paintComponent(Graphics g) {
    super.paintComponent(g);
     double total = 0.0D;
     for (Slice slice : slices) {
         total += slice.value;
     }
     Rectangle area=getBounds();
      double curValue = 0.0D;
      int startAngle;
     for (Slice slice : slices) {
         startAngle = (int) (curValue * 360 / total);
         int arcAngle = (int) (slice.value * 360 / total);
         g.setColor(slice.color);
         g.fillArc(area.x/2, area.y/2, area.width/2, area.height/2,
                 startAngle, arcAngle);
         curValue += slice.value;
     }
     int y=30;
     for(int i=0;i<name.length;i++)
     {g.setColor(slices[i].color);
	g.drawString(name[i], 250, y); 
        y+=20;
     }
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setAutoscrolls(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
class Slice {
   double value;
   Color color;
   public Slice(double value, Color color) {  
      this.value = value;
      this.color = color;
   }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
