package edu.upc.eetac.dsa;

public class UserImpl implements User {

    private int idUser;
    private String nameUser;

    public UserImpl(int id, String name) {
        this.idUser = id;
        this.nameUser = name;
    }

    @Override
    public String getName() { return this.nameUser; }

    @Override
    public void setName(String name) { this.nameUser = name; }
}
