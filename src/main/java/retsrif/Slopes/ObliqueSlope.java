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

public abstract class ObliqueSlope extends GenericCustomBlock {
	public static ObliqueSlopeDesign osd;

	public ObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, false, new ObliqueSlopeDesign(tex, subtex));
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

final class WoodenObliqueSlope extends ObliqueSlope {
	public WoodenObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		osd = new ObliqueSlopeDesign(tex, subtex);
	}
}

final class CobbleObliqueSlope extends ObliqueSlope {
	public CobbleObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		osd = new ObliqueSlopeDesign(tex, subtex);
	}
}

final class GlassObliqueSlope extends ObliqueSlope {
	public GlassObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		osd = new ObliqueSlopeDesign(tex, subtex);
	}
}

final class SandstoneObliqueSlope extends ObliqueSlope {
	public SandstoneObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		osd = new ObliqueSlopeDesign(tex, subtex);
	}
}

final class DirtObliqueSlope extends ObliqueSlope {
	public DirtObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		osd = new ObliqueSlopeDesign(tex, subtex);
	}
}

final class StoneObliqueSlope extends ObliqueSlope {
	public StoneObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		osd = new ObliqueSlopeDesign(tex, subtex);
	}
}

final class SandObliqueSlope extends ObliqueSlope {
	public SandObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		osd = new ObliqueSlopeDesign(tex, subtex);
	}
}

final class SnowObliqueSlope extends ObliqueSlope {
	public SnowObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		osd = new ObliqueSlopeDesign(tex, subtex);
	}
}

final class GrassObliqueSlope extends ObliqueSlope {
	public GrassObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		osd = new ObliqueSlopeDesign(tex, subtex);
	}
}

final class BricksObliqueSlope extends ObliqueSlope {
	public BricksObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		osd = new ObliqueSlopeDesign(tex, subtex);
	}
}

final class GravelObliqueSlope extends ObliqueSlope {
	public GravelObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		osd = new ObliqueSlopeDesign(tex, subtex);
	}
}

final class GoldObliqueSlope extends ObliqueSlope {
	public GoldObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		osd = new ObliqueSlopeDesign(tex, subtex);
	}
}

final class IronObliqueSlope extends ObliqueSlope {
	public IronObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		osd = new ObliqueSlopeDesign(tex, subtex);
	}
}

final class ObsidianObliqueSlope extends ObliqueSlope {
	public ObsidianObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		osd = new ObliqueSlopeDesign(tex, subtex);
	}
}

final class DiamondObliqueSlope extends ObliqueSlope {
	public DiamondObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		osd = new ObliqueSlopeDesign(tex, subtex);
	}
}

final class NetherbrickObliqueSlope extends ObliqueSlope {
	public NetherbrickObliqueSlope(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		osd = new ObliqueSlopeDesign(tex, subtex);
	}
}
