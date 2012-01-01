package retsrif.Slopes;

import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.SubTexture;
import org.getspout.spoutapi.block.design.Texture;

public class StairsDesign extends GenericBlockDesign {
	public StairsDesign(Texture tex, SubTexture subtex) {
		this.setTexture(Slopes.instance, tex);
		this.setQuadNumber(10);
		
		Quad right1 = new Quad(0, subtex);
		right1.addVertex(0, 0.5f, 1f, 0f);
		right1.addVertex(1, 0f, 1f, 0f);
		right1.addVertex(2, 0f, 0f, 0f);
		right1.addVertex(3, 0.5f, 0f, 0f);
		
		Quad right2 = new Quad(1, subtex);
		right2.addVertex(0, 1f, 0.5f, 0f);
		right2.addVertex(1, 0.5f, 0.5f, 0f);
		right2.addVertex(2, 0.5f, 0f, 0f);
		right2.addVertex(3, 1f, 0f, 0f);
		
		Quad left1 = new Quad(2, subtex);
		left1.addVertex(0, 0.5f, 0.5f, 1f);
		left1.addVertex(1, 1f, 0.5f, 1f);
		left1.addVertex(2, 1f, 0f, 1f);
		left1.addVertex(3, 0.5f, 0f, 1f);
		
		Quad left2 = new Quad(3, subtex);
		left2.addVertex(0, 0f, 1f, 1f);
		left2.addVertex(1, 0.5f, 1f, 1f);
		left2.addVertex(2, 0.5f, 0f, 1f);
		left2.addVertex(3, 0f, 0f, 1f);
		
		Quad up1 = new Quad(4, subtex);
		up1.addVertex(0, 0.5f, 1f, 1f);
		up1.addVertex(1, 0f, 1f, 1f);
		up1.addVertex(2, 0f, 1f, 0f);
		up1.addVertex(3, 0.5f, 1f, 0f);
		
		Quad up2 = new Quad(5, subtex);
		up2.addVertex(0, 1f, 0.5f, 1f);
		up2.addVertex(1, 0.5f, 0.5f, 1f);
		up2.addVertex(2, 0.5f, 0.5f, 0f);
		up2.addVertex(3, 1f, 0.5f, 0f);
		
		Quad front1 = new Quad(6, subtex);
		front1.addVertex(0, 0.5f, 1f, 1f);
		front1.addVertex(1, 0.5f, 1f, 0f);
		front1.addVertex(2, 0.5f, 0.5f, 0f);
		front1.addVertex(3, 0.5f, 0.5f, 1f);
		
		Quad front2 = new Quad(7, subtex);
		front2.addVertex(0, 1f, 0.5f, 1f);
		front2.addVertex(1, 1f, 0.5f, 0f);
		front2.addVertex(2, 1f, 0f, 0f);
		front2.addVertex(3, 1f, 0f, 1f);
		
		Quad down = new Quad(8, subtex);
		down.addVertex(0, 1f, 0f, 0f);
		down.addVertex(1, 1f, 0f, 1f);
		down.addVertex(2, 0f, 0f, 1f);
		down.addVertex(3, 0f, 0f, 0f);
		
		Quad back = new Quad(9, subtex);
		back.addVertex(0, 0f, 1f, 0f);
		back.addVertex(1, 0f, 1f, 1f);
		back.addVertex(2, 0f, 0f, 1f);
		back.addVertex(3, 0f, 0f, 0f);
		
		this.setQuad(right1).setQuad(right2).setQuad(left1).setQuad(left2).setQuad(up1);
		this.setQuad(left2).setQuad(front1).setQuad(front2).setQuad(down).setQuad(back);
		
		this.setRenderPass(1);
	}
}