package com.day.myprovince

object utils {
    val provinceList: ArrayList<Province> = ArrayList()

    init {
        provinceList.add(Province("Aceh",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Coat_of_arms_of_Aceh.svg/177px-Coat_of_arms_of_Aceh.svg.png",4.368549099555788,97.0253024),
        )
        provinceList.add(Province("Sumatera Utara",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c8/Coat_of_arms_of_North_Sumatra.svg/144px-Coat_of_arms_of_North_Sumatra.svg.png",
            2.1923518997662206,99.3812201),
        )
        provinceList.add(Province("Sumatera Barat",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/6/62/Coat_of_arms_of_West_Sumatra.svg/157px-Coat_of_arms_of_West_Sumatra.svg.png",
            -0.5827528999417824,100.61333789999999),
        )
        provinceList.add(Province("Riau",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0b/Coat_of_arms_of_Riau.svg/122px-Coat_of_arms_of_Riau.svg.png",
            0.5004111999478309,101.54758109999999),
        )
        provinceList.add(Province("Jambi",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/Coat_of_arms_of_Jambi.svg/173px-Coat_of_arms_of_Jambi.svg.png",
            -1.611571999848731,102.77969899999998),
        )
        provinceList.add(Province("Sumatera Selatan",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/4/45/Coat_of_arms_of_South_Sumatra.svg/140px-Coat_of_arms_of_South_Sumatra.svg.png",
            -3.12668419974361,104.0930554),
        )
        provinceList.add(Province("Bengkulu",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/5/54/Coat_of_arms_of_Bengkulu.svg/142px-Coat_of_arms_of_Bengkulu.svg.png",
            -3.518676299724009,102.53598339999999),
        )
        provinceList.add(Province("Lampung",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f0/Coat_of_arms_of_Lampung.svg/122px-Coat_of_arms_of_Lampung.svg.png",
            -4.855503899684,105.0272986),
        )
        provinceList.add(Province("Bangka Belitung",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/0/08/Coat_of_arms_of_Bangka_Belitung_Islands.svg/144px-Coat_of_arms_of_Bangka_Belitung_Islands.svg.png",
            -2.7052885997683713,106.3585607),
        )
        provinceList.add(Province("Kepulauan Riau",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/5/54/Coat_of_arms_of_Riau_Islands.svg/135px-Coat_of_arms_of_Riau_Islands.svg.png",
            -0.15478459998423127	,104.58037449999999),
        )
        provinceList.add(Province("D.K.I Jakarta",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Coat_of_arms_of_Jakarta.svg/159px-Coat_of_arms_of_Jakarta.svg.png",
            -6.200000,106.816666),
        )
        provinceList.add(Province("Jawa Barat",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Coat_of_arms_of_West_Java.svg/154px-Coat_of_arms_of_West_Java.svg.png",
            -6.889190399707042,107.6404716),
        )
        provinceList.add(Province("D.I Yogyakarta",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b8/Coat_of_arms_of_Yogyakarta.svg/139px-Coat_of_arms_of_Yogyakarta.svg.png",
            -7.797068,110.370529),
        )
        provinceList.add(Province("Jawa Timur",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Coat_of_arms_of_East_Java.svg/128px-Coat_of_arms_of_East_Java.svg.png",
            -7.697739699743451,112.49141989999998),
        )
        provinceList.add(Province("Banten",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/Coat_of_arms_of_Banten.svg/171px-Coat_of_arms_of_Banten.svg.png",
            -6.445380099693416,106.13755860000002),
        )
        provinceList.add(Province("Bali",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/1/10/Coat_of_arms_of_Bali.svg/180px-Coat_of_arms_of_Bali.svg.png",
            -8.330497699781604,115.09064009999997),
        )
        provinceList.add(Province("Nusa Tenggara Barat",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/Coat_of_arms_of_West_Nusa_Tenggara.svg/122px-Coat_of_arms_of_West_Nusa_Tenggara.svg.png",
            8.789285499814026,117.14616899999999),
        )
        provinceList.add(Province("Nusa Tenggara Timur",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/Coat_of_Arms_of_East_Nusa_Tenggara_NEW.png/170px-Coat_of_Arms_of_East_Nusa_Tenggara_NEW.png",
            -8.565678699797756,120.69785809999998),
        )
        provinceList.add(Province("Kalimantan Barat",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/5/5d/Coat_of_arms_of_West_Kalimantan.svg/133px-Coat_of_arms_of_West_Kalimantan.svg.png",
            -0.13223869998651558	,	111.0968901),
        )
        provinceList.add(Province("Kalimantan Tengah",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/Coat_of_arms_of_Central_Kalimantan.svg/136px-Coat_of_arms_of_Central_Kalimantan.svg.png",
            -1.4995829998581305	,113.2903307),
        )
        provinceList.add(Province("Kalimantan Selatan",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a6/Coat_of_arms_of_South_Kalimantan.svg/129px-Coat_of_arms_of_South_Kalimantan.svg.png",
            -2.928568599754789,115.3700718),
        )
        provinceList.add(Province("Kalimantan Timur",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Coat_of_arms_of_East_Kalimantan.svg/147px-Coat_of_arms_of_East_Kalimantan.svg.png",
            0.7884396999171788,116.24199769999997),
        )
        provinceList.add(Province("Kalimantan Utara",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Coat_of_arms_of_North_Kalimantan_%282021_version%29.svg/134px-Coat_of_arms_of_North_Kalimantan_%282021_version%29.svg.png",
            3.023581699680139,116.20493059999997),
        )
        provinceList.add(Province("Sulawesi Utara",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/6/68/Coat_of_arms_of_North_Sulawesi.svg/180px-Coat_of_arms_of_North_Sulawesi.svg.png",
            0.6555691999313628,124.090151),
        )
        provinceList.add(Province("Sulawesi Tengah",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Coat_of_arms_of_Central_Sulawesi.svg/114px-Coat_of_arms_of_Central_Sulawesi.svg.png",
            -1.6937785998419586,120.8088555),
        )
        provinceList.add(Province("Sulawesi Selatan",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/6/67/Coat_of_arms_of_South_Sulawesi.svg/147px-Coat_of_arms_of_South_Sulawesi.svg.png",
            -3.64467179971844,119.94719059999997),
        )
        provinceList.add(Province("Sulawesi Tenggara",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Coat_of_arms_of_Southeast_Sulawesi.svg/180px-Coat_of_arms_of_Southeast_Sulawesi.svg.png",
            -3.5491198997226308,	121.7279646),
        )
        provinceList.add(Province("Gorontalo",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Coat_of_arms_of_Gorontalo.svg/160px-Coat_of_arms_of_Gorontalo.svg.png",
            0.718617399924641,122.45559269999998),
        )
        provinceList.add(Province("Sulawesi Barat",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/8/89/Coat_of_arms_of_West_Sulawesi.svg/162px-Coat_of_arms_of_West_Sulawesi.svg.png",
            -2.497454599781922,119.3918955),
        )
        provinceList.add(Province("Maluku",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/3/39/Coat_of_arms_of_Maluku.svg/163px-Coat_of_arms_of_Maluku.svg.png",
            -3.118836999744037,129.4207759),
        )
        provinceList.add(Province("Maluku Utara",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Coat_of_arms_of_North_Maluku.svg/157px-Coat_of_arms_of_North_Maluku.svg.png",
            0.6301214999340713,127.97202190000002),
        )
        provinceList.add(Province("Papua",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/Coat_of_arms_of_Papua_2.svg/156px-Coat_of_arms_of_Papua_2.svg.png",-3.988572799705101,138.34852189999998),
        )
        provinceList.add(Province("Papua Barat",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Coat_of_arms_of_West_Papua.svg/126px-Coat_of_arms_of_West_Papua.svg.png",-1.3842355998680145,132.902528),
        )

    }


}