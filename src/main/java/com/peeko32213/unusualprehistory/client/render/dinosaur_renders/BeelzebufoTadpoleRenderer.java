package com.peeko32213.unusualprehistory.client.render.dinosaur_renders;


import com.peeko32213.unusualprehistory.client.model.BeelzebufoTadpoleModel;
import com.peeko32213.unusualprehistory.common.entity.msc.baby.EntityBeelzebufoTadpole;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class BeelzebufoTadpoleRenderer extends GeoEntityRenderer<EntityBeelzebufoTadpole> {

    public BeelzebufoTadpoleRenderer(EntityRendererProvider.Context context) {
        super(context, new BeelzebufoTadpoleModel());
    }
}