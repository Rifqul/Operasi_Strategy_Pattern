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
public class OperasiTambah implements Strategy{
   @Override
   public int eksekusi(int bilangan1, int bilangan2) {
      return bilangan1 + bilangan2;
   }
}
