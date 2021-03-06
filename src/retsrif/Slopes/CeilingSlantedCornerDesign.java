package retsrif.Slopes;

import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.SubTexture;
import org.getspout.spoutapi.block.design.Texture;

public class CeilingSlantedCornerDesign extends GenericBlockDesign {
	public CeilingSlantedCornerDesign(Texture tex, SubTexture subtex) {
		this.setTexture(Slopes.instance, tex);
		this.setQuadNumber(4);
		
		Quad right = new Quad(0, subtex);
		right.addVertex(0, 1f, 1f, 0f);
		right.addVertex(1, 0f, 1f, 0f);
		right.addVertex(2, 0f, 0.5f, 0f);
		right.addVertex(3, 0f, 0f, 0f);
		
		Quad left = new Quad(1, subtex);
		left.addVertex(0, 0f, 1f, 0f);
		left.addVertex(1, 0f, 1f, 1f);
		left.addVertex(2, 0f, 0f, 0f);
		left.addVertex(3, 0f, 0.5f, 0f);
		
		Quad front = new Quad(2, subtex);
		front.addVertex(0, 0f, 1f, 1f);
		front.addVertex(1, 0.5f, 1f, 0.5f);
		front.addVertex(2, 1f, 1f, 0f);
		front.addVertex(3, 0f, 0f, 0f);
		
		Quad up = new Quad(3, subtex);
		up.addVertex(0, 0.5f, 1f, 0.5f);
		up.addVertex(1, 0f, 1f, 1f);
		up.addVertex(2, 0f, 1f, 0f);
		up.addVertex(3, 1f, 1f, 0f);
		
		this.setQuad(right).setQuad(left).setQuad(front).setQuad(up);
		
		this.setRenderPass(1);
	}
}