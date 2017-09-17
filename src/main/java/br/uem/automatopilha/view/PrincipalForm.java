package br.uem.automatopilha.view;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.apache.commons.lang3.StringUtils;

import br.uem.automatopilha.AutomatoPilha;
import br.uem.automatopilha.AutomatoPilhaImpl;
import br.uem.automatopilha.estados.Estado;
import br.uem.automatopilha.estados.EstadoFactory;
import br.uem.automatopilha.view.util.AutomatoUtil;

/**
 *
 * @author Fernando
 */
public class PrincipalForm extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	private final TableModelPilha pilhaModel = new TableModelPilha();
	private AutomatoPilha automatoPilha;

	private Integer index = 0;

	public PrincipalForm() {
		initComponents();
		setLocationRelativeTo(null);
		setExtendedState(MAXIMIZED_BOTH);
		this.lbPalavra.setText(StringUtils.EMPTY);
		tbPilha.setModel(pilhaModel);
	}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbPalavra = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btStart = new javax.swing.JButton();
        btNext = new javax.swing.JButton();
        panelAutomato = new javax.swing.JPanel();
        panelEstados = new javax.swing.JPanel();
        panelInicial = new javax.swing.JPanel();
        lbInicio = new javax.swing.JLabel();
        panelQ0 = new javax.swing.JPanel();
        lbQ0 = new javax.swing.JLabel();
        panelLoopQ0 = new javax.swing.JPanel();
        lbLoopQ0 = new javax.swing.JLabel();
        panelTransicao = new javax.swing.JPanel();
        lbTransicao = new javax.swing.JLabel();
        panelQ1 = new javax.swing.JPanel();
        lbQ1 = new javax.swing.JLabel();
        panelLoopQ1 = new javax.swing.JPanel();
        lbLoopQ1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPilha = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setText("Word:");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setText("Expression:");

        lbPalavra.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lbPalavra.setForeground(new java.awt.Color(255, 0, 0));
        lbPalavra.setText("000000111111");
        lbPalavra.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lbPalavraPropertyChange(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("0");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("n");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("1");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("n");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("|    N   >   1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPalavra)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbPalavra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6)
                        .addComponent(jLabel8))
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btStart.setText("Start");
        btStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStartActionPerformed(evt);
            }
        });

        btNext.setText("Next");
        btNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btStart, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btNext, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btNext, btStart});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btStart, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btNext, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btNext, btStart});

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelAutomato.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbInicio.setForeground(new java.awt.Color(255, 255, 255));
        lbInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inicio.png"))); // NOI18N

        javax.swing.GroupLayout panelInicialLayout = new javax.swing.GroupLayout(panelInicial);
        panelInicial.setLayout(panelInicialLayout);
        panelInicialLayout.setHorizontalGroup(
            panelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelInicialLayout.setVerticalGroup(
            panelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInicialLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbInicio)
                .addContainerGap())
        );

        lbQ0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estado.png"))); // NOI18N

        javax.swing.GroupLayout panelQ0Layout = new javax.swing.GroupLayout(panelQ0);
        panelQ0.setLayout(panelQ0Layout);
        panelQ0Layout.setHorizontalGroup(
            panelQ0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelQ0Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbQ0)
                .addGap(30, 30, 30))
        );
        panelQ0Layout.setVerticalGroup(
            panelQ0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelQ0Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbQ0)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbLoopQ0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loop.png"))); // NOI18N

        javax.swing.GroupLayout panelLoopQ0Layout = new javax.swing.GroupLayout(panelLoopQ0);
        panelLoopQ0.setLayout(panelLoopQ0Layout);
        panelLoopQ0Layout.setHorizontalGroup(
            panelLoopQ0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoopQ0Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbLoopQ0)
                .addContainerGap())
        );
        panelLoopQ0Layout.setVerticalGroup(
            panelLoopQ0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoopQ0Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lbLoopQ0))
        );

        lbTransicao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transicacao.png"))); // NOI18N

        javax.swing.GroupLayout panelTransicaoLayout = new javax.swing.GroupLayout(panelTransicao);
        panelTransicao.setLayout(panelTransicaoLayout);
        panelTransicaoLayout.setHorizontalGroup(
            panelTransicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTransicaoLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(lbTransicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTransicaoLayout.setVerticalGroup(
            panelTransicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTransicao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbQ1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estado.png"))); // NOI18N

        javax.swing.GroupLayout panelQ1Layout = new javax.swing.GroupLayout(panelQ1);
        panelQ1.setLayout(panelQ1Layout);
        panelQ1Layout.setHorizontalGroup(
            panelQ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelQ1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbQ1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelQ1Layout.setVerticalGroup(
            panelQ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbQ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lbLoopQ1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loop.png"))); // NOI18N

        javax.swing.GroupLayout panelLoopQ1Layout = new javax.swing.GroupLayout(panelLoopQ1);
        panelLoopQ1.setLayout(panelLoopQ1Layout);
        panelLoopQ1Layout.setHorizontalGroup(
            panelLoopQ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoopQ1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbLoopQ1)
                .addContainerGap())
        );
        panelLoopQ1Layout.setVerticalGroup(
            panelLoopQ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoopQ1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbLoopQ1)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelEstadosLayout = new javax.swing.GroupLayout(panelEstados);
        panelEstados.setLayout(panelEstadosLayout);
        panelEstadosLayout.setHorizontalGroup(
            panelEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelQ0, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelLoopQ0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTransicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelQ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelLoopQ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelEstadosLayout.setVerticalGroup(
            panelEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadosLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(panelEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEstadosLayout.createSequentialGroup()
                        .addGroup(panelEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelInicial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelQ0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelTransicao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelLoopQ0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEstadosLayout.createSequentialGroup()
                        .addComponent(panelQ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelLoopQ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        tbPilha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbPilha);

        javax.swing.GroupLayout panelAutomatoLayout = new javax.swing.GroupLayout(panelAutomato);
        panelAutomato.setLayout(panelAutomatoLayout);
        panelAutomatoLayout.setHorizontalGroup(
            panelAutomatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutomatoLayout.createSequentialGroup()
                .addComponent(panelEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelAutomatoLayout.setVerticalGroup(
            panelAutomatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAutomatoLayout.createSequentialGroup()
                .addGroup(panelAutomatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAutomatoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(panelAutomatoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(panelEstados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAutomato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAutomato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	// GEN-FIRST:event_btStartActionPerformed
	private void btStartActionPerformed(java.awt.event.ActionEvent evt) {
		openPalavraDialog();
	}// GEN-LAST:event_btStartActionPerformed

	// GEN-FIRST:event_btNextActionPerformed
	private void btNextActionPerformed(java.awt.event.ActionEvent evt) {
		startExecution();
	}// GEN-LAST:event_btNextActionPerformed

	// GEN-FIRST:event_lbPalavraPropertyChange
	private void lbPalavraPropertyChange(java.beans.PropertyChangeEvent evt) {
		habilitarBtNext();
	}// GEN-LAST:event_lbPalavraPropertyChange

	public static void main(String args[]) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			PrincipalForm automato = new PrincipalForm();
			automato.setVisible(true);
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException
				| UnsupportedLookAndFeelException ex) {
			System.out.println(ex);
		}
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNext;
    private javax.swing.JButton btStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbInicio;
    private javax.swing.JLabel lbLoopQ0;
    private javax.swing.JLabel lbLoopQ1;
    private javax.swing.JLabel lbPalavra;
    private javax.swing.JLabel lbQ0;
    private javax.swing.JLabel lbQ1;
    private javax.swing.JLabel lbTransicao;
    private javax.swing.JPanel panelAutomato;
    private javax.swing.JPanel panelEstados;
    private javax.swing.JPanel panelInicial;
    private javax.swing.JPanel panelLoopQ0;
    private javax.swing.JPanel panelLoopQ1;
    private javax.swing.JPanel panelQ0;
    private javax.swing.JPanel panelQ1;
    private javax.swing.JPanel panelTransicao;
    private javax.swing.JTable tbPilha;
    // End of variables declaration//GEN-END:variables
	private List<String> list;

	private void habilitarBtNext() {
		btNext.setEnabled(false);
		String palavraInserida = lbPalavra.getText();
		if (StringUtils.isNotBlank(palavraInserida)) {
			automatoPilha = new AutomatoPilhaImpl(palavraInserida);
			Boolean isTamanhoValido = validaTamanhoPalavra();
			if (isTamanhoValido) {
				btNext.setEnabled(true);
			} else {
				lbPalavra.setText(StringUtils.EMPTY);
				btNext.setEnabled(false);
			}
		}
	}

	private void openPalavraDialog() {
		PalavraForm palavraDialog = new PalavraForm(lbPalavra);
		palavraDialog.setVisible(true);
	}

	private void startExecution() {
		list = AutomatoUtil.toList(lbPalavra.getText());
		trataTransicaoTabela();
		index++;
		trataExecucaoAutomato();
	}

	private Boolean validaTamanhoPalavra() {
		Boolean validSize = automatoPilha.isValidSize();
		if (!validSize) {
			showRejectMessage();
		}
		return validSize;
	}

	private void trataExecucaoAutomato() {
		if ((index - 1) == list.size()) {
			AutomatoPilha automatoPila = new AutomatoPilhaImpl(lbPalavra.getText());
			Boolean isAceita = automatoPila.run();
			if (isAceita) {
				showAcceptMessage();
			} else {
				showRejectMessage();
			}
		}
	}
	
	private void showRejectMessage() {
		JOptionPane.showMessageDialog(this, "Palavra Rejeita!");
	}

	private void showAcceptMessage() {
		JOptionPane.showMessageDialog(this, "Palavra Aceita!");
	}

	private void trataTransicaoTabela() {
		Estado estado = new EstadoFactory().factory(index, lbPalavra.getText());
		if (estado.isEstadoInicial()) {
			estado.atualizarView(panelInicial, null);
			pilhaModel.empilhar("#");
		} else if (estado.isEstadoItermediario()) {
			estado.atualizarView(panelLoopQ0, panelInicial);
			String palavra = list.get(index - 1);
			pilhaModel.empilhar(palavra);
		} else if (estado.isEstadoFinal()) {
			estado.atualizarView(panelLoopQ1, panelLoopQ0);
			pilhaModel.desempilhar();
		}
		tbPilha.updateUI();
	}
}
