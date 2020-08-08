/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operasi_strategy_pattern;

/**
 *
 * @author ammar
 */
public class Operasi_Strategy_Pattern {
   public static void main(String[] args) {
      Konteks konteks = new Konteks(new OperasiTambah());		
      System.out.println("10 + 5 = " + konteks.executeStrategy(10, 5));

      konteks = new Konteks(new OperasiKurang());		
      System.out.println("10 - 5 = " + konteks.executeStrategy(10, 5));

      konteks = new Konteks(new OperasiKali());		
      System.out.println("10 * 5 = " + konteks.executeStrategy(10, 5));
   }
}
