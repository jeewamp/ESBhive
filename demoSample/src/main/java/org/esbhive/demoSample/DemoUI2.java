/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DemoUI2.java
 *
 * Created on Sep 1, 2011, 5:53:11 PM
 */
package org.esbhive.demoSample;

import java.util.List;
import org.esbhive.node.mgt.xsd.ESBNode;

/**
 *
 * @author melaka
 */
public class DemoUI2 extends javax.swing.JFrame implements UIInterface {

    /** Creates new form DemoUI2 */
    public DemoUI2() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new DemoUI2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    public void nodesFetched(List<ESBNode> esbNodes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void requestFailed(ESBNode esbNode) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void nodeRemoved(List<ESBNode> oldEsbNodes, List<ESBNode> newEsbNodes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void responseRecieved(ESBNode node, String value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void currentLeader(String ipAndPort) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<String> ipPortPairs(List<ESBNode> esbNodes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void sendingRequest(String ipAndPort) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
