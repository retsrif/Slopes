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

public abstract class Stairs extends GenericCustomBlock {
	public static StairsDesign sd;

	public Stairs(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, false, new StairsDesign(tex, subtex));
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

final class GlassStairs extends Stairs {
	public GlassStairs(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sd = new StairsDesign(tex, subtex);
	}
}

final class SandstoneStairs extends Stairs {
	public SandstoneStairs(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sd = new StairsDesign(tex, subtex);
	}
}

final class DirtStairs extends Stairs {
	public DirtStairs(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sd = new StairsDesign(tex, subtex);
	}
}

final class SandStairs extends Stairs {
	public SandStairs(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sd = new StairsDesign(tex, subtex);
	}
}

final class SnowStairs extends Stairs {
	public SnowStairs(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sd = new StairsDesign(tex, subtex);
	}
}

final class GrassStairs extends Stairs {
	public GrassStairs(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sd = new StairsDesign(tex, subtex);
	}
}

final class GravelStairs extends Stairs {
	public GravelStairs(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sd = new StairsDesign(tex, subtex);
	}
}

final class GoldStairs extends Stairs {
	public GoldStairs(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sd = new StairsDesign(tex, subtex);
	}
}

final class IronStairs extends Stairs {
	public IronStairs(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sd = new StairsDesign(tex, subtex);
	}
}

final class ObsidianStairs extends Stairs {
	public ObsidianStairs(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sd = new StairsDesign(tex, subtex);
	}
}

final class DiamondStairs extends Stairs {
	public DiamondStairs(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sd = new StairsDesign(tex, subtex);
	}
}
