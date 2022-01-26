package com.company;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.io.File;

public class CardList {

    List<String> CardList = new ArrayList<>();

//    public CardList(String whatList) {
//        try {
//            BufferedReader br = new BufferedReader(new FileReader(whatList));
//            String line;
//            while ((line = br.readLine()) != null) {
//                cards.add(new String(line));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "CardList{" +
//                "cards=" + cards + "\n" +
//                '}';
//    }

    public CardList() {
        Scanner s = null;
        try {
            s = new Scanner(new File("cards.txt"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        while (s.hasNext()) {
            String nextWord = s.next();
            if (nextWord.charAt(0) == '"') {
                nextWord = nextWord.substring(1, nextWord.length() - 1);
            }
            CardList.add(nextWord);
        }
        s.close();
    }

    public String random() {
        Random r = new Random();
        int randomitem = r.nextInt(CardList.size());
        String randomElement = CardList.get(randomitem);
        return randomElement;
    }
//    public CardList() {
//        Scanner s = null;
//        try {
//            s = new Scanner(new File("cards.txt"));
//            s.useDelimiter(",");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        while (s.hasNext()){
//            String nextWord = s.next();
//            if(nextWord.charAt(0) == '"') {
//                nextWord = nextWord.substring(1, nextWord.length() - 1);
//            }
//            cards.add(nextWord);
//        }
//        s.close();
//    }
//    public String random() {
//        Random r = new Random();
//        int randomitem = r.nextInt(cards.size());
//        String randomElement = cards.get(randomitem);
//        return randomElement;
//    }
}
