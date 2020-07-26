package OfficeHours.Practice_06_10_2020;
/*Create an abstract class for Social Media that has the following features:
        - Direct messaging(String username, String message)
        - Post(String body)
        - Notifications(int time)

    - Personal URl (String)
    - Account length (int)
    - Platform (static String)

        */

/*
-----------------------------------
        Social Media
        (*) Create an abstract class for Social Media that has the following features:
        - Direct messaging(String username, String message)
        - Post(String body)
        - Notifications(int time)
        (*) The Social Media will also have the following fields:
        - Personal URl (String)
        - Account length (int)
        - Platform (static String)
        -----------------------------------
 */

public abstract class SocialMedia {

    protected String personalUrl;
    protected int accountLength;
    protected static String platform;

    public abstract boolean directMessage(String username, String message);

    public abstract boolean createPost(String body);

    public abstract void notification(int time);

}