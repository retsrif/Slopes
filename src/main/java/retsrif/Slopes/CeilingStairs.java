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

public abstract class CeilingStairs extends GenericCustomBlock {
	public static CeilingStairsDesign csd;

	public CeilingStairs(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, false, new CeilingStairsDesign(tex, subtex));
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

final class WoodenCeilingStairs extends CeilingStairs {
	public WoodenCeilingStairs(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		csd = new CeilingStairsDesign(tex, subtex);
	}
}

final class CobbleCeilingStairs extends CeilingStairs {
	public CobbleCeilingStairs(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		csd = new CeilingStairsDesign(tex, subtex);
	}
}

final class GlassCeilingStairs extends CeilingStairs {
	public GlassCeilingStairs(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		csd = new CeilingStairsDesign(tex, subtex);
	}
}

final class SandstoneCeilingStairs extends CeilingStairs {
	public SandstoneCeilingStairs(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		csd = new CeilingStairsDesign(tex, subtex);
	}
}

final class DirtCeilingStairs extends CeilingStairs {
	public DirtCeilingStairs(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		csd = new CeilingStairsDesign(tex, subtex);
	}
}

final class StoneCeilingStairs extends CeilingStairs {
	public StoneCeilingStairs(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		csd = new CeilingStairsDesign(tex, subtex);
	}
}

final class SandCeilingStairs extends CeilingStairs {
	public SandCeilingStairs(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		csd = new CeilingStairsDesign(tex, subtex);
	}
}

final class SnowCeilingStairs extends CeilingStairs {
	public SnowCeilingStairs(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		csd = new CeilingStairsDesign(tex, subtex);
	}
}

final class GrassCeilingStairs extends CeilingStairs {
	public GrassCeilingStairs(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		csd = new CeilingStairsDesign(tex, subtex);
	}
}

final class BricksCeilingStairs extends CeilingStairs {
	public BricksCeilingStairs(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		csd = new CeilingStairsDesign(tex, subtex);
	}
}

final class GravelCeilingStairs extends CeilingStairs {
	public GravelCeilingStairs(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		csd = new CeilingStairsDesign(tex, subtex);
	}
}

final class GoldCeilingStairs extends CeilingStairs {
	public GoldCeilingStairs(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		csd = new CeilingStairsDesign(tex, subtex);
	}
}

final class IronCeilingStairs extends CeilingStairs {
	public IronCeilingStairs(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		csd = new CeilingStairsDesign(tex, subtex);
	}
}

final class ObsidianCeilingStairs extends CeilingStairs {
	public ObsidianCeilingStairs(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		csd = new CeilingStairsDesign(tex, subtex);
	}
}

final class DiamondCeilingStairs extends CeilingStairs {
	public DiamondCeilingStairs(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		csd = new CeilingStairsDesign(tex, subtex);
	}
}

final class NetherbrickCeilingStairs extends CeilingStairs {
	public NetherbrickCeilingStairs(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		csd = new CeilingStairsDesign(tex, subtex);
	}
}
