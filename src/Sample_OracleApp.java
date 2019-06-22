import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.BorderLayout;

/**
 * Sample_OracleApp
 * 
 */
public class Sample_OracleApp extends JFrame {

	// ======= Constants =======

	private int[] rowNum = { 0, 1, 3, 5, 6, 8 };

	// ======= Member Variable =======

	// ----- Container -----

	private Container con = null;
	private JScrollPane scrollPane = null;
	private JPanel panel = null;
	private JPanel panel_SwingComponents = null;
	private JPanel panel_AwtComponents = null;
	private JTable table;

	/**
	 * SetJButtonComponents
	 * 
	 */
	private void setJButtonComponents() {

		int lineNum = 0;

		// ----- 1st Line / 1st Row -----

		JLabel lbl_JButton = new JLabel("JButton");
		GridBagConstraints gbc_lbl_JButton = new GridBagConstraints();
		gbc_lbl_JButton.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_JButton.gridx = rowNum[0];
		gbc_lbl_JButton.gridy = lineNum;
		panel_SwingComponents.add(lbl_JButton, gbc_lbl_JButton);

		// ----- 1st Line / 2nd Row -----

		JButton btn_JButton = new JButton("Button");

		GridBagConstraints gbc_btn_JButton = new GridBagConstraints();
		gbc_btn_JButton.insets = new Insets(0, 0, 5, 5);
		gbc_btn_JButton.gridx = rowNum[1];
		gbc_btn_JButton.gridy = lineNum;
		gbc_btn_JButton.fill = GridBagConstraints.BOTH;
		panel_SwingComponents.add(btn_JButton, gbc_btn_JButton);

		// ----- 1st Line / 3rd Row -----

		JLabel lbl_JButtonValue = new JLabel("0");
		GridBagConstraints gbc_lbl_JButtonValue = new GridBagConstraints();
		gbc_lbl_JButtonValue.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_JButtonValue.gridx = rowNum[2];
		gbc_lbl_JButtonValue.gridy = lineNum;
		panel_SwingComponents.add(lbl_JButtonValue, gbc_lbl_JButtonValue);

		btn_JButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Integer value = Integer.parseInt(lbl_JButtonValue.getText());
				lbl_JButtonValue.setText(String.valueOf(value + 1));
			}
		});
	}

	/**
	 * setJTextFieldComponents
	 * 
	 */
	private void setJTextFieldComponents() {

		int lineNum = 0;

		// ----- 1st Line / 4th Row -----

		JLabel lbl_JTextField = new JLabel("JTextField");
		GridBagConstraints gbc_lbl_JTextField = new GridBagConstraints();
		gbc_lbl_JTextField.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_JTextField.gridx = rowNum[3];
		gbc_lbl_JTextField.gridy = lineNum;
		panel_SwingComponents.add(lbl_JTextField, gbc_lbl_JTextField);

		// ----- 1st Line / 5th Row -----

		JTextField textField = new JTextField();
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = rowNum[4];
		gbc_textField.gridy = lineNum;
		gbc_textField.fill = GridBagConstraints.BOTH;
		panel_SwingComponents.add(textField, gbc_textField);

		// ----- 1st Line / 6th Row -----

		JLabel lbl_JTextFieldValue = new JLabel("(empty)");
		GridBagConstraints gbc_lbl_JTextFieldValue = new GridBagConstraints();
		gbc_lbl_JTextFieldValue.insets = new Insets(0, 0, 5, 0);
		gbc_lbl_JTextFieldValue.gridx = rowNum[5];
		gbc_lbl_JTextFieldValue.gridy = lineNum;
		panel_SwingComponents.add(lbl_JTextFieldValue, gbc_lbl_JTextFieldValue);

		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {

				String value = textField.getText();
				lbl_JTextFieldValue.setText(value);
			}
		});
	}

	/**
	 * setJCheckBoxComponents
	 * 
	 */
	private void setJCheckBoxComponents() {

		int lineNum = 1;

		// ----- 2nd Line / 1st Row -----

		JLabel lbl_CheckBox = new JLabel("JCheckBox");
		GridBagConstraints gbc_lbl_JCheckbox = new GridBagConstraints();
		gbc_lbl_JCheckbox.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_JCheckbox.gridx = rowNum[0];
		gbc_lbl_JCheckbox.gridy = lineNum;
		panel_SwingComponents.add(lbl_CheckBox, gbc_lbl_JCheckbox);

		// ----- 2nd Line / 2nd Row -----

		JCheckBox chckbxCheckBox = new JCheckBox("CheckBox");
		GridBagConstraints gbc_chckbxCheckBox = new GridBagConstraints();
		gbc_chckbxCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxCheckBox.gridx = rowNum[1];
		gbc_chckbxCheckBox.gridy = lineNum;
		gbc_chckbxCheckBox.fill = GridBagConstraints.BOTH;
		panel_SwingComponents.add(chckbxCheckBox, gbc_chckbxCheckBox);

		// ----- 2nd Line / 3rd Row -----

		JLabel lbl_JCheckBoxValue = new JLabel("False");
		GridBagConstraints gbc_lbl_JCheckBoxValue = new GridBagConstraints();
		gbc_lbl_JCheckBoxValue.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_JCheckBoxValue.gridx = rowNum[2];
		gbc_lbl_JCheckBoxValue.gridy = lineNum;
		panel_SwingComponents.add(lbl_JCheckBoxValue, gbc_lbl_JCheckBoxValue);

		chckbxCheckBox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {

				Boolean value = chckbxCheckBox.isSelected();
				lbl_JCheckBoxValue.setText(String.valueOf(value));
			}
		});
	}

	/**
	 * setJToggleButtonComponents
	 * 
	 */
	private void setJToggleButtonComponents() {

		int lineNum = 1;

		// ----- 2nd Line / 4th Row -----

		JLabel lbl_Jtogglebutton = new JLabel("JToggleButton");
		GridBagConstraints gbc_lbl_Jtogglebutton = new GridBagConstraints();
		gbc_lbl_Jtogglebutton.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_Jtogglebutton.gridx = rowNum[3];
		gbc_lbl_Jtogglebutton.gridy = lineNum;
		panel_SwingComponents.add(lbl_Jtogglebutton, gbc_lbl_Jtogglebutton);

		// ----- 2nd Line / 5th Row -----
		JToggleButton tglbtnJToggleButton = new JToggleButton("JToggleButton");
		GridBagConstraints gbc_tglbtnJToggleButton = new GridBagConstraints();
		gbc_tglbtnJToggleButton.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnJToggleButton.gridx = rowNum[4];
		gbc_tglbtnJToggleButton.gridy = lineNum;
		gbc_tglbtnJToggleButton.fill = GridBagConstraints.BOTH;
		panel_SwingComponents.add(tglbtnJToggleButton, gbc_tglbtnJToggleButton);

		// ----- 2nd Line / 6th Row -----
		JLabel lbl_JToggleButtonValue = new JLabel("false");
		GridBagConstraints gbc_lbl_JToggleButtonValue = new GridBagConstraints();
		gbc_lbl_JToggleButtonValue.insets = new Insets(0, 0, 5, 0);
		gbc_lbl_JToggleButtonValue.gridx = rowNum[5];
		gbc_lbl_JToggleButtonValue.gridy = lineNum;
		panel_SwingComponents.add(lbl_JToggleButtonValue, gbc_lbl_JToggleButtonValue);

		tglbtnJToggleButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				Boolean value = tglbtnJToggleButton.isSelected();
				lbl_JToggleButtonValue.setText(String.valueOf(value));
			}
		});

	}

	/**
	 * setJRadioButtonComponents
	 * 
	 */
	private void setJRadioButtonComponents() {

		int lineNum = 2;

		ButtonGroup btnGroup = new ButtonGroup();

		// ----- 3rd-5th Line / 1st Row -----

		JLabel lbl_JRadioButton = new JLabel("JRadioButton");
		GridBagConstraints gbc_lbl_JRadioButton = new GridBagConstraints();
		gbc_lbl_JRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_JRadioButton.gridx = rowNum[0];
		gbc_lbl_JRadioButton.gridy = lineNum;
		panel_SwingComponents.add(lbl_JRadioButton, gbc_lbl_JRadioButton);

		// ----- 3rd-5th Line / 2nd Row -----

		JRadioButton rdbtnRadioButton_1 = new JRadioButton("JRadioButton#1");
		btnGroup.add(rdbtnRadioButton_1);
		GridBagConstraints gbc_rdbtnRadioButton_1 = new GridBagConstraints();
		gbc_rdbtnRadioButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnRadioButton_1.gridx = rowNum[1];
		gbc_rdbtnRadioButton_1.gridy = lineNum;
		gbc_rdbtnRadioButton_1.fill = GridBagConstraints.BOTH;
		panel_SwingComponents.add(rdbtnRadioButton_1, gbc_rdbtnRadioButton_1);

		JRadioButton rdbtnRadioButton_2 = new JRadioButton("JRadioButton#2");
		btnGroup.add(rdbtnRadioButton_2);
		GridBagConstraints gbc_rdbtnRadioButton_2 = new GridBagConstraints();
		gbc_rdbtnRadioButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnRadioButton_2.gridx = rowNum[1];
		gbc_rdbtnRadioButton_2.gridy = lineNum + 1;
		gbc_rdbtnRadioButton_2.fill = GridBagConstraints.BOTH;
		panel_SwingComponents.add(rdbtnRadioButton_2, gbc_rdbtnRadioButton_2);

		JRadioButton rdbtnRadioButton_3 = new JRadioButton("JRadioButton#3");
		btnGroup.add(rdbtnRadioButton_3);
		GridBagConstraints gbc_rdbtnRadioButton_3 = new GridBagConstraints();
		gbc_rdbtnRadioButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnRadioButton_3.gridx = rowNum[1];
		gbc_rdbtnRadioButton_3.gridy = lineNum + 2;
		gbc_rdbtnRadioButton_3.fill = GridBagConstraints.BOTH;
		panel_SwingComponents.add(rdbtnRadioButton_3, gbc_rdbtnRadioButton_3);

		// ----- 3rd-5th Line / 3rd Row -----

		JLabel lbl_JRadioButtonValue_1 = new JLabel("");
		GridBagConstraints gbc_lbl_JRadioButtonValue_1 = new GridBagConstraints();
		gbc_lbl_JRadioButtonValue_1.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_JRadioButtonValue_1.gridx = rowNum[2];
		gbc_lbl_JRadioButtonValue_1.gridy = lineNum;
		panel_SwingComponents.add(lbl_JRadioButtonValue_1, gbc_lbl_JRadioButtonValue_1);

		rdbtnRadioButton_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				Boolean value = rdbtnRadioButton_1.isSelected();
				lbl_JRadioButtonValue_1.setText(String.valueOf(value));
			}
		});

		JLabel lbl_JRadioButtonValue_2 = new JLabel("");
		GridBagConstraints gbc_lbl_JRadioButtonValue_2 = new GridBagConstraints();
		gbc_lbl_JRadioButtonValue_2.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_JRadioButtonValue_2.gridx = rowNum[2];
		gbc_lbl_JRadioButtonValue_2.gridy = lineNum + 1;
		panel_SwingComponents.add(lbl_JRadioButtonValue_2, gbc_lbl_JRadioButtonValue_2);

		rdbtnRadioButton_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				Boolean value = rdbtnRadioButton_2.isSelected();
				lbl_JRadioButtonValue_2.setText(String.valueOf(value));
			}
		});

		JLabel lbl_JRadioButtonValue_3 = new JLabel("");
		GridBagConstraints gbc_lbl_JRadioButtonValue_3 = new GridBagConstraints();
		gbc_lbl_JRadioButtonValue_3.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_JRadioButtonValue_3.gridx = rowNum[2];
		gbc_lbl_JRadioButtonValue_3.gridy = lineNum + 2;
		panel_SwingComponents.add(lbl_JRadioButtonValue_3, gbc_lbl_JRadioButtonValue_3);

		rdbtnRadioButton_3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				Boolean value = rdbtnRadioButton_3.isSelected();
				lbl_JRadioButtonValue_3.setText(String.valueOf(value));
			}
		});
	}

	/**
	 * setJFormatedTextComponents
	 * 
	 */
	private void setJFormatedTextComponents() {

		int lineNum = 2;

		// ----- 3rd Line / 4th Row -----

		JLabel lbl_JFormattedText = new JLabel("JFormattedText");
		GridBagConstraints gbc_lbl_JFormattedText = new GridBagConstraints();
		gbc_lbl_JFormattedText.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_JFormattedText.gridx = rowNum[3];
		gbc_lbl_JFormattedText.gridy = lineNum;
		panel_SwingComponents.add(lbl_JFormattedText, gbc_lbl_JFormattedText);

		// ----- 3rd Line / 5th Row -----

		JFormattedTextField formattedTextField = new JFormattedTextField();
		GridBagConstraints gbc_formattedTextField = new GridBagConstraints();
		gbc_formattedTextField.insets = new Insets(0, 0, 5, 5);
		gbc_formattedTextField.gridx = rowNum[4];
		gbc_formattedTextField.gridy = lineNum;
		gbc_formattedTextField.fill = GridBagConstraints.BOTH;
		panel_SwingComponents.add(formattedTextField, gbc_formattedTextField);

		// ----- 3rd Line / 6th Row -----
		JLabel lbl_JFormattedTextValue = new JLabel("");
		GridBagConstraints gbc_lbl_JFormattedTextValue = new GridBagConstraints();
		gbc_lbl_JFormattedTextValue.insets = new Insets(0, 0, 5, 0);
		gbc_lbl_JFormattedTextValue.gridx = rowNum[5];
		gbc_lbl_JFormattedTextValue.gridy = lineNum;
		panel_SwingComponents.add(lbl_JFormattedTextValue, gbc_lbl_JFormattedTextValue);

		formattedTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				lbl_JFormattedTextValue.setText(formattedTextField.getText());
			}
		});
	}

	/**
	 * setJPasswordFieldComponents
	 * 
	 */
	private void setJPasswordFieldComponents() {

		int lineNum = 3;

		// ----- 4th Line / 4th Row -----

		JLabel lblJPasswordField = new JLabel("JPasswordField");
		GridBagConstraints gbc_lblJPasswordField = new GridBagConstraints();
		gbc_lblJPasswordField.insets = new Insets(0, 0, 5, 5);
		gbc_lblJPasswordField.gridx = rowNum[3];
		gbc_lblJPasswordField.gridy = lineNum;
		panel_SwingComponents.add(lblJPasswordField, gbc_lblJPasswordField);

		// ----- 4th Line / 5th Row -----
		JPasswordField passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.gridx = rowNum[4];
		gbc_passwordField.gridy = lineNum;
		gbc_passwordField.fill = GridBagConstraints.BOTH;
		panel_SwingComponents.add(passwordField, gbc_passwordField);

		// ----- 4th Line / 6th Row -----
		JLabel lbl_JPasswordFieldValue = new JLabel("(empty)");
		GridBagConstraints gbc_lbl_JPasswordFieldValue = new GridBagConstraints();
		gbc_lbl_JPasswordFieldValue.insets = new Insets(0, 0, 5, 0);
		gbc_lbl_JPasswordFieldValue.gridx = rowNum[5];
		gbc_lbl_JPasswordFieldValue.gridy = lineNum;
		panel_SwingComponents.add(lbl_JPasswordFieldValue, gbc_lbl_JPasswordFieldValue);

		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				lbl_JPasswordFieldValue.setText(passwordField.getPassword().toString());
			}
		});

	}

	/**
	 * setJSpinnerComponents
	 * 
	 */
	private void setJSpinnerComponents() {

		int lineNum = 4;

		// ----- 5th Line / 4th Row -----

		JLabel lblJSpinner = new JLabel("JSpinner");
		GridBagConstraints gbc_lblJSpinner = new GridBagConstraints();
		gbc_lblJSpinner.insets = new Insets(0, 0, 5, 5);
		gbc_lblJSpinner.gridx = rowNum[3];
		gbc_lblJSpinner.gridy = lineNum;
		panel_SwingComponents.add(lblJSpinner, gbc_lblJSpinner);

		// ----- 5th Line / 5th Row -----
		JSpinner spinner = new JSpinner();
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.insets = new Insets(0, 0, 5, 5);
		gbc_spinner.gridx = rowNum[4];
		gbc_spinner.gridy = lineNum;
		gbc_spinner.fill = GridBagConstraints.BOTH;
		panel_SwingComponents.add(spinner, gbc_spinner);

		// ----- 5th Line / 6th Row -----
		JLabel lblJSpinnerValue = new JLabel("0");
		GridBagConstraints gbc_lblJSpinnerValue = new GridBagConstraints();
		gbc_lblJSpinnerValue.insets = new Insets(0, 0, 5, 0);
		gbc_lblJSpinnerValue.gridx = rowNum[5];
		gbc_lblJSpinnerValue.gridy = lineNum;
		panel_SwingComponents.add(lblJSpinnerValue, gbc_lblJSpinnerValue);

		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				lblJSpinnerValue.setText(spinner.getValue().toString());
			}
		});

	}

	/**
	 * setJTextAreaComponents
	 * 
	 */
	private void setJTextAreaComponents() {

		int lineNum = 5;

		// ----- 6th Line / 1st Row -----

		JLabel lblJTextArea = new JLabel("JTextArea");
		GridBagConstraints gbc_lblJTextArea = new GridBagConstraints();
		gbc_lblJTextArea.insets = new Insets(0, 0, 5, 5);
		gbc_lblJTextArea.gridx = rowNum[0];
		gbc_lblJTextArea.gridy = lineNum;
		panel_SwingComponents.add(lblJTextArea, gbc_lblJTextArea);

		// ----- 6th Line / 2nd Row -----

		JTextArea textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.gridx = rowNum[1];
		gbc_textArea.gridy = lineNum;
		gbc_textArea.fill = GridBagConstraints.BOTH;
		panel_SwingComponents.add(textArea, gbc_textArea);

		// ----- 6th Line / 3rd Row -----

		JLabel lblJTextAreaValue = new JLabel("");
		GridBagConstraints gbc_lblJTextAreaValue = new GridBagConstraints();
		gbc_lblJTextAreaValue.insets = new Insets(0, 0, 5, 5);
		gbc_lblJTextAreaValue.gridx = rowNum[2];
		gbc_lblJTextAreaValue.gridy = lineNum;
		panel_SwingComponents.add(lblJTextAreaValue, gbc_lblJTextAreaValue);

		textArea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String value = textArea.getText();
				lblJTextAreaValue.setText(value);
			}
		});
	}

	/**
	 * setJListComponents
	 * 
	 */
	private void setJListComponents() {

		int lineNum = 5;
		String options[] = { "a", "b", "c", "d", "e" };

		// ----- 6th Line / 4th Row -----

		JLabel lblJList = new JLabel("JList");
		GridBagConstraints gbc_lblJList = new GridBagConstraints();
		gbc_lblJList.insets = new Insets(0, 0, 5, 5);
		gbc_lblJList.gridx = rowNum[3];
		gbc_lblJList.gridy = lineNum;
		panel_SwingComponents.add(lblJList, gbc_lblJList);

		// ----- 6th Line / 5th Row -----
		JList list = new JList(options);
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = rowNum[4];
		gbc_list.gridy = lineNum;
		panel_SwingComponents.add(list, gbc_list);

		// ----- 6th Line / 6th Row -----
		JLabel lblJListValue = new JLabel("");
		GridBagConstraints gbc_lblJListValue = new GridBagConstraints();
		gbc_lblJListValue.insets = new Insets(0, 0, 5, 0);
		gbc_lblJListValue.gridx = rowNum[5];
		gbc_lblJListValue.gridy = lineNum;
		panel_SwingComponents.add(lblJListValue, gbc_lblJListValue);

		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				lblJListValue.setText(list.getSelectedValue().toString());
			}
		});

	}

	/**
	 * setJTable
	 * 
	 */
	private void setJTableComponents() {
		int lineNum = 6;

		Object[][] arrayData = {
				{"1", "a", "aaa"},
				{"2", "b", "bbb"},
				{"3", "c", "ccc"},
				{"4", "d", "ddd"},
				{"5", "e", "eee"}
		};
		
		String[] arrayColumn = {"Col.A", "Col.B", "Col.C"};
		
		
		// ----- 7th Line / 1st Row -----
		JLabel lblJTable = new JLabel("JTable");
		GridBagConstraints gbc_lblJTable = new GridBagConstraints();
		gbc_lblJTable.insets = new Insets(0, 0, 0, 5);
		gbc_lblJTable.gridx = rowNum[0];
		gbc_lblJTable.gridy = lineNum;
		panel_SwingComponents.add(lblJTable, gbc_lblJTable);

		// ----- 7th Line / 2nd Row -----
		table = new JTable(arrayData, arrayColumn);
		JScrollPane sp = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		JScrollBar bar = sp.getVerticalScrollBar();
		bar.setPreferredSize(new Dimension(0,40));
/*		JPanel p = new JPanel();
		p.add(table.getTableHeader());
		p.add(table);
		sp.setViewportView(p);
*/		
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.fill = GridBagConstraints.HORIZONTAL;
		gbc_table.insets = new Insets(0, 0, 0, 5);
		gbc_table.gridx = rowNum[1];
		gbc_table.gridwidth=6;
		gbc_table.gridy = lineNum;
		gbc_table.gridheight=5;
		
		panel_SwingComponents.add(sp, gbc_table);
	}

	/**
	 * initialize
	 * 
	 */
	private void initialize() {
		// ======= Prepare Container =======

		// ----- Set Container -----

		con = this.getContentPane();
		scrollPane = new JScrollPane();
		panel = new JPanel();
		panel.setLayout(new GridLayout(2, 0));
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		// ----- Set Panel -----

		panel_SwingComponents = new JPanel();
		panel_SwingComponents.setBorder(
				new TitledBorder(null, "Swing Components", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		GridBagLayout gbl_panel_SwingComponents = new GridBagLayout();
		gbl_panel_SwingComponents.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0};
		gbl_panel_SwingComponents.columnWeights = new double[] { 1.0, 1.0, 0.0, 0.5, 1.0, 1.0, 1.0, 0, 0.5 };
		panel_SwingComponents.setLayout(gbl_panel_SwingComponents);

		// ======= Prepare Swing Components =======

		// ----- 1st line -----

		setJButtonComponents();
		setJTextFieldComponents();

		// ----- 2nd line -----
		setJCheckBoxComponents();
		setJToggleButtonComponents();

		// ----- 3rd line -----
		setJRadioButtonComponents();
		setJFormatedTextComponents();
		setJPasswordFieldComponents();
		setJSpinnerComponents();

		// ----- 6th line -----
		setJTextAreaComponents();
		setJListComponents();

		// ----- 7th line -----
		setJTableComponents();

		// ======= Prepare AWT Components =======

		panel_AwtComponents = new JPanel();
		panel_AwtComponents.setBorder(
				new TitledBorder(null, "AWT Components", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		// ======= Place Panels onto container =======

		panel.add(panel_SwingComponents);
		panel.add(panel_AwtComponents);
		scrollPane.setViewportView(panel);
		con.add(scrollPane);

		// ======= Window Setting =======

		this.setTitle("Sample_OracleApp");
		this.setSize(1000, 800);
		this.setVisible(true);

	}

	/**
	 * Sample_OracleApp
	 * 
	 */
	public Sample_OracleApp() {

		super();
		initialize();

	}

	/**
	 * main
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample_OracleApp myApp = new Sample_OracleApp();

	}

}
