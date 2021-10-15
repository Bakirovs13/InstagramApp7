package com.hfad.instagramfinal.data;

import com.hfad.instagramfinal.R;
import com.hfad.instagramfinal.model.Notification;

import java.util.ArrayList;

public class NotificationData {

    private ArrayList<Notification> notificationArrayList = new ArrayList<>();


    public ArrayList<Notification> getList() {

        notificationArrayList.add(new Notification("Malala", R.drawable.ic_person_photo));
        notificationArrayList.add(new Notification("Zharkynai", R.drawable.ic_bishkek));
        notificationArrayList.add(new Notification("Azaza", R.drawable.ic_person_photo));


        return notificationArrayList;
    }
}
