package DAO;

import lombok.Data;

@Data
public class DAO_User {
    private String userName;
    private long cellPhoneNumber;
    private String nombreCompleto;

    public DAO_User(){}
    public DAO_User(String userName, long cellPhoneNumber, String nombreCompleto){
        this.nombreCompleto = nombreCompleto;
        this.userName = userName;
        this.cellPhoneNumber = cellPhoneNumber;
    }

}
