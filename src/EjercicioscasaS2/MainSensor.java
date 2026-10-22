package EjercicioscasaS2;

public class MainSensor {
    public static void main(String[] args) {
        // Creación de los tres sensores utilizando new
        Sensor sensorTemp = new Sensor();
        Sensor sensorPres = new Sensor();
        Sensor sensorHum = new Sensor();

        // Asignación de valores al sensor de temperatura
        sensorTemp.nombre = "Sensor T-01";
        sensorTemp.tipo = "Temperatura";
        sensorTemp.lectura = 24.5;
        sensorTemp.unidad = "°C";

        // Asignación de valores al sensor de presión
        sensorPres.nombre = "Sensor P-01";
        sensorPres.tipo = "Presión";
        sensorPres.lectura = 101.3;
        sensorPres.unidad = "kPa";

        // Asignación de valores al sensor de humedad
        sensorHum.nombre = "Sensor H-01";
        sensorHum.tipo = "Humedad";
        sensorHum.lectura = 60.0;
        sensorHum.unidad = "%";

        // Comprobación de la información inicial de cada sensor
        System.out.println("=== INFORMACIÓN INICIAL DE LOS SENSORES ===");
        System.out.println("\n--- Sensor de Temperatura ---");
        sensorTemp.mostrarInformacion();

        System.out.println("\n--- Sensor de Presión ---");
        sensorPres.mostrarInformacion();

        System.out.println("\n--- Sensor de Humedad ---");
        sensorHum.mostrarInformacion();

        // Probando actualización y reinicio
        System.out.println("\n=== PRUEBAS DE MÉTODOS ===");
        sensorTemp.actualizarLectura(28.2);
        sensorHum.reiniciarLectura();

        System.out.println("\n=== ESTADO FINAL DEL SENSOR DE HUMEDAD ===");
        sensorHum.mostrarInformacion();
    }
}

