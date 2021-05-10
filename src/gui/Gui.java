/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import javax.swing.*;
import java.awt.event.*;
import ruang.Balok;
/**
 *
 * @author hp
 */
public class Gui extends JFrame implements ActionListener{
    JLabel lp = new JLabel("Panjang");
       JTextField fp = new JTextField(10);
       
       JLabel ll = new JLabel("Lebar");
       JTextField fl = new JTextField(10);
       
       JLabel lt = new JLabel("Tinggi");
       JTextField ft = new JTextField(10);
       
       JLabel lluas = new JLabel();
       JLabel lkeliling = new JLabel();
       JLabel lvolume = new JLabel();
       JLabel lluaspermukaan = new JLabel();
       
       JButton bhitung = new JButton("Hitung");
       JButton breset = new JButton("Reset");

       public Gui(){
           setTitle("Mengitung Balok");
           
           setSize( 310 ,  300 );
           setLayout(null);
           add(lp);
           add(fp);
           add(ll);
           add(fl);
           add(lt);
           add(ft);
           add(lluas);
           add(lkeliling);
           add(lvolume);
           add(lluaspermukaan);
           add(bhitung);
           add(breset);
           
           lp.setBounds(10,10,120,20);
           fp.setBounds(130,10,150,20);
           ll.setBounds(10,35,120,20);
           fl.setBounds(130,35,150,20);
           lt.setBounds(10,60,120,20);
           ft.setBounds(130,60,150,20);
           lluas.setBounds(10,125,200,20);
           lkeliling.setBounds(10,150,200,20);
           lvolume.setBounds(10,200,200,20);
           lluaspermukaan.setBounds(10,175,200,20);
           bhitung.setBounds(10,95,100,20);
           breset.setBounds(180,95,100,20);
           
           setVisible(true);
           setDefaultCloseOperation(EXIT_ON_CLOSE);
           setLocationRelativeTo(null);
       
           bhitung.addActionListener(this);
           breset.addActionListener(this);
       }

 
       public void actionPerformed (ActionEvent e){
           int p, l, t;
           
           if(e.getSource() == bhitung){
               if(fp.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Kolom Panjang tidak boleh kosong!");
               } else if(fl.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Kolom Lebar tidak boleh kosong!");
               } else if(ft.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Kolom Tinggi tidak boleh kosong!");
               } else {
                    try{
                         p = Integer.parseInt(fp.getText());
                         l = Integer.parseInt(fl.getText());
                         t = Integer.parseInt(ft.getText());
                         Balok balok = new Balok(p, l, t);
                         lluas.setText("Luas Persegi Panjang = " + balok.luas());
                         lkeliling.setText("Keliling Persegi Panjang = " + balok.keliling());
                         lvolume.setText("Volume Balok = " + balok.volume());
                         lluaspermukaan.setText("Luas Permukaan = " + balok.luasPermukaan());
                     } catch(NumberFormatException err){
                         JOptionPane.showMessageDialog(this, "Masukkan angka bilangan bulat!");
                     }
               }
           }
           
           if(e.getSource() == breset){
               fp.setText("");
               fl.setText("");
               ft.setText("");
               lluas.setText("");
               lkeliling.setText("");
               lvolume.setText("");
               lluaspermukaan.setText("");
               
           }
        }
}

