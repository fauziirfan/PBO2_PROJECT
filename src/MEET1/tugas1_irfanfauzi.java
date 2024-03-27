/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MEET1;
        
/**
 *
 * @author irfanfauzi
 */
import java.awt.Label;
import javax.swing.*;
public class tugas1_irfanfauzi {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame ("Contoh program Swing");
        Label myLabel = new Label ("Selamat Belajar JAVA!");
        myFrame.add(myLabel);
        myFrame.setSize(300,250);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
