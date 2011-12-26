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

public abstract class InvertedObliqueSlope extends GenericCustomBlock {
	public static InvertedObliqueSlopeDesign iosd;

	public InvertedObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, false, new InvertedObliqueSlopeDesign(tex, subtex));
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

final class WoodenInvertedObliqueSlope extends InvertedObliqueSlope {
	public WoodenInvertedObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		iosd = new InvertedObliqueSlopeDesign(tex, subtex);
	}
}

final class CobbleInvertedObliqueSlope extends InvertedObliqueSlope {
	public CobbleInvertedObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		iosd = new InvertedObliqueSlopeDesign(tex, subtex);
	}
}

final class GlassInvertedObliqueSlope extends InvertedObliqueSlope {
	public GlassInvertedObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		iosd = new InvertedObliqueSlopeDesign(tex, subtex);
	}
}

final class SandstoneInvertedObliqueSlope extends InvertedObliqueSlope {
	public SandstoneInvertedObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		iosd = new InvertedObliqueSlopeDesign(tex, subtex);
	}
}

final class DirtInvertedObliqueSlope extends InvertedObliqueSlope {
	public DirtInvertedObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		iosd = new InvertedObliqueSlopeDesign(tex, subtex);
	}
}

final class StoneInvertedObliqueSlope extends InvertedObliqueSlope {
	public StoneInvertedObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		iosd = new InvertedObliqueSlopeDesign(tex, subtex);
	}
}

final class SandInvertedObliqueSlope extends InvertedObliqueSlope {
	public SandInvertedObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		iosd = new InvertedObliqueSlopeDesign(tex, subtex);
	}
}

final class SnowInvertedObliqueSlope extends InvertedObliqueSlope {
	public SnowInvertedObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		iosd = new InvertedObliqueSlopeDesign(tex, subtex);
	}
}

final class GrassInvertedObliqueSlope extends InvertedObliqueSlope {
	public GrassInvertedObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		iosd = new InvertedObliqueSlopeDesign(tex, subtex);
	}
}

final class BricksInvertedObliqueSlope extends InvertedObliqueSlope {
	public BricksInvertedObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		iosd = new InvertedObliqueSlopeDesign(tex, subtex);
	}
}

final class GravelInvertedObliqueSlope extends InvertedObliqueSlope {
	public GravelInvertedObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		iosd = new InvertedObliqueSlopeDesign(tex, subtex);
	}
}

final class GoldInvertedObliqueSlope extends InvertedObliqueSlope {
	public GoldInvertedObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		iosd = new InvertedObliqueSlopeDesign(tex, subtex);
	}
}

final class IronInvertedObliqueSlope extends InvertedObliqueSlope {
	public IronInvertedObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		iosd = new InvertedObliqueSlopeDesign(tex, subtex);
	}
}

final class ObsidianInvertedObliqueSlope extends InvertedObliqueSlope {
	public ObsidianInvertedObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		iosd = new InvertedObliqueSlopeDesign(tex, subtex);
	}
}

final class DiamondInvertedObliqueSlope extends InvertedObliqueSlope {
	public DiamondInvertedObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		iosd = new InvertedObliqueSlopeDesign(tex, subtex);
	}
}

final class NetherbrickInvertedObliqueSlope extends InvertedObliqueSlope {
	public NetherbrickInvertedObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		iosd = new InvertedObliqueSlopeDesign(tex, subtex);
	}
}
