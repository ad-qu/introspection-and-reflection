package edu.upc.eetac.dsa;

public class UserImpl implements User {

    private int idUser;
    private String nameUser;

    public UserImpl() { }

    public UserImpl(int id, String name) {
        this.idUser = id;
        this.nameUser = name;
    }

    @Override
    public void setId(int id) { this.idUser = id; }

    @Override
    public int getId() { return idUser; }

    @Override
    public String getName() { return this.nameUser; }

    @Override
    public void setName(String name) { this.nameUser = name; }
}
