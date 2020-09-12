package by.training.oop.flower.store.model;

import by.training.oop.flower.store.enums.AccessoryKind;

public class Accessory extends Good{
    AccessoryKind accessoryKind;
//    Integer cost;
//    Integer Id;
    

    public AccessoryKind getAccessoryKind() {
        return accessoryKind;
    }

    public void setAccessoryKind(AccessoryKind accessoryKind) {
        this.accessoryKind = accessoryKind;
    }
    


}
