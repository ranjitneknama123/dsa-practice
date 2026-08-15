package jsonReading;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.awt.desktop.ScreenSleepEvent;
import java.io.File;
import java.io.IOException;

public class ReadJson {

    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("src/main/resources/inputjsondata.json"));

        // Read the JSON data into a tree structure

        //Read all the json data
        System.out.println("Root Node: " + root);

        //read single data without path
        System.out.println("Order ID: " + root.get("orderId").asText());


        //Read data using index in array
        System.out.println("History Data by index");
        String firstTimeStamp = root.at("/history/0/timestamp").asText();
        System.out.println("First Timestamp: " + firstTimeStamp);

        //Read all the timestamp which is there in history
        System.out.println("All Timestamps:");
        root.at("/history").forEach(node -> {
            String timestamp = node.get("timestamp").asText();
            System.out.println("Timestamp: " + timestamp);
        });


    }
}
