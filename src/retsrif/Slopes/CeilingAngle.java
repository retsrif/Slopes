package retsrif.Slopes;

import org.bukkit.World;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.SubTexture;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.player.SpoutPlayer;

public abstract class CeilingAngle extends SlopeBlock {
	public static CeilingAngleDesign cad;
	Texture tex;
	SubTexture subtex;
	public static GenericBlockDesign design = new GenericBlockDesign();

	public CeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex) {
		super(plugin, name, design, tex, subtex);
		this.tex = tex;
		this.subtex = subtex;
	}
	
	public void onNeighborBlockChange(World world, int x, int y, int z, int changedId) { }
	 
    public void onBlockPlace(World world, int x, int y, int z) { }
 
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

final class WoodenCeilingAngle extends CeilingAngle {
	public WoodenCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex, Direction d) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex, d);
	}
}

final class CobbleCeilingAngle extends CeilingAngle {
	public CobbleCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex, Direction d) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex, d);
	}
}

final class GlassCeilingAngle extends CeilingAngle {
	public GlassCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex, Direction d) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex, d);
	}
}

final class SandstoneCeilingAngle extends CeilingAngle {
	public SandstoneCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex, Direction d) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex, d);
	}
}

final class DirtCeilingAngle extends CeilingAngle {
	public DirtCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex, Direction d) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex, d);
	}
}

final class StoneCeilingAngle extends CeilingAngle {
	public StoneCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex, Direction d) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex, d);
	}
}

final class SandCeilingAngle extends CeilingAngle {
	public SandCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex, Direction d) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex, d);
	}
}

final class SnowCeilingAngle extends CeilingAngle {
	public SnowCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex, Direction d) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex, d);
	}
}

final class GrassCeilingAngle extends CeilingAngle {
	public GrassCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex, Direction d) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex, d);
	}
}

final class BricksCeilingAngle extends CeilingAngle {
	public BricksCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex, Direction d) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex, d);
	}
}

final class GravelCeilingAngle extends CeilingAngle {
	public GravelCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex, Direction d) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex, d);
	}
}

final class GoldCeilingAngle extends CeilingAngle {
	public GoldCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex, Direction d) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex, d);
	}
}

final class IronCeilingAngle extends CeilingAngle {
	public IronCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex, Direction d) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex, d);
	}
}

final class ObsidianCeilingAngle extends CeilingAngle {
	public ObsidianCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex, Direction d) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex, d);
	}
}

final class DiamondCeilingAngle extends CeilingAngle {
	public DiamondCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex, Direction d) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex, d);
	}
}

final class NetherbrickCeilingAngle extends CeilingAngle {
	public NetherbrickCeilingAngle(Plugin plugin, String name, Texture tex, SubTexture subtex, Direction d) {
		super(plugin, name, tex, subtex);
		cad = new CeilingAngleDesign(tex, subtex, d);
	}
}
