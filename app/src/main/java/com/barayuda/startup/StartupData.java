package com.barayuda.startup;

import java.util.ArrayList;

public class StartupData {
    public static String[][] data = new String[][]{

            {
                "TRAVELOKA",
                "Unicorn Indonesia Pertama",
                "https://s3-ap-southeast-1.amazonaws.com/traveloka/imageResource/2017/03/17/1489744198907-356bed3012407aaa8f07132704bd7e66.png",
                "Pada awal konsepnya Traveloka berfungsi sebagai mesin pencari untuk membandingkan harga tiket pesawat dari berbagai situs lainnya. Pada pertengahan tahun 2013 Traveloka kemudian berubah menjadi situs reservasi tiket pesawat di mana pengguna dapat melakukan pemesanan di situs resminya. Pada bulan Maret 2014, Ferry Unardi menyatakan bahwa Traveloka akan segera masuk ke bisnis reservasi kamar hotel. Pada bulan Juli 2014, jasa pemesanan hotel telah tersedia di situs Traveloka.",
                "Februari 2012",
                "Ferry Unardi"
            },
            {
                "TOKOPEDIA",
                "Unicorn Indonesia Kedua",
                "https://ecs7.tokopedia.net/microsite-production/brand-asset/dlc/mascot/Tokopedia_Mascot.png",
                "Tokopedia merupakan perusahaan teknologi Indonesia dengan misi mencapai pemerataan ekonomi secara digital. Sejak didirikan pada tahun 2009, Tokopedia telah bertransformasi menjadi sebuah unicorn yang berpengaruh tidak hanya di Indonesia tetapi juga di Asia Tenggara.",
                "6 Februari 2009",
                "William Tanuwijaya"
            },
            {
                "BUKALAPAK",
                "Unicorn Indonesia Ketiga",
                "https://cdn.evbuc.com/images/52925289/191447604509/2/logo.png",
                "Bukalapak merupakan salah satu pusat perbelanjaan daring di Indonesia yang dimiliki dan dijalankan oleh PT. Bukalapak. Bukalapak didirikan pada 10 Januari 2010 oleh Achmad Zaky, Nugroho Herucahyono, dan Fajrin Rasyid di sebuah rumah kos di Bandung, Jawa Barat.",
                 "10 Januari 2010",
                 "Achmad Zaky"
            },
            {
                "GOJEK",
                "Unicorn Indonesia Keempat",
                "https://cdn6.aptoide.com/imgs/8/a/7/8a73e72df231deacfaa35c759945aedb_icon.png?w=240",
                 "Pada 7 Januari 2015, GOJEK akhirnya meluncurkan aplikasi berbasis Android dan IOS untuk menggantikan sistem pemesanan menggunakan call center.",
                 "7 Januari 2015",
                 "Nadiem Makarim"
            }
    };
    public static ArrayList<Startup> getListData(){
        Startup startup;
        ArrayList<Startup> list = new ArrayList<>();
        for (int i = 0; i<data.length; i++){
            startup = new Startup();
            startup.setName(data[i][0]);
            startup.setRemarks(data[i][1]);
            startup.setPhoto(data[i][2]);
            startup.setDeskripsi(data[i][3]);
            startup.setBerdiri(data[i][4]);
            startup.setCeo(data[i][5]);

            list.add(startup);
        }

        return list;
    }
}
