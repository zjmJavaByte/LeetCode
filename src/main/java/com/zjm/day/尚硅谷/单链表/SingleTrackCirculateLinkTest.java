package com.zjm.day.尚硅谷.单链表;

import java.util.ArrayList;

public class SingleTrackCirculateLinkTest {

    public static void main(String[] args) {
        SingleTrackCirculateLink singleTrackCirculateLink = new SingleTrackCirculateLink(new Node("小孩子11", 1, 1));
        singleTrackCirculateLink.add(new Node("小孩子2",2,2));
        singleTrackCirculateLink.add(new Node("小孩子3",3,3));
        singleTrackCirculateLink.add(new Node("小孩子4",4,4));
        singleTrackCirculateLink.add(new Node("小孩子5",5,5));
        singleTrackCirculateLink.show();


        singleTrackCirculateLink.count(2,3,5);
    }

}
