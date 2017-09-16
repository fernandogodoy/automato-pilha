package br.uem.automatopilha.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author Fernando
 */
public class AutomatoState extends JPanel {

    private static final int PREF_W = 30;
    private static final int PREF_H = PREF_W;
    private List<Shape> shapes = new ArrayList<>();

    public AutomatoState() {
        this.setBackground(Color.WHITE);
        this.shapes.add(new Ellipse2D.Double(50, 50, 120, 120));
        this.shapes.add(new Ellipse2D.Double(50, 50, 120, 120));
        repaint();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(PREF_W, PREF_H);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        shapes.stream().forEach(g2::draw);
        System.out.println("br.uem.automatopilha.view.AutomatoState.paintComponent()");

    }

}
