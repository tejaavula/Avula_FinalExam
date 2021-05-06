/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example2;

/**
 * pilot 
 * @author Tejaswi Avula
 */
 class flight extends pilot{
  @Override
  void salary()
  {
      System.out.println("hourly salary of pilot will be 12.45$");
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pilot obj=new flight();
        obj.salary();
    }
    
}