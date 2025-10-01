package gym_app;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class design extends JFrame {

    private DefaultTableModel model;
    private ArrayList<Member> members = new ArrayList<>();

    private JTextField tfName, tfSex, tfDob, tfPhone;
    private JSpinner spMonths;
    private JTable table;
    private JButton btnAdd, btnRemove, btnCheck, btnUpdate, btnExport;

    public design() {
        super("Quản Lý Lớp Học");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLocationRelativeTo(null);

        initComponents();
        setVisible(true);
    }

    private void initComponents() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(204, 255, 204));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Labels + TextFields
        JLabel lblName = new JLabel("NAME :");
        JLabel lblSex = new JLabel("SEX :");
        JLabel lblDob = new JLabel("DATE OF BIRTH :");
        JLabel lblPhone = new JLabel("PHONE NUMBER :");
        JLabel lblMonths = new JLabel("NUMBER OF MONTHS :");

        tfName = new JTextField(15);
        tfSex = new JTextField(15);
        tfDob = new JTextField(15);
        tfPhone = new JTextField(15);
        spMonths = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));

        // Table
        model = new DefaultTableModel(new String[]{"No", "Sex", "Name", "Months"}, 0);
        table = new JTable(model);
        table.setRowHeight(25);
        table.setSelectionBackground(new Color(102, 204, 255));
        table.setSelectionForeground(Color.BLACK);
        table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        table.getTableHeader().setBackground(new Color(51, 153, 255));
        table.getTableHeader().setForeground(Color.RED);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        JScrollPane scrollPane = new JScrollPane(table);

        // Buttons
        btnAdd = new JButton("ADD");
        btnRemove = new JButton("REMOVE");
        btnCheck = new JButton("CHECK");
        btnUpdate = new JButton("UPDATE");
        btnExport = new JButton("EXPORT FILE");

        // Add components to panel (left form)
        gbc.gridx = 0; gbc.gridy = 0; panel.add(lblName, gbc);
        gbc.gridx = 1; gbc.gridy = 0; panel.add(tfName, gbc);

        gbc.gridx = 0; gbc.gridy = 1; panel.add(lblSex, gbc);
        gbc.gridx = 1; gbc.gridy = 1; panel.add(tfSex, gbc);

        gbc.gridx = 0; gbc.gridy = 2; panel.add(lblDob, gbc);
        gbc.gridx = 1; gbc.gridy = 2; panel.add(tfDob, gbc);

        gbc.gridx = 0; gbc.gridy = 3; panel.add(lblPhone, gbc);
        gbc.gridx = 1; gbc.gridy = 3; panel.add(tfPhone, gbc);

        gbc.gridx = 0; gbc.gridy = 4; panel.add(lblMonths, gbc);
        gbc.gridx = 1; gbc.gridy = 4; panel.add(spMonths, gbc);

        gbc.gridx = 0; gbc.gridy = 5; gbc.gridwidth = 2;
        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5,0));
        btnPanel.add(btnAdd); btnPanel.add(btnRemove);
        btnPanel.add(btnCheck); btnPanel.add(btnUpdate); btnPanel.add(btnExport);
        panel.add(btnPanel, gbc);

        // Table on the right
        gbc.gridx = 2; gbc.gridy = 0; gbc.gridheight = 6; gbc.fill = GridBagConstraints.BOTH; gbc.weightx=1; gbc.weighty=1;
        panel.add(scrollPane, gbc);

        add(panel);

        // Button actions
        btnAdd.addActionListener(e -> addMember());
        btnRemove.addActionListener(e -> removeMember());
        btnCheck.addActionListener(e -> checkMember());
        btnUpdate.addActionListener(e -> updateMember());
        btnExport.addActionListener(e -> exportMembers());
    }

    private void addMember() {
        String name = tfName.getText();
        String sex = tfSex.getText();
        String dob = tfDob.getText();
        String phone = tfPhone.getText();
        int months = (int) spMonths.getValue();

        if (name.isEmpty() || sex.isEmpty() || dob.isEmpty() || phone.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields!");
            return;
        }

        Member m = new Member(name, sex, dob, phone, months);
        members.add(m);
        model.addRow(new Object[]{model.getRowCount()+1, sex, name, months});

        tfName.setText(""); tfSex.setText(""); tfDob.setText(""); tfPhone.setText(""); spMonths.setValue(0);
    }

    private void removeMember() {
        int row = table.getSelectedRow();
        if (row >= 0) {
            model.removeRow(row);
            members.remove(row);
        } else JOptionPane.showMessageDialog(this, "Please select a row to remove!");
    }

    private void checkMember() {
        int row = table.getSelectedRow();
        if (row >= 0) {
            String name = (String) model.getValueAt(row, 2);
            int months = (int) model.getValueAt(row, 3);
            JOptionPane.showMessageDialog(this, name + " has registered for " + months + " months.");
        } else JOptionPane.showMessageDialog(this, "Please select a member to check!");
    }

    private void updateMember() {
        int row = table.getSelectedRow();
        if (row >= 0) {
            Member m = members.get(row);

            String name = tfName.getText().isEmpty() ? m.getName() : tfName.getText();
            String sex = tfSex.getText().isEmpty() ? m.getSex() : tfSex.getText();
            String dob = tfDob.getText().isEmpty() ? m.getDob() : tfDob.getText();
            String phone = tfPhone.getText().isEmpty() ? m.getPhone() : tfPhone.getText();
            int months = (int) spMonths.getValue(); if(months==0) months = m.getMonths();

            m.setName(name); m.setSex(sex); m.setDob(dob); m.setPhone(phone); m.setMonths(months);
            model.setValueAt(sex, row, 1); model.setValueAt(name, row, 2); model.setValueAt(months, row, 3);

            JOptionPane.showMessageDialog(this, "Update successful!");
        } else JOptionPane.showMessageDialog(this, "Please select a row to update!");
    }

    private void exportMembers() {
        try {
            java.io.FileWriter fw = new java.io.FileWriter("members.txt");
            fw.write("======= MEMBER LIST =======\n");
            fw.write(String.format("%-5s | %-6s | %-15s | %-6s\n","No","Sex","Name","Months"));
            fw.write("---------------------------------------------\n");
            for(int i=0;i<members.size();i++){
                Member m = members.get(i);
                fw.write(String.format("%-5d | %-6s | %-15s | %-6d\n", i+1, m.getSex(), m.getName(), m.getMonths()));
            }
            fw.close();
            JOptionPane.showMessageDialog(this,"Export successful! File: members.txt");
        } catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error exporting file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new design());
    }
}
