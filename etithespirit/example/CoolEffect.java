package etithespirit.example;

import etithespirit.autoeffect.IAutoEffect;
import etithespirit.autoeffect.data.EffectTextDisplayType;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.util.ResourceLocation;

public class CoolEffect extends Effect implements IAutoEffect {

  public static final ResourceLocation COOL_ICON = new ResourceLocation("wtflol", "textures/memes/knucklesthatisnottougherthanknuckles.png");

  protected CoolEffect(EffectType typeIn, int liquidColorIn) {
    super(typeIn, liquidColorIn);
  }

  @Override
	public ResourceLocation GetCustomIcon() {
		return COOL_ICON;
	}
	
	@Override
	public int GetNameColor() {
		return 0x069420;
	}
	
	@Override
	public EffectTextDisplayType GetInfoDisplayType() {
		return EffectTextDisplayType.NAME_ONLY;
	}
}
