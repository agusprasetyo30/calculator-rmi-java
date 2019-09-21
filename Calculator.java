
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kalkulator;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author gokpraz
 */
public class Calculator extends UnicastRemoteObject implements CalculatorInterface
{
   
   public Calculator() throws RemoteException
   {}

   @Override
   public double penjumlahan(double nilai1, double nilai2) throws RemoteException 
   {
      double jumlah = nilai1 + nilai2;
      
      return jumlah;
   }

   @Override
   public double pengurangan(double nilai1, double nilai2) throws RemoteException 
   {
      double kurang = nilai1 - nilai2;
      
      return kurang;
   }

   @Override
   public double perkalian(double nilai1, double nilai2) throws RemoteException 
   {
      double kali = nilai1 * nilai2;
      
      return kali;
   }

   @Override
   public double pembagian(double nilai1, double nilai2) throws RemoteException 
   {
      double bagi = nilai1 / nilai2;
      
      return bagi;
   }
}
