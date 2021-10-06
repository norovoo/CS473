package com.example.quiz_lab6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_details.*

class Details : AppCompatActivity(), MyAdapter.onItemClickListener  {
    val prods = ArrayList<Product>()
    val product1: Product = Product("RGA Voyager 7\" 16GB Android Tablet", 35.0, "Black", R.drawable.tablet, "0001", "Dragon Touch 10 inch Tablet: The Dragon Touch K10 features a brilliant 10” display and Android 8.1 Oreo OS, brings all you need for entertainment with a visual feast and fast operation. Easily browsing online and download whatever you want, such as Youtube, Netflix, Instagram and any other games.\n" +
            "Full-featured Tablet: Do what you like to do, Dragon Touch K10 10.1-inch tablet would satisfy you with providing a long-lasting reading and watching times. More songs, e-books, pictures and videos will be saved right on your tablet thanks to 128 GB expandable storage. And other features would contribute as well, such as FM, GPS, BT 4.0 and so on.\n" +
            "Brilliant HD Display: The 10-inch HD IPS Display with 1280*800 Resolution that stays clear in any light. Sharing the big screen with families in any angle for hands-free. It also has a micro HDMI interface for syncing the tablet movies and videos to TV. Both charging and data transmission would be supported via micro USB.\n" +
            "Store More Pictures and Videos: The Dragon Touch K10 tablet comes with 16GB of internal storage, expandable storage to 128 GB. The big storage will satisfy your daily requirements for working and learning.\n" +
            "Entertainment for You Anywhere: Easily get more entertainment on this tablet. The tablet also supports to download Apps from Google Play thanks to GMS certified from Google and a native Android operating system preloaded.")
    val product2: Product = Product("HP Flyer Red 15.6\" Laptop", 299.0, "Black & Red", R.drawable.laptop, "0002", "This Certified Refurbished product is tested to work like new. The product ships with all relevant accessories, and may arrive in a generic box. Only select sellers who maintain a high performance bar may offer Certified Refurbished products on Amazon.com\n" +
            "7th Generation Intel Core i5-7300U (2 Core, 2.6GHz, up to 3.5GHz with Turbo Boost, 3MB Cache)\n" +
            "14\" diagonal FHD (1920 x 1080) IPS anti-glare LED-backlit display with HP Sure View Integrated Privacy Screen ; Intel UHD Graphics\n" +
            "16 GB RAM; 256GB SSD\n" +
            "Factory Refurbished ; Windows 10 Professional 64 bit")
    val product3: Product = Product("VIZIO 70\" Class 4K", 1298.0, "Black", R.drawable.prod_tv, "0003", "VIZIO IQ Active 4K HDR Processor: Inside, the lightning-fast IQ Active processor delivers superior picture processing, and more intelligent 4K upscaling engine displaying your favorite HD entertainment in spectacular 4K quality.\n" +
            "Active Pixel Tuning: Intelligent pixel-level brightness adjustments for increased picture accuracy and contrast\n" +
            "V-Gaming Engine: Automatically makes the latest Xbox One and PlayStation gameplay more responsive with Auto Game Mode and the V-Series lowest input lag.\n" +
            "VIZIO SmartCast: With lightning fast navigation, enjoy instant access to the best selection of apps from top-tier streaming services like Netflix, Disney+, YouTube, Prime Video, and many more right on the TV using the all-new smart remote or SmartCast Mobile app.\n" +
            "Free Streaming Channels: A cord-cutter’s dream, serving up unlimited free viewing from specially curated channels – movies, TV shows, news and more. No fees, logins or subscription.\n" +
            "Included components: Power Cable, Remote Control, Stand")
    val product4: Product = Product("Epson WorkForse WF-2750", 69.0, "Black", R.drawable.printer, "0004", "Epson Workforce WF-28 50 Series Wireless Color Inkjet All-in-One Printer - Print Copy Scan Fax - Mobile Printing - Auto Duplex Printing - 2.4\" Colour LCD Display - Up to 30 Pages ADF\n" +
            "Up to 100 Sheets Paper Tray Capacity\n" +
            "Up to 30 Pages Automatic Document Feeder\n" +
            "Auto Duplex Printing\n" +
            "Wi-Fi, Wi-Fi Direct, USB Connection\n" +
            "2.4\" color LCD")
    val product5: Product = Product("IPhone 13 128GB Gray", 799.0, "Gray", R.drawable.iphone13, "0005", "6.1-inch Super Retina XDR display with ProMotion for a faster, more responsive feel\n" +
            "Cinematic mode adds shallow depth of field and shifts focus automatically in your videos\n" +
            "Pro camera system with new 12MP Telephoto, Wide, and Ultra Wide cameras; LiDAR Scanner; 6x optical zoom range; macro photography; Photographic Styles, ProRes video, Smart HDR 4, Night mode, Apple ProRAW, 4K Dolby Vision HDR recording\n" +
            "12MP TrueDepth front camera with Night mode, 4K Dolby Vision HDR recording\n" +
            "A15 Bionic chip for lightning-fast performance\n" +
            "Up to 22 hours of video playback\n" +
            "Durable design with Ceramic Shield")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        recyclerId.layoutManager = LinearLayoutManager(this)
        // Create an object for the MyAdapter
        prods.add(product1)
        prods.add(product2)
        prods.add(product3)
        prods.add(product4)
        prods.add(product5)
        val adapter = MyAdapter(prods, this)
        // Set adapter to your RecyclerView
        recyclerId.adapter = adapter

    }

    override fun onItemClick(position: Int) {
        startActivity(Intent(this, BigDetail::class.java).putExtra("prod",prods[position]))
    }
}