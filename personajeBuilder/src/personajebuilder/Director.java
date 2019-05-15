
package personajebuilder;

public class Director {
    
   private PersonajeBuilder personajeBuilder;
   
   public void personajeBuilder(PersonajeBuilder pb){
       personajeBuilder = pb; 
   }
   
   public void construirPersonaje(String raza, String arma, String atacar){ 
       personajeBuilder.fabricarNewPersonaje(); 
       personajeBuilder.construirRaza(raza); 
       personajeBuilder.construirTipo(arma); 
       personajeBuilder.construirAtaque(atacar);
       
   }
    
   public Personaje getPersonaje() { 
       return personajeBuilder.getPersonaje();
   }
}
