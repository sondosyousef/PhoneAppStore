package com.example.phoneappstore;

public class Phone {
    private String name;
    private int imageID;

    private String description;


    public static final Phone[] phones = {
            new Phone("Apple iPhone 12 Pro Max", R.drawable.pic1,"Released 2020, November 13\n" +
                    "228g, 7.4mm thickness\n" +
                    "iOS 14.1, up to iOS 14.2\n" +
                    "128GB storage, no card slot\n" +
                    "Price  5799.99\n"),
            new Phone("Apple iPhone 12 ", R.drawable.pic2,"Released 2020, November 13\n" +
                    "135g, 7.4mm thickness\n" +
                    "iOS 14.1, up to iOS 14.2\n" +
                    "128GB storage, no card slot\n" +
                    "Price  4449.99 \n"),
            new Phone("Apple iPhone 11 ", R.drawable.pic3,"Released 2019, September\n" +
                    "194g, 8.3mm thickness\n" +
                    "iOS 13, up to iOS 13.1.2\n" +
                    "128GB storage, no card slot\n" +
                    "Price  2919.99 ₪\u200E\n"),
            new Phone("Apple iPhone X ", R.drawable.pic4,"Released 2017, September 22\n" +
                    "148g, 7.3mm thickness\n" +
                    "iOS 11, up to iOS 14.2\n" +
                    "64GB storage, no card slot\n" +
                    "Price 2119.99\n"),
            new Phone("Apple iPhone 8 ", R.drawable.pic5,"Released 2017, September 22\n" +
                    "148g, 7.3mm thickness\n" +
                    "iOS 11, up to iOS 14.2\n" +
                    "64GB storage, no card slot\n" +
                    "Price 1399.99\n"),
            new Phone("Apple iPad 8th Generation", R.drawable.pic6,"Released 2020, September 18\n" +
                    "iPadOS 14, up to iPadOS 14.1\n" +
                    "32GB, no card slot\n" +
                    "Price: 1519.99 \n"),
            new Phone("Apple iPad 7th Generation ", R.drawable.pic7,"Released 2019, September\n" +
                    "483g (Wi-Fi), 7.5mm thickness\n" +
                    "iPadOS 13.1, up to iPadOS 13.1.2\n" +
                    "32GB storage, no card slot\n" +
                    "Price 1399.99\n"),
            new Phone("Apple Watch SE ", R.drawable.pic8,"Released 2020, September 18\n" +
                    "36.4g, 10.4mm thickness\n" +
                    "watchOS 7.0, up to 7.1\n" +
                    "32GB storage, no card slot\n" +
                    "50m water resistant\n" +
                    "Price 1349.99\n"),
            new Phone("Samsung Galaxy A71", R.drawable.pic9,"Released 2020, January\n" +
                    "179g, 7.7mm thickness\n" +
                    "Android 10.0; One UI 2\n" +
                    "128GB storage, microSDXC\n" +
                    "Price 1379.99\n"),
            new Phone("Samsung Galaxy Note10+", R.drawable.pic10,"Released 2019, August\n" +
                    "196g, 7.9mm thickness\n" +
                    "Android 9.0; One UI\n" +
                    "256GB storage, microSD slot\n" +
                    " Price 3569.99\n"),
            new Phone("Samsung Galaxy A31", R.drawable.pic11,"Released 2020, April 27\n" +
                    "185g, 8.6mm thickness\n" +
                    "Android 10, One UI 2.0\n" +
                    "128GB storage, microSDXC\n" +
                    "Price 819.99\n"),
            new Phone("Xiaomi Redmi 9", R.drawable.pic12,"Released 2020, June 10\n" +
                    "198g, 9.1mm thickness\n" +
                    "Android 10, MIUI 12\n" +
                    "32GB storage, microSDXC\n" +
                    "           Price 519.99\n"),
            new Phone("Huawei nova 7i", R.drawable.pic13,"Released 2020, February 14\n" +
                    "183g, 8.7mm thickness\n" +
                    "Android 10, EMUI 10, no Google Play Services\n" +
                    "128GB storage, NM\n" +
                    "Price 1199.99\n")

    };
    private Phone(String name, int imageID, String description){
        this.name = name;
        this.imageID = imageID;
        this.description=description;
    }
    public String getName(){return name;}
    public int getImageID(){return imageID;}
    public String getDescription() {
        return description;
    }


}

