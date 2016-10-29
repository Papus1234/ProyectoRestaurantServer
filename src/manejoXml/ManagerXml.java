package manejoXml;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Node;

import com.thoughtworks.xstream.XStream;

import com.Objetos.*;;

public class ManagerXml {
	//XStream x = new XStream();
	String path;
	String texto;
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public ManagerXml(){
		this.path="C:/Users/Roberto/OneDrive/Respaldo Progra/ProyectoRestaurantServer/";
		
	}
	public void guardar(String ruta, String txt) throws IOException{
    File archivo = new File(path+"esto.xml");
    BufferedWriter bw;
    if(archivo.exists()) {
        bw = new BufferedWriter(new FileWriter(archivo));
        bw.write("El fichero de texto ya estaba creado.");
        bw.write(txt);
        
    } else {
        bw = new BufferedWriter(new FileWriter(archivo));
        bw.write(txt);
    }
    this.texto=txt;
    bw.close();
	}
	 public String muestraContenido(String archivo) throws FileNotFoundException, IOException {
	        String cadena,respuesta="";
	        FileReader f = new FileReader(path+archivo);
	        BufferedReader b = new BufferedReader(f);
	        while((cadena = b.readLine())!=null) {
	            respuesta=respuesta+cadena;
	        }
	        b.close();
	        return respuesta;
	    }
//	
//	public void guardarxml (Object ob,String ruta) throws IOException{
//    // Grabar
//		
//		this.texto=x.toXML(new Cheff("david", "43"));
//		System.out.println(texto+"Esta por aca ");
//		
//		 x.toXML(ob, new FileOutputStream(ruta));
//		 guardar("esto.txt", texto);
//	}
//	public  Object leerXml(String ruta) throws FileNotFoundException{
//    // Recuperar
//     return  x.fromXML(new FileInputStream(ruta));
//
//	
//	}
	
}