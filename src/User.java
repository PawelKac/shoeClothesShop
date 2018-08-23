/**
 * Created by Kaczmarczyk on 2018-08-23.
 */
public class User {

    Long id; //id
    String login; //login
    String password; //password

    public User (Long id, String login, String password){

        this.id = id;
        this.login = login;
        this.password = password;

    }
}

public class Product {

    Long id;//id
    //productName
    //
    //price
    //weight
    //color (String)
    //productCount

}

public class Boots extends Product {

    //size (int)
    //isNaturalSkin (boolean)
}

public class Cloth extends Product {

    //size (String)
    //amount (int)
}