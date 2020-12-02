package clientforkyrsach;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class PieChart extends javax.swing.JPanel {
 Slice[] slices;
 String[] name={"кроссовер","внедорожник","седан","хетчбэк"};
    /**
     * Creates new form PieChart3
     * @param qwer
     */
    public PieChart(Double qwer[]) {
        Random random = new Random();
        slices= new Slice[4];
         slices[0]=new Slice(qwer[0],Color.RED);
          slices[1]=new Slice(qwer[1],Color.BLUE);
           slices[2]=new Slice(qwer[2],Color.YELLOW);
            slices[3]=new Slice(qwer[3],Color.GREEN);
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
