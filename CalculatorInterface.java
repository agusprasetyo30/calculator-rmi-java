/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kalkulator;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author gokpraz
 */
public interface CalculatorInterface extends Remote
{
   
   public double penjumlahan(double nilai1, double nilai2) throws RemoteException;
   public double pengurangan(double nilai1, double nilai2) throws RemoteException;
   public double perkalian(double nilai1, double nilai2) throws RemoteException;
   public double pembagian(double nilai1, double nilai2) throws RemoteException;
   
}
