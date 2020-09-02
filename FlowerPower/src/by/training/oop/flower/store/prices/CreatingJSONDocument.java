package by.training.oop.flower.store.prices;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;

public class CreatingJSONDocument {
    public static void FileWriter() {
        //Creating a JSONObject object
        JSONObject jsonObject = new JSONObject();
        //Inserting key-value pairs into the JSON object 
        
        jsonObject.put("ID", "1");
        jsonObject.put("flowerKind", "ROSE");
        jsonObject.put("LocalDate", "2020-08-20");
        jsonObject.put("FlowerLength", "30");
        jsonObject.put("Color", "RED");
        jsonObject.put("Cost", "10");
        jsonObject.put("ID", "2");        
        jsonObject.put("flowerKind", "LILAC");
        jsonObject.put("LocalDate", "2020-08-19");
        jsonObject.put("FlowerLength", "20");
        jsonObject.put("Color", "WHITE");
        jsonObject.put("Cost", "15");
        jsonObject.put("ID", "3");
        jsonObject.put("flowerKind", "TULIP");
        jsonObject.put("LocalDate", "2020-08-23");
        jsonObject.put("FlowerLength", "10");
        jsonObject.put("Color", "YELLOW");
        jsonObject.put("Cost", "5");
        jsonObject.put("ID", "4");
        jsonObject.put("flowerKind", "CHRIZANTHEMUM");
        jsonObject.put("LocalDate", "2020-08-25");
        jsonObject.put("FlowerLength", "20");
        jsonObject.put("Color", "ORANGE");
        jsonObject.put("Cost", "12");
      
        try {
           FileWriter file = new FileWriter("./src/by/training/oop/flower/store/resources/Pricelist.json");
           file.write(jsonObject.toJSONString());
           file.close();
        } catch (IOException e) {
           e.printStackTrace();
        }
        System.out.println("JSON file created: "+jsonObject);
     }

    
  }