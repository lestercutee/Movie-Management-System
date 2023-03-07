/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package moviemanagementsystem;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kaarlosasiang
 */
public class MovieGui extends javax.swing.JInternalFrame {

    private static Movie movie = new Movie();
    private DefaultTableModel model;

    public MovieGui() {

        initComponents();
//        displayTable();
        setTitle("Movies");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        moviesTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        movieTitle = new javax.swing.JTextField();
        yearReleased = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        movieActor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        movieDirector = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        plotOutline = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        genre = new javax.swing.JTextField();
        updateMovieBtn = new javax.swing.JButton();
        deleteMovieBtn = new javax.swing.JButton();
        addMovieBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(800, 470));
        setRequestFocusEnabled(false);

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backBtn.setForeground(new java.awt.Color(51, 51, 51));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanagementsystem/images/back.png"))); // NOI18N
        backBtn.setText("BACK");
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        moviesTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        moviesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Movie Title", "Year Released", "Movie Actor", "Director", "Plot Outline", "Genre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        moviesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moviesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(moviesTable);
        if (moviesTable.getColumnModel().getColumnCount() > 0) {
            moviesTable.getColumnModel().getColumn(0).setResizable(false);
            moviesTable.getColumnModel().getColumn(1).setResizable(false);
            moviesTable.getColumnModel().getColumn(2).setResizable(false);
            moviesTable.getColumnModel().getColumn(3).setResizable(false);
            moviesTable.getColumnModel().getColumn(4).setResizable(false);
            moviesTable.getColumnModel().getColumn(5).setResizable(false);
            moviesTable.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Movie Title");

        movieTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        movieTitle.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        yearReleased.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        yearReleased.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        yearReleased.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearReleasedActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Year Released");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Movie Actor");

        movieActor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        movieActor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Director");

        movieDirector.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        movieDirector.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        movieDirector.setMinimumSize(new java.awt.Dimension(100, 20));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Plot Outline");

        plotOutline.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        plotOutline.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        plotOutline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plotOutlineActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Genre");

        genre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        genre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(yearReleased, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(movieActor)
                    .addComponent(movieTitle, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(genre)
                    .addComponent(plotOutline, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(movieDirector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(movieTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yearReleased, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(movieActor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(movieDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(plotOutline, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(genre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        updateMovieBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateMovieBtn.setForeground(new java.awt.Color(51, 51, 51));
        updateMovieBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanagementsystem/images/update.png"))); // NOI18N
        updateMovieBtn.setText("UPDATE");
        updateMovieBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateMovieBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMovieBtnActionPerformed(evt);
            }
        });

        deleteMovieBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteMovieBtn.setForeground(new java.awt.Color(51, 51, 51));
        deleteMovieBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanagementsystem/images/delete.png"))); // NOI18N
        deleteMovieBtn.setText("DELETE");
        deleteMovieBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteMovieBtn.setMaximumSize(new java.awt.Dimension(92, 34));
        deleteMovieBtn.setMinimumSize(new java.awt.Dimension(92, 34));
        deleteMovieBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMovieBtnActionPerformed(evt);
            }
        });

        addMovieBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addMovieBtn.setForeground(new java.awt.Color(51, 51, 51));
        addMovieBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanagementsystem/images/add.png"))); // NOI18N
        addMovieBtn.setText("ADD");
        addMovieBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addMovieBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMovieBtnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanagementsystem/images/eraser.png"))); // NOI18N
        jButton1.setText("CLEAR");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(updateMovieBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(addMovieBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(deleteMovieBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(14, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addMovieBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateMovieBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteMovieBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void displayTable() {
        Object[] data = movie.displayMovie();
        model = (DefaultTableModel) moviesTable.getModel();
        model.addRow(data);
    }

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void moviesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moviesTableMouseClicked
        model = (DefaultTableModel) moviesTable.getModel();

        //set data to text field when selected
        String tableTitle = model.getValueAt(moviesTable.getSelectedRow(), 1).toString();
        String tableYrReleased = model.getValueAt(moviesTable.getSelectedRow(), 2).toString();
        String tableActor = model.getValueAt(moviesTable.getSelectedRow(), 3).toString();
        String tableDirector = model.getValueAt(moviesTable.getSelectedRow(), 4).toString();
        String tablePlOutline = model.getValueAt(moviesTable.getSelectedRow(), 5).toString();
        String tableGenre = model.getValueAt(moviesTable.getSelectedRow(), 6).toString();

        //set to text field
        movieTitle.setText(tableTitle);
        yearReleased.setText(tableYrReleased);
        movieActor.setText(tableActor);
        movieDirector.setText(tableDirector);
        plotOutline.setText(tablePlOutline);
        genre.setText(tableGenre);
    }//GEN-LAST:event_moviesTableMouseClicked

    private void deleteMovieBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMovieBtnActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null, "Delete a movie?", "Confirmation", JOptionPane.YES_NO_OPTION);

        model = (DefaultTableModel) moviesTable.getModel();

        if (moviesTable.getSelectedRowCount() == 1) {
            if (dialogResult == JOptionPane.YES_OPTION) {
                // User clicked "Yes"
                model.removeRow(moviesTable.getSelectedRow());

                JOptionPane.showMessageDialog(null, "Deleted successfully!");
            } else {
                // User clicked "No" or closed the dialog
                System.out.println("Movie not deleted");
            }

        } else {
            //if table has no data
            if (moviesTable.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Table is empty!");
                //if no row selected
            } else {
                JOptionPane.showMessageDialog(null, "Please select single row to delete!");
            }
        }
    }//GEN-LAST:event_deleteMovieBtnActionPerformed

    private void updateMovieBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMovieBtnActionPerformed
        model = (DefaultTableModel) moviesTable.getModel();

        if (moviesTable.getSelectedRowCount() == 1) {
            String mId = model.getValueAt(moviesTable.getSelectedRow(), 0).toString();
            String mTitle = movieTitle.getText();
            String yReleased = yearReleased.getText();
            String mActor = movieActor.getText();
            String mDirector = movieDirector.getText();
            String pOutline = plotOutline.getText();
            String mGenre = genre.getText();
            //if current id is found, update movie
            if (movie.updateMovie(mId, mTitle, yReleased, mDirector, mActor, pOutline, mGenre)) {
                //set updated value on table row
                model.setValueAt(mId, moviesTable.getSelectedRow(), 0);
                model.setValueAt(mTitle, moviesTable.getSelectedRow(), 1);
                model.setValueAt(yReleased, moviesTable.getSelectedRow(), 2);
                model.setValueAt(mActor, moviesTable.getSelectedRow(), 3);
                model.setValueAt(mDirector, moviesTable.getSelectedRow(), 4);
                model.setValueAt(pOutline, moviesTable.getSelectedRow(), 5);
                model.setValueAt(mGenre, moviesTable.getSelectedRow(), 6);

                JOptionPane.showMessageDialog(null, "Updated Successfully!");

                //reset field
                clearField();
            } else {

                JOptionPane.showMessageDialog(null, "Update failed!");
            }
        }

    }//GEN-LAST:event_updateMovieBtnActionPerformed

    private void yearReleasedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearReleasedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearReleasedActionPerformed

    private void plotOutlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plotOutlineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plotOutlineActionPerformed

    private void addMovieBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMovieBtnActionPerformed
        //declare variables to store movie credentials

        String mTitle = movieTitle.getText();
        String yReleased = yearReleased.getText();
        String mDirector = movieDirector.getText();
        String mActor = movieActor.getText();
        String pOutline = plotOutline.getText();
        String mGenre = genre.getText();

        /*
        if the field is not filled, show message dialog, else add user input to array list
         */
        if (mTitle.equals("") || yReleased.equals("") || mDirector.equals("") || mActor.equals("") || pOutline.equals("") || mGenre.equals("")) {

            JOptionPane.showMessageDialog(null, "Please fill in all fields!");

        } else {

            movie.addMovie(mTitle, yReleased, mDirector, mActor, pOutline, mGenre);
            displayTable();

            JOptionPane.showMessageDialog(null, "Added Successfully!");

            //reset field
            clearField();
        }
    }//GEN-LAST:event_addMovieBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        movieTitle.setText("");
        yearReleased.setText("");
        movieActor.setText("");
        movieDirector.setText("");
        plotOutline.setText("");
        genre.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        moviesTable.clearSelection();
    }//GEN-LAST:event_jButton1MouseClicked

    private void clearField() {
        movieTitle.setText("");
        yearReleased.setText("");
        movieActor.setText("");
        movieDirector.setText("");
        plotOutline.setText("");
        genre.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMovieBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteMovieBtn;
    private javax.swing.JTextField genre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField movieActor;
    private javax.swing.JTextField movieDirector;
    private javax.swing.JTextField movieTitle;
    private javax.swing.JTable moviesTable;
    private javax.swing.JTextField plotOutline;
    private javax.swing.JButton updateMovieBtn;
    private javax.swing.JTextField yearReleased;
    // End of variables declaration//GEN-END:variables

}