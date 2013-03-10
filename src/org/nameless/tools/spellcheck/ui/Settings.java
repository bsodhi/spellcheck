/*
 * RSS Beas.
 */

package org.nameless.tools.spellcheck.ui;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.BackingStoreException;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.nameless.tools.spellcheck.SpellChecker;

/**
 * Panel showing the settings for the application.
 * @author  bsodhi
 */
public class Settings extends javax.swing.JPanel {
    public static final String DEF_SUFFIX = " (default)";

    /**
     * Parent dialog in which this panel will be shown.
     */
    private JDialog parentDialog;

    /**
     * Default constructor.
     */
    public Settings() {
    }
    
    /**
     * Initializes the panel.
     * @param parentDialog
     */
    public Settings(JDialog parentDialog) {
        this.parentDialog = parentDialog;
        initComponents();
        try {
            loadSettings();
        } catch (BackingStoreException ex) {
            Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Couldn't load settings.\nError: "+
                ex.getLocalizedMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean isDictionarySelectionValid() {
        int selIndex = jList1.getSelectedIndex();
        boolean valid = true;
        if (selIndex == -1) {
            JOptionPane.showMessageDialog(parentDialog, "No item has been selected from the list!",
                    "Invalid selection!", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }
        return valid;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        wordDelimiters = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        addDelimBtn = new javax.swing.JButton();
        removeDelimBtn = new javax.swing.JButton();
        selectedDelim = new javax.swing.JLabel();
        totalLab = new javax.swing.JLabel();
        resetDelim = new javax.swing.JButton();
        isFindCompundWords = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        exclUSWords = new javax.swing.JCheckBox();
        exclUKWords = new javax.swing.JCheckBox();
        exclCandianWords = new javax.swing.JCheckBox();
        exclEnglishWords = new javax.swing.JCheckBox();
        exclAllSystemWordLists = new javax.swing.JCheckBox();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Custom Word Lists"));

        jList1.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jList1);

        jButton1.setText("Add new");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Set default");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Miscellaneous"));

        jCheckBox1.setText("Ignore words in uppercase");

        wordDelimiters.setModel(new DefaultListModel());
        wordDelimiters.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        wordDelimiters.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wordDelimitersMouseClicked(evt);
            }
        });
        wordDelimiters.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                wordDelimitersKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(wordDelimiters);

        jLabel1.setText("Delimiters (Unicode value):");
        jLabel1.setToolTipText("<html>See here for unicode values of different symbols<br/>and characters: http://www.unicode.org/charts/</html>");

        addDelimBtn.setText("Add");
        addDelimBtn.setMargin(new java.awt.Insets(2, 2, 2, 2));
        addDelimBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDelimBtnActionPerformed(evt);
            }
        });

        removeDelimBtn.setLabel("Remove");
        removeDelimBtn.setMargin(new java.awt.Insets(2, 2, 2, 2));
        removeDelimBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeDelimBtnActionPerformed(evt);
            }
        });

        selectedDelim.setText("Selected: None");

        totalLab.setText("Total:");

        resetDelim.setText("Reset delimiters");
        resetDelim.setMargin(new java.awt.Insets(2, 2, 2, 2));
        resetDelim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetDelimActionPerformed(evt);
            }
        });

        isFindCompundWords.setText("Find Compound Words");
        isFindCompundWords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isFindCompundWordsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(addDelimBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(removeDelimBtn))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectedDelim)
                            .addComponent(jCheckBox1)
                            .addComponent(totalLab)
                            .addComponent(resetDelim)
                            .addComponent(isFindCompundWords))))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addDelimBtn, removeDelimBtn});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(selectedDelim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalLab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetDelim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDelimBtn)
                    .addComponent(removeDelimBtn)
                    .addComponent(isFindCompundWords))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jCheckBox1.setSelected(PrefsHelper.isUpperCaseWordsIgnored());

        jButton4.setText("OK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Cancel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Excluded Word Lists"));

        exclUSWords.setText("American Words");

        exclUKWords.setText("British Words");

        exclCandianWords.setText("Canadian Words");

        exclEnglishWords.setText("English Words");

        exclAllSystemWordLists.setText("All System Word Lists");
        exclAllSystemWordLists.setToolTipText("");
        exclAllSystemWordLists.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exclAllSystemWordListsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exclUSWords)
                    .addComponent(exclEnglishWords))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(exclUKWords)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exclCandianWords))
                    .addComponent(exclAllSystemWordLists))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exclUSWords)
                    .addComponent(exclUKWords)
                    .addComponent(exclCandianWords))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exclEnglishWords)
                    .addComponent(exclAllSystemWordLists)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(118, 118, 118)
                            .addComponent(jButton4)
                            .addGap(26, 26, 26)
                            .addComponent(jButton5))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton4, jButton5});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        // OK button handler.
        try {
            // Save the settings to the current user's preferences.
            saveDictPrefs();
            SpellCheckerApp app = (SpellCheckerApp) parentDialog.getParent();
            app.applyCustomDictionaries();
            PrefsHelper.setUpperCaseWordsIgnored(jCheckBox1.isSelected());

            DefaultListModel m = (DefaultListModel) wordDelimiters.getModel();

            HashSet<String> delims = new HashSet<String>();
            for (Object o : m.toArray()) {
                delims.add(o.toString());    
            }
            PrefsHelper.saveWordDelimiterPrefs(delims);

        } catch (IOException ex) {
            Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Could not apply custom dictionaries.\n"+
                ex.getLocalizedMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (BackingStoreException ex) {
            Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
        }
        parentDialog.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Cancel button handler. We hide the dialog.
        parentDialog.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void addDelimBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDelimBtnActionPerformed
        
        String s = (String)JOptionPane.showInputDialog(
                    this.parentDialog,
                    "Unicode value for delimiter (e.g. u003A for ':'):",
                    "Enter delimiter",
                    JOptionPane.PLAIN_MESSAGE);
        try {
            if (null == s) return;// User cancelled the input dialog
            s = (""+s).toLowerCase().trim();
            Integer.decode(s.replace("u", "0x"));
            DefaultListModel m = (DefaultListModel) wordDelimiters.getModel();
            m.addElement(s);
            totalLab.setText("Total: "+m.getSize());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(parentDialog, "Invalid unicode value entered!",
                    "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_addDelimBtnActionPerformed

    private void removeDelimBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeDelimBtnActionPerformed
        
        int selIndex = wordDelimiters.getSelectedIndex();
        if (selIndex == -1) {
            JOptionPane.showMessageDialog(parentDialog, "No item has been selected from the list!",
                    "Invalid selection!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        DefaultListModel model = (DefaultListModel) wordDelimiters.getModel();
        model.removeElementAt(selIndex);
        totalLab.setText("Total: "+model.getSize());
        
    }//GEN-LAST:event_removeDelimBtnActionPerformed

    private void wordDelimitersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wordDelimitersMouseClicked
        updateCurrentDelimSelection();
        
    }//GEN-LAST:event_wordDelimitersMouseClicked

    private void resetDelimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetDelimActionPerformed
        
        HashSet<String> delims = PrefsHelper.getWordDelimiters();
        delims.addAll(Arrays.asList(SpellChecker.DELIMS_UNICODE));
        DefaultListModel m = (DefaultListModel) wordDelimiters.getModel();
        m.clear();
        for (String d : delims) {
            m.addElement(d);
        }
        totalLab.setText("Total: "+m.getSize());
    }//GEN-LAST:event_resetDelimActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Remove entry
        if (!isDictionarySelectionValid()) return;
        DefaultListModel model = (DefaultListModel) jList1.getModel();
        model.remove(jList1.getSelectedIndex());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Set selected entry as default
        if (!isDictionarySelectionValid()) return;

        int selIndex = jList1.getSelectedIndex();
        DefaultListModel model = (DefaultListModel) jList1.getModel();
        Object[] elements = model.toArray();
        int defIndex = -1;
        String oldDef = null;
        for (int i=0; i<elements.length; i++) {
            oldDef = elements[i].toString();
            if (oldDef.toLowerCase().endsWith(DEF_SUFFIX)) {
                defIndex = i;
                break;
            }
        }
        if (defIndex != -1) {
            model.setElementAt(oldDef.substring(0, oldDef.indexOf(DEF_SUFFIX)), defIndex);
            model.setElementAt(model.elementAt(selIndex).toString() + DEF_SUFFIX, selIndex);
        } else {
            model.setElementAt(model.elementAt(selIndex).toString() + DEF_SUFFIX, selIndex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Add new entry. Adds the new custom dictionary to the settings.
        JFileChooser fc = new JFileChooser();
        if (PrefsHelper.getLastAccessedDirectory() != null) {
            fc.setCurrentDirectory(new File(PrefsHelper.getLastAccessedDirectory()));
        }
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            DefaultListModel model = (DefaultListModel) jList1.getModel();
            if (model.isEmpty()) { // This is 1st entry so mark it as default
                model.addElement(fc.getSelectedFile().getAbsolutePath()+ DEF_SUFFIX);
            } else {
                model.addElement(fc.getSelectedFile().getAbsolutePath());
            }
            PrefsHelper.setLastAccessedDirectory(fc.getSelectedFile().getParent());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void exclAllSystemWordListsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exclAllSystemWordListsActionPerformed
        
        adjustExcludedWordListSelection();
        
    }//GEN-LAST:event_exclAllSystemWordListsActionPerformed

    private void wordDelimitersKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wordDelimitersKeyReleased
        
        updateCurrentDelimSelection();
    }//GEN-LAST:event_wordDelimitersKeyReleased

    private void isFindCompundWordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isFindCompundWordsActionPerformed
        
        PrefsHelper.setFindCompoundWordsEnabled(isFindCompundWords.isSelected());
        
    }//GEN-LAST:event_isFindCompundWordsActionPerformed
    
    /**
     * Loads the current user's preferences.
     * @throws java.util.prefs.BackingStoreException
     */
    private void loadSettings() throws BackingStoreException {

        isFindCompundWords.setSelected(PrefsHelper.isFindCompoundWordsEnabled());
        
        // Load dictionary settings
        HashMap<String, String> dicts = PrefsHelper.getDictionaries();
        DefaultListModel model = (DefaultListModel) jList1.getModel();
        Iterator it = dicts.keySet().iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            if (key.equalsIgnoreCase("default")) {
                model.addElement(dicts.get(key) + DEF_SUFFIX);
            } else {
                model.addElement(dicts.get(key));
            }
        }
        // Load word delimiters
        HashSet<String> delims = PrefsHelper.getWordDelimiters();
        DefaultListModel m2 = (DefaultListModel) wordDelimiters.getModel();
        for (String ss : delims) {
            m2.addElement(ss);
        }
        totalLab.setText("Total: "+delims.size());
        
        // Set the ignored dictionaries
        exclCandianWords.setSelected(PrefsHelper.isDictIgnored(PrefsHelper.WordListTypes.Canadian));
        exclUKWords.setSelected(PrefsHelper.isDictIgnored(PrefsHelper.WordListTypes.British));
        exclUSWords.setSelected(PrefsHelper.isDictIgnored(PrefsHelper.WordListTypes.American));
        exclEnglishWords.setSelected(PrefsHelper.isDictIgnored(PrefsHelper.WordListTypes.English));
        exclAllSystemWordLists.setSelected(PrefsHelper.isDictIgnored(PrefsHelper.WordListTypes.All));
        adjustExcludedWordListSelection();
    }
    
    /**
     * Saves the current user's prefernces.
     * @throws java.util.prefs.BackingStoreException
     */
    public void saveDictPrefs() throws BackingStoreException {
        
        DefaultListModel model = (DefaultListModel) jList1.getModel();
        int size = model.getSize();
        HashMap<String, String> dicts = new HashMap<String, String>();
        for (int i=0; i<size; i++) {
            String key = null;
            String value = (String) model.get(i);
            if (value.endsWith(DEF_SUFFIX)) {
                key = "default";
                value = value.substring(0, value.indexOf("("));
            } else {
                key = ""+i;
            }
            dicts.put(key, value);
        }
        PrefsHelper.saveDictionaryPrefs(dicts);
        
        // Save ignored dictionaries prefs
        PrefsHelper.setDictIgnored(PrefsHelper.WordListTypes.Canadian, exclCandianWords.isSelected());
        PrefsHelper.setDictIgnored(PrefsHelper.WordListTypes.British, exclUKWords.isSelected());
        PrefsHelper.setDictIgnored(PrefsHelper.WordListTypes.American, exclUSWords.isSelected());
        PrefsHelper.setDictIgnored(PrefsHelper.WordListTypes.English, exclEnglishWords.isSelected());
        PrefsHelper.setDictIgnored(PrefsHelper.WordListTypes.All, exclAllSystemWordLists.isSelected());
        
        // Apply the changes to spell checker
        SpellCheckerApp app = (SpellCheckerApp) parentDialog.getParent();
        app.initSpellChecker();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDelimBtn;
    private javax.swing.JCheckBox exclAllSystemWordLists;
    private javax.swing.JCheckBox exclCandianWords;
    private javax.swing.JCheckBox exclEnglishWords;
    private javax.swing.JCheckBox exclUKWords;
    private javax.swing.JCheckBox exclUSWords;
    private javax.swing.JCheckBox isFindCompundWords;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton removeDelimBtn;
    private javax.swing.JButton resetDelim;
    private javax.swing.JLabel selectedDelim;
    private javax.swing.JLabel totalLab;
    private javax.swing.JList wordDelimiters;
    // End of variables declaration//GEN-END:variables

    private String fromUnicodeStringToChar(String ucStr) throws NumberFormatException {
        String s = ""+ucStr;
        int hex = Integer.decode(s.replace("u", "0x"));
        s = new String(new char[]{(char)hex});
        return s;
    }

    private void adjustExcludedWordListSelection() {
        boolean enabled = !exclAllSystemWordLists.isSelected();
        exclCandianWords.setEnabled(enabled);
        exclEnglishWords.setEnabled(enabled);
        exclUKWords.setEnabled(enabled);
        exclUSWords.setEnabled(enabled);
    }

    private void updateCurrentDelimSelection() throws NumberFormatException {
        
        DefaultListModel m = (DefaultListModel) wordDelimiters.getModel();
        String s = fromUnicodeStringToChar(""+wordDelimiters.getSelectedValue());
        wordDelimiters.setToolTipText(s);
        selectedDelim.setText("Selected: ["+s+"]");
    }
    
}
