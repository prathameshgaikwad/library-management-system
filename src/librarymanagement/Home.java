/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarymanagement;

/**
 *
 * @author prath
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        buttonAddMember = new javax.swing.JButton();
        buttonModifyMember = new javax.swing.JButton();
        buttonDeleteMember = new javax.swing.JButton();
        buttonAddPublisher = new javax.swing.JButton();
        buttonModifyPublisher = new javax.swing.JButton();
        buttonDeletePublisher = new javax.swing.JButton();
        buttonAddBook = new javax.swing.JButton();
        buttonModifyBook = new javax.swing.JButton();
        buttonDeleteBook = new javax.swing.JButton();
        buttonDeleteBook1 = new javax.swing.JButton();
        buttonDeleteBook2 = new javax.swing.JButton();
        buttonAvailableBooks = new javax.swing.JButton();
        buttonIssuedBooks = new javax.swing.JButton();
        buttonMembersList = new javax.swing.JButton();
        buttonLogout = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel1.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HOME");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("Publishers");

        jLabel3.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("Members");

        jLabel4.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("Reports");

        jLabel5.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("Books");

        buttonAddMember.setBackground(new java.awt.Color(204, 255, 255));
        buttonAddMember.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        buttonAddMember.setForeground(new java.awt.Color(51, 51, 51));
        buttonAddMember.setText("Register");
        buttonAddMember.setToolTipText("Add a new member");
        buttonAddMember.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonAddMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddMemberActionPerformed(evt);
            }
        });

        buttonModifyMember.setBackground(new java.awt.Color(204, 255, 255));
        buttonModifyMember.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        buttonModifyMember.setForeground(new java.awt.Color(51, 51, 51));
        buttonModifyMember.setText("Modify");
        buttonModifyMember.setToolTipText("Modify existing member details");
        buttonModifyMember.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonModifyMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModifyMemberActionPerformed(evt);
            }
        });

        buttonDeleteMember.setBackground(new java.awt.Color(204, 255, 255));
        buttonDeleteMember.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        buttonDeleteMember.setForeground(new java.awt.Color(51, 51, 51));
        buttonDeleteMember.setText("Delete");
        buttonDeleteMember.setToolTipText("Delete member details");
        buttonDeleteMember.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonDeleteMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteMemberActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(buttonAddMember, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(buttonModifyMember, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(buttonDeleteMember, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonDeleteMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonModifyMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonAddMember, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(buttonAddMember)
                .addGap(27, 27, 27)
                .addComponent(buttonModifyMember)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(buttonDeleteMember))
        );

        buttonAddPublisher.setBackground(new java.awt.Color(204, 255, 255));
        buttonAddPublisher.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        buttonAddPublisher.setForeground(new java.awt.Color(51, 51, 51));
        buttonAddPublisher.setText("Add");
        buttonAddPublisher.setToolTipText("Add a new publisher");
        buttonAddPublisher.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonAddPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddPublisherActionPerformed(evt);
            }
        });

        buttonModifyPublisher.setBackground(new java.awt.Color(204, 255, 255));
        buttonModifyPublisher.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        buttonModifyPublisher.setForeground(new java.awt.Color(51, 51, 51));
        buttonModifyPublisher.setText("Modify");
        buttonModifyPublisher.setToolTipText("Modify existing publisher details");
        buttonModifyPublisher.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonModifyPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModifyPublisherActionPerformed(evt);
            }
        });

        buttonDeletePublisher.setBackground(new java.awt.Color(204, 255, 255));
        buttonDeletePublisher.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        buttonDeletePublisher.setForeground(new java.awt.Color(51, 51, 51));
        buttonDeletePublisher.setText("Delete");
        buttonDeletePublisher.setToolTipText("Delete publisher details");
        buttonDeletePublisher.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonDeletePublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeletePublisherActionPerformed(evt);
            }
        });

        buttonAddBook.setBackground(new java.awt.Color(204, 255, 255));
        buttonAddBook.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        buttonAddBook.setForeground(new java.awt.Color(51, 51, 51));
        buttonAddBook.setText("Add");
        buttonAddBook.setToolTipText("Add a new book");
        buttonAddBook.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddBookActionPerformed(evt);
            }
        });

        buttonModifyBook.setBackground(new java.awt.Color(204, 255, 255));
        buttonModifyBook.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        buttonModifyBook.setForeground(new java.awt.Color(51, 51, 51));
        buttonModifyBook.setText("Modify");
        buttonModifyBook.setToolTipText("Modify existing book details");
        buttonModifyBook.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonModifyBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModifyBookActionPerformed(evt);
            }
        });

        buttonDeleteBook.setBackground(new java.awt.Color(204, 255, 255));
        buttonDeleteBook.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        buttonDeleteBook.setForeground(new java.awt.Color(51, 51, 51));
        buttonDeleteBook.setText("Delete");
        buttonDeleteBook.setToolTipText("Delete a member");
        buttonDeleteBook.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonDeleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteBookActionPerformed(evt);
            }
        });

        buttonDeleteBook1.setBackground(new java.awt.Color(204, 255, 255));
        buttonDeleteBook1.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        buttonDeleteBook1.setForeground(new java.awt.Color(51, 51, 51));
        buttonDeleteBook1.setText("Book Issue");
        buttonDeleteBook1.setToolTipText("Issue book to member");
        buttonDeleteBook1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonDeleteBook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteBook1ActionPerformed(evt);
            }
        });

        buttonDeleteBook2.setBackground(new java.awt.Color(204, 255, 255));
        buttonDeleteBook2.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        buttonDeleteBook2.setForeground(new java.awt.Color(51, 51, 51));
        buttonDeleteBook2.setText("Book Return");
        buttonDeleteBook2.setToolTipText("Record return of book from member");
        buttonDeleteBook2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonDeleteBook2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteBook2ActionPerformed(evt);
            }
        });

        buttonAvailableBooks.setBackground(new java.awt.Color(204, 255, 255));
        buttonAvailableBooks.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        buttonAvailableBooks.setForeground(new java.awt.Color(51, 51, 51));
        buttonAvailableBooks.setText("Available Books");
        buttonAvailableBooks.setToolTipText("Get a list of available books");
        buttonAvailableBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonAvailableBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAvailableBooksActionPerformed(evt);
            }
        });

        buttonIssuedBooks.setBackground(new java.awt.Color(204, 255, 255));
        buttonIssuedBooks.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        buttonIssuedBooks.setForeground(new java.awt.Color(51, 51, 51));
        buttonIssuedBooks.setText("Issued Books");
        buttonIssuedBooks.setToolTipText("Get a list of books issued");
        buttonIssuedBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonIssuedBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIssuedBooksActionPerformed(evt);
            }
        });

        buttonMembersList.setBackground(new java.awt.Color(204, 255, 255));
        buttonMembersList.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        buttonMembersList.setForeground(new java.awt.Color(51, 51, 51));
        buttonMembersList.setText("Members List");
        buttonMembersList.setToolTipText("Get a list of registered members");
        buttonMembersList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonMembersList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMembersListActionPerformed(evt);
            }
        });

        buttonLogout.setBackground(new java.awt.Color(255, 51, 51));
        buttonLogout.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        buttonLogout.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogout.setText("Logout");
        buttonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonMembersList)
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonDeleteBook2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonDeleteBook1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(buttonAddPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonModifyPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonDeletePublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel2)
                                .addGap(16, 16, 16)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel3)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(buttonModifyBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonDeleteBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonAddBook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel5)))))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(buttonAvailableBooks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonIssuedBooks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4)))
                .addGap(26, 26, 26))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(61, 61, 61)
                                    .addComponent(buttonAddBook)
                                    .addGap(30, 30, 30)
                                    .addComponent(buttonModifyBook))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(buttonAvailableBooks)
                                        .addGap(30, 30, 30)
                                        .addComponent(buttonIssuedBooks))
                                    .addComponent(jLabel4)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonDeleteBook))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(38, 38, 38)
                            .addComponent(buttonAddPublisher)
                            .addGap(33, 33, 33)
                            .addComponent(buttonModifyPublisher)
                            .addGap(32, 32, 32)
                            .addComponent(buttonDeletePublisher))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDeleteBook1)
                    .addComponent(buttonMembersList))
                .addGap(34, 34, 34)
                .addComponent(buttonDeleteBook2)
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonLogout)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogoutActionPerformed
        
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonLogoutActionPerformed

    private void buttonAddPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddPublisherActionPerformed
        new Publisher_Add().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonAddPublisherActionPerformed

    private void buttonModifyPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModifyPublisherActionPerformed
        new Publisher_Modify().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonModifyPublisherActionPerformed

    private void buttonDeletePublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeletePublisherActionPerformed
        new Publisher_Delete().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonDeletePublisherActionPerformed

    private void buttonAddMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddMemberActionPerformed
        new Member_Add().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonAddMemberActionPerformed

    private void buttonModifyMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModifyMemberActionPerformed
       new Member_Modify().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonModifyMemberActionPerformed

    private void buttonDeleteMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteMemberActionPerformed
        new Member_Delete().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonDeleteMemberActionPerformed

    private void buttonMembersListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMembersListActionPerformed
        new Member_List().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonMembersListActionPerformed

    private void buttonAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddBookActionPerformed
        new Book_Add().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonAddBookActionPerformed

    private void buttonModifyBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModifyBookActionPerformed
        new Book_Modify().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonModifyBookActionPerformed

    private void buttonDeleteBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteBookActionPerformed
        new Book_Delete().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonDeleteBookActionPerformed

    private void buttonDeleteBook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteBook1ActionPerformed
        new Book_Issue().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonDeleteBook1ActionPerformed

    private void buttonDeleteBook2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteBook2ActionPerformed
        new Book_Return().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonDeleteBook2ActionPerformed

    private void buttonAvailableBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAvailableBooksActionPerformed
        new Reports_AvailableBooks().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonAvailableBooksActionPerformed

    private void buttonIssuedBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIssuedBooksActionPerformed
        new Reports_BooksIssued().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonIssuedBooksActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddBook;
    private javax.swing.JButton buttonAddMember;
    private javax.swing.JButton buttonAddPublisher;
    private javax.swing.JButton buttonAvailableBooks;
    private javax.swing.JButton buttonDeleteBook;
    private javax.swing.JButton buttonDeleteBook1;
    private javax.swing.JButton buttonDeleteBook2;
    private javax.swing.JButton buttonDeleteMember;
    private javax.swing.JButton buttonDeletePublisher;
    private javax.swing.JButton buttonIssuedBooks;
    private javax.swing.JButton buttonLogout;
    private javax.swing.JButton buttonMembersList;
    private javax.swing.JButton buttonModifyBook;
    private javax.swing.JButton buttonModifyMember;
    private javax.swing.JButton buttonModifyPublisher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
