package com.Practice._4;

// 1773. Count Items Matching a Rule
//You are given an array items, where each items[i] = [type[i], color[i], name[i] describes the type, color, and name of the [i]th item.
//        You are also given a rule represented by two strings, ruleKey and ruleValue.
//
//        The ith item is said to match the rule if one of the following is true:
//
//        ruleKey == "type" and ruleValue == type[i].
//        ruleKey == "color" and ruleValue == color[i].
//        ruleKey == "name" and ruleValue == name[i].
//
//        Return the number of items that match the given rule.
//
//        Example 1:
//        Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],
//                        ["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
//        Output: 1
//        Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
//
//        Example 2:
//        Input: items = [["phone","blue","pixel"],["computer","silver","phone"]
//                        ,["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
//        Output: 2
//        Explanation: There are only two items matching the given rule,
//                    which are ["phone","blue","pixel"] and ["phone","gold","iphone"].
//                    Note that the item ["computer","silver","phone"] does not match.
public class Count_Items_Matching {
    public static void main(String[] args) {
        String[][] items = {    {"phone","blue","pixel"},
                                {"computer","silver","lenovo"},
                                {"phone","gold","iphone"}         };

        String ruleKey = "color";
        String ruleValue = "silver";

//        String[][] items = {    {"phone","blue","pixel"},
//                                {"computer","silver","phone"},
//                                {"phone","gold","iphone"}       };
//
//        String ruleKey = "type";
//        String ruleValue = "phone";


        System.out.println(match(items,ruleKey,ruleValue));
    }

    static int match(String[][] items, String ruleKey, String ruleValue) {
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            if(ruleKey == "type") {
                if(items[i][0] == ruleValue) {
                    count++;
                }
            }

            else if(ruleKey == "color") {
                if(items[i][1] == ruleValue) {
                    count++;
                }
            }

            else if(ruleKey == "name") {
                if(items[i][2] == ruleValue) {
                    count++;
                }
            }
        }
        return count;
    }
}
