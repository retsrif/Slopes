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

public abstract class Corner extends GenericCustomBlock {
	public static CornerDesign cd;

	public Corner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, false, new CornerDesign(tex, subtex));
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

final class WoodenCorner extends Corner {
	public WoodenCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cd = new CornerDesign(tex, subtex);
	}
}

final class CobbleCorner extends Corner {
	public CobbleCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cd = new CornerDesign(tex, subtex);
	}
}

final class GlassCorner extends Corner {
	public GlassCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cd = new CornerDesign(tex, subtex);
	}
}

final class SandstoneCorner extends Corner {
	public SandstoneCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cd = new CornerDesign(tex, subtex);
	}
}

final class DirtCorner extends Corner {
	public DirtCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cd = new CornerDesign(tex, subtex);
	}
}

final class StoneCorner extends Corner {
	public StoneCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cd = new CornerDesign(tex, subtex);
	}
}

final class SandCorner extends Corner {
	public SandCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cd = new CornerDesign(tex, subtex);
	}
}

final class SnowCorner extends Corner {
	public SnowCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cd = new CornerDesign(tex, subtex);
	}
}

final class GrassCorner extends Corner {
	public GrassCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cd = new CornerDesign(tex, subtex);
	}
}

final class BricksCorner extends Corner {
	public BricksCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cd = new CornerDesign(tex, subtex);
	}
}

final class GravelCorner extends Corner {
	public GravelCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cd = new CornerDesign(tex, subtex);
	}
}

final class GoldCorner extends Corner {
	public GoldCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cd = new CornerDesign(tex, subtex);
	}
}

final class IronCorner extends Corner {
	public IronCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cd = new CornerDesign(tex, subtex);
	}
}

final class ObsidianCorner extends Corner {
	public ObsidianCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cd = new CornerDesign(tex, subtex);
	}
}

final class DiamondCorner extends Corner {
	public DiamondCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cd = new CornerDesign(tex, subtex);
	}
}

final class NetherbrickCorner extends Corner {
	public NetherbrickCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cd = new CornerDesign(tex, subtex);
	}
}
