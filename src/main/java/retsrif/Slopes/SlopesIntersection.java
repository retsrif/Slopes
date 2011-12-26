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

public abstract class SlopesIntersection extends GenericCustomBlock {
	public static SlopesIntersectionDesign sid;

	public SlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, false, new SlopesIntersectionDesign(tex, subtex));
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

final class WoodenSlopesIntersection extends SlopesIntersection {
	public WoodenSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sid = new SlopesIntersectionDesign(tex, subtex);
	}
}

final class CobbleSlopesIntersection extends SlopesIntersection {
	public CobbleSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sid = new SlopesIntersectionDesign(tex, subtex);
	}
}

final class GlassSlopesIntersection extends SlopesIntersection {
	public GlassSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sid = new SlopesIntersectionDesign(tex, subtex);
	}
}

final class SandstoneSlopesIntersection extends SlopesIntersection {
	public SandstoneSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sid = new SlopesIntersectionDesign(tex, subtex);
	}
}

final class DirtSlopesIntersection extends SlopesIntersection {
	public DirtSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sid = new SlopesIntersectionDesign(tex, subtex);
	}
}

final class StoneSlopesIntersection extends SlopesIntersection {
	public StoneSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sid = new SlopesIntersectionDesign(tex, subtex);
	}
}

final class SandSlopesIntersection extends SlopesIntersection {
	public SandSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sid = new SlopesIntersectionDesign(tex, subtex);
	}
}

final class SnowSlopesIntersection extends SlopesIntersection {
	public SnowSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sid = new SlopesIntersectionDesign(tex, subtex);
	}
}

final class GrassSlopesIntersection extends SlopesIntersection {
	public GrassSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sid = new SlopesIntersectionDesign(tex, subtex);
	}
}

final class BricksSlopesIntersection extends SlopesIntersection {
	public BricksSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sid = new SlopesIntersectionDesign(tex, subtex);
	}
}

final class GravelSlopesIntersection extends SlopesIntersection {
	public GravelSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sid = new SlopesIntersectionDesign(tex, subtex);
	}
}

final class GoldSlopesIntersection extends SlopesIntersection {
	public GoldSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sid = new SlopesIntersectionDesign(tex, subtex);
	}
}

final class IronSlopesIntersection extends SlopesIntersection {
	public IronSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sid = new SlopesIntersectionDesign(tex, subtex);
	}
}

final class ObsidianSlopesIntersection extends SlopesIntersection {
	public ObsidianSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sid = new SlopesIntersectionDesign(tex, subtex);
	}
}

final class DiamondSlopesIntersection extends SlopesIntersection {
	public DiamondSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sid = new SlopesIntersectionDesign(tex, subtex);
	}
}

final class NetherbrickSlopesIntersection extends SlopesIntersection {
	public NetherbrickSlopesIntersection(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sid = new SlopesIntersectionDesign(tex, subtex);
	}
}
