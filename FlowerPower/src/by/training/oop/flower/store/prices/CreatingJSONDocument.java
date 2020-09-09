package by.training.oop.flower.store.prices;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.training.oop.flower.store.application.Store;
import by.training.oop.flower.store.enums.FlowerKind;

import by.training.oop.flower.store.model.Flower;
import by.training.oop.flower.store.model.FlowerLength;
import by.training.oop.flower.store.model.Good;
import by.training.oop.flower.store.model.Color;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;

public class CreatingJSONDocument {

    private static final String STORAGE_FILE_NAME = "./src/by/training/oop/flower/store/resources/Pricelist.json";

    public void writeFromStoreToFile(Store store) {
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
            FileWriter file = new FileWriter(STORAGE_FILE_NAME);
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("JSON file created: " + jsonObject);


    }
    public void readFileToStore(Store store) {
        JSONObject jsonObject = (JSONObject) JSONValue.parse(readStringFromFile(STORAGE_FILE_NAME));
        store.setGoods(readFlowers(jsonObject));
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

    private List<Good> readFlowers(JSONObject data) {
        JSONArray flowersJ = (JSONArray) data.get("flowers");
        List<Good> flowers = new ArrayList<>();
        for (var item: flowersJ) {
            JSONObject flowerJ = (JSONObject) item;
            Flower flower  = new Flower();
            flowers.add(flower);
            flower.setFlowerKind(FlowerKind.getFlowerKind((String) flowerJ.get("flowerKind")));
            flower.setLength(FlowerLength.getLength((String) flowerJ.get("FlowerLength")));
            flower.setColor(Color.getColor((String) flowerJ.get("Color")));
        }
        return flowers;
    }


}