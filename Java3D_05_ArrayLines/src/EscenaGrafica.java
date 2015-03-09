
import com.sun.j3d.utils.universe.SimpleUniverse;
import java.awt.GraphicsConfiguration;
import javax.media.j3d.*;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Point3f;
import javax.vecmath.Vector3d;

class EscenaGrafica{
Canvas3D canvas3D;

EscenaGrafica(){
    
    GraphicsConfiguration config = SimpleUniverse.getPreferredConfiguration(); // 0
    canvas3D = new Canvas3D(config); // 1)  
    SimpleUniverse su = new SimpleUniverse(canvas3D); // 2)    

    double x,y,z;
    double r =10.0,phi= 45.0,theta = 45.0;
    x = r*Math.cos(Math.toRadians(phi))*Math.sin(Math.toRadians(theta));
    z = r*Math.cos(Math.toRadians(phi))*Math.cos(Math.toRadians(theta));
    y = r*Math.sin(Math.toRadians(phi));
    Transform3D t3d = new Transform3D();
    t3d.lookAt(new Point3d(x,y,z), new Point3d(0.0,0.0,0.0), new Vector3d(0.0,0.0,1.0));
    t3d.invert();
    su.getViewingPlatform().getViewPlatformTransform().setTransform(t3d);         
    BranchGroup bg = new BranchGroup();// 4)

    //**************************************
    int formatoVertices,nroVertices;
    nroVertices = 2;
    formatoVertices = GeometryArray.COORDINATES |GeometryArray.COLOR_3;
    LineArray ejeX,ejeY,ejeZ;
    ejeX = new LineArray(nroVertices,formatoVertices);
    ejeY = new LineArray(nroVertices,formatoVertices);
    ejeZ = new LineArray(nroVertices,formatoVertices);
    Color3f rojo, verde,azul;
    rojo = new Color3f(1.0f,0.0f,0.0f); //Color3f(Color.);
    verde = new Color3f(0.0f,1.0f,0.0f);
    azul = new Color3f(0.0f,0.0f,1.0f);
    Point3f punto1,punto2,punto3,punto4,punto5,punto6;
    punto1 = new Point3f(-5.0f,0.0f,0.0f);
    punto2 = new Point3f(5.0f,0.0f,0.0f);
    punto3 = new Point3f(0.0f,-5.0f,0.0f);
    punto4 = new Point3f(0.0f,5.0f,0.0f);
    punto5 = new Point3f(0.0f,0.0f,-5.0f);
    punto6 = new Point3f(0.0f,0.0f,5.0f);
    ejeX.setCoordinate(0,punto1);
    ejeX.setCoordinate(1,punto2);
    ejeX.setColor(0,rojo);
    ejeX.setColor(1,rojo);
    ejeY.setCoordinate(0,punto3);
    ejeY.setCoordinate(1,punto4);
    ejeY.setColor(0,verde);
    ejeY.setColor(1,verde);
    ejeZ.setCoordinate(0,punto5);
    ejeZ.setCoordinate(1,punto6);
    ejeZ.setColor(0,azul);
    ejeZ.setColor(1,azul);
    //ejeZ.setColor(0,azul);
    //ejeZ.setColor(1,azul);
    Shape3D parteX,parteY,parteZ;
    parteX = new Shape3D();
    parteY = new Shape3D();
    parteZ = new Shape3D();
    parteX.setGeometry(ejeX);
    parteY.setGeometry(ejeY);
    parteZ.setGeometry(ejeZ);
    bg.addChild(parteX);
    bg.addChild(parteY);
    bg.addChild(parteZ);
    bg.compile();
    su.addBranchGraph(bg);
}

    public Canvas3D getLienzo(){
        return canvas3D;
    }
}
