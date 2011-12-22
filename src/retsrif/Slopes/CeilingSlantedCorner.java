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

public abstract class CeilingSlantedCorner extends GenericCustomBlock {
	public static CeilingSlantedCornerDesign cscd;

	public CeilingSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, false, new CeilingSlantedCornerDesign(tex, subtex));
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

final class WoodenCeilingSlantedCorner extends CeilingSlantedCorner {
	public WoodenCeilingSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cscd = new CeilingSlantedCornerDesign(tex, subtex);
	}
}

final class CobbleCeilingSlantedCorner extends CeilingSlantedCorner {
	public CobbleCeilingSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cscd = new CeilingSlantedCornerDesign(tex, subtex);
	}
}

final class GlassCeilingSlantedCorner extends CeilingSlantedCorner {
	public GlassCeilingSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cscd = new CeilingSlantedCornerDesign(tex, subtex);
	}
}

final class SandstoneCeilingSlantedCorner extends CeilingSlantedCorner {
	public SandstoneCeilingSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cscd = new CeilingSlantedCornerDesign(tex, subtex);
	}
}

final class DirtCeilingSlantedCorner extends CeilingSlantedCorner {
	public DirtCeilingSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cscd = new CeilingSlantedCornerDesign(tex, subtex);
	}
}

final class StoneCeilingSlantedCorner extends CeilingSlantedCorner {
	public StoneCeilingSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cscd = new CeilingSlantedCornerDesign(tex, subtex);
	}
}

final class SandCeilingSlantedCorner extends CeilingSlantedCorner {
	public SandCeilingSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cscd = new CeilingSlantedCornerDesign(tex, subtex);
	}
}

final class SnowCeilingSlantedCorner extends CeilingSlantedCorner {
	public SnowCeilingSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cscd = new CeilingSlantedCornerDesign(tex, subtex);
	}
}

final class GrassCeilingSlantedCorner extends CeilingSlantedCorner {
	public GrassCeilingSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cscd = new CeilingSlantedCornerDesign(tex, subtex);
	}
}

final class BricksCeilingSlantedCorner extends CeilingSlantedCorner {
	public BricksCeilingSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cscd = new CeilingSlantedCornerDesign(tex, subtex);
	}
}

final class GravelCeilingSlantedCorner extends CeilingSlantedCorner {
	public GravelCeilingSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cscd = new CeilingSlantedCornerDesign(tex, subtex);
	}
}

final class GoldCeilingSlantedCorner extends CeilingSlantedCorner {
	public GoldCeilingSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cscd = new CeilingSlantedCornerDesign(tex, subtex);
	}
}

final class IronCeilingSlantedCorner extends CeilingSlantedCorner {
	public IronCeilingSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cscd = new CeilingSlantedCornerDesign(tex, subtex);
	}
}

final class ObsidianCeilingSlantedCorner extends CeilingSlantedCorner {
	public ObsidianCeilingSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cscd = new CeilingSlantedCornerDesign(tex, subtex);
	}
}

final class DiamondCeilingSlantedCorner extends CeilingSlantedCorner {
	public DiamondCeilingSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cscd = new CeilingSlantedCornerDesign(tex, subtex);
	}
}

final class NetherbrickCeilingSlantedCorner extends CeilingSlantedCorner {
	public NetherbrickCeilingSlantedCorner(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		cscd = new CeilingSlantedCornerDesign(tex, subtex);
	}
}
