package ProxyAndChaintOfResponsability;

public class Disponibilidad implements ITerminalTransporte {


    private Bus bus;

    private String nameBus;
    private String dateOut;
    private boolean stateBus ;

    public String getNameBus() {
        return nameBus;
    }

    public void setNameBus(String nameBus) {
        this.nameBus = nameBus;
    }

    public void setStateBus(boolean stateBus) {
        this.stateBus = stateBus;
    }

    public Disponibilidad(Bus bus) {
        this.bus = bus;
        this.stateBus=true;

    }

    @Override
    public void programacionSalidasVehiculo(String nameBus, String dateOut ,  boolean activo) {
        this.nameBus = nameBus;
        this.dateOut = dateOut;
        CheckBuses(bus);
        this.stateBus= activo;

    }

    @Override
    public void ventaTiketes(Object ProgramacionVehiculos) {

    }

    public Bus CheckBuses(Bus bus) {

        if (bus != null && stateBus ) {
            System.out.println("bus  programado, se puede vender Tiketes = " + bus + " Name:  "+ this.nameBus + "Date Out:  " +this.dateOut);
            return this.bus;
        } else {
            System.out.println("El bus  no esta habilitado = " + bus);
        }

        return this.bus;

    }

    public boolean  isStateBus() {
        return stateBus;
    }
}
