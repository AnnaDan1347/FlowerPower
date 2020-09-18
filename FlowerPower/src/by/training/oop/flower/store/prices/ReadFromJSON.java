package by.training.oop.flower.store.prices;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import by.training.oop.flower.store.application.Store;
import by.training.oop.flower.store.enums.AccessoryKind;
import by.training.oop.flower.store.enums.FlowerKind;

import by.training.oop.flower.store.model.Flower;
import by.training.oop.flower.store.enums.FlowerLength;
import by.training.oop.flower.store.model.Accessory;
import by.training.oop.flower.store.enums.Color;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class ReadFromJSON {

    private static final String FLOWER_STORAGE_FILE_NAME = "./src/by/training/oop/flower/store/resources/Pricelist.json";
    private static final String ACCESSORY_STORAGE_FILE_NAME = "./src/by/training/oop/flower/store/resources/PricelistAccessory.json";

    public void readFlowerToStore(Store store) {
        JSONObject jsonObject = (JSONObject) JSONValue.parse(readStringFromFile(FLOWER_STORAGE_FILE_NAME));
        store.setFlowers(readFlowers(jsonObject));
    }

    public void readAccessoryToStore(Store accessory) {
        JSONObject jsonObject = (JSONObject) JSONValue.parse(readStringFromFile(ACCESSORY_STORAGE_FILE_NAME));
        accessory.setAccessories(readAccessories(jsonObject));
    }

    private String readStringFromFile(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader in = new BufferedReader(reader);
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                stringBuilder.append(inputLine);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();

    }

    private List<Flower> readFlowers(JSONObject data) {
        JSONArray flowersJ = (JSONArray) data.get("flowers");
        List<Flower> flowers = new ArrayList<>();
        for (var item : flowersJ) {
            JSONObject flowerJ = (JSONObject) item;
            Flower flower = new Flower();
            flowers.add(flower);
            flower.setId(Integer.parseInt((Flower.getId((String) flowerJ.get("ID")))));
            flower.setFlowerKind(FlowerKind.getFlowerKind((String) flowerJ.get("flowerKind")));
            flower.setLength(FlowerLength.getLength((String) flowerJ.get("FlowerLength")));
            flower.setColor(Color.getColor((String) flowerJ.get("Color")));
            flower.setCost(Integer.parseInt((Flower.getCost((String) flowerJ.get("Cost")))));
            flower.setShipmentDate(LocalDate.parse((Flower.getShipmentDate((String) flowerJ.get("LocalDate")))));
        }
        return flowers;
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