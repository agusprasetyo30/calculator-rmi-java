/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kalkulator;

import javax.swing.SwingUtilities;

/**
 *
 * @author gokpraz
 */
public class Main 
{
   public static void main(String[] args) 
   {
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            FormClient client = new FormClient();
            client.setVisible(true);
         }
      });
   }
}
