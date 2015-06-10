
public class CubeSides {

}
/*
import com.sun.j3d.utils.geometry.*;
import com.sun.j3d.utils.universe.*;
import javax.media.j3d.*;
import javax.vecmath.*;

public class CubeSides {
	public CubeSides() {
		// 創建一個虛擬空間
		SimpleUniverse universe = new SimpleUniverse();
		// 創建一個用來包含對象的數據結構
		BranchGroup group = new BranchGroup();

		// 創建一個球並把它加入到group中
		Sphere sphere = new Sphere(0.5f); // 小球的半徑為0.5米
		group.addChild(sphere);

		Color3f light1Color = new Color3f(1.8f, 0.1f, 0.1f);
		// 設置光線的顏色
		BoundingSphere bounds = new BoundingSphere(new Point3d(0.0, 0.0, 0.0),
				100.0);
		// 設置光線的作用範圍
		Vector3f light1Direction = new Vector3f(4.0f, -7.0f, -12.0f);
		// 設置光線的方向
		DirectionalLight light1 = new DirectionalLight(light1Color,
				light1Direction);
		// 指定顏色和方向，產生單向光源
		light1.setInfluencingBounds(bounds);
		// 把光線的作用範圍加入光源中
		group.addChild(light1);
		// 將光源加入group組,安放觀察點
		universe.getViewingPlatform().setNominalViewingTransform();
		// 把group加入到虛擬空間中
		universe.addBranchGraph(group);
	}

	public static void main(String[] args) {
		new CubeSides();
	}
}
*/