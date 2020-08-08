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
public class Konteks {
   public Strategy strategy;

   public Konteks (Strategy strategy){
      this.strategy = strategy;
   }

   public int executeStrategy(int bilangan1, int bilangan2){
      return strategy.eksekusi (bilangan1, bilangan2);
   }
}
