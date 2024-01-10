package org.scnu.utils;

import org.scnu.detect.SystemInfo;

import java.io.*;
import java.util.ArrayList;

public class ReadArray {
    public static int[] GenerateArray() {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            File file = new File("C:\\Users\\scnuer\\IdeaProjects\\Predictor\\src\\main\\resources\\arrays\\arrays.txt");
            InputStreamReader input = new InputStreamReader(new FileInputStream(file));
            BufferedReader bf = new BufferedReader(input);
            // 按行读取字符串
            String str;
            str = bf.readLine();
            bf.close();
            input.close();
            String[] split = str.trim().split(" ");
            int[] res = new int[split.length];
            int i = 0;
            for (String s : split) {
                res[i] = Integer.parseInt(s);
                i++;
            }
            return res;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
