/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.miguelloriegaparcial;


import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author MILO
 */
public class GeneradorCalificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Evaluacion e=new Evaluacion();
        e.setNombre("petra" );
        e.setNombre("jose");
        e.setNombre("roberta");
        
          e.setCalificacion();
          e.setCalificacion();
      
          
       
     
        System.out.println("probaremos tosas las operaciones sql");
        
        //primer paso crear el SessionFactory
      SessionFactory factory= MiconfiguracionHibernate.getSessionFactory();
        
        //obtenemos la apertura de sesion actual
        Session sesion= factory.openSession();
        
        
        //Creamos la transaccion
        Transaction tranza=sesion.beginTransaction();
        
       
      /*  Usuario u=*/
                
             List<Evaluacion> evaluacion= sesion.createCriteria(Evaluacion.class).list();
                
                /*.add(Restrictions.idEq(1)).uniqueResult();*/
        
        tranza.commit();  
        sesion.close();
        for(Evaluacion ev: evaluacion){
        System.out.println("caligicaciones encontradas:"+ev.getNombre());
        // TODO code application logic here
        }}}
    

