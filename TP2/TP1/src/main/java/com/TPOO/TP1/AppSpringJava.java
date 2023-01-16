package com.TPOO.TP1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppSpringJava {
   public static void main(String[] args) {
      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
      Service zooService = (Service) context.getBean(Service.class);


      try {
         zooService.nouveauVisiteur();
      } catch (LimiteVisiteurException e) {
         System.out.println("Trop de visiteurs");
      }
   }


}
