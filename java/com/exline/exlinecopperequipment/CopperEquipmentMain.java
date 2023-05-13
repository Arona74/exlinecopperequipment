package com.exline.exlinecopperequipment;

import com.exline.exlinecopperequipment.init.ItemInit;
import net.fabricmc.api.ModInitializer;

public class CopperEquipmentMain implements ModInitializer {

    public static final String MOD_ID = "exlinecopperequipment";

    @Override
    public void onInitialize(){
        ItemInit.registerItems();
    }
}
