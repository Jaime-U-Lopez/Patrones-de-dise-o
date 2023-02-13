package ProxyAndChaintOfResponsability;

public class ServiciosEspeciales implements ITerminalTransporte {


    private String nameBus;
    private String dateOut;

    public ServiciosEspeciales(String nameBus, String dateOut) {
        this.nameBus = nameBus;
        this.dateOut = dateOut;
    }

    @Override
    public void programacionSalidasVehiculo(String nameBus, String dateOut, boolean activo) {

    }

    @Override
    public void ventaTiketes(Object ProgramacionVehiculos) {

    }
}
