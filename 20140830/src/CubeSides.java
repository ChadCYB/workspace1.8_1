
public class CubeSides {

}
/*
import com.sun.j3d.utils.geometry.*;
import com.sun.j3d.utils.universe.*;
import javax.media.j3d.*;
import javax.vecmath.*;

public class CubeSides {
	public CubeSides() {
		// �Ыؤ@�ӵ����Ŷ�
		SimpleUniverse universe = new SimpleUniverse();
		// �Ыؤ@�ӥΨӥ]�t��H���ƾڵ��c
		BranchGroup group = new BranchGroup();

		// �Ыؤ@�Ӳy�ç⥦�[�J��group��
		Sphere sphere = new Sphere(0.5f); // �p�y���b�|��0.5��
		group.addChild(sphere);

		Color3f light1Color = new Color3f(1.8f, 0.1f, 0.1f);
		// �]�m���u���C��
		BoundingSphere bounds = new BoundingSphere(new Point3d(0.0, 0.0, 0.0),
				100.0);
		// �]�m���u���@�νd��
		Vector3f light1Direction = new Vector3f(4.0f, -7.0f, -12.0f);
		// �]�m���u����V
		DirectionalLight light1 = new DirectionalLight(light1Color,
				light1Direction);
		// ���w�C��M��V�A���ͳ�V����
		light1.setInfluencingBounds(bounds);
		// ����u���@�νd��[�J������
		group.addChild(light1);
		// �N�����[�Jgroup��,�w���[���I
		universe.getViewingPlatform().setNominalViewingTransform();
		// ��group�[�J������Ŷ���
		universe.addBranchGraph(group);
	}

	public static void main(String[] args) {
		new CubeSides();
	}
}
*/