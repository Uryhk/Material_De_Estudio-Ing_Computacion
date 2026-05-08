package ec1.EJ2;

public class Materia {
        // Variables
        private String profesor;
        //Constructor
        public Materia (String profesor){
            this.profesor = profesor;
        }
        /**
         * si el argumento profesor es distinto de null, setea el valor y retorna true
         * Si el valor es null o un String vacio, ignora el valor y retorna false
         * @param profesor. El nombre del profesor
         */
        public boolean setProfesor(String profesor){
            //TODO: Implemente el metodo
            if(profesor==null || profesor.equals("")){
                return false;
            }
            this.profesor=profesor;
            return  true;

        }
        /**
         * Retorna el valor de matricula
         */
        public String getProfesor (){
            //TODO: Implemente el metodo
            return profesor;
        }}
