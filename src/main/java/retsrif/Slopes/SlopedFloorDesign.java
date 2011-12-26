package retsrif.Slopes;

import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.SubTexture;
import org.getspout.spoutapi.block.design.Texture;

public class SlopedFloorDesign extends GenericBlockDesign {
	public SlopedFloorDesign(Texture tex, SubTexture subtex) {
		this.setTexture(Slopes.instance, tex);
		this.setQuadNumber(5);
		
		Quad right = new Quad(0, subtex);
		right.addVertex(0, 0.5f, 0.5f, 0);
		right.addVertex(1, 0f, 1f, 0f);
		right.addVertex(2, 0f, 0f, 0f);
		right.addVertex(3, 1f, 0f, 0f);
		
		Quad left = new Quad(1, subtex);
		left.addVertex(0, 1f, 0f, 1f);
		left.addVertex(1, 0f, 0f, 1f);
		left.addVertex(2, 0f, 1f, 1f);
		left.addVertex(3, 0.5f, 0.5f, 1f);
		
		Quad front = new Quad(2, subtex);
		front.addVertex(0, 0f, 1f, 1f);
		front.addVertex(1, 0f, 1f, 0f);
		front.addVertex(2, 1f, 0f, 0f);
		front.addVertex(3, 1f, 0f, 1f);
		
		Quad back = new Quad(3, subtex);
		back.addVertex(0, 0f, 1f, 0f);
		back.addVertex(1, 0f, 1f, 1f);
		back.addVertex(2, 0f, 0f, 1f);
		back.addVertex(3, 0f, 0f, 0f);
		
		Quad down = new Quad(4, subtex);
		down.addVertex(0, 1f, 0f, 1f);
		down.addVertex(1, 1f, 0f, 0f);
		down.addVertex(2, 0f, 0f, 0f);
		down.addVertex(3, 0f, 0f, 1f);
		
		this.setQuad(right).setQuad(left).setQuad(front).setQuad(back).setQuad(down);
		
		this.setRenderPass(1);
	}
}