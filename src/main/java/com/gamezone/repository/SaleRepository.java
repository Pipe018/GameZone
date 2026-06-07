package com.gamezone.repository;

import com.gamezone.model.Sale;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class SaleRepository {

    private static final String FILE_PATH = "data/sales.json";

    private final Gson gson;

    public SaleRepository() {
        gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public void saveAll(List<Sale> sales) {

        try (FileWriter writer = new FileWriter(FILE_PATH)) {

            gson.toJson(sales, writer);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Sale> findAll() {

        try (FileReader reader = new FileReader(FILE_PATH)) {

            Type listType = new TypeToken<List<Sale>>() {
            }.getType();

            List<Sale> sales = gson.fromJson(reader, listType);

            if (sales == null) {
                return new ArrayList<>();
            }

            return sales;

        } catch (Exception e) {

            return new ArrayList<>();
        }
    }
}