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

public abstract class SlantedCorner extends GenericCustomBlock {
	public static SlantedCornerDesign scd;

	public SlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, false, new SlantedCornerDesign(tex, subtex));
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

final class WoodenSlantedCorner extends SlantedCorner {
	public WoodenSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlantedCornerDesign(tex, subtex);
	}
}

final class CobbleSlantedCorner extends SlantedCorner {
	public CobbleSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlantedCornerDesign(tex, subtex);
	}
}

final class GlassSlantedCorner extends SlantedCorner {
	public GlassSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlantedCornerDesign(tex, subtex);
	}
}

final class SandstoneSlantedCorner extends SlantedCorner {
	public SandstoneSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlantedCornerDesign(tex, subtex);
	}
}

final class DirtSlantedCorner extends SlantedCorner {
	public DirtSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlantedCornerDesign(tex, subtex);
	}
}

final class StoneSlantedCorner extends SlantedCorner {
	public StoneSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlantedCornerDesign(tex, subtex);
	}
}

final class SandSlantedCorner extends SlantedCorner {
	public SandSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlantedCornerDesign(tex, subtex);
	}
}

final class SnowSlantedCorner extends SlantedCorner {
	public SnowSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlantedCornerDesign(tex, subtex);
	}
}

final class GrassSlantedCorner extends SlantedCorner {
	public GrassSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlantedCornerDesign(tex, subtex);
	}
}

final class BricksSlantedCorner extends SlantedCorner {
	public BricksSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlantedCornerDesign(tex, subtex);
	}
}

final class GravelSlantedCorner extends SlantedCorner {
	public GravelSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlantedCornerDesign(tex, subtex);
	}
}

final class GoldSlantedCorner extends SlantedCorner {
	public GoldSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlantedCornerDesign(tex, subtex);
	}
}

final class IronSlantedCorner extends SlantedCorner {
	public IronSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlantedCornerDesign(tex, subtex);
	}
}

final class ObsidianSlantedCorner extends SlantedCorner {
	public ObsidianSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlantedCornerDesign(tex, subtex);
	}
}

final class DiamondSlantedCorner extends SlantedCorner {
	public DiamondSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlantedCornerDesign(tex, subtex);
	}
}

final class NetherbrickSlantedCorner extends SlantedCorner {
	public NetherbrickSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		scd = new SlantedCornerDesign(tex, subtex);
	}
}
