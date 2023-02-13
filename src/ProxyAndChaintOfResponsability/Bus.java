package ProxyAndChaintOfResponsability;

public class Bus implements ITerminalTransporte {

    private String nameBus;
    private String dateOut;

    public Bus(String nameBus, String dateOut) {
        this.nameBus = nameBus;
        this.dateOut = dateOut;
    }

    @Override
    public void programacionSalidasVehiculo(  String nameBus, String dateOut, boolean activo) {

        this.nameBus=nameBus;
        this.dateOut= dateOut;

    }

    @Override
    public void ventaTiketes(Object ProgramacionVehiculos) {

    }

    public String getNameBus() {
        return nameBus;
    }

    public void setNameBus(String nameBus) {
        this.nameBus = nameBus;
    }

    @Override
    public String toString() {
        return "Bus";
    }
}
