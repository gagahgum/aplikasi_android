package com.example.gagum;

import java.util.ArrayList;

class HeroesData {
    private static String[][] data = new String[][]{
            {"Atta Halilintar", "Muhammad Attamimi Halilintar yang lebih dikenal sebagai Atta Halilintar (lahir di Dumai, Riau, 20 November 1994; umur 24 tahun) adalah YouTuber dan pengusaha berkebangsaan Indonesia. Ia merupakan anak sulung dari kesebelasan Gen Halilintar.", "https://cdn2.tstatic.net/suryamalang/foto/bank/images/pendapatan-atta-halilintar.jpg"},
            {"Ria Ricis", "Sosok Ria Ricis banyak dikenal lewat tingkah lakunya yang atraktif, lucu, dan imut. Bernama lengkap Ria Yunita, gadis berhijab ini menuai kesuksesannya dengan menjadi selebgram, atau selebriti instagram dan juga youtuber kondang Indonesia. ", "https://thumb.viva.co.id/media/frontend/tokoh/2018/01/15/5a5c43d3b0fa9-ria-ricis_216_287.jpg"},
            {"Gen Halilintar", "Gen Halilintar adolah julukan kaluarga Indonesia untuak pasangan Halilintar Anofial Asmid (ayah) dan Lenggogeni Faruk (mandeh) nan punyo sabaleh urang anak. Kaluarga asa Minangkabau iko manjadi tanamo sasudah sang mandeh manulih buku nan bajudul Kesebelasan Gen Halilintar: My Family My Team pado awal 2015.", "https://upload.wikimedia.org/wikipedia/commons/7/77/Gen_Halilintar.jpg"},
            {"Saai Halilintar", "Muhammad Saaih Halilintar karena memiliki passion dalam bidang IT, tugas utama Saaih Halilintar yakni memperbaiki segala kerusakan yang ada hubungannya dengan peralatan elektronik. Ia juga memiliki tanggung jawab sebagai IT Maintenance. Selain itu, Saaih Halilintar juga aktif mengisi konten Youtube seperti review, unboxing, dan prank.", "https://thegorbalsla.com/wp-content/uploads/2019/02/Saaih-Halilintar.jpg"},
            {"Raditya Dika", "Dika Angkasaputra Moerwani atau lebih dikenal dengan Raditya Dika (lahir di Jakarta, 28 Desember 1984; umur 34 tahun) adalah seorang penulis, komedian, sutradara, dan aktor. Buku pertamanya berjudul Kambing Jantan masuk kategori best seller. Buku tersebut menampilkan kehidupan Dika (Raditya Dika) saat kuliah di Australia.", "https://1.bp.blogspot.com/-WAAc8QcWZy8/VsGeeDLHZKI/AAAAAAAABGs/-Jy9b7G0YQY/s400/raditya-dika.jpg"},
            {"Baim Paula", "Pria yang bernama asli Muhammad Ibrahim dan bertinggi 176 cm ini adalah anak bungsu dari 5 bersaudara dari pasangan pengusaha Johnny Wong dan Kartini Marta Atmadja. Pada 21 Juli 2018 Baim Wong bertunangan dengan Paula Verhoeven lalu menikah dengannya pada 22 November 2018.", "https://upload.wikimedia.org/wikipedia/id/thumb/c/c6/Baim_wong.jpeg/450px-Baim_wong.jpeg"},
            {"Arif Muhammad", "Arief Muhammad (lahir dengan nama Muhammad Arief Yakoeb di Batam, 26 Oktober 1990; umur 28 tahun), akrab dipanggil Poconggg, adalah seorang penulis asal Indonesia. Di Indonesia, Arief yang berdarah Minangkabau ini dikenal sebagai selebriti Twitter dan penulis buku jenaka. Buku pertamanya yang berjudul Poconggg Juga Pocong masuk kategori best seller. Buku tersebut menampilkan kehidupan seikat Pocong yang galau tetapi senang menghibur", "https://www.anakkost.tv/wp-content/uploads/2016/05/Biodata-dan-Perjalanan-Karir-Arief-Muhammad.png"},
            {"MiawAug", "Tahu tren game saat ini itu wajib, tapi kalau bermain gamer berdasarkan tren saja juga nggak asik. Pemilik nama asli Reggy Prabowo ini hanya memainkan games yang memang ia sukai. Jadi jangan heran kalau satu game saja bisa sampai lebih dari 10 part konten di Youtube.", "https://cdn1-production-images-kly.akamaized.net/_x_BnHhT-ghrdJnYKd5sUNnV3vg=/680x383/smart/filters:quality(75):strip_icc():format(webp)/kly-media-production/medias/2533929/original/008653100_1544764921-gamer-sekaligus-youtuber-miawaug-beda-dari-yang-lain.jpg"},
            {"Jess No Limit", "Jess No limit memang termasuk yang baru di dunia youtube, sebab channel youtube nya sendiri di buat tahun lalu. Tepatnya pada tanggal 06 September 2017. Sekarang channel youtubenya sudah mendapatkan 4 juta lebih subscriber.", "https://www.anakkost.tv/wp-content/uploads/2018/12/jess-no-limit.jpg"},
            {"Dyland PROS", "DI era Revolusi Industri 4.0 dengan bermain game, seseorang bisa meraih banyak keuntungan. Saking jagonya pendapatan mereka sangat fantastis dan mendadak kaya. Salah satunya Dyland Pros, gamer Free Fire, sekaligus seorang YouTuber ini penghasilannya besar. Sampai hidupnya mendadak kaya, berani membeli mobil mewah sampai punya usaha restoran.", "https://img.okeinfo.net/content/2019/03/24/612/2034398/mengintip-kehidupan-jet-zet-dyland-pros-atlet-esport-yang-sukses-di-free-fire-GemnD0hPse.jpg"},
    };

    static ArrayList<Hero> getListData(){
        ArrayList<Hero> list = new ArrayList<>();
        for (String[] aData : data) {
            Hero hero = new Hero();
            hero.setName(aData[0]);
            hero.setFrom(aData[1]);
            hero.setPhoto(aData[2]);

            list.add(hero);
        }

        return list;
    }
}