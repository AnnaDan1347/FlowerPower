package by.training.oop.flower.store.prices;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.training.oop.flower.store.application.Store;
import by.training.oop.flower.store.enums.AccessoryKind;
import by.training.oop.flower.store.enums.FlowerKind;

import by.training.oop.flower.store.model.Flower;
import by.training.oop.flower.store.model.FlowerLength;
import by.training.oop.flower.store.model.Good;
import by.training.oop.flower.store.model.Accessory;
import by.training.oop.flower.store.model.Color;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;

public class ReadAccessoryFromJSON {

    private static final String STORAGE_FILE_NAME = "./src/by/training/oop/flower/store/resources/PricelistAccessory.json";

//    public void writeFromStoreToFile(Store store) {
//        // Creating a JSONObject object
//        JSONObject jsonObject = new JSONObject();
//        // Inserting key-value pairs into the JSON object
//
//        try {
//            FileWriter file = new FileWriter(STORAGE_FILE_NAME);
//            file.write(jsonObject.toJSONString());
//            file.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("JSON file created: " + jsonObject);
//
//    }
    
    

    public void readAccessoryToStore(Store accessory) {
        JSONObject jsonObject = (JSONObject) JSONValue.parse(readStringFromFile(STORAGE_FILE_NAME));
        accessory.setAccessories(readAccessories(jsonObject));
    }

    private String readStringFromFile(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader in = new BufferedReader(reader);
            String inputLine;
            // построчно считываем результат в объект StringBuilder
            while ((inputLine = in.readLine()) != null) {
                stringBuilder.append(inputLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    private List<Accessory> readAccessories(JSONObject data) {
        JSONArray accessoriesJ = (JSONArray) data.get("accessories");
        List<Accessory> accessories = new ArrayList<>();
        for (var item : accessoriesJ) {
            JSONObject accessoryJ = (JSONObject) item;
            Accessory accessory = new Accessory();
            accessories.add(accessory);
            accessory.setAccessoryKind(AccessoryKind.getAccessoryKind((String) accessoryJ.get("accessoryKind")));
            accessory.setColor(Color.getColor((String) accessoryJ.get("Color")));
            accessory.setId(Integer.parseInt((Accessory.getId((String) accessoryJ.get("ID")))));
            accessory.setCost(Integer.parseInt((Accessory.getCost((String) accessoryJ.get("Cost")))));
        }
        return accessories;
    }

}