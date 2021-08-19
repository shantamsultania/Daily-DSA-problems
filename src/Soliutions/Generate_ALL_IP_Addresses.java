package Soliutions;

import java.util.ArrayList;
import java.util.List;

public class Generate_ALL_IP_Addresses {

    //
    //An IP Address is in the format of A.B.C.D, where A, B, C, D are all integers between 0 to 255.
    //
    //Given a string of numbers, return the possible IP addresses you can make with that string by splitting into 4 parts of A, B, C, D.
    //
    //Keep in mind that integers can't start with a 0! (Except for 0)
    //
    //Example:
    //Input: 1592551013
    //Output: ['159.255.101.3']
    //def ip_addresses(s, ip_parts=[]):
    //  # Fill this in.
    //
    //print ip_addresses('1592551013')
    //# ['159.255.101.3']
    //

    public String ip_addresses(String numbers) {
        String ipAddress = "";
        if (numbers.length() < 3 || numbers.length() > 12) {
            return "invalid amount of numbers entered ";
        } else {
            List<String> res = new ArrayList<>();
            for (int i = 0; i < numbers.length(); i += 3) {
                if (i + 2 < numbers.length()) {
                    res.add(numbers.substring(i, i + 3));
                } else {
                    res.add(numbers.substring(i, numbers.length()));
                }
            }
            for (String s : res) {
                if (isValid(s)) {
                    ipAddress += s+".";
                } else {
                    return "invalid String entered";
                }
            }
        }
        return ipAddress;
    }

    public boolean isValid(String s) {

        int x = Integer.parseInt(s);
        if (s.length() > 3 || x < 0 || x > 255) {
            return false;
        } else if (s.length() > 1 && x == 0) {
            return false;
        } else if (s.length() > 1 && x != 0 && s.charAt(0) == 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Generate_ALL_IP_Addresses generate_all_ip_addresses = new Generate_ALL_IP_Addresses();
        System.out.println("IP Address "+generate_all_ip_addresses.ip_addresses("25525511135"));
    }
}
