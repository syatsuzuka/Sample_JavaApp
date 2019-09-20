import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.List;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * Sample_OracleApp
 * 
 */
public class Sample_OracleApp extends JFrame {

	// ======= Constants =======

	private static final long serialVersionUID = 1L;
	private String title = "Sample_OracleApp";
	private String header = "GUI Components for Testing ver1.0";
	private int[] rowNum = { 0, 1, 3, 5, 6, 8 };

	// ======= Member Variable =======

	// ----- Container -----

	private Container con = null;
	private JPanel panel = null;
	private JPanel panel_SwingComponents_1;
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
		panel_SwingComponents_1.add(lbl_JButton, gbc_lbl_JButton);

		// ----- 1st Line / 2nd Row -----

		JButton btn_JButton = new JButton("Button");

		GridBagConstraints gbc_btn_JButton = new GridBagConstraints();
		gbc_btn_JButton.insets = new Insets(0, 0, 5, 5);
		gbc_btn_JButton.gridx = rowNum[1];
		gbc_btn_JButton.gridy = lineNum;
		gbc_btn_JButton.fill = GridBagConstraints.BOTH;
		panel_SwingComponents_1.add(btn_JButton, gbc_btn_JButton);

		// ----- 1st Line / 3rd Row -----

		final JLabel lbl_JButtonValue = new JLabel("0");
		GridBagConstraints gbc_lbl_JButtonValue = new GridBagConstraints();
		gbc_lbl_JButtonValue.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_JButtonValue.gridx = rowNum[2];
		gbc_lbl_JButtonValue.gridy = lineNum;
		panel_SwingComponents_1.add(lbl_JButtonValue, gbc_lbl_JButtonValue);

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
		panel_SwingComponents_1.add(lbl_JTextField, gbc_lbl_JTextField);

		// ----- 1st Line / 5th Row -----

		JTextField textField = new JTextField();
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = rowNum[4];
		gbc_textField.gridy = lineNum;
		gbc_textField.fill = GridBagConstraints.BOTH;
		panel_SwingComponents_1.add(textField, gbc_textField);
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
		panel_SwingComponents_1.add(lbl_CheckBox, gbc_lbl_JCheckbox);

		// ----- 2nd Line / 2nd Row -----

		final JCheckBox chckbxCheckBox = new JCheckBox("CheckBox");
		GridBagConstraints gbc_chckbxCheckBox = new GridBagConstraints();
		gbc_chckbxCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxCheckBox.gridx = rowNum[1];
		gbc_chckbxCheckBox.gridy = lineNum;
		gbc_chckbxCheckBox.fill = GridBagConstraints.BOTH;
		panel_SwingComponents_1.add(chckbxCheckBox, gbc_chckbxCheckBox);

		// ----- 2nd Line / 3rd Row -----

		final JLabel lbl_JCheckBoxValue = new JLabel("False");
		GridBagConstraints gbc_lbl_JCheckBoxValue = new GridBagConstraints();
		gbc_lbl_JCheckBoxValue.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_JCheckBoxValue.gridx = rowNum[2];
		gbc_lbl_JCheckBoxValue.gridy = lineNum;
		panel_SwingComponents_1.add(lbl_JCheckBoxValue, gbc_lbl_JCheckBoxValue);

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
		panel_SwingComponents_1.add(lbl_Jtogglebutton, gbc_lbl_Jtogglebutton);

		// ----- 2nd Line / 5th Row -----
		final JToggleButton tglbtnJToggleButton = new JToggleButton("JToggleButton");
		GridBagConstraints gbc_tglbtnJToggleButton = new GridBagConstraints();
		gbc_tglbtnJToggleButton.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnJToggleButton.gridx = rowNum[4];
		gbc_tglbtnJToggleButton.gridy = lineNum;
		gbc_tglbtnJToggleButton.fill = GridBagConstraints.BOTH;
		panel_SwingComponents_1.add(tglbtnJToggleButton, gbc_tglbtnJToggleButton);

		// ----- 2nd Line / 6th Row -----
		final JLabel lbl_JToggleButtonValue = new JLabel("false");
		GridBagConstraints gbc_lbl_JToggleButtonValue = new GridBagConstraints();
		gbc_lbl_JToggleButtonValue.insets = new Insets(0, 0, 5, 0);
		gbc_lbl_JToggleButtonValue.gridx = rowNum[5];
		gbc_lbl_JToggleButtonValue.gridy = lineNum;
		panel_SwingComponents_1.add(lbl_JToggleButtonValue, gbc_lbl_JToggleButtonValue);

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
		panel_SwingComponents_1.add(lbl_JRadioButton, gbc_lbl_JRadioButton);

		// ----- 3rd-5th Line / 2nd Row -----

		final JRadioButton rdbtnRadioButton_1 = new JRadioButton("JRadioButton#1");
		btnGroup.add(rdbtnRadioButton_1);
		GridBagConstraints gbc_rdbtnRadioButton_1 = new GridBagConstraints();
		gbc_rdbtnRadioButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnRadioButton_1.gridx = rowNum[1];
		gbc_rdbtnRadioButton_1.gridy = lineNum;
		gbc_rdbtnRadioButton_1.fill = GridBagConstraints.BOTH;
		panel_SwingComponents_1.add(rdbtnRadioButton_1, gbc_rdbtnRadioButton_1);

		final JRadioButton rdbtnRadioButton_2 = new JRadioButton("JRadioButton#2");
		btnGroup.add(rdbtnRadioButton_2);
		GridBagConstraints gbc_rdbtnRadioButton_2 = new GridBagConstraints();
		gbc_rdbtnRadioButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnRadioButton_2.gridx = rowNum[1];
		gbc_rdbtnRadioButton_2.gridy = lineNum + 1;
		gbc_rdbtnRadioButton_2.fill = GridBagConstraints.BOTH;
		panel_SwingComponents_1.add(rdbtnRadioButton_2, gbc_rdbtnRadioButton_2);

		final JRadioButton rdbtnRadioButton_3 = new JRadioButton("JRadioButton#3");
		btnGroup.add(rdbtnRadioButton_3);
		GridBagConstraints gbc_rdbtnRadioButton_3 = new GridBagConstraints();
		gbc_rdbtnRadioButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnRadioButton_3.gridx = rowNum[1];
		gbc_rdbtnRadioButton_3.gridy = lineNum + 2;
		gbc_rdbtnRadioButton_3.fill = GridBagConstraints.BOTH;
		panel_SwingComponents_1.add(rdbtnRadioButton_3, gbc_rdbtnRadioButton_3);

		// ----- 3rd-5th Line / 3rd Row -----

		final JLabel lbl_JRadioButtonValue_1 = new JLabel("");
		GridBagConstraints gbc_lbl_JRadioButtonValue_1 = new GridBagConstraints();
		gbc_lbl_JRadioButtonValue_1.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_JRadioButtonValue_1.gridx = rowNum[2];
		gbc_lbl_JRadioButtonValue_1.gridy = lineNum;
		panel_SwingComponents_1.add(lbl_JRadioButtonValue_1, gbc_lbl_JRadioButtonValue_1);

		rdbtnRadioButton_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				Boolean value = rdbtnRadioButton_1.isSelected();
				lbl_JRadioButtonValue_1.setText(String.valueOf(value));
			}
		});

		final JLabel lbl_JRadioButtonValue_2 = new JLabel("");
		GridBagConstraints gbc_lbl_JRadioButtonValue_2 = new GridBagConstraints();
		gbc_lbl_JRadioButtonValue_2.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_JRadioButtonValue_2.gridx = rowNum[2];
		gbc_lbl_JRadioButtonValue_2.gridy = lineNum + 1;
		panel_SwingComponents_1.add(lbl_JRadioButtonValue_2, gbc_lbl_JRadioButtonValue_2);

		rdbtnRadioButton_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				Boolean value = rdbtnRadioButton_2.isSelected();
				lbl_JRadioButtonValue_2.setText(String.valueOf(value));
			}
		});

		final JLabel lbl_JRadioButtonValue_3 = new JLabel("");
		GridBagConstraints gbc_lbl_JRadioButtonValue_3 = new GridBagConstraints();
		gbc_lbl_JRadioButtonValue_3.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_JRadioButtonValue_3.gridx = rowNum[2];
		gbc_lbl_JRadioButtonValue_3.gridy = lineNum + 2;
		panel_SwingComponents_1.add(lbl_JRadioButtonValue_3, gbc_lbl_JRadioButtonValue_3);

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
		panel_SwingComponents_1.add(lbl_JFormattedText, gbc_lbl_JFormattedText);

		// ----- 3rd Line / 5th Row -----

		JFormattedTextField formattedTextField = new JFormattedTextField();
		GridBagConstraints gbc_formattedTextField = new GridBagConstraints();
		gbc_formattedTextField.insets = new Insets(0, 0, 5, 5);
		gbc_formattedTextField.gridx = rowNum[4];
		gbc_formattedTextField.gridy = lineNum;
		gbc_formattedTextField.fill = GridBagConstraints.BOTH;
		panel_SwingComponents_1.add(formattedTextField, gbc_formattedTextField);

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
		panel_SwingComponents_1.add(lblJPasswordField, gbc_lblJPasswordField);

		// ----- 4th Line / 5th Row -----
		JPasswordField passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.gridx = rowNum[4];
		gbc_passwordField.gridy = lineNum;
		gbc_passwordField.fill = GridBagConstraints.BOTH;
		panel_SwingComponents_1.add(passwordField, gbc_passwordField);

	}

	/**
	 * setJSpinnerComponents
	 * 
	 */
	private void setJSpinnerComponents() {

		int lineNum = 4;

		// ----- 5th Line / 4th Row -----

		final JLabel lblJSpinner = new JLabel("JSpinner");
		GridBagConstraints gbc_lblJSpinner = new GridBagConstraints();
		gbc_lblJSpinner.insets = new Insets(0, 0, 5, 5);
		gbc_lblJSpinner.gridx = rowNum[3];
		gbc_lblJSpinner.gridy = lineNum;
		panel_SwingComponents_1.add(lblJSpinner, gbc_lblJSpinner);

		// ----- 5th Line / 5th Row -----
		final JSpinner spinner = new JSpinner();
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.insets = new Insets(0, 0, 5, 5);
		gbc_spinner.gridx = rowNum[4];
		gbc_spinner.gridy = lineNum;
		gbc_spinner.fill = GridBagConstraints.BOTH;
		panel_SwingComponents_1.add(spinner, gbc_spinner);

		// ----- 5th Line / 6th Row -----
		final JLabel lblJSpinnerValue = new JLabel("0");
		GridBagConstraints gbc_lblJSpinnerValue = new GridBagConstraints();
		gbc_lblJSpinnerValue.insets = new Insets(0, 0, 5, 0);
		gbc_lblJSpinnerValue.gridx = rowNum[5];
		gbc_lblJSpinnerValue.gridy = lineNum;
		panel_SwingComponents_1.add(lblJSpinnerValue, gbc_lblJSpinnerValue);

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
		panel_SwingComponents_1.add(lblJTextArea, gbc_lblJTextArea);

		// ----- 6th Line / 2nd Row -----

		JTextArea textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.gridx = rowNum[1];
		gbc_textArea.gridy = lineNum;
		gbc_textArea.fill = GridBagConstraints.BOTH;
		panel_SwingComponents_1.add(textArea, gbc_textArea);

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
		panel_SwingComponents_1.add(lblJList, gbc_lblJList);

		// ----- 6th Line / 5th Row -----
		final JList<String> list = new JList<String>(options);
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = rowNum[4];
		gbc_list.gridy = lineNum;
		panel_SwingComponents_1.add(list, gbc_list);

		// ----- 6th Line / 6th Row -----
		final JLabel lblJListValue = new JLabel("");
		GridBagConstraints gbc_lblJListValue = new GridBagConstraints();
		gbc_lblJListValue.insets = new Insets(0, 0, 5, 0);
		gbc_lblJListValue.gridx = rowNum[5];
		gbc_lblJListValue.gridy = lineNum;
		panel_SwingComponents_1.add(lblJListValue, gbc_lblJListValue);

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

		Object[][] arrayData = { { "1", "a", "aaa" }, { "2", "b", "bbb" }, { "3", "c", "ccc" }, { "4", "d", "ddd" },
				{ "5", "e", "eee" } };

		String[] arrayColumn = { "Col.A", "Col.B", "Col.C" };

		// ----- 7th Line / 1st Row -----
		JLabel lblJTable = new JLabel("JTable");
		GridBagConstraints gbc_lblJTable = new GridBagConstraints();
		gbc_lblJTable.insets = new Insets(0, 0, 5, 5);
		gbc_lblJTable.gridx = rowNum[0];
		gbc_lblJTable.gridy = lineNum;
		panel_SwingComponents_1.add(lblJTable, gbc_lblJTable);

		// ----- 7th Line / 2nd Row -----
		table = new JTable(arrayData, arrayColumn);
		JScrollPane sp = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		JScrollBar bar = sp.getVerticalScrollBar();
		bar.setPreferredSize(new Dimension(0, 40));

		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.insets = new Insets(0, 0, 0, 5);
		gbc_table.gridx = rowNum[1];
		gbc_table.gridwidth = 6;
		gbc_table.gridy = lineNum;

		panel_SwingComponents_1.add(sp, gbc_table);
		
		// ----- 7th Line / 3rd Row -----
		
		final JLabel lblJTableValue = new JLabel("");
		GridBagConstraints gbc_lblJTableValue = new GridBagConstraints();
		gbc_lblJTableValue.insets = new Insets(0, 0, 5, 0);
		gbc_lblJTableValue.gridx = rowNum[5];
		gbc_lblJTableValue.gridy = lineNum;
		panel_SwingComponents_1.add(lblJTableValue, gbc_lblJTableValue);

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblJTableValue.setText(String.valueOf(table.getSelectedRow()));
			}
		});

	}

	/**
	 * createSwingPanel
	 * 
	 */
	private void createSwingPanel() {

		// ======= Set Panel =======

		panel_SwingComponents_1 = new JPanel();
		panel_SwingComponents_1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		GridBagLayout gbl_panel_SwingComponents = new GridBagLayout();
		gbl_panel_SwingComponents.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0 };
		gbl_panel_SwingComponents.columnWeights = new double[] { 1.0, 1.0, 0.0, 0.5, 1.0, 1.0, 1.0, 0, 0.5 };
		panel_SwingComponents_1.setLayout(gbl_panel_SwingComponents);

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

	}

	/**
	 * setButtonComponents
	 * 
	 */
	private void setButtonComponents() {

		int lineNum = 0;

		// ----- 1st Line / 1st Row -----
		JLabel lblButton = new JLabel("Button");
		GridBagConstraints gbc_lblButton = new GridBagConstraints();
		gbc_lblButton.insets = new Insets(0, 0, 5, 5);
		gbc_lblButton.gridx = rowNum[0];
		gbc_lblButton.gridy = lineNum;
		panel_AwtComponents.add(lblButton, gbc_lblButton);

		// ----- 1st Line / 2nd Row -----
		Button button = new Button("Button");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = rowNum[1];
		gbc_button.gridy = lineNum;
		gbc_button.fill = GridBagConstraints.BOTH;
		panel_AwtComponents.add(button, gbc_button);

		// ----- 1st Line / 3rd Row -----
		final Label lblButtonValue = new Label("0");
		GridBagConstraints gbc_lblButtonValue = new GridBagConstraints();
		gbc_lblButtonValue.insets = new Insets(0, 0, 5, 5);
		gbc_lblButtonValue.gridx = rowNum[2];
		gbc_lblButtonValue.gridy = lineNum;

		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int value = Integer.valueOf(lblButtonValue.getText());
				lblButtonValue.setText(String.valueOf(value + 1));
			}
		});

		panel_AwtComponents.add(lblButtonValue, gbc_lblButtonValue);
	}

	/**
	 * setCheckBoxComponents
	 * 
	 */
	private void setCheckBoxComponents() {

		int lineNum = 0;

		// ----- 1st Line / 1st Row -----

		Label lblCheckBox = new Label("CheckBox");
		GridBagConstraints gbc_lblCheckBox = new GridBagConstraints();
		gbc_lblCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_lblCheckBox.gridx = rowNum[3];
		gbc_lblCheckBox.gridy = lineNum;
		panel_AwtComponents.add(lblCheckBox, gbc_lblCheckBox);

		// ----- 1st Line / 2nd Row -----
		final Checkbox checkbox = new Checkbox("CheckBox");
		GridBagConstraints gbc_checkbox = new GridBagConstraints();
		gbc_checkbox.insets = new Insets(0, 0, 5, 5);
		gbc_checkbox.gridx = rowNum[4];
		gbc_checkbox.gridy = lineNum;
		gbc_checkbox.fill = GridBagConstraints.BOTH;
		panel_AwtComponents.add(checkbox, gbc_checkbox);

		// ----- 1st Line / 3rd Row -----
		final Label lblCheckBoxValue = new Label("false");
		GridBagConstraints gbc_lblCheckBoxValue = new GridBagConstraints();
		gbc_lblCheckBoxValue.insets = new Insets(0, 0, 5, 0);
		gbc_lblCheckBoxValue.gridx = rowNum[5];
		gbc_lblCheckBoxValue.gridy = lineNum;

		checkbox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				lblCheckBoxValue.setText(String.valueOf(checkbox.getState()));
			}
		});

		panel_AwtComponents.add(lblCheckBoxValue, gbc_lblCheckBoxValue);
	}

	/**
	 * setChoiceComponents
	 * 
	 */
	private void setChoiceComponents() {

		int lineNum = 1;

		// ----- 2nd Line / 1st Row -----

		Label lblChoice = new Label("Choice");
		GridBagConstraints gbc_lblChoice = new GridBagConstraints();
		gbc_lblChoice.insets = new Insets(0, 0, 5, 5);
		gbc_lblChoice.gridx = rowNum[0];
		gbc_lblChoice.gridy = lineNum;
		panel_AwtComponents.add(lblChoice, gbc_lblChoice);

		// ----- 2nd Line / 2nd Row -----
		final Choice choice = new Choice();
		choice.addItem("a");
		choice.addItem("b");
		choice.addItem("c");
		choice.addItem("d");
		choice.addItem("e");

		GridBagConstraints gbc_choice = new GridBagConstraints();
		gbc_choice.insets = new Insets(0, 0, 5, 5);
		gbc_choice.gridx = rowNum[1];
		gbc_choice.gridy = lineNum;
		gbc_choice.fill = GridBagConstraints.BOTH;
		panel_AwtComponents.add(choice, gbc_choice);

		// ----- 2nd Line / 3rd Row -----
		final Label lblChoiceValue = new Label("");
		GridBagConstraints gbc_lblChoiceValue = new GridBagConstraints();
		gbc_lblChoiceValue.insets = new Insets(0, 0, 5, 5);
		gbc_lblChoiceValue.gridx = rowNum[2];
		gbc_lblChoiceValue.gridy = lineNum;

		choice.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				lblChoiceValue.setText(choice.getSelectedItem());
			}
		});

		panel_AwtComponents.add(lblChoiceValue, gbc_lblChoiceValue);
	}


	/**
	 * setTextFieldComponents
	 * 
	 */
	private void setTextFieldComponents() {

		int lineNum = 1;

		// ----- 2nd Line / 4th Row -----
		Label lblTextField = new Label("TextField");
		GridBagConstraints gbc_lblTextField = new GridBagConstraints();
		gbc_lblTextField.insets = new Insets(0, 0, 5, 5);
		gbc_lblTextField.gridx = rowNum[3];
		gbc_lblTextField.gridy = lineNum;
		panel_AwtComponents.add(lblTextField, gbc_lblTextField);

		// ----- 2nd Line / 4th Row -----
		TextField textField = new TextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = rowNum[4];
		gbc_textField.gridy = lineNum;
		gbc_textField.fill = GridBagConstraints.BOTH;
		panel_AwtComponents.add(textField, gbc_textField);

	}

	/**
	 * setListComponents
	 * 
	 */
	private void setListComponents() {

		int lineNum = 2;

		// ----- 3rd Line / 1st Row -----
		Label lblList = new Label("List");
		GridBagConstraints gbc_lblList = new GridBagConstraints();
		gbc_lblList.insets = new Insets(0, 0, 5, 5);
		gbc_lblList.gridx = rowNum[0];
		gbc_lblList.gridy = lineNum;
		panel_AwtComponents.add(lblList, gbc_lblList);

		// ----- 3rd Line / 2nd Row -----
		final List list = new List();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");

		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.gridx = rowNum[1];
		gbc_list.gridy = lineNum;
		gbc_list.fill = GridBagConstraints.BOTH;
		panel_AwtComponents.add(list, gbc_list);

		// ----- 3rd Line / 3rd Row -----
		final Label lblListValue = new Label("");
		GridBagConstraints gbc_lblListValue = new GridBagConstraints();
		gbc_lblListValue.insets = new Insets(0, 0, 5, 0);
		gbc_lblListValue.gridx = rowNum[2];
		gbc_lblListValue.gridy = lineNum;

		list.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				lblListValue.setText(list.getSelectedItem());
			}
		});

		panel_AwtComponents.add(lblListValue, gbc_lblListValue);
	}
	/**
	 * setTextAreaComponents
	 * 
	 */
	private void setTextAreaComponents() {

		int lineNum = 2;

		// ----- 3rd Line / 4th Row -----
		Label lblTextArea = new Label("TextArea");
		GridBagConstraints gbc_lblTextArea = new GridBagConstraints();
		gbc_lblTextArea.insets = new Insets(0, 0, 0, 5);
		gbc_lblTextArea.gridx = rowNum[3];
		gbc_lblTextArea.gridy = lineNum;
		panel_AwtComponents.add(lblTextArea, gbc_lblTextArea);

		// ----- 3rd Line / 5th Row -----
		TextArea textArea = new TextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.insets = new Insets(0, 0, 0, 5);
		gbc_textArea.gridx = rowNum[4];
		gbc_textArea.gridy = lineNum;
		gbc_textArea.fill = GridBagConstraints.BOTH;
		panel_AwtComponents.add(textArea, gbc_textArea);

	}

	/**
	 * createAwtPanel
	 * 
	 */
	private void createAwtPanel() {

		// ======= Set Panel =======

		panel_AwtComponents = new JPanel();
		panel_AwtComponents.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		GridBagLayout gbl_panel_AwtComponents = new GridBagLayout();
		gbl_panel_AwtComponents.rowWeights = new double[] { 0.0, 0.0, 0.0 };
		gbl_panel_AwtComponents.columnWeights = new double[] { 1.0, 1.0, 0.0, 0.5, 1.0, 1.0, 1.0, 0, 0.5 };
		panel_AwtComponents.setLayout(gbl_panel_AwtComponents);

		// ======= Prepare AWT Components =======

		// ----- 1st line -----
		setButtonComponents();
		setCheckBoxComponents();

		// ----- 2nd line -----

		setChoiceComponents();
		setListComponents();

		// ----- 3rd line -----

		setTextFieldComponents();
		setTextAreaComponents();

	}

	/**
	 * initialize
	 * 
	 */
	private void initialize() {

		// ======= Prepare Container =======

		// ----- Set Container -----

		con = this.getContentPane();
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.setLayout(new BorderLayout());
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

		// ======= Place Panels onto container =======
		
		JLabel lblHeader = new JLabel(header);
		lblHeader.setFont(new Font("Arial", Font.BOLD,18));

		createSwingPanel();
		createAwtPanel();
		tabbedPane.addTab("Swing", panel_SwingComponents_1);
		
		tabbedPane.addTab("AWT", panel_AwtComponents);
		panel.add(lblHeader, BorderLayout.NORTH);
		panel.add(tabbedPane, BorderLayout.CENTER);
		con.add(panel);

		// ======= Window Setting =======

		this.setTitle(title);
		this.setSize(800, 500);
		this.setResizable(false);
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

		new Sample_OracleApp();

	}

}
