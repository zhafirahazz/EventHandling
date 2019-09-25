package eventhandling;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class DataDiri extends JFrame {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("TUGAS EVENT HANDLING");
    JLabel ljk = new JLabel("Jenis Kelamin");
    JRadioButton rbPria = new JRadioButton(" Laki-Laki ");
    JRadioButton rbWanita = new JRadioButton(" Perempuan ");
    ButtonGroup gender = new ButtonGroup();
    JTextField hasilGender = new JTextField("Pilih Jenis Kelamin!");
    JLabel labelDidik = new JLabel("Pendidikan Terakhir");
    String namaDidik[]
            = {" SD ",
               " SMP ",
               " SMA ",
               " D1/D3/D4 ",
               " S1 ",
               " S2 ",
               " S3 "};
    JComboBox cmbDidik = new JComboBox(namaDidik);
    JTextField hasilDidik = new JTextField("Pendidikan Terakhir Anda?");
    JLabel labelAgama = new JLabel("Agama");
    String namaAgama[]
            = {" Islam ",
               " Kristen ",
               " Katholik ",
               " Hindu ",
               " Budha "};
    JComboBox cbAgama = new JComboBox(namaAgama);
    JTextField hasilAgama = new JTextField("Islam");
    JLabel labelStatus = new JLabel("Status");
    JCheckBox cbMenikah = new JCheckBox("Menikah");
    JCheckBox cbBelum = new JCheckBox("Belum Menikah");
    JTextField hStatus = new JTextField("Menikah");
    
    //mouse listener
    JTextField hobi = new JTextField("Hobi");
    JTextField travel = new JTextField("Travelling & Photography");
    JTextField cook = new JTextField("Culinary & Cooking");
    JTextField sport = new JTextField("Sport & E-Sport");
    JTextField art = new JTextField("Art");
    JTextField hasil1 = new JTextField();
    JTextField hasil2 = new JTextField();
    
    //pengatur font
    Font font1 = new Font("Arial", Font.BOLD, 30);
    Font font2 = new Font("Arial", Font.BOLD, 15);

    public DataDiri() {
        //frame
        frame.setTitle("TUGAS EVENT HANDLING");
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLayout(null);

        //judul
        frame.add(label);
        label.setFont(font2);
        label.setBounds(300, 20, 200, 50);
         
        //jeniskelamin
        frame.add(ljk);
        ljk.setBounds(50, 100, 150, 20);
        frame.add(rbPria);
        rbPria.setBounds(200, 100, 100, 20);
        frame.add(rbWanita);
        rbWanita.setBounds(300, 100, 100, 20);
        gender.add(rbPria);
        gender.add(rbWanita);
        rbPria.addItemListener((ItemEvent ie) -> {
            if (ie.getSource() == rbPria) {
                if (ie.getStateChange() == ItemEvent.SELECTED) {
                    hasilGender.setText("Laki-Laki");
                }
            }
        });
        rbWanita.addItemListener((ItemEvent ie) -> {
            if (ie.getSource() == rbWanita) {
                if (ie.getStateChange() == ItemEvent.SELECTED) {
                    hasilGender.setText("Perempuan");
                }
            }
        });
        frame.add(hasilGender);
        hasilGender.setBounds(200, 125, 200, 20);
        hasilGender.setEditable(false);
        
        //pendidikan terakhir
        frame.add(labelDidik);
        labelDidik.setBounds(50, 150, 300, 30);
        frame.add(cmbDidik);
        cmbDidik.setBounds(200, 150, 200, 20);
        cmbDidik.addItemListener((ItemEvent ie) -> {
            if (ie.getStateChange() == ItemEvent.SELECTED) {
                if (cmbDidik.getSelectedIndex() == 0) {
                    hasilDidik.setText("SD");
                } else if (cmbDidik.getSelectedIndex() == 1) {
                    hasilDidik.setText("SMP");
                } else if (cmbDidik.getSelectedIndex() == 2) {
                    hasilDidik.setText("SMA");
                } else if (cmbDidik.getSelectedIndex() == 3) {
                    hasilDidik.setText("D1/D3/D4");
                } else if (cmbDidik.getSelectedIndex() == 4) {
                    hasilDidik.setText("S1");
                } else if (cmbDidik.getSelectedIndex() == 5) {
                    hasilDidik.setText("S2");
                } else if (cmbDidik.getSelectedIndex() == 6) {
                    hasilDidik.setText("S3");
                }
            }
        });
        frame.add(hasilDidik);
        hasilDidik.setBounds(200, 175, 200, 20);
        hasilDidik.setEditable(false);
        
        //agama
        frame.add(labelAgama);
        labelAgama.setBounds(50, 200, 150, 20);
        frame.add(cbAgama);
        cbAgama.setBounds(200, 200, 200, 20);
        cbAgama.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                if (cbAgama.getSelectedIndex() == 0) {
                    hasilAgama.setText("Islam");
                } else if (cbAgama.getSelectedIndex() == 1) {
                    hasilAgama.setText("Kristen");
                } else if (cbAgama.getSelectedIndex() == 2) {
                    hasilAgama.setText("Katholik");
                } else if (cbAgama.getSelectedIndex() == 3) {
                    hasilAgama.setText("Hindu");
                } else if (cbAgama.getSelectedIndex() == 4) {
                    hasilAgama.setText("Budha");
                }
            }
        });
        frame.add(hasilAgama);
        hasilAgama.setBounds(200, 225, 200, 20);
        hasilAgama.setEditable(false);
        
        //status
        frame.add(labelStatus);
        labelStatus.setBounds(50, 250, 150, 20);
        frame.add(cbMenikah);
        cbMenikah.setBounds(200, 250, 100, 20);
        frame.add(cbBelum);
        cbBelum.setBounds(300, 250, 120, 20);
        cbMenikah.addItemListener((ItemEvent event) -> {
            if (event.getSource() == cbMenikah) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    hStatus.setText("Menikah");
                    cbMenikah.setSelected(true);
                }
            }
        });
        cbBelum.addItemListener((ItemEvent event) -> {
            if (event.getSource() == cbBelum) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    hStatus.setText("Belum Menikah");
                    cbBelum.setSelected(true);
                }
            }
        });
        frame.add(hStatus);
        hStatus.setBounds(200, 275, 300, 20);
        hStatus.setEditable(false); //text field nanti gabisa diubah

        //buat mouse listenernya
        frame.add(travel); //hobi travelling dan photography
        travel.setBounds(25, 320, 150, 20);
        travel.setEditable(false);
        travel.setHorizontalAlignment(JTextField.CENTER);
        travel.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent me) {
                hasil1.setText(travel.getText());
            }
        });
        frame.add(cook); //hobi culinary dan cooking
        cook.setBounds(225, 320, 150, 20);
        cook.setEditable(false);
        cook.setHorizontalAlignment(JTextField.CENTER);
        cook.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent me) {
                hasil1.setText(cook.getText());
            }
        });
        frame.add(sport); //hobi sport dan e-sport
        sport.setBounds(425, 320, 150, 20);
        sport.setEditable(false);
        sport.setHorizontalAlignment(JTextField.CENTER);
        sport.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent me) {
                hasil1.setText(sport.getText());
            }
        });
        frame.add(art); //hobi art atau kesenian
        art.setBounds(625, 320, 150, 20);
        art.setEditable(false);
        art.setHorizontalAlignment(JTextField.CENTER);
        art.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent me) {
                hasil1.setText(art.getText());
            }
        });
        //hasil frame
        frame.add(hasil1);
        hasil1.setBounds(25, 380, 750, 50);
        hasil1.setEditable(false);
        Font font = null;
        hasil1.setFont(font);
        hasil1.setHorizontalAlignment(JTextField.CENTER);
        hasil1.addMouseMotionListener(new MouseAdapter() {
            public void mouseMoved(MouseEvent me) {
                hasil2.setText(hasil1.getText());
            }
        });
    }
}