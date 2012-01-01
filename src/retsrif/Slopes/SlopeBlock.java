package retsrif.Slopes;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.SubTexture;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.material.block.GenericCustomBlock;
import org.getspout.spoutapi.packet.PacketCustomBlockDesign;
import org.getspout.spoutapi.player.SpoutPlayer;

public abstract class SlopeBlock extends GenericCustomBlock {
	Texture tex;
	SubTexture subtex;
	SlopeBlockDesign des;
	
	public SlopeBlock(Plugin plugin, String name, GenericBlockDesign design, Texture tex, SubTexture subtex) {
		super(plugin, name, false, design);
		
		this.tex = tex;
		this.subtex = subtex;
	}

	
	public void onNeighborBlockChange(World world, int x, int y, int z, int changedId) { }
	 
    public void onBlockPlace(World world, int x, int y, int z) { }
 
    public void onBlockPlace(World world, int x, int y, int z, LivingEntity living) {
    	Location loc = living.getLocation();
    	Block block = world.getBlockAt(x, y, z);
    	Location[] locs = getRelativeLocs(block);
    	double[] dist = getLocsDistance(locs, loc);
    	int closeFace = getClosestFace(dist);
    	
    	switch(closeFace) {
    	default:
    	case 1:
    		des = new SlopeBlockDesign(tex, subtex, Direction.EAST);
    		break;
    	case 2:
    		des = new SlopeBlockDesign(tex, subtex, Direction.SOUTH);
    		break;
    	case 3:
    		des = new SlopeBlockDesign(tex, subtex, Direction.WEST);
    		break;
    	case 0:
    		des = new SlopeBlockDesign(tex, subtex, Direction.NORTH);
    		break;
    	}
    	
    	this.setBlockDesign(des);
    	PacketCustomBlockDesign packet = new PacketCustomBlockDesign((short) 0, des);
    	
    	List<Player> players = world.getPlayers();
    	for(Player p : players) {
    		SpoutPlayer sp = (SpoutPlayer)p;
    		if(sp.isSpoutCraftEnabled()) {
    			sp.sendPacket(packet);
    		}
    	}
    }
    
    public int getClosestFace(double[] dist) {
    	double d = dist[0];
    	int f = 0;
    	for(int i=0; i<4; i++) {
    		if(dist[1]<d) {
    			f=i;
    		}
    	}
    	return f;
    }
    
    public double[] getLocsDistance(Location[] locs, Location loc) {
    	double[] dist = new double[4];
    	for(int i=0; i<4; i++) {
    		dist[i] = locs[i].distance(loc);
    	}
    	
    	return dist;
    }
    
    public Location[] getRelativeLocs(Block block) {
    		Location[] locs = {(block.getRelative(BlockFace.NORTH)).getLocation(), (block.getRelative(BlockFace.EAST)).getLocation(),
    			(block.getRelative(BlockFace.SOUTH)).getLocation(), (block.getRelative(BlockFace.WEST)).getLocation()};
    		
    		return locs;
    	}
 
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
