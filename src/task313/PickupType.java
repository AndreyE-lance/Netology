package task313;

public class PickupType extends VehicleTypeByBodyTypes{
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PICKUP.name();
    }
}
