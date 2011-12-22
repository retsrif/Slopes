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

public abstract class SlopedCeiling extends GenericCustomBlock {
	public static SlopedCeilingDesign scd;

	public SlopedCeiling(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, false, new SlopedCeilingDesign(tex, subtex));
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

final class WoodenSlopedCeiling extends SlopedCeiling {
	public WoodenSlopedCeiling(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlopedCeilingDesign(tex, subtex);
	}
}

final class CobbleSlopedCeiling extends SlopedCeiling {
	public CobbleSlopedCeiling(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlopedCeilingDesign(tex, subtex);
	}
}

final class GlassSlopedCeiling extends SlopedCeiling {
	public GlassSlopedCeiling(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlopedCeilingDesign(tex, subtex);
	}
}

final class SandstoneSlopedCeiling extends SlopedCeiling {
	public SandstoneSlopedCeiling(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlopedCeilingDesign(tex, subtex);
	}
}

final class DirtSlopedCeiling extends SlopedCeiling {
	public DirtSlopedCeiling(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlopedCeilingDesign(tex, subtex);
	}
}

final class StoneSlopedCeiling extends SlopedCeiling {
	public StoneSlopedCeiling(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlopedCeilingDesign(tex, subtex);
	}
}

final class SandSlopedCeiling extends SlopedCeiling {
	public SandSlopedCeiling(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlopedCeilingDesign(tex, subtex);
	}
}

final class SnowSlopedCeiling extends SlopedCeiling {
	public SnowSlopedCeiling(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlopedCeilingDesign(tex, subtex);
	}
}

final class GrassSlopedCeiling extends SlopedCeiling {
	public GrassSlopedCeiling(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlopedCeilingDesign(tex, subtex);
	}
}

final class BricksSlopedCeiling extends SlopedCeiling {
	public BricksSlopedCeiling(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlopedCeilingDesign(tex, subtex);
	}
}

final class GravelSlopedCeiling extends SlopedCeiling {
	public GravelSlopedCeiling(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlopedCeilingDesign(tex, subtex);
	}
}

final class GoldSlopedCeiling extends SlopedCeiling {
	public GoldSlopedCeiling(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlopedCeilingDesign(tex, subtex);
	}
}

final class IronSlopedCeiling extends SlopedCeiling {
	public IronSlopedCeiling(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlopedCeilingDesign(tex, subtex);
	}
}

final class ObsidianSlopedCeiling extends SlopedCeiling {
	public ObsidianSlopedCeiling(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlopedCeilingDesign(tex, subtex);
	}
}

final class DiamondSlopedCeiling extends SlopedCeiling {
	public DiamondSlopedCeiling(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlopedCeilingDesign(tex, subtex);
	}
}

final class NetherbrickSlopedCeiling extends SlopedCeiling {
	public NetherbrickSlopedCeiling(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlopedCeilingDesign(tex, subtex);
	}
}
