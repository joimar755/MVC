package Modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;

//import org.json.simple.parser.JSONParser;

import com.google.gson.Gson;
import com.google.gson.JsonParser;

public class Json extends JFrame {

    JsonParser p = new JsonParser();
    String json = "";

    public void JsonFile() throws IOException {
        setSize(900, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // FileReader("C:/Users/Joimar/Documents/NetBeansProjects/MVC-1/Depa.json"));

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("Depa.json"));
            String linea = "";
            while ((linea = br.readLine()) != null) {
                json += linea;
            }
            br.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // System.out.println(json);

    }

}
