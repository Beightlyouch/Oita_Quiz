package com.beightlyouch.oita;

public class QuizDataCity {
    private static final String poolcity[] []= new String[][]{
            {"beppu", "bungoono", "bungotakada", "hiji", "himeshima", "hita", "kitsuki", "kokonoe",
             "kunisaki", "kusu", "nakatsu", "oita", "saiki", "takeda", "tsukumi", "usa", "usuki", "yufu"},

            {"別府市", "豊後大野市", "豊後高田市", "日出町", "姫島村", "日田市", "杵築市", "九重町",
             "国東市", "玖珠町", "中津市", "大分市", "佐伯市", "竹田市", "津久見市", "宇佐市", "臼杵市", "由布市"}};

    public static String[][] getPoolcity(){
        return QuizDataCity.poolcity;
    }

    public static int getCityNum(){
        return poolcity.length;
    }
}
