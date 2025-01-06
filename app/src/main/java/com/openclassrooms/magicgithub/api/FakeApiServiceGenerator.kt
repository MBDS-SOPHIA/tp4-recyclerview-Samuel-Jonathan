package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;
import java.util.*;

object FakeApiServiceGenerator {

    @JvmField
    var FAKE_USERS = mutableListOf(
        User("001", "Jake", "https://robohash.org/1.png?size=512x512"),
        User("002", "Paul", "https://robohash.org/2.png?size=512x512"),
        User("003", "Phil", "https://robohash.org/3.png?size=512x512"),
        User("004", "Guillaume", "https://robohash.org/4.png?size=512x512"),
        User("005", "Francis", "https://robohash.org/5.png?size=512x512"),
        User("006", "George", "https://robohash.org/6.png?size=512x512"),
        User("007", "Louis", "https://robohash.org/7.png?size=512x512"),
        User("008", "Mateo", "https://robohash.org/8.png?size=512x512"),
        User("009", "April", "https://robohash.org/9.png?size=512x512"),
        User("010", "Louise", "https://robohash.org/10.png?size=512x512"),
        User("011", "Elodie", "https://robohash.org/11.png?size=512x512"),
        User("012", "Helene", "https://robohash.org/12.png?size=512x512"),
        User("013", "Fanny", "https://robohash.org/13.png?size=512x512"),
        User("014", "Laura", "https://robohash.org/14.png?size=512x512"),
        User("015", "Gertrude", "https://robohash.org/15.png?size=512x512"),
        User("016", "Chloé", "https://robohash.org/16.png?size=512x512"),
        User("017", "April", "https://robohash.org/17.png?size=512x512"),
        User("018", "Marie", "https://robohash.org/18.png?size=512x512"),
        User("019", "Henri", "https://robohash.org/19.png?size=512x512"),
        User("020", "Rémi", "https://robohash.org/20.png?size=512x512")
    )

    @JvmField
    var FAKE_USERS_RANDOM = Arrays.asList(
        User("021", "Lea", "https://robohash.org/21.png?size=512x512"),
        User("022", "Geoffrey", "https://robohash.org/22.png?size=512x512"),
        User("023", "Simon", "https://robohash.org/23.png?size=512x512"),
        User("024", "André", "https://robohash.org/24.png?size=512x512"),
        User("025", "Leopold", "https://robohash.org/25.png?size=512x512")
    );
}
