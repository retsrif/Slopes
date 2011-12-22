package retsrif.Slopes;

import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.SubTexture;
import org.getspout.spoutapi.block.design.Texture;

public class CeilingAngleDesign extends GenericBlockDesign {
	public CeilingAngleDesign(Texture tex, SubTexture subtex) {
		this.setTexture(Slopes.instance, tex);
		this.setQuadNumber(5);
		
		Quad frontR = new Quad(0, subtex);
		frontR.addVertex(0, 1f, 1f, 0f);
		frontR.addVertex(1, 0f, 1f, 0f);
		frontR.addVertex(2, 0f, 0f, 1f);
		frontR.addVertex(3, 0.5f, 0.5f, 0.5f);
		
		Quad frontL = new Quad(1, subtex);
		frontL.addVertex(0, 1f, 1f, 1f);
		frontL.addVertex(1, 1f, 1f, 0f);
		frontL.addVertex(2, 0.5f, 0.5f, 0.5f);
		frontL.addVertex(3, 0f, 0f, 1f);
		
		Quad backR = new Quad(2, subtex);
		backR.addVertex(0, 0f, 1f, 0f);
		backR.addVertex(1, 0f, 1f, 1f);
		backR.addVertex(2, 0f, 0.5f, 1f);
		backR.addVertex(3, 0f, 0f, 1f);
		
		Quad backL = new Quad(3, subtex);
		backL.addVertex(0, 0f, 0.5f, 1f);
		backL.addVertex(1, 0f, 0f, 1f);
		backL.addVertex(2, 1f, 1f, 1f);
		backL.addVertex(3, 0f, 1f, 1f);
		
		Quad up = new Quad(4, subtex);
		up.addVertex(0, 1f, 1f, 1f);
		up.addVertex(1, 0f, 1f, 1f);
		up.addVertex(2, 0f, 1f, 0f);
		up.addVertex(3, 1f, 1f, 0f);
		
		this.setQuad(frontR).setQuad(frontL).setQuad(backR).setQuad(backL).setQuad(up);
		
		this.setRenderPass(1);
	}
}