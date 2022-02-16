package Ferry;

/**
 * [la clase Vehicle es la clase base de la cual heredamos las siguientes
 * clases]
 *
 * @version [1.0.000 2022-02-12]
 *
 * @author [Juan Esteban, Velasquez Posada ]
 *
 * @since [1.0.000 2022-02-15]
 *
 */
public class Motorcicle extends Vehicle {
        int typeMotor;

    public Motorcicle(int typeMotor, int numberOfPassengers, int numberWheels, int registration, int numberSeats) {
        super(numberOfPassengers, numberWheels, registration, numberSeats);
        this.typeMotor = typeMotor;
    }
    
    public int getTypeMotor() {
        return typeMotor;
    }

    public void setTypeMotor(int typeMotor) {
        this.typeMotor = typeMotor;
    }
 

     /**
     * Numero de pasajeros asignado en  clase Motorcicle
     *
     * @return numberOfPassengers valor int
     */
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    /**
     * Numero de pasajeros asignado por usuario(en caso de ser solicitado)
     *
     * @param numberOfPassengers valor int
     */
    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    /**
     * Numero de llantas asignado clase Motorcicle
     *
     * @return getNumberWheels valor int
     */
    public int getNumberWheels() {
        return numberWheels;
    }

    /**
     * Numero de llantas asignadas por usuario(en caso de ser solicitado)
     *
     * @param numberWheels valor int
     */
    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    /**
     * Año de matriculacion de clase Motorcicle
     *
     * @return registration valor int
     */
    public int getRegistration() {
        return registration;
    }

    /**
     * Año de matriculacion del vehiculo asignada por usuario (en caso de ser
     * solicitado)
     *
     * @param registration valor int
     */
    public void setRegistration(int registration) {
        this.registration = registration;
    }

    /**
     * Numero de asientos totales
     *
     * @return numberSeats valor int
     */
    public int getNumberSeats() {
        return numberSeats;
    }

    /**
     * Numero de asientos totales asignado por usuario (en caso de ser
     * solicitado)
     *
     * @param numberSeats valor int
     */
    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }
    
    
    /**
     * [Detalle Sera el metodo para ingresar el arreglo a organizar ]
     *
     *
     *
     * @param registration Año de matriculacion del vehiculo
     * @param typeMotor tipo de cilindraje seteado por usuario
     * @return Una estructura de arreglo para mostrar los datos de la motocicleta
     *
     * @author [Juan Esteban, Velasquez Posada ]
     *
     * @since [1.0.000 2022-02-15]
     */
    
    @Override
    public String toString() {
        return "La motocicleta que creaste tiene: " + "\n" + " año de matricula= "
                + registration + " Tiene  cilindraje de: " + typeMotor + "cc" ;
    }
}