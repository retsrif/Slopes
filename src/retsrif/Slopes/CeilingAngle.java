package retsrif.Slopes;

import org.bukkit.World;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.SubTexture;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.block.GenericCustomBlock;
import org.getspout.spoutapi.player.SpoutPlayer;

public abstract class CeilingAngle extends GenericCustomBlock {
	public static CeilingAngleDesign cad;

	public CeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, false, new CeilingAngleDesign(tex, subtex));
	}
	
	public void onNeighborBlockChange(World world, int x, int y, int z, int changedId) { }
	 
    public void onBlockPlace(World world, int x, int y, int z) { }
 
    public void onBlockPlace(World world, int x, int y, int z, LivingEntity living) { }
 
    public void onBlockDestroyed(World world, int x, int y, int z) {
    	
    }
 
    public boolean onBlockInteract(World world, int x, int y, int z, SpoutPlayer player) {
        return true;
    }
 
    public void onEntityMoveAt(World world, int x, int y, int z, Entity entity) { }
 
    public void onBlockClicked(World world, int x, int y, int z, SpoutPlayer player) { }
 
    public boolean isProvidingPowerTo(World world, int x, int y, int z, BlockFace face) {
        return false;
    }
 
    public boolean isIndirectlyProvidingPowerTo(World world, int x, int y, int z, BlockFace face) {
        return false;
    }
}

final class WoodenCeilingAngle extends CeilingAngle {
	public WoodenCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex);
	}
}

final class CobbleCeilingAngle extends CeilingAngle {
	public CobbleCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex);
	}
}

final class GlassCeilingAngle extends CeilingAngle {
	public GlassCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex);
	}
}

final class SandstoneCeilingAngle extends CeilingAngle {
	public SandstoneCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex);
	}
}

final class DirtCeilingAngle extends CeilingAngle {
	public DirtCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex);
	}
}

final class StoneCeilingAngle extends CeilingAngle {
	public StoneCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex);
	}
}

final class SandCeilingAngle extends CeilingAngle {
	public SandCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex);
	}
}

final class SnowCeilingAngle extends CeilingAngle {
	public SnowCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex);
	}
}

final class GrassCeilingAngle extends CeilingAngle {
	public GrassCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex);
	}
}

final class BricksCeilingAngle extends CeilingAngle {
	public BricksCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex);
	}
}

final class GravelCeilingAngle extends CeilingAngle {
	public GravelCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex);
	}
}

final class GoldCeilingAngle extends CeilingAngle {
	public GoldCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex);
	}
}

final class IronCeilingAngle extends CeilingAngle {
	public IronCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex);
	}
}

final class ObsidianCeilingAngle extends CeilingAngle {
	public ObsidianCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex);
	}
}

final class DiamondCeilingAngle extends CeilingAngle {
	public DiamondCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex);
	}
}

final class NetherbrickCeilingAngle extends CeilingAngle {
	public NetherbrickCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex);
	}
}
