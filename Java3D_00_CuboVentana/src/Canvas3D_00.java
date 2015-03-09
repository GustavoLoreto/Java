



import com.sun.j3d.utils.geometry.ColorCube;
import com.sun.j3d.utils.universe.SimpleUniverse;
import java.awt.GraphicsConfiguration;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.TransformGroup;

public class Canvas3D_00 {
    private Canvas3D canvas3D;
    public TransformGroup tg;

    public Canvas3D_00(){
        
        // 0) CONFIGURACION GRAFICA DEL MONITOR 
        /*Se interroga al hardware de la maquina con getPreferredConfiguration() 
        y elresultado de la consulta se le asigna a un  objeto 
        GraphicsConfiguration(En este caso  el objeto es gc).
        
        Uno de los métodos que fabrican objetos del tipo GraphicsConfiguration 
        es getPreferredConfiguration() de la clase SimpleUniverse*/
        
        // 1) creacion de un Objeto Canvas3D
        // 2) Creacion de un Objeto del tipo SimpleUniverse
        // 4) Creacion de Un BranchGroup (Puntos de insercion)   
        // Este objeto BranchGroup, pasa a ser la base de la rama Volumetrica.
        // 5) Creacion de un Objeto del tipo TransformGroup
        // 6) Creacion de un Obj. ColorCube
        //ColorCube es una clase que desciende, de Shape3D,
        // como argumento se le pasa la longitud de la arista
        // 7) Se agrega tg al obj.BranchGroup
        /* Para agregar elementos al objeto tipo BranchGroup se utiliza el método
        addChild de esta clase.*/
        // 8) Al obj. tg se le agrega el Obj. color
        // 9) Compilar la rama de volumen
        // 10) Agregar el BranchGroup al SimpleUniverse
        
        GraphicsConfiguration config = SimpleUniverse.getPreferredConfiguration();
        canvas3D = new Canvas3D(config); // 1)
        SimpleUniverse su = new SimpleUniverse(canvas3D); // 2) 
        su.getViewingPlatform().setNominalViewingTransform(); // 3) 
        BranchGroup bg = new BranchGroup(); // 4) 
        tg = new TransformGroup(); // 5) 
        ColorCube color = new ColorCube(0.25); // 6)
        bg.addChild(tg); // 7)  
        tg.addChild(color); // 8) 
        bg.compile(); // 9)
        su.addBranchGraph(bg); // 10)   
    }


    public Canvas3D getLienzo(){
        return canvas3D;
    }

}
