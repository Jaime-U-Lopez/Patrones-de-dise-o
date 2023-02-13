package ProxyAndChaintOfResponsability;

public class Main {

    public static void main(String[] args) {
//intanciaciones
        Bus bus = new Bus("busRojo", "3/abril");
        ServiciosEspeciales serviciosEspeciales = new ServiciosEspeciales("carro Band", "5/moyo");
        ITerminalTransporte bus1 = new Disponibilidad(bus);

        bus1.programacionSalidasVehiculo("busRojo", "3/abril", true);


        ITerminalTransporte venta = new SalidaTransporte();
        venta.ventaTiketes(bus1);


    }
}
