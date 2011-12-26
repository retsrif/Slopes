package retsrif.Slopes;

import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.SubTexture;
import org.getspout.spoutapi.block.design.Texture;

public class CeilingStairsDesign extends GenericBlockDesign {
	public CeilingStairsDesign(Texture tex, SubTexture subtex) {
		this.setTexture(Slopes.instance, tex);
		this.setQuadNumber(10);
		
		Quad right1 = new Quad(0, subtex);
		right1.addVertex(0, 0.5f, 1f, 0f);
		right1.addVertex(1, 0f, 1f, 0f);
		right1.addVertex(2, 0f, 0f, 0f);
		right1.addVertex(3, 0.5f, 0f, 0f);
		
		Quad right2 = new Quad(1, subtex);
		right2.addVertex(0, 1f, 1f, 0f);
		right2.addVertex(1, 0.5f, 1f, 0f);
		right2.addVertex(2, 0.5f, 0.5f, 0f);
		right2.addVertex(3, 1f, 0.5f, 0f);
		
		Quad left1 = new Quad(2, subtex);
		left1.addVertex(0, 1f, 0.5f, 1f);
		left1.addVertex(1, 0.5f, 0.5f, 1f);
		left1.addVertex(2, 0.5f, 1f, 1f);
		left1.addVertex(3, 1f, 1f, 1f);
		
		Quad left2 = new Quad(3, subtex);
		left2.addVertex(0, 0.5f, 0.5f, 1f);
		left2.addVertex(1, 0f, 0.5f, 1f);
		left2.addVertex(2, 0f, 1f, 1f);
		left2.addVertex(3, 0.5f, 1f, 1f);
		
		Quad up = new Quad(4, subtex);
		up.addVertex(0, 0f, 1f, 0f);
		up.addVertex(1, 1f, 1f, 0f);
		up.addVertex(2, 1f, 1f, 1f);
		up.addVertex(3, 0f, 1f, 1f);
		
		Quad front1 = new Quad(5, subtex);
		front1.addVertex(0, 1f, 1f, 1f);
		front1.addVertex(1, 1f, 1f, 0f);
		front1.addVertex(2, 1f, 0.5f, 0f);
		front1.addVertex(3, 1f, 0.5f, 1f);
		
		Quad front2 = new Quad(6, subtex);
		front2.addVertex(0, 0.5f, 0.5f, 1f);
		front2.addVertex(1, 0.5f, 0.5f, 0f);
		front2.addVertex(2, 0.5f, 0f, 0f);
		front2.addVertex(3, 0.5f, 0f, 1f);
		
		Quad down1 = new Quad(7, subtex);
		down1.addVertex(0, 1f, 0.5f, 0f);
		down1.addVertex(1, 0.5f, 0.5f, 0f);
		down1.addVertex(2, 0.5f, 0.5f, 1f);
		down1.addVertex(3, 1f, 0.5f, 1f);
		
		Quad down2 = new Quad(8, subtex);
		down2.addVertex(0, 0.5f, 0f, 0f);
		down2.addVertex(1, 0f, 0f, 0f);
		down2.addVertex(2, 0f, 0f, 1f);
		down2.addVertex(3, 0.5f, 0f, 1f);
		
		Quad back = new Quad(9, subtex);
		back.addVertex(0, 0f, 1f, 0f);
		back.addVertex(1, 0f, 1f, 1f);
		back.addVertex(2, 0f, 0f, 1f);
		back.addVertex(3, 0f, 0f, 0f);
		
		this.setQuad(right1).setQuad(right2).setQuad(left1).setQuad(left2).setQuad(up);
		this.setQuad(front1).setQuad(front2).setQuad(down1).setQuad(down2).setQuad(back);
		
		this.setRenderPass(1);
	}
}
