/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp
 */
public class MyString implements IString {

    @Override
    public int f1(String string) {
        int countWords = 0;
        //tach string thanh array chua cac tu
        String[] words = string.split(" ");
        for (int i = 0; i < words.length; i++) {
            int countDigits = 0;
            for (int j = 0; j < words[i].length(); j++) {
                // dem xem trong moi tu co bao nhieu chu so
                if (words[i].charAt(j) >= '0' && words[i].charAt(j) <= '9') {
                    countDigits++;
                }
            }

            //neu countDigit = 2 --> countWords++;
            if (countDigits == 2) {
                countWords++;
            }

        }
        return countWords;
    }

    @Override
    public String f2(String string) {
        String[] words = string.split(" ");
        boolean found = false;
        //b1: tim tu dau tien xuat hien dung 3 lan
        int i;
        for (i = 0; i < words.length; i++) {
            //b1.1: dem so lan xuat hien cua tu
            int freq = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[j].equals(words[i])) {
                    freq++;
                }
            }
            //b1.2 neu nhu so lan xuat hien = 3 --> break
            if (freq == 3) {
                found = true;
                break;
            }
        }
        
        //neu ton tai tu dau tien xuat hien 3 lan
        if (found == true) {
            String x = words[i];
            //b2: thay the tu do bang V
            for (int m = 0; m < 3; m++) {
                string = string.replace(x, "V");
            }
        }

        return string;
    }

}
