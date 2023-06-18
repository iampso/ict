import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Math.*;
import javax.swing.*;
public class op extends JFrame{
    JButton I1;
    JTextField t1,t2;
    JLabel b1,b2;
    String text,put;
    eWork kn = new eWork();
    public op (String s) {
        super(s);
        setLayout(new FlowLayout());
        b1 = new JLabel("Укажите нижний диапазон");
        b2 = new JLabel("Укажите верхний диапазон");
        t1 = new JTextField(25);
        t2 = new JTextField(25);

        I1 = new JButton("Рисовать");

        add(b1);
        add(t1);
        add(b2);
        add(t2);

        add(I1);
        I1.addActionListener(kn);
    }
    public static void main(String[] args){
        op we = new op("График");
        we.setVisible(true);
        we.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        we.setSize(500, 130);
        we.setResizable(false);
        we.setLocationRelativeTo(null);

    }
    public class eWork implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource()==I1 && Double.parseDouble(t1.getText()) < Double.parseDouble(t2.getText()) ) {
                    XYSeries series = new XYSeries("График");
                    for (double x = Double.parseDouble(t1.getText()); x <= Double.parseDouble(t2.getText()); x +=0.005){
                        series.add(x,sin(x) - pow(x,2));
                    }
                    XYSeriesCollection XYDataset = new XYSeriesCollection();
                    XYDataset.addSeries(series);


                    JFreeChart chart= ChartFactory.createXYLineChart("f(x) = sin(x) - pow(x,2)","X","Y",
                            XYDataset, PlotOrientation.VERTICAL,true,true,true);


                    chart.setBackgroundPaint(Color.white);
                    Plot plot = chart.getPlot();
                    plot.setBackgroundPaint(Color.white);


                    ((XYPlot) plot).setDomainGridlinePaint(Color.black);
                    ((XYPlot) plot).setRangeGridlinePaint(Color.black);

                    XYLineAndShapeRenderer renderer = (XYLineAndShapeRenderer)((XYPlot) plot).getRenderer();
                    renderer.setSeriesPaint(0,Color.black);

                    renderer.setSeriesStroke(0,new BasicStroke(4.0f));
                    JFrame frame = new JFrame("График");
                    frame.getContentPane().add(new ChartPanel(chart));
                    frame.setSize(800,600);
                    frame.setVisible(true);

                }
                else JOptionPane.showMessageDialog(op.this, "Ошибка");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(op.this, "Ошибка"); }

        }
    }
}
