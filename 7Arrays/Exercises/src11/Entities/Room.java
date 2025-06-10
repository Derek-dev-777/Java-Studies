package Entities;

public class Room {

    private String nome;
    private String email;
    private int room;

    public Room(String nome, String email, int room){

        this.nome = nome;
        this.email = email;
        this.room = room;
    }

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public int getRoom(){
        return room;
    }

    public String toString(){
        return String.format("%d: %s, %s", room, nome, email);
    }


}
