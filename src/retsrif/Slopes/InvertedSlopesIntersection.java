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

public abstract class InvertedSlopesIntersection extends GenericCustomBlock {
	public static InvertedSlopesIntersectionDesign isid;

	public InvertedSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, false, new InvertedSlopesIntersectionDesign(tex, subtex));
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

final class WoodenInvertedSlopesIntersection extends InvertedSlopesIntersection {
	public WoodenInvertedSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		isid = new InvertedSlopesIntersectionDesign(tex, subtex);
	}
}

final class CobbleInvertedSlopesIntersection extends InvertedSlopesIntersection {
	public CobbleInvertedSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		isid = new InvertedSlopesIntersectionDesign(tex, subtex);
	}
}

final class GlassInvertedSlopesIntersection extends InvertedSlopesIntersection {
	public GlassInvertedSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		isid = new InvertedSlopesIntersectionDesign(tex, subtex);
	}
}

final class SandstoneInvertedSlopesIntersection extends InvertedSlopesIntersection {
	public SandstoneInvertedSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		isid = new InvertedSlopesIntersectionDesign(tex, subtex);
	}
}

final class DirtInvertedSlopesIntersection extends InvertedSlopesIntersection {
	public DirtInvertedSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		isid = new InvertedSlopesIntersectionDesign(tex, subtex);
	}
}

final class StoneInvertedSlopesIntersection extends InvertedSlopesIntersection {
	public StoneInvertedSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		isid = new InvertedSlopesIntersectionDesign(tex, subtex);
	}
}

final class SandInvertedSlopesIntersection extends InvertedSlopesIntersection {
	public SandInvertedSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		isid = new InvertedSlopesIntersectionDesign(tex, subtex);
	}
}

final class SnowInvertedSlopesIntersection extends InvertedSlopesIntersection {
	public SnowInvertedSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		isid = new InvertedSlopesIntersectionDesign(tex, subtex);
	}
}

final class GrassInvertedSlopesIntersection extends InvertedSlopesIntersection {
	public GrassInvertedSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		isid = new InvertedSlopesIntersectionDesign(tex, subtex);
	}
}

final class BricksInvertedSlopesIntersection extends InvertedSlopesIntersection {
	public BricksInvertedSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		isid = new InvertedSlopesIntersectionDesign(tex, subtex);
	}
}

final class GravelInvertedSlopesIntersection extends InvertedSlopesIntersection {
	public GravelInvertedSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		isid = new InvertedSlopesIntersectionDesign(tex, subtex);
	}
}

final class GoldInvertedSlopesIntersection extends InvertedSlopesIntersection {
	public GoldInvertedSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		isid = new InvertedSlopesIntersectionDesign(tex, subtex);
	}
}

final class IronInvertedSlopesIntersection extends InvertedSlopesIntersection {
	public IronInvertedSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		isid = new InvertedSlopesIntersectionDesign(tex, subtex);
	}
}

final class ObsidianInvertedSlopesIntersection extends InvertedSlopesIntersection {
	public ObsidianInvertedSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		isid = new InvertedSlopesIntersectionDesign(tex, subtex);
	}
}

final class DiamondInvertedSlopesIntersection extends InvertedSlopesIntersection {
	public DiamondInvertedSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		isid = new InvertedSlopesIntersectionDesign(tex, subtex);
	}
}

final class NetherbrickInvertedSlopesIntersection extends InvertedSlopesIntersection {
	public NetherbrickInvertedSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		isid = new InvertedSlopesIntersectionDesign(tex, subtex);
	}
}
