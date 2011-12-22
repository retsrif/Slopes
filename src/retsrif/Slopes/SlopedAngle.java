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

public abstract class SlopedAngle extends GenericCustomBlock {
	public static SlopedAngleDesign sad;

	public SlopedAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, false, new SlopedAngleDesign(tex, subtex));
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

final class WoodenSlopedAngle extends SlopedAngle {
	public WoodenSlopedAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sad = new SlopedAngleDesign(tex, subtex);
	}
}

final class CobbleSlopedAngle extends SlopedAngle {
	public CobbleSlopedAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sad = new SlopedAngleDesign(tex, subtex);
	}
}

final class GlassSlopedAngle extends SlopedAngle {
	public GlassSlopedAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sad = new SlopedAngleDesign(tex, subtex);
	}
}

final class SandstoneSlopedAngle extends SlopedAngle {
	public SandstoneSlopedAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sad = new SlopedAngleDesign(tex, subtex);
	}
}

final class DirtSlopedAngle extends SlopedAngle {
	public DirtSlopedAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sad = new SlopedAngleDesign(tex, subtex);
	}
}

final class StoneSlopedAngle extends SlopedAngle {
	public StoneSlopedAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sad = new SlopedAngleDesign(tex, subtex);
	}
}

final class SandSlopedAngle extends SlopedAngle {
	public SandSlopedAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sad = new SlopedAngleDesign(tex, subtex);
	}
}

final class SnowSlopedAngle extends SlopedAngle {
	public SnowSlopedAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sad = new SlopedAngleDesign(tex, subtex);
	}
}

final class GrassSlopedAngle extends SlopedAngle {
	public GrassSlopedAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sad = new SlopedAngleDesign(tex, subtex);
	}
}

final class BricksSlopedAngle extends SlopedAngle {
	public BricksSlopedAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sad = new SlopedAngleDesign(tex, subtex);
	}
}

final class GravelSlopedAngle extends SlopedAngle {
	public GravelSlopedAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sad = new SlopedAngleDesign(tex, subtex);
	}
}

final class GoldSlopedAngle extends SlopedAngle {
	public GoldSlopedAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sad = new SlopedAngleDesign(tex, subtex);
	}
}

final class IronSlopedAngle extends SlopedAngle {
	public IronSlopedAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sad = new SlopedAngleDesign(tex, subtex);
	}
}

final class ObsidianSlopedAngle extends SlopedAngle {
	public ObsidianSlopedAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sad = new SlopedAngleDesign(tex, subtex);
	}
}

final class DiamondSlopedAngle extends SlopedAngle {
	public DiamondSlopedAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sad = new SlopedAngleDesign(tex, subtex);
	}
}

final class NetherbrickSlopedAngle extends SlopedAngle {
	public NetherbrickSlopedAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sad = new SlopedAngleDesign(tex, subtex);
	}
}
