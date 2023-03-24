package co.edu.campusucc.poo.domain;

public class Client {
    private String id;
    private String typeIdCard;
    private String idCard;
    private String name;
    private String nickName;
    private String lastname;

    public Client(String id, String typeIdCard, String idCard, String name, String nickName, String lastname) {
        this.id = id;
        this.typeIdCard = typeIdCard;
        this.idCard = idCard;
        this.name = name;
        this.nickName = nickName;
        this.lastname = lastname;
    }

    public Client() {
    }

    @Override
    public String toString() {
        return "Client [id=" + id + ", typeIdCard=" + typeIdCard + ", idCard=" + idCard + ", name=" + name
                + ", nickName=" + nickName + ", lastname=" + lastname + "]";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTypeIdCard() {
        return typeIdCard;
    }

    public void setTypeIdCard(String typeIdCard) {
        this.typeIdCard = typeIdCard;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    
}

