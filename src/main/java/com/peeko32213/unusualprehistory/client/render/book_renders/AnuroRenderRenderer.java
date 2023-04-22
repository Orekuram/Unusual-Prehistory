package com.peeko32213.unusualprehistory.client.render.book_renders;


import com.peeko32213.unusualprehistory.client.model.render.AnuroRenderModel;
import com.peeko32213.unusualprehistory.common.entity.msc.render.BaseEntityRender;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class AnuroRenderRenderer extends MobRenderer<BaseEntityRender, AnuroRenderModel<BaseEntityRender>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation("unusualprehistory:textures/entity/renders/anurognathus_render.png");

	public AnuroRenderRenderer(EntityRendererProvider.Context renderManagerIn) {
		super(renderManagerIn, new AnuroRenderModel<>(renderManagerIn.bakeLayer(AnuroRenderModel.LAYER_LOCATION)), 0.2F);
	}

	@Override
	public ResourceLocation getTextureLocation(BaseEntityRender entity) {
		return TEXTURE;
	}

}