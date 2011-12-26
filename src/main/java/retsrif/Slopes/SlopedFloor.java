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

public abstract class SlopedFloor extends GenericCustomBlock {
	public static SlopedFloorDesign sfd;

	public SlopedFloor(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, false, new SlopedFloorDesign(tex, subtex));
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

final class WoodenSlopedFloor extends SlopedFloor {
	public WoodenSlopedFloor(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sfd = new SlopedFloorDesign(tex, subtex);
	}
}

final class CobbleSlopedFloor extends SlopedFloor {
	public CobbleSlopedFloor(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sfd = new SlopedFloorDesign(tex, subtex);
	}
}

final class GlassSlopedFloor extends SlopedFloor {
	public GlassSlopedFloor(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sfd = new SlopedFloorDesign(tex, subtex);
	}
}

final class SandstoneSlopedFloor extends SlopedFloor {
	public SandstoneSlopedFloor(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sfd = new SlopedFloorDesign(tex, subtex);
	}
}

final class DirtSlopedFloor extends SlopedFloor {
	public DirtSlopedFloor(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sfd = new SlopedFloorDesign(tex, subtex);
	}
}

final class StoneSlopedFloor extends SlopedFloor {
	public StoneSlopedFloor(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sfd = new SlopedFloorDesign(tex, subtex);
	}
}

final class SandSlopedFloor extends SlopedFloor {
	public SandSlopedFloor(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sfd = new SlopedFloorDesign(tex, subtex);
	}
}

final class SnowSlopedFloor extends SlopedFloor {
	public SnowSlopedFloor(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sfd = new SlopedFloorDesign(tex, subtex);
	}
}

final class GrassSlopedFloor extends SlopedFloor {
	public GrassSlopedFloor(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sfd = new SlopedFloorDesign(tex, subtex);
	}
}

final class BricksSlopedFloor extends SlopedFloor {
	public BricksSlopedFloor(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sfd = new SlopedFloorDesign(tex, subtex);
	}
}

final class GravelSlopedFloor extends SlopedFloor {
	public GravelSlopedFloor(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sfd = new SlopedFloorDesign(tex, subtex);
	}
}

final class GoldSlopedFloor extends SlopedFloor {
	public GoldSlopedFloor(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sfd = new SlopedFloorDesign(tex, subtex);
	}
}

final class IronSlopedFloor extends SlopedFloor {
	public IronSlopedFloor(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sfd = new SlopedFloorDesign(tex, subtex);
	}
}

final class ObsidianSlopedFloor extends SlopedFloor {
	public ObsidianSlopedFloor(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sfd = new SlopedFloorDesign(tex, subtex);
	}
}

final class DiamondSlopedFloor extends SlopedFloor {
	public DiamondSlopedFloor(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sfd = new SlopedFloorDesign(tex, subtex);
	}
}

final class NetherbrickSlopedFloor extends SlopedFloor {
	public NetherbrickSlopedFloor(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, tex, subtex);
		sfd = new SlopedFloorDesign(tex, subtex);
	}
}
